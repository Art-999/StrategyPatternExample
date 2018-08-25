package com.company;

import com.company.interfaces.SpeekInArmenian;
import com.company.interfaces.SpeekInEnglish;
import com.company.peoples.Armenian;
import com.company.peoples.People;

public class Main {

    public static void main(String[] args) {
	// write your code here

        People armenian=new Armenian();
        armenian.setSpeekBehavior(new SpeekInArmenian());
        armenian.performSpeek();
        armenian.setSpeekBehavior(new SpeekInEnglish());
        armenian.performSpeek();
        armenian.setSpeekBehavior(new SpeekInArmenian());
        armenian.performSpeek();
    }
}
