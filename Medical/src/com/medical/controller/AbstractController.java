package com.medical.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

public class AbstractController implements ApplicationContextAware, ServletContextAware {

    ApplicationContext ctx;
    ServletContext servCtx;

    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;

    }

    public ApplicationContext getAppContext() {
        return this.ctx;
    }

    public void setServletContext(ServletContext servCtx) {
        this.servCtx = servCtx;

    }

    public ServletContext getServletContext() {
        return this.servCtx;
    }

    public String getContextPath() {
        return ((AbstractController) this.servCtx).getContextPath();
    }

    public String getContextPathFromCDN() {

        String CDNContextPath = null;

        CDNContextPath = "cdn." + getContextPath();

        return CDNContextPath;

    }

}
