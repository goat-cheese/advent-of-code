package com.goatcheese;

import com.goatcheese.days.Day1;

import javax.inject.Inject;
import java.util.Set;

public class AdventOfCode {

    public static void main(String[] args) throws Exception {
        System.out.println("----- Advent of Code Challenge ----- \n");

        System.out.println("***** First we solve Day 1 ******");
        Day1 day1 = new Day1();

        System.out.println("AOC - 1.1");
        System.out.println(day1.solvePart1() + "\n");

        System.out.println("AOC - 1.2");
        System.out.println(day1.solvePart2() + "\n");
    }
}
