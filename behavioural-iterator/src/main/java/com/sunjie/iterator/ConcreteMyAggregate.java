package com.sunjie.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: sunjie
 * Date: 2018/9/10
 * Time: 下午7:38
 */
public class ConcreteMyAggregate {
    private List<Object> list=new ArrayList<Object>();

    public void addObject(Object obj){
        this.list.add(obj);
    }

    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    //获取迭代器
    public MyIterator CreateIterator(){
        return new ConcreteMyIterator();
    }

    private  class ConcreteMyIterator implements MyIterator{
        private int cursor;//定义游标用于记录遍历时的位置


        public boolean hasnext() {
            if(cursor<list.size()){
                return true;
            }
            return false;
        }


        public Object next() {
            Object obj=list.get(cursor);
            if(cursor<list.size()){
                cursor++;
            }
            return obj;
        }
    }

}
