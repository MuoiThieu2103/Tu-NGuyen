public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id,String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void transferTo(Account another, int amount) {
        if (amount > this.balance) {
        }
    }

    public void credit(int amount){
        this.balance += amount;
    }

    public void debit(int amount){
        if (amount <= this.balance);
    }
}
