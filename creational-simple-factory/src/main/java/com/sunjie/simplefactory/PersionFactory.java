package com.sunjie.simplefactory;

import com.sun.prism.es2.ES2Graphics;
import com.sunjie.simplefactory.Model.Man;
import com.sunjie.simplefactory.Model.Robot;
import com.sunjie.simplefactory.Model.Woman;

import java.lang.reflect.Type;

/**
 * Description:
 * User: sunjie
 * Date: 2018/6/24
 * Time: 下午4:37
 */
public class PersionFactory {

    public static Persion getPersion(String persionType){
        if ("W".equals(persionType)){
            return new Woman();
        }else if ("M".equals(persionType)){
            return new Man();
        }else if("R".equals(persionType)){
            return new Robot();
        }else{
            throw new RuntimeException("Persion type is not exist");
        }
    }
}
