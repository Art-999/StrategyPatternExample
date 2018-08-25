package com.company.peoples;

import com.company.interfaces.SpeekBehavior;

public abstract class People {
    protected SpeekBehavior speekBehavior;

    protected abstract void sleep();

    protected abstract void eat();

    public void setSpeekBehavior(SpeekBehavior speekBehavior) {
        this.speekBehavior = speekBehavior;
    }

    public void performSpeek() {
        speekBehavior.speek();
    }
}
