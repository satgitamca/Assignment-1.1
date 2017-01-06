class variables
{
   int assignment=1;
   int num=0;
   int marks=0;
   int age=0;
   int pyramidvalue=0;

}

class BusinessLogic
{

 public String checkNumber(int number)
   {
      if(number==0)
        return "You Have Entered Zero";
      else if(number>0)
        return "You Have Entered Positive Value";
      else 
        return "You Have Entered Negative Value";
   }

 public String gradecalulator(int marks,int age )
   {
      String result="Fail";
      if(marks>70 || (marks>60 && age<15) )
         result="A";
      else if( (marks>60 && marks<71)  ||  ((marks>44 && marks<61) && age<15))
         result="B";
     
      else if( (marks<61)  || (marks<45 && age<15) )
         result="C";

      return "Your Grade is :"+result;
   }
 
  

}


class assignment1
{

public static void main(String[] args)
{
    variables v1 =new variables();
    BusinessLogic L1=new BusinessLogic();

    System.out.print("Enter 1 for Number validation, 2 for Marks Calculating : "); 
    v1.assignment=Integer.parseInt(System.console().readLine());

    if(v1.assignment==1)
	{
         System.out.print("Please Enter a number: ");    
         v1.num=Integer.parseInt(System.console().readLine());
         System.out.print(L1.checkNumber(v1.num));
        }
    
    else if(v1.assignment==2)
	{
         
         System.out.print("Please Enter Obtained Marks: ");    
         v1.marks=Integer.parseInt(System.console().readLine());
         System.out.print("Please Enter your Age: ");    
         v1.age=Integer.parseInt(System.console().readLine());   
         System.out.print(L1.gradecalulator(v1.marks,v1.age));

        }
    


    
} 
}