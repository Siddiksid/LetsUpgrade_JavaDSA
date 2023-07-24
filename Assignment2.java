import java.util.*;
class Pattern1 {
  public static void main(String[] args) {
    // 1.print N stars
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print('*');
        }

    //2.Print a matrix of stars
      for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
  // 3.stair pattern 1
      for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
  // 4.Skip Even numbers Half pyramid

      for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    continue;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }

  // 5.Two Line Star Pattern

     for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=n;j++)
            {
                if(j==1 || j==n)
                {
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    // 6.Leading spaces pyramid

    for(int i=1;i<=n;i++)
        {
            for(int s=n;s>i;s--)
            {
                System.out.print(" ");
            }
        
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

    // 7.From top to down(Print N natural numbers)

    for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }

    // 8.Odd Game 1
    for(int i=1;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }

    // 9.Summation Game

     int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    
    // 10.From down to top

    for(int i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }

    // 11.Multiplication Table 52
     for(int i=1;i<=10;i++)
        {
            int result=n*i;
             System.out.println(n + " * " + i + " = " + result);
        }

    // 12.Easy Power

     System.out.println((int)Math.pow(n,m));


    // 13.Count factor

    int c=0;
    
    for(int i=1;i<=n;i++)
    {
        
        if(n%i==0)
        {
            c+=1;
        }
    }
        System.out.println(c);

    // 14.Is it prime?

      if(n<=1)
       {
           System.out.println("NO");
           return;
       }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    // 15.Is It Perfect? 1
         if (T < 1 || T > 10) {
           
        } else {
            
            for (int i = 0; i < T; i++) {
               
                int N = scanner.nextInt();

               
                boolean isPerfect = isPerfectNumber(N);

                
                if (isPerfect) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
    private static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

  // 16.count the digits 2

      
        for(int i=1;i<=n;i++)
        {
            
            a=sc.nextInt();
            if(a==0)
            {
                System.out.println(1);
                continue;
            }
             c=0;
             while(a>0)
             {
                 
                 a/=10;
                 c++;
             }
            System.out.println(c);
        }

// 17.Armstrong Numbers!
public class Solution {
public static boolean isArmstrong(int n)
{
    int ans=0;
    int dup=n;
    while(n>0)
    {
        int d=n%10;
        ans+=Math.pow(d,3);
        n/=10;
    }
    if(ans==dup)
    {
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String[] args) {
      
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isArmstrong((i)))
               {
                   System.out.println(i);
               }
        }
    }
}



// 18.Print all the primes


public class Solution {
public static boolean isPrime(int n)
{
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }

// 19.Find LCM of two numbers

      public class Solution {
   public static int calculateGCD(int num1, int num2) {
        if(num2==0)
        {
            return num1;
        }
       else{
           return calculateGCD(num2,num1%num2);
       }
    }

    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
    }
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int lcm = calculateLCM(a, b);
   
       System.out.println(lcm);

  }


        // 20.Palindromic Integer 2

           int rev=0;
        int dup=n;
        while(dup>0)
        {
            int d=dup%10;
            rev=(rev*10)+d;
            dup/=10;
        }
        if(rev==n)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    // 21.Inverted Half Pyramid 1
       for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
            }
            
            System.out.println();
        }
      
    // 22.Leading spaces inverted pyramid

      
        for (int i = 0; i < N; i++) {
           
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 0; k < N - i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
      
  // 23.Star Pattern II

          for (int i = n; i >= 1; i--) {
            // Loop for printing asterisks and spaces
            for (int j = n; j >= 1; j--) {
                if (j == i || i == N || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

  // 24.Photo Frame Pattern
 for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int k=1;k<=n;k++)
                {
                    System.out.print('*');
                }
            }
            else{
                for(int j=1;j<=n;j++)
                {
                    if(j==1 || j==n)
                    {
                        System.out.print('*');
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            
            
            System.out.println();
        }
      
      
}
    
