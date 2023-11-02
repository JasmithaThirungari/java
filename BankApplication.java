class BankApplication {
    public static void main(String args[]) {
      int bank_application=9076;
      String bank_name=" bank_of_india";
      long account_number=9799476338287l;
      String person_name="jasmitha";
      int totalamount=50000;
      int withdraw=4000;
      int balance_amount=totalamount-withdraw;
      if(totalamount>100000)
           System.out.println("get credit card");
       else if(totalamount>50000)
            System.out.println("get health insurence");
       else if(totalamount>30000)     
            System.out.println("get LIC");
      System.out.println("Bank application number is : " + bank_application);
      System.out.println("Bank name is : " + bank_name);
      System.out.println("Bank account number is : " + account_number);
      System.out.println("Bank person name is : " + person_name);
      System.out.println("Bank total amount is : " + totalamount);
      System.out.println("Bank withdraw amount is : " + withdraw);
      System.out.println("Bank balance amount  is : " + balance_amount);
}
}
      
