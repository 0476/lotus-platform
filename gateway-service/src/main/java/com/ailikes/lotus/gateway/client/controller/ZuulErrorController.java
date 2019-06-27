package com.ailikes.lotus.gateway.client.controller;

import com.ailikes.lotus.common.core.commons.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.zuul.context.RequestContext;


/**
 * zuul自定义异常格式
 * (限流处理异常)
*/

@Controller
public class ZuulErrorController implements ErrorController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public static final String ERROR_PATH = "/error";

    /**
     * 错误最终会到这里来
     */
    @RequestMapping(ERROR_PATH)
    @ResponseBody
    public Object error() {
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        return Result.failed(throwable.getMessage()) ;
    }

    

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}