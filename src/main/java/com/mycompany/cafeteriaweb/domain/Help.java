/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cafeteriaweb.domain;

//import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Sibakhulu
 */
@Embeddable
public class Help {

    private String question;

    private Help(Builder build) {
        question = build.question;
    }

    private Help() {

    }

    public static class Builder {

        private String question;

        public Builder(String nam) {
            this.question = nam;

        }

        public Help build() {
            return new Help(this);
        }

        public Builder copy(Help help) {
            this.question = help.getQuestion();
            return this;
        }
    }

    public String getQuestion() {
        return question;
    }
}
