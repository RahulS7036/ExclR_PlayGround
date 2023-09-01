//ExceR Basic Bnking project

 
 import java.util.*;
 class Account{

int accountNo;
int balance;
String accountHolderName;


 Account(int balance, int accountNo, String accountHolderName){
    this.balance = balance;
    this.accountNo = accountNo;
    this.accountHolderName = accountHolderName;

 }
void display(){
    System.out.println("Account Balance : " + accountHolderName);
    System.out.println("Account Balance : " + accountNo);
    System.out.println("Account Balance : " + balance);

}
void deposit(int amount){
    balance += amount;


}
void withdraw(int amount){
    balance -= amount;

}
}
public class Bank{
    public static void main(String[] args){
        Account a =new Account(1200000, 12345, "Rahul sabale") ;
        Scanner sc = new Scanner(System.in);
       int des ;
        do{
            System.out.println("Enter your choice: ");
        System.out.println("1 . Display ");
        System.out.println("2 . withdraw ");
        System.out.println("3 .Deposit ");
         int choice = sc.nextInt();
         
        
        
       switch(choice){
        case 1:
             a.display();
             break;
        case 2:
              System.out.print("Enter amount: ");
              int amount = sc.nextInt();
              a. withdraw(amount); 
              a. display();
              break; 
        case 3:
              System.out.print("Enter amount: ");
              int deposit = sc.nextInt();
              a. deposit(deposit);
              a.display();
              break; 
        default:
         System.out.print("Please enter correct choice") ;    

       }
       System.out.println("Do you wan't to exit :");
       System.out.println("1.NO  2. Yes");
       
      des = sc.nextInt();

    }while(des == 1);
        
     sc.close();

    }

}


