package stu.prototype;

import org.springframework.beans.BeanUtils;

public class Test {

    public static void main(String[] args) {

        RequestBody body = new RequestBody();
        body.setIP("127.0.0.1");
        body.setMethod("POST");
        body.setId(1);
        body.setName("Jack");
        body.setAddress("China-AnHui");
        User user = new User();
        //prototype
        BeanUtils.copyProperties(body, user);
        System.out.println(user);
    }

}
