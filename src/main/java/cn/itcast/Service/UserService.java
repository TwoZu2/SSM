package cn.itcast.Service;

import cn.itcast.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
    boolean save(User user);
    //动态sql查询
    List<User> findChoss(User user);
    boolean delectUser(User user);
    boolean updateUser(User user);
}
