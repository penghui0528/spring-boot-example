package com.example.penghui.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect//这是一个切面
@Component//告诉Spring需要将其加入到IOC容器
public class WebLogAop {


    private static ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();
    private Logger logger = LoggerFactory.getLogger(WebLogAop.class);

   @Before("execution(* com.example.penghui.service..*.*(..))")
    public void logBefore(JoinPoint joinPoint){
        logger.info("-----before----"+joinPoint.getArgs());
        Object[] objs =  joinPoint.getArgs();
        for(Object obj : objs){
            logger.info("-----obj----"+obj.toString());

        }

    }

    @After("execution(* com.example.penghui.service..*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        logger.info("-----after----");
    }

//    @Before(value = "pointCut()")
//    public void doBefore(JoinPoint joinPoint) {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//
//        System.out.println("URL==>" + request.getRequestURL().toString() + "," +
//                "METHOD==>" + request.getMethod() + "," +
//                "IP==>" + request.getRemoteAddr());
//
//        Map<String, String[]> params = request.getParameterMap();
//        Map<String,String> args = new HashMap<>();
//        for (Map.Entry<String,String[]> temp : params.entrySet()) {
//            args.put(temp.getKey(), Arrays.toString(temp.getValue()));
//        }
//
//        System.out.println("CLASS_METHOD==>" + joinPoint.getSignature().getDeclaringTypeName() + "." +joinPoint.getSignature().getName() + "," +
//                "ARGS==>" + args);
//
//        threadLocal.set(System.currentTimeMillis());
//    }

//    @AfterReturning(pointcut = "pointCut()",returning = "returnMsg")
//    public void doAfterReturn(JoinPoint joinPoint,Object returnMsg) {
//        System.out.println("CLASS_METHOD==>" + joinPoint.getSignature().getDeclaringTypeName() + "." +
//                joinPoint.getSignature().getName());
//        Long reponseTime = System.currentTimeMillis() - threadLocal.get();
//        System.out.println("接口响应时间(毫秒)==>" + reponseTime);
//        threadLocal.remove();
//    }

//    @AfterThrowing(pointcut="pointCut()",throwing = "exception")
//    public void doAfterThrow(JoinPoint joinPoint,Throwable exception) {
//        if (exception instanceof NullPointerException) {
//            System.out.println("报NullPointerException了！请处理一下！");
//        }
//    }
}