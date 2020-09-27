package AOP;

import AOP.Interceptor.CglibProxy;
import AOP.Interface.UserService;
import AOP.ServiceImpl.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;

public class cglibProxy {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);

        UserService o = (UserService)enhancer.create();
        o.getName(1);
        o.getAge(1);
    }
}
