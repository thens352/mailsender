package com.mailsender.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Enes KURU on 9/10/2015.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MailSenderService mm = (MailSenderService) context.getBean("mailSenderService");
        mm.sendMail("from",
                "to",
                "subject",
                "context");

    }
}
