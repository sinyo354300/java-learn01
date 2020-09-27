package AOP.Handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    private Object object;
    MyInvocationHandler(){
        super();
    }
    public MyInvocationHandler(Object obj){
        super();
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if("getName".equals(method.getName())){
            System.out.println("++++++before " + method.getName() + "++++++");
            result = method.invoke(object,args);
        }else{
            result = method.invoke(object,args);
        }
        return result;
    }

}
