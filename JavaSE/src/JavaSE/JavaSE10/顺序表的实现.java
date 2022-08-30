package JavaSE.JavaSE10;

import java.util.Arrays;

class MyArrayList{
    public int[] elem;
    public int usedSize;

    public MyArrayList(){
        this.elem = new int[10];
        this.usedSize = 0;
    }

    // 打印顺序表
    public void display() {
        System.out.println(Arrays.toString(this.elem));
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos > this.usedSize || pos < 0){
            System.out.println("pos不合法");
            return;    //在void里面return相当于直接结束程序
        }
        if (this.usedSize == this.elem.length){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);   //扩容的方法
        }
            int i =this.usedSize-1;
            while (pos <= i){
                this.elem[i+1] = this.elem[i];
                i--;
            }
            this.elem[pos] = data;
            usedSize++;

    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize ; i++) {
            if (this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

     // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos >= this.usedSize || pos < 0){
            return -1;
        }else{
            return this.elem[pos];
        }
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos >= this.usedSize || pos < 0){
            return;
        }else{
            this.elem[pos] = value;
        }
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = search(toRemove);
        if (pos == -1){
            System.out.println("没有这个数字");
            return;
        }
        for (int i = pos; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
 }



public class 顺序表的实现 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i,i);
        }
        myArrayList.display();

    }
}
