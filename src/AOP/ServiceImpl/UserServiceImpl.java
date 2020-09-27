package AOP.ServiceImpl;

import AOP.Interface.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getName(int id) {
        System.out.println("------getName------");
        return "zhangsan";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 10;
    }
}
