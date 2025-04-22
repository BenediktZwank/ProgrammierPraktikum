package ÜB2;

import java.util.ArrayList;

public class Phd extends Student{



    private String dissTopic;

    public Phd(String firstName, String lastName, int age, int matNumber, int semester, ArrayList<String> courses, String dissTopic) {
        super(firstName, lastName, age, matNumber, semester, courses);
        this.dissTopic = dissTopic;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " dissertion Topic: " +dissTopic;
    }


}
