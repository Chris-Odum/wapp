package com.chrisodum.ll.wapp.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Entity
 * @Table(name="Guest")
 *                      public class Guest {
 * @Id
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * @javax.persistence.Column(name="GUEST_ID")
 *                                            private long id;
 * @Column(name="FIRST_NAME")
 *                            private String firstName;
 * @Column(name="LAST_NAME")
 *                           private String lastName;
 * @Column(name="EMAIL_ADDRESS")
 *                               private String emailAddress;
 * @Column(name="ADDRESS")
 *                         private String address;
 * @Column(name="COUNTRY")
 *                         private String country;
 * @Column(name="STATE")
 *                       private String state;
 * @Column(name="PHONE_NUMBER")
 *                              private String phoneNumber;
 */
@Entity
@Table(name = "MultipleChoiceQuestions")
public class MultipleChoiceQuestions {
    @Id
    @Column(name = "Mcq_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Question")
    private String question;

    @Column(name = "Answer")
    private String answer;

    @Column(name = "Distractor_1")
    private String d1;

    @Column(name = "Distractor_2")
    private String d2;

    @Column(name = "Distractor_3")
    private String d3;

    @Column(name = "Distractor_4")
    private String d4;

    public MultipleChoiceQuestions(String question, String answer, String d1, String d2, String d3, String d4) {
        this.question = question;
        this.answer = answer;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    @Override
    public String toString() {
        return "MultipleChoiceQuestions [answer=" + answer + ", d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + ", d4=" + d4
                + ", id=" + id + "]";
    }

}