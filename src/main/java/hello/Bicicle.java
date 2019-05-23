package hello;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Bicicle {

	private int id;
	
	private String color;
	
	private String model;
	
	private String brand;
	
	private Double price;
	
	private Integer rinSize;
	
	
}
