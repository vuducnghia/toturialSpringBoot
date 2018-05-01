package com.example.spring_boot_hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//prefix app, find app.* values , nếu chỉ có title=HOME thì k cần prefix
@ConfigurationProperties("app")  // không cần phải khai báo thuộc tính nào của đối tượng như @Value, chỉ cần khai báo, auto map
@PropertySource("classpath:menu.properties")
public class MenuConfig {

    private List<Menu> menus = new ArrayList<>();

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public static class Menu {
        private String name;
        private String path;
        private String title;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Menu{name='" + name + '\'' + ", path='" + path + '\'' + ", title='" + title + '\'' + '}';
        }
    }
}
