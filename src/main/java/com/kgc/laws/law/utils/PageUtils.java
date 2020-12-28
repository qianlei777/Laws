package com.kgc.laws.law.utils;

import com.kgc.laws.law.pojo.Page;

import java.util.*;

public class PageUtils{

    public static List<Page>getChild(Integer id,List<Page> allPage){
        //顶级菜单下面的子菜单
        List<Page>childList = new ArrayList();
        for (Page page : allPage) {
            if(page.getPageparent()==id){
                childList.add(page);
            }
        }
        //z子菜单的下级菜单的下级
        for (Page page : childList) {
            page.setChildpage(getChild(page.getId(),allPage));
        }
        if(childList.size()==0){
            return null;
        }
        return sortList(childList);
    }
    public static List<Page> sortList(List<Page> list){
        Collections.sort(list, new Comparator<Object>()
        {
            @Override
            public int compare(Object o1, Object o2) {
                Page p1 = (Page)o1;
                Page p2 = (Page)o2;
                if (p1.getPagesort()>p2.getPagesort()){
                    return 1;
                }else if (p1.getPagesort()<p2.getPagesort()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        return list;
    }
    public static TreeMap<Integer,String> getParent(Integer id,List<Page> allPage,TreeMap<Integer,String>treeMap){
        for (Page page : allPage) {
            if(page.getId()==id){
                if (page.getPagelevel()==1){
                    treeMap.put(1,page.getPagename());
                    break;
                }else{
                    treeMap.put(page.getPagelevel(),page.getPagename());
                    getParent(page.getPageparent(),allPage,treeMap);
                }
                break;
            }
        }
        return treeMap;
    }

}
