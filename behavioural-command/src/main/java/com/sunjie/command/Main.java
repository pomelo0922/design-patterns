package com.sunjie.command;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 下午3:03
 */
public class Main {

    public static void main(String[] args){
        //创建接收者
        Receiver receiver=new Receiver();
        //创建命令对象，并设置接收者
        Command command=new ConcreteCommand(receiver);

        //创建调用者，设置命令
        Invoker invoker=new Invoker(command);

        invoker.runCommand();
        invoker.cancelCommand();

    }
}
