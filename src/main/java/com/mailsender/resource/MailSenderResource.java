package com.mailsender.resource;

import com.mailsender.example.Mail;
import com.mailsender.example.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Enes KURU on 9/10/2015.
 */
@Component
@Path("/mail")
public class MailSenderResource {

    @Autowired
    private MailSenderService mailSenderService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Mail mail) {
        mail.setFrom("decorationcontact@gmail.com");
        mailSenderService.sendMail(mail.getFrom(), mail.getTo(), mail.getSubject(), mail.getMessage());
        return Response.ok().build();
    }

    @GET
    @Produces("text/plain")
    public String get(){
        return "OKKK";
    }
}
