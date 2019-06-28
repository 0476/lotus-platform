package com.ailikes.lotus.auth.server.model;

import java.io.Serializable;
import java.util.Date;
/**
 * @author ailikes
 * @Date: [2018-08-23 12:07]
 * @Description: [ ]
 * @Version: [1.0.0]
 */
public class SysService implements Serializable {

    private static final long serialVersionUID = 749360940290141180L;

    private Long id;
    private Long parentId;
    private String name;
    private String css;
    private String url;
    private String path;
    private Integer sort;
    private Date createTime;
    private Date updateTime;

    private Integer isMenu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(Integer isMenu) {
        this.isMenu = isMenu;
    }
}