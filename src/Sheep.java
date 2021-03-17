import java.util.ArrayList;
import java.util.List;

/*
* 瑛太莱的一个笔试题
* 母羊在2岁和4岁生一个小母羊 问到15岁多少羊
*
* */
public class Sheep {
    public int age = 0;
    public static int getSheeps(int n){
        ArrayList<Sheep> sheeps = new ArrayList<Sheep>();
        sheeps.add(new Sheep());
        List<Sheep> addSheeps = new ArrayList<Sheep>();
        List<Sheep> delSheeps = new ArrayList<Sheep>();
        for(int i=0; i<=n; i++){
            for(Sheep sheep: sheeps){
                sheep.age++;
                if(sheep.age == 2||sheep.age ==4){
                    addSheeps.add(new Sheep());
                }else if(sheep.age ==5){
                    delSheeps.add(sheep);
                }
            }
            sheeps.addAll(addSheeps);
            sheeps.removeAll(delSheeps);
            addSheeps.clear();
            delSheeps.clear();
        }
        return  sheeps.size();
    }

    public static  int get(int year){
        int num =1;
        for(int i=0; i<=year; i++){
            if(i==2){
                num+=get(year-2);
            }else if(i==4){
                num+=get(year-4);
            }else if(i==5){
                num--;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(getSheeps(15));
        System.out.println(get(15));
    }
}
