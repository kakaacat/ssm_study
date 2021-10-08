package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author : kaka
 * @Date: 2021-10-05 14:58
 */

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
