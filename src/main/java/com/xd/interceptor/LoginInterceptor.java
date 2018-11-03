package com.xd.interceptor;

import com.xd.util.ResponseUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        setCrossDomain(response);
        System.out.println(">>>>>>Login拦截开始>>>>>>("+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date())+")");
        System.out.println();
        boolean isLogin = true;
        if (request.getSession().getAttribute("syEmp")==null){
            ResponseUtil.write(response,"html","<script>alert('未检测到登录的账号，请先登录！');top.location.href='/syEmp/login'</script>");
            isLogin = false;
        }
        return isLogin;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println();
        System.out.println("<<<<<<Login拦截结束<<<<<<("+new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS").format(new Date())+")");
    }
    private void setCrossDomain(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST,GET");
        response.addHeader("Access-Control-Allow-Credentials", "true");
    }
}
