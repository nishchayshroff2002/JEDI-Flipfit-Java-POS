package com.flipfit.business;

import java.util.List;

public class FactoryService implements FactoryInterface{
    public void printList(List<String>list){
        for(String s:list){
            System.out.println(s);
        }
    }

}
