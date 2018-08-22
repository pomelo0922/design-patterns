package com.sunje.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 上午10:46
 */
public class FilterChain {

    private List<Filter> filterChain=new ArrayList<Filter>();

    public FilterChain addFilter(Filter filter){
        filterChain.add(filter);
        return this;
    }

    public String doFilter(String str){
        for(Filter filter :filterChain){
            str = filter.doFilter(str);
        }
        return str;
    }
}
