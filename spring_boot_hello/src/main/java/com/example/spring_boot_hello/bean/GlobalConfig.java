package com.example.spring_boot_hello.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties  //tự động mapping thuộc tính của bean với các giá trị trong file .properties
@PropertySource("classpath:global.properties")
@Validated
public class GlobalConfig {
    @NotEmpty
    @Value("${facebook}")
    public String facebook;

    @Value("${name}")
    public String name;

    @Value("${website}")
    public String website;

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
