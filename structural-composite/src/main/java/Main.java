/**
 * Description:
 * User: sunjie
 * Date: 2018/8/9
 * Time: 下午9:09
 */
public class Main {


    public static void main(String[] args){

        Leaf leaf1=new Leaf("苹果");
        Leaf leaf2=new Leaf("香蕉");
        Leaf leaf3=new Leaf("梨子");
        Leaf leaf4=new Leaf("草莓");



        Composite composite=new Composite("小盘子");
        composite.addLeaf(leaf1);
        composite.addLeaf(leaf2);
        composite.addLeaf(leaf3);

        Composite composite1=new Composite("大盘子");
        composite1.addComposite(composite);
        composite1.addLeaf(leaf4);


        composite1.print();



    }
}
