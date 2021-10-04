package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author : kaka
 * @Date: 2021-09-26 15:12
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            //使用mybatis第一步：获取sqlsessionFactory对象
            String  resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取sqlsession的实例
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
