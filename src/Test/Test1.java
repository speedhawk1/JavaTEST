package Test;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Administrator on 2016/9/3.
 */
public class Test1 {
    public static void main(String[] args){
        float store=98.5f;
        String name="张三";
        String gender="男";
        System.out.print("姓名："+name+" ");
        System.out.print("性别："+gender+" ");
        System.out.print("分数："+store+" "+"\n");
        String a="44.4";
        System.out.println(Integer.MIN_VALUE+"\t"+Integer.MAX_VALUE+"\n");
        Double b= Double.parseDouble(a);
        double c=(double)b;
        System.out.print(c);
    }
}
