package com.he.interceptors;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SecurityInterceptor implements HandlerInterceptor{

    private List<String> excludeUrl;
    public void setExcludeUrl(List<String> excludeUrl) {
        this.excludeUrl = excludeUrl;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String url = request.getRequestURI().replace(request.getContextPath(), "");
        //不拦截地址
        if(url.startsWith("/js/") || url.startsWith("/dictionary/")){
            return true;
        }
        if(excludeUrl != null && !excludeUrl.isEmpty()){
            Iterator<String> iterator = excludeUrl.iterator();
            while(iterator.hasNext()){
                if(url.contains(iterator.next())){
                    return true;
                }
            }
        }
        if(request.getSession().getAttribute("loginUser") == null){
            request.setAttribute("msg", "登录超时，请重新登录");
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

}
