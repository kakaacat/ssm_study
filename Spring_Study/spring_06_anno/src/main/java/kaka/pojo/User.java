package kaka.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author : kaka
 * @Date: 2021-10-09 16:22
 */

//  @Component 相当于 <bean id="user" class="User"/>
@Component
public class User {
//    private String name = "kaka";

    @Value("kaka")
    private String name;

    public String getName() {
        return name;
    }
}
