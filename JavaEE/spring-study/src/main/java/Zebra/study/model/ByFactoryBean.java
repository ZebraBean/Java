package Zebra.study.model;

import org.springframework.beans.factory.FactoryBean;

//@Component
public class ByFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User u = new User();
        u.setUsername("我是Zebra的factory");
        u.setPassword("factory的factory");
        return u;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
