import java.util.Scanner;
//package com.example.java;
// modification in file ffff  creation branch 
 class Segment{
    private int a1;
    private int b1;

    public Segment(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
        ordonne();
    }
     public  float getLongueur(){
        float s = Math.abs(this.a1 - this.b1);
        return s;

     }
    private void ordonne() {
        if (a1 > b1) {
            int temp = a1;
            a1 = b1;
            b1 = temp;
        }
    }

    public boolean appartient(int x) {
        return x >= a1 && x <= b1;
    }
    public String toString() {
        return "SEGMENT[" + a1 + ", " + b1 + "]";
    }
}
class Segment  extends Presone{
   public int s ;
   public Presone( int s,int a1 , int b1) {
  super(int a1 , int b1);
   this.s = s ;
}
 public string toString(){
   retune  super.toString() +" s"+ this.s; 
}
}

class Main{
  public static void main(String[] args) {
        // Segment.Segment segment = new Segment.Segment(3, 7);
    // git commit 
            // objet 1
            Segment segment = new Segment(24,12);
            System.out.println(segment.toString());
            System.out.println(segment.appartient(15));
            System.out.println(segment.getLongueur());
            // objet 2
            Segment segment1 = new Segment(100,12);
            System.out.println(segment1.toString());
            System.out.println(segment1.getLongueur());
            Presone segment11 = new Presone(100,12);
            System.out.println(segment11.toString());
        
  }
}
