package com.sqs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author : kaka
 * @Date: 2022-08-15 13:51
 */

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dog {
    private String name;
    private Integer age;
}
