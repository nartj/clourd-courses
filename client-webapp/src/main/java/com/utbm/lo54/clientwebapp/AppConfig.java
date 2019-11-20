package com.utbm.lo54.clientwebapp;

import com.utbm.lo54.core.SecurityConfiguration;
import com.utbm.lo54.core.courses.PersistenceConfiguration;
import com.utbm.lo54.core.users.UsersPersistenceConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.utbm.lo54.clientwebapp", "com.utbm.lo54.core"})
@EnableWebMvc
@Import({ SecurityConfiguration.class, UsersPersistenceConfiguration.class})
public class AppConfig {
}