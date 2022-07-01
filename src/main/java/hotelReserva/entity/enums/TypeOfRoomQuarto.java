package hotelReserva.entity.enums;

public enum TypeOfRoomQuarto {
	
	PremierSuite(0),
	DeluxeAC(1),
	DeluxeNonAC(2);

	private Integer code;
	
	private TypeOfRoomQuarto(int value) {
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
