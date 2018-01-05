package ru.dinis.ibm;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by dinis of 26.12.17.
 */
public class Launcher {

    public void launch() {
        new ClassPathXmlApplicationContext("app-config.xml");
    }

}
