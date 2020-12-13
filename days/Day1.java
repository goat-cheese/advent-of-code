package com.goatcheese.days;

import java.util.*;

public class Day1 {
    private static final String FILENAME = "day1-input.txt";
    private static final Integer SUM_TOTAL = 2020;

    private List<Integer> getInputValues(){
        Scanner scanner = new Scanner(Day1.class.getResourceAsStream(FILENAME));

        List<Integer> input = new ArrayList<>();
        while (scanner.hasNextLine()){
            input.add(scanner.nextInt());
        }

        return input;
    }

    public Integer solvePart1(){
        List<Integer> inputs = getInputValues();
        for(int i = 0; i < inputs.size(); i++){
            for(int j = i+1; j < inputs.size() - 1; j++){
                if(inputs.get(i) + inputs.get(j) == SUM_TOTAL){
                    return inputs.get(i) * inputs.get(j);
                }
            }
        }

        return 0;
    }

    public Integer solvePart2(){
        List<Integer> inputs = getInputValues();
        for(int i = 0; i < inputs.size(); i++){
            for(int j = i+1; j < inputs.size() - 1; j++){
                for(int h = j+1; h < inputs.size() - 2; h++){
                    if(inputs.get(i) + inputs.get(j) + inputs.get(h) == SUM_TOTAL){
                        return inputs.get(i) * inputs.get(j) * inputs.get(h);
                    }
                }
            }
        }

        return 0;
    }
}
