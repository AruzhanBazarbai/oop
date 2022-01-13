import java.math.BigDecimal;
class Task1Main{
    public static void main(String[] args){
        Client c1=new Client("Aaaaaaa","111111","1");
        Client c2=new Client("Bbbbbbb","222222","2");
        Client c3=new Client("Ccccccc","333333","3");
        GoldenAccount a1=new GoldenAccount("44444","1",c1,new BigDecimal("2000.00"));
        PremiumAccount a2=new PremiumAccount("55555","1",c2,new BigDecimal("1000"));
        RegularAccount a3=new RegularAccount("666666","1",c3,new BigDecimal("500.00"));
        ATM d1=new ATM();
        Smartphone d2=new Smartphone();
        d1.withdraw(a1,new BigDecimal("1000.00"));
        d1.deposit(a1,new BigDecimal("100.00"));
        d1.getStatement(a1);
        d1.getBalance(a1,"1");
        d2.withdraw(a2,new BigDecimal("100.00"));
        d2.deposit(a2,new BigDecimal("10.00"));
        d2.getStatement(a2);
        d2.getBalance(a2,"1");
        // a1.credit(new BigDecimal("100000.00"));
        // System.out.println(a1.balance);
        // a1.debit(new BigDecimal("1000.00"));
        // System.out.println(a1.balance);
        // a1.paymentForService();
        // System.out.println(a1.balance);
        // System.out.println(a1.balanceBuilder());
        // a1.getStatement();
        // a2.credit(new BigDecimal("10000.00"));
        // System.out.println(a2.balance);
        // a2.debit(new BigDecimal("100.00"));
        // System.out.println(a2.balance);
        // a2.paymentForService();
        // System.out.println(a2.balance);
        // System.out.println(a2.balanceBuilder());
        // a2.getStatement();
        // a3.credit(new BigDecimal("10000.00"));
        // System.out.println(a3.balance);
        // a3.debit(new BigDecimal("10.00"));
        // System.out.println(a3.balance);
        // a3.paymentForService();
        // System.out.println(a3.balance);
        // System.out.println(a3.balanceBuilder());
        // a3.getStatement();
    } 
}