package com.stackroute.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    private List<String> stringList=new ArrayList<>();

    public List<String> addArray(String [] inputArray){
        for(String input:inputArray){
            stringList.add(input);
        }
        return stringList;
    }

    public List<String> removeAll(){
        stringList.clear();
        return stringList;
    }

    public List<String> update(int index,String value){
        stringList.set(index,value);
        return stringList;
    }
}
