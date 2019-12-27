package canger.study.boot.model;


import org.springframework.stereotype.Component;

public class Flight {

    public Flight() {
        System.out.println("Flight init");
    }

    @Override
    public String toString() {
        return "Flight{}";
    }
}
