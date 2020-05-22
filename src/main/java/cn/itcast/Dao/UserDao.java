package cn.itcast.Dao;

import cn.itcast.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;
@Repository
public interface UserDao {
    List<User> findAll();

    boolean saveUser(User user);
    //动态sql查询
    List<User> findChoss(User user);
    //删除
    boolean delectUser(User user);
    boolean updateUser(User user);
}
