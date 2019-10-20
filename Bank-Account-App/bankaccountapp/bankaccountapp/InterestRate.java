package bankaccountapp;

public interface InterestRate {
	
	default double get_base_rate() {
		return 2.5;
	}
}
