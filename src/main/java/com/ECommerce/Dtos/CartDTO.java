package com.ECommerce.Dtos;


import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartDTO {
	
	@NotNull
	private Integer productId;
	
	private String productName;
	
	private Double price;
	
	@Min(1)
	private Integer quantity;
	
}
