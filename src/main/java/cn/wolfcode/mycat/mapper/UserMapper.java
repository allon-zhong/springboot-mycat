package cn.wolfcode.mycat.mapper;

import cn.wolfcode.mycat.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wolfcode-lanxw
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(id,name) value (#{id},#{name})")
    int insert(User user);
    @Select("select * from user")
    List<User> selectAll();
    @Select("select * from user where id = #{id}")
    User selectById(String id);
    @Select("select * from user where id> #{id}")
    List<User> rangeById(String id);
}
