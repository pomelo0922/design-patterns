package com.sunjie.simplefactory;

import com.sunjie.simplefactory.model.Man;
import com.sunjie.simplefactory.model.Robot;
import com.sunjie.simplefactory.model.Woman;

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
