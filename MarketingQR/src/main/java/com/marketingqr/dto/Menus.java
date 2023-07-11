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
public class Menus {
	
	private Long menu_id;
	private Long m_fk_store_id;
	private String menu_name;
	private Long price;
	private String menu_intro;
	private String menu_img_url;
}
