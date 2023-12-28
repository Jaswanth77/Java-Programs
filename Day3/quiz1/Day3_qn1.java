
class Day3_qn1{


    static class Account
    {
        int Acc_id,Acc_Balance;
        String Name;

        Account(int Acc_id,String Name,int Acc_Balance)
        {
            this.Acc_id = Acc_id;
            this.Name = Name;
            this.Acc_Balance = Acc_Balance;
        }

        public void Credit(int cash)
        {
            this.Acc_Balance = this.Acc_Balance + cash;

            System.out.println("Account id:"+this.Acc_id);
            System.out.println("Name :"+this.Name);
            System.out.println("Account Balance: Rs."+this.Acc_Balance);

        }

        public void Debit(int cash)
        {
            this.Acc_Balance = this.Acc_Balance - cash;
            System.out.println("Account id:"+this.Acc_id);
            System.out.println("Name :"+this.Name);
            System.out.println("Account Balance: Rs."+this.Acc_Balance);
        }
    }

    public static void main(String[] args) {
        Account A = new Account(12344,"Newname",5000);
        Account B = new Account(12345,"Oldname",2000);

        A.Debit(1500);
        B.Credit(1500);

        B.Debit(3000);
        A.Credit(3000);
    }
}
