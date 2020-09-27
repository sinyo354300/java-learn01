package AOP;

import AOP.Handler.MyInvocationHandler;
import AOP.Interface.UserService;
import AOP.ServiceImpl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class jdkProxy {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxyUserService = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),invocationHandler);
        System.out.println(proxyUserService.getName(1));
        System.out.println(proxyUserService.getAge(1));

    }
}
