1.Max Two

     int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
                         
        if(a>=b)
        {
            System.out.println(a);      
        }
        else{
            System.out.println(b);
        }


2.Max Of Three 4

       int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a);
        }
        else if(b>=c)
        {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

3.Grade 2

      int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int percentage=(a+b+c+d+e)/5;
        System.out.println(percentage);
        if(percentage>=90)
        {
            
            System.out.println('A');
        }
        else if(percentage>=80 && percentage <90)
        {
            
            System.out.println('B');
        }
        else if(percentage>=70 && percentage<80)
        {
           
            System.out.println("C");
        }
        else if(percentage>=60 && percentage<60)
        {
            
            System.out.println("D");
        }
        else if(percentage>=40 && percentage<60)
        {
            
            System.out.println("E");
        }
        else{
            System.out.println("F");
            
        }

4.Which Month? 1

      public static void main(String[] args) {
   
        String arr[]={"January", "February", "March", "April", "May", "June", "July","August", "September", "October", "November", "December"};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(arr[n-1]);
    }

5.Valid Triangle

     int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b+c ==180)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

6.Bank Account 5

        int bal,op,amount;
        Scanner sc=new Scanner(System.in);
        bal=sc.nextInt();
        op=sc.nextInt();
        amount=sc.nextInt();
        if(op==1)
        {
            bal+=amount;
        }
        else if(amount<=bal)
        {
            bal-=amount;
        }
        else{
            System.out.println("Insufficient Funds");
            return;
        }
        System.out.println(bal);

7.Divisible by Two Number

     int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%5==0 && a%11==0)
        {
            System.out.println(1);
        }
        else{
             System.out.println(0);
        }

8.Which Triangle? 2

        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b && a==c)
        {
            System.out.println("equilateral");
        }
        else if(a!=b && b!=c && a!=c)
        {
            System.out.println("scalene");
        }
        else{
            System.out.println("isosceles");
        }

9.Categorize Number?

   int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println(1);
        }
        else if(a<0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(0);
        }

10.floor of two numbers

  int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a/b);
