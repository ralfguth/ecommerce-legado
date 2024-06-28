package dev.ralfguth.ecommerce.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MessageBean {

    public String getMessage() {
        return "Olá, CDI 1.1 no WildFly!";
    }
}


