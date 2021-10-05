package pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : kaka
 * @Date: 2021-10-05 17:22
 */

@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
