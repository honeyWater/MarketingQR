package com.marketingqr.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stores {
	private Long store_id;
	
	private	Long s_fk_store_user_id;
	
	private String name;
	
	private String address;
	
	private String phone;
	
	private String runtime;
	
	private String introduction;
	
	private Long business_num;
	
	private String represent_img;
}
