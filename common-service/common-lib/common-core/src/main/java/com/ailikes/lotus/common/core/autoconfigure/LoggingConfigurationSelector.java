package com.ailikes.lotus.common.core.autoconfigure;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ailikes
 * @create 2017年7月2日
 * 装配bean
 */
public class LoggingConfigurationSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
//		importingClassMetadata.getAllAnnotationAttributes(EnableEcho.class.getName());
		return new String[] { 
				"com.ailikes.lotus.common.core.autoconfigure.datasource.DataSourceAspect",
				"com.ailikes.lotus.common.core.autoconfigure.log.LogAnnotationAspect"
		};
	}

}
