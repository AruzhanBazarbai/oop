public class ApplicationLab6 {
	public static void main(String[] args) {
		Client client = new Client("John Doe", "+77012012020", "950303300737");
		System.out.println(client.getName());

		BankAccount bacc = new BankAccount("KZ12312321321321", "1", client);
		
		Bank bank = new Bank("AnyBank");

		for(int i = 0; i < 150; i++) {
			System.out.println(bank.createAccount(bacc));
			System.out.println(bank.createClient(client));
		}

		System.out.println(bank.makeReport());

	}
}
