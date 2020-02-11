package edu.hebeu.community.mapper;

import edu.hebeu.community.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified}) ")
    void inset(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
