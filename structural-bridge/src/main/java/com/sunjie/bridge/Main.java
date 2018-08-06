package com.sunjie.bridge;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/6
 * Time: 下午9:31
 */
public class Main {

     public static void main(String[] args){
         Computer computer=new NotebookComputer();

         Brand brand=new AppleBrand();

         brand.setComputer(computer);


         brand.use();
     }
}
