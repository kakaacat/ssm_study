package utils;

import java.util.UUID;

/**
 * @Author : kaka
 * @Date: 2021-10-05 15:03
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
