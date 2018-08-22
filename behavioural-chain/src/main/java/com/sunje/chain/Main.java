package com.sunje.chain;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 上午10:46
 */
public class Main {

    public static void main(String[] args){

        FilterChain filterChain=new FilterChain();

        filterChain.addFilter(new AFilter()).addFilter(new BFilter()).addFilter(new CFilter());


        String str = filterChain.doFilter("A我B已经C被ACB过滤B了C");
        System.out.println(str);

    }
}
