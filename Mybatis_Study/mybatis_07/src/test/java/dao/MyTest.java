package dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Blog;
import utils.IDUtils;
import utils.MybatisUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Author : kaka
 * @Date: 2021-10-05 15:15
 */
public class MyTest {

    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBook(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
//        map.put("title", "Java");
//        mapper.queryBlogIF(map);

        map.put("views", 5000);
        map.put("title", "Mybatis如此简单");
        map.put("author", "sqs");
        map.put("id", "88468d8dbc554f3ba766b564939ff239");

//        List<Blog> blogList = mapper.queryBlogChoose(map);
//        for (Blog blog : blogList) {
//            System.out.println(blog);
//        }

        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        ArrayList<String> ids = new ArrayList<String>();
        ids.add("88468d8dbc554f3ba766b564939ff239");
        ids.add("7d593d154d8948a3bdc4f7977a485dd4");


        map.put("ids", ids);

        mapper.queryBlogForeach(map);

        sqlSession.close();
    }
}
