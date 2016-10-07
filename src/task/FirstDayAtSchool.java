package task;

import java.util.Arrays;

public class FirstDayAtSchool { 

    public String[] prepareMyBag() {
        String[] schoolbag = { "Books", "Notebooks", "Pens" };
        System.out.println("My school bag contains: "
                + Arrays.toString(schoolbag));
        return schoolbag;
    }
 
    public String[] addPencils() {
        String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
        System.out.println("Now my school bag contains: "
                + Arrays.toString(schoolbag));
        return schoolbag;
    }
}

// https://www.javacodegeeks.com/2014/11/junit-tutorial-unit-testing.html
//https://github.com/SquareSquash/java/blob/master/src/test/java/com/squareup/squash/SquashEntryTest.java


// https://www.tutorialspoint.com/junit/junit_writing_tests.htm