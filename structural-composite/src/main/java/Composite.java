import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/9
 * Time: 下午9:05
 */
public class Composite {

    private List<Composite> composites=new ArrayList<Composite>();

    private List<Leaf> childLeaf = new ArrayList<Leaf>();

    private String name ;

    public void addComposite(Composite c){
        composites.add(c);
    }

    public void addLeaf(Leaf leaf){
        childLeaf.add(leaf);
    }


    public Composite(String name){
        this.name = name;
    }


    public void print(){
        System.out.println(this.name);
        for(Leaf leaf : childLeaf){
            leaf.print();
        }
        //输出当前对象的子对象了
        for(Composite c : composites){
            //递归输出每个子对象
            c.print();
        }
    }


}
