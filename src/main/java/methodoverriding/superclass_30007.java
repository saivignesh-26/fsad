package methodoverriding;
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

// Subclass SBI
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 2.5;
    }
}

// Subclass HDFC
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 5.0;
    }
}

public class superclass_30007 {

	public static void main(String[] args) {
	
		Bank bank;

        bank = new SBI();
        System.out.println("Final SBI Rate" + bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("Final HDFC Rate: " + bank.getInterestRate() + "%");

	}

}
