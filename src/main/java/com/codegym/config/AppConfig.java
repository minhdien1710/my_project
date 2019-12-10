package com.codegym.config;

import com.codegym.service.RoleOfTeacherService;
import com.codegym.service.UserTypeService;
import com.codegym.service.impl.RoleOfTeacherImpl;
import com.codegym.service.impl.UserTypeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    UserTypeService userTypeService(){
        return new UserTypeImpl();
    }
    @Bean
    RoleOfTeacherService roleOfTeacherService(){
        return new RoleOfTeacherImpl();
    }
}
