package com.htheprogrammer.abstractclass.level1.problem3;

public class ClassA extends Marks{

    Integer percentage;
    Integer sub1;
    Integer sub2;
    Integer sub3;

    public ClassA(final Integer subject1, final Integer subject2, final Integer subject3) {
        sub1 = subject1;
        sub2 = subject2;
        sub3 = subject3;
    }

    @Override
    void getPercentage() {
        percentage = (sub1 + sub2 + sub3) / 3;
        System.out.println("Percentage of StudentA : " + percentage);
    }
}
