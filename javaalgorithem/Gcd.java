package javaalgorithem;

public class Gcd{
    public static void main(String[] args){
        int o=gcd(10,6);
        System.out.println(o);
    }
    public static int gcd(int p,int q){
        if(q==0) return p;
        int r=p%q;
        return gcd(q,r);
    }
}