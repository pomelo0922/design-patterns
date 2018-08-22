package com.sunjie.command;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/22
 * Time: 下午3:03
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    //执行命令
    public void runCommand() {
        command.execute();
    }

    //取消命令
    public void cancelCommand() {
        command.cancel();
    }

}
