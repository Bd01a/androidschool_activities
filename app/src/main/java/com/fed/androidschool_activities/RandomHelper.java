package com.fed.androidschool_activities;

import java.util.ArrayList;
import java.util.Random;

public class RandomHelper {
    private String randString(int length) {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = generator.nextInt(++length);
        randomLength++;
        char tempChar;
        for (int i = 0; i < randomLength; i++){
            tempChar = (char) (generator.nextInt(96) + 32);
            randomStringBuilder.append(tempChar);
        }
        return randomStringBuilder.toString();
    }

    public TestModel randInitial(){

        Random random = new Random();
        String string = randString(random.nextInt(10));

        ArrayList<Integer> ints = new ArrayList<>();
        int n = random.nextInt(10);
        n= n!=0 ? n : 1;
        for(int i=0; i<n; i++){
            ints.add(random.nextInt());
        }
        ArrayList<Float> flts = new ArrayList<>();
        n = random.nextInt(10);
        n= n!=0 ? n : 1;
        for(int i=0; i<n; i++){
            flts.add(random.nextFloat());
        }
       TestModel testModel = new TestModel(string, ints, flts);
        return testModel;
    }

}
