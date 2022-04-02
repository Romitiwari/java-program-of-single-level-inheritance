class Val
{ int x,y;
  void getval(int a,int b)
{ x=a;
  y=b;
}
void showval()
{ System.out.println("the value of x:" +x+" and the value of y :"+y);
}
}
class Sum extends Val
{ int sum;
 void getsum()
{ sum=x+y;
  showval();
  System.out.println("sum of : "+x+" and y :"+y);
}}
class Singlelevelinheritance
{ public static void main(String args[])
{ Sum s=new Sum();
  s.getval(23,45);
  s.getsum();
}
}