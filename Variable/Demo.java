/*class Demo{
	int a=100;
	int b=200;
 static int c=10;
 public static void main(String[] args){
   Demo d1= new Demo();
   System.out.println(d1.a+d1.b);
   System.out.println(d1.a+d1.b+d1.c);
   d1.c=100;
   d1.a=10;
   System.out.println(d1.a+d1.b+d1.c);
   Demo d2= new Demo();
   System.out.println(d2.a+d2.b);
   System.out.println(d2.a+d2.b+d2.c);
   
 }
}*/


class Demo{
	int a=100;
  public static void main(String[] args){
	Demo d1= new Demo();
	d1.m1();
 }
 public void m1(){
	 System.out.println(a);
 }
 
}