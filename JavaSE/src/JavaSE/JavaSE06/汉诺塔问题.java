package JavaSE.JavaSE06;

public class 汉诺塔问题 {
    public static void main(String[] args) {
        hano(3,'A','B','C');  //有三个盘子在A上，借助B移动到C上

    }
    public static void move(char pos1,char pos2){ //将pos1上的一个盘子移动到pos2上
        System.out.print(pos1+"->"+pos2+" ");
    }

    /**
     *
     * @param n     //盘子数目
     * @param pos1  //起始位置
     * @param pos2  //中途位置
     * @param pos3  //结束位置
     */
    public static void hano(int n ,char pos1, char pos2, char pos3){ //将pos1上的n个盘子通过pos2移动到pos3
        if(n == 1){
            move(pos1,pos3);             //将pos1上的一个盘子移动到pos3上
        }else {
            hano(n-1,pos1,pos3,pos2); //将pos1上的n-1个盘子通过pos3移动到pos2上
            move(pos1,pos3);             //将pos1上的一个盘子移动到pos3上
            hano(n-1,pos2,pos1,pos3); //将pos2上的n-1个盘子通过pos1移动到pos3上
        }
    }
}
