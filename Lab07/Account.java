public class Account {
    private static int count = 0;
    private String name;
    private String pin;
    private int id;
    private double balance;

    public Account(String name, String pin){
        this.name = name;
        this.pin = pin;
        this.id = Account.count++;
        this.balance = 0.0;
    }
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public boolean isPin(String attempt){
        boolean isVaild = attempt.equals(this.pin);
        return isVaild;
    }
    public void deposit(double amount){
        if(amount >= 0){
            this.balance += amount;
        }
    }
    public double withdraw(double amount){
        if(amount >= 0 && this.balance >= amount){
            this.balance -= amount;
        }
        return this.balance;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s, Account ID: %d, Balance: $%.02f", this.name, this.id, this.balance);
    }
}
