package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem16 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = a.nextInt();
        String foff;
        if(age>=16)
            foff = ("You are old enough to drive");
        else foff = ("You are not old enough to drive");
        System.out.println(foff);
    }
}
