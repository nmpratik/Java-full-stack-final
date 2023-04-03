package com.pra.spi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;
import com.util.FileChecker;
import com.util.FileUtil;

/**
 * Hello world!
 */
public final class App {

    public static void normal() {
        System.out.println("🔥 Providing Dependencies Normally 🔥");

        FileUtil util = new FileUtil();

        FileChecker checker = new FileChecker(util);
        checker.checkFileValidity();
    }

    public static void withSpringJavaConfig() {
        System.out.println("🔥 Providing Dependencies With Java Code 🔥");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] names = ctx.getBeanDefinitionNames();
        for(String nm : names) {
            System.out.println(" 👉 "+nm);
        }

        FileChecker checker = ctx.getBean(FileChecker.class);
        checker.checkFileValidity();
    }

    public static void withSpringXmlConfig() {
        System.out.println("🔥 Providing Dependencies With Xml Config 🔥");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        FileChecker checker = ctx.getBean(FileChecker.class);
        checker.checkFileValidity();
    }

    public static void main(String[] args) {
        withSpringXmlConfig();
    }
}
