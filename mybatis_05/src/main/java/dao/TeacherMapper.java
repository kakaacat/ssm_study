package dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.Teacher;

public interface TeacherMapper {

    @Select("select * from teacher where id=#{id}")
    Teacher getTeacher(@Param("id") int id);
}
