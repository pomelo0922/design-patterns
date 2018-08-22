package com.sunjie.command;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 下午3:02
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;


    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }

    public void execute() {
        //可进行执行命令前相关操作
        receiver.action();//执行命令
        //可进行执行命令后相关操作

    }

    public void cancel() {
        receiver.unAction();
    }
}
