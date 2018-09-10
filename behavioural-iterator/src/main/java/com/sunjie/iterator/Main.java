package com.sunjie.iterator;

/**
 * Description:
 * User: sunjie
 * Date: 2018/9/10
 * Time: 下午7:39
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMyAggregate cma=new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");
        cma.addObject("dd");
        MyIterator iterator=cma.CreateIterator();
        while(iterator.hasnext()){
            System.out.println(iterator.next());
        }
    }
}
