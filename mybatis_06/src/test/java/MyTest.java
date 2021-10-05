import dao.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Teacher;
import utils.MybatisUtils;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-05 14:00
 */
public class MyTest {
    @Test
    public void getTeachers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeachers();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }


    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
