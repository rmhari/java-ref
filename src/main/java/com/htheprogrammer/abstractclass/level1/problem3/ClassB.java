package com.htheprogrammer.abstractclass.level1.problem3;

public class ClassB extends Marks{

    Integer percentage;
    Integer sub1;
    Integer sub2;
    Integer sub3;
    Integer sub4;

    public ClassB(final Integer subject1, final Integer subject2, final Integer subject3, final Integer subject4) {
        sub1 = subject1;
        sub2 = subject2;
        sub3 = subject3;
        sub4 = subject4;
    }

    @Override
    void getPercentage() {
        percentage = (sub1 + sub2 + sub3 + sub4) / 4;
        System.out.println("Percentage of StudentB : " + percentage);
    }

}
