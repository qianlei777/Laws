package com.kgc.laws.law.utils;

import com.kgc.laws.law.pojo.Page;
import org.springframework.stereotype.Component;

import java.util.Comparator;

public class PageComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Page p1 = (Page)o1;
        Page p2 = (Page)o2;
        if(p1.getPagesort()>p2.getPagesort()){
            return 1;
        }
        return -1;
    }
}
