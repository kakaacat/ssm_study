import dao.StudentMapper;
import dao.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import pojo.Teacher;
import utils.MybatisUtils;

import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-05 13:08
 */
public class MyTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getStudents(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentList = mapper.getStudnets();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void getStudents2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentList = mapper.getStudnets2();
        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
