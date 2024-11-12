package org.jsp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentWebInitialzer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	public Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		
		return new Class[] {StudentConfig.class};
	}

	@Override
	public String[] getServletMappings() {
		return new String[] {"/"};
	}
	

	

}
