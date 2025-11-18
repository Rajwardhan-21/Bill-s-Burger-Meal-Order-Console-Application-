package com.company;
import java.util.Scanner;

class TCA2009{

    int rno;
    String name;
    int per;

    public  TCA2009(){
        System.out.println("Welcome to TCA ");
    }

    public TCA2009(int rno,String name,int per){
        this.rno=rno;
        this.name=name;
        this.per=per;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public void display(){
        System.out.println("Your rno : "+this.rno);
        System.out.println("Your name : "+this.name);
        System.out.println("Your percentage : "+this.per);
    }
}

class TCA2020 extends TCA2009{

    double wp;
    String email;

    public  TCA2020(){
        super();
    }

    public TCA2020(int rno,String name,int per){
        super(rno,name,per);
    }

    public TCA2020(int rno,String name,int per,double wp,String email){
        this.rno=rno;
        this.name=name;
        this.per=per;
        this.email=email;
        this.wp=wp;
    }

    public double getWhatsapp() {
        return this.wp;
    }

    public void setWhatsapp(double wp) {
        this.wp = wp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display2020(){
        super.display();
        System.out.println("Your whatsapp number is: "+this.wp);
        System.out.println("Your email is :"+this.email);
    }
}
public class TCA {
    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);

        System.out.print("How many students entries are there :");
        int n=sc.nextInt();

        TCA2020 TCA[] = new TCA2020[n];

        System.out.println("Welcome to TCA ");

        for(int i=0;i<TCA.length;i++){

            System.out.println("Enter your name :");
            String name=sc.next();

            System.out.println("Enter your roll no :");
            int rno=sc.nextInt();

            System.out.println("Enter your Percentage :");
            int per=sc.nextInt();

            System.out.println("Can your also pls provide your Whatsapp no and Email : \n [Yes / No]");
            String choice =sc.next();

            TCA[i]=new TCA2020(rno,name,per);

            if(choice.equalsIgnoreCase("Yes")){

                System.out.println("Enter your whatsapp no :");
                double wp=sc.nextDouble();

               System.out.println("Enter email :");
               String mail=sc.next();

                TCA[i]=new TCA2020(rno,name,per,wp,mail);
                System.out.println();
            }

        }
        for (int j=0;j< TCA.length;j++) {
            TCA[j].display2020();
            System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}
