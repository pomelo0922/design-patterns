package com.sunjie.iterator;

/**
 * Description:
 * User: sunjie
 * Date: 2018/9/10
 * Time: 下午7:38
 */
public interface MyIterator {
    boolean hasnext();//是否有下一个元素
    Object next();//获取当前游标所指元素,并将游标加1
}
