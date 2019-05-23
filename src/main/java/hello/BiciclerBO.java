package hello;


public class BiciclerBO {

	
	
	public Bicicle createBicicle( BicicleDTO dto) throws Exception {
		
		validateRequiredFields(dto);
		
		return Bicicle.builder()
		.brand(dto.getBrand())
		.color(dto.getColor())
		.model(dto.getModel())
		.price(dto.getPrice())
		.rinSize(dto.getRinSize()).build();
	}

	private Boolean validateRequiredFields(BicicleDTO dto) throws Exception {
		if(dto.getBrand() != null ) {
			throw new Exception("The brand is required");
		}
		if(dto.getModel() != null ) {
			throw new Exception("The model is required");
		}
		if(dto.getPrice() != null ) {
			throw new Exception("The price is required");
		}
		if(dto.getRinSize() != null ) {
			throw new Exception("The rin size is required");
		}
		return true;
	}
}
