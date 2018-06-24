package com.sunjie.factory.factory;

import com.sunjie.factory.Persion;
import com.sunjie.factory.PersionFactory;
import com.sunjie.factory.mdel.Man;
import com.sunjie.factory.mdel.Woman;

/**
 * Description:
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午5:29
 */
public class WomanFactory implements PersionFactory {


    public Persion getPersion() {
        return new Woman();
    }
}
