package com.sunje.chain;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 上午10:44
 */
public class CFilter implements Filter  {
    public String doFilter(String str) {
        return str.replace("C","");
    }
}
