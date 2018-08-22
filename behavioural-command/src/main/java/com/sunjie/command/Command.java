package com.sunjie.command;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 下午3:01
 */
public interface Command {
    void  execute();//执行命令
    void  cancel();//取消命令
}
