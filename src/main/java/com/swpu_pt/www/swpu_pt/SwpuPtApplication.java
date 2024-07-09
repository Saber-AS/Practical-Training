package com.swpu_pt.www.swpu_pt;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*启动类注解（main方法程序入口）*/
@SpringBootApplication
public class SwpuPtApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SwpuPtApplication.class, args);

        SpringApplication springApplication =new SpringApplication(SwpuPtApplication.class);
        springApplication.setBannerMode(Banner.Mode.LOG);
        springApplication.run(args);
    }

}
