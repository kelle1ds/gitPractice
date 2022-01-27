package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello CMU");
        System.out.println("Hello World");
        BranchOne branch = new BranchOne();
        branch.setNum(12);
        System.out.println(branch.getNum());
    }
}

class BranchOne {

    private int num;

    public BranchOne(){
        this.num = 0;
    }

    public int getNum(){
        return this.num;
    }

    public void setNum(int n){
        this.num = n;
    }

}

class square {
    private float num;

    public square() {
        this.num = 0.0f;
    }

    public float setNum(float n) {
        num = n*n;
        return this.num;
    }
}
