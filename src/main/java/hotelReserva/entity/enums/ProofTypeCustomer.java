package hotelReserva.entity.enums;

public enum ProofTypeCustomer {

		DropdownValues(0),
		PANcard(1),
		VoterId(2),
		Passport(3),
		DrivingLicense(4),
		Aadharcard(5);
	
		private Integer code;
		
		private ProofTypeCustomer(int value) {
			this.code = value;
		}
	
		public Integer getCode() {
			return this.code;
		}
		
		public static ProofTypeCustomer valueOf(int value) {
			for (ProofTypeCustomer code : ProofTypeCustomer.values()) {
				if (code.getCode() == value) {
					return code;
				}
			}
			throw new IllegalArgumentException("Codigo invalido");
		}
}
