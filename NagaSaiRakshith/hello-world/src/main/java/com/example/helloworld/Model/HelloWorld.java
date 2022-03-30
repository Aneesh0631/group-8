package com.example.helloworld.Model;

import javax.persistence.*;

@Entity
@Table
public class HelloWorld {

    @Id
    @SequenceGenerator(
            name="hw_sequence",
            sequenceName = "hw_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hw_sequence"
    )
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TEXT")
    private String text;

    public HelloWorld() {
    }

    public HelloWorld(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public HelloWorld(String text) {
        this.text = text;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
