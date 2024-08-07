/* This is a small program that represents a Car Loan system and explores the use of 
control flow in Java*/

public class CarLoan {
	public static void main(String[] args) {
    //All the necessary information to calculating a car loan payment.    
    int carLoan = 10000;
    int loanLength= 3;
    int interestRate= 5;
    int downPayment= 2000;

    //Some requirements that would prevent a buyer from taking out an invalid car loan.
    if ((loanLength<=0)||(interestRate<=0)){
      System.out.println("Error! You must take out a valid loan.");
    } else if(downPayment>=carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      //The calculations that lead to the founding of the monthly payment.  
      int remainingBalance = carLoan-downPayment;
      int months= loanLength*12;
      int monthlyBalance= remainingBalance/months;
      int interest= (monthlyBalance*interestRate)/100;
      int monthlyPayment= monthlyBalance+interest;

      System.out.println("Your monthly payment shall be: "+ monthlyPayment);
    }


	}
}