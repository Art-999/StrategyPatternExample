package com.company.interfaces;

public class SpeekInRussian implements SpeekBehavior {
    @Override
    public void speek() {
        System.out.println("I am speeking in Russian");
    }
}
