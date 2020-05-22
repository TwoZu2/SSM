package cn.itcast.Service.Impl;

import cn.itcast.Dao.UserDao;
import cn.itcast.Entity.User;
import cn.itcast.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        System.out.println("查询所有用户.............");

    return userDao.findAll();
    }

    @Override
    public boolean save(User user)
    {
        System.out.println("保存用户.............");
       return userDao.saveUser(user);
    }

    @Override
    public List<User> findChoss(User user) {
        return userDao.findChoss(user);
    }

    @Override
    public boolean delectUser(User user) {
        return userDao.delectUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }
}
