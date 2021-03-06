/**
 * 
 */
package com.example.hwmanage.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author saitoshu
 *
 */
public class FloorForm implements HwManageForm {

	@NotNull
	protected Long floorCd;

	@NotBlank
	@Size(max=40)
	protected String floorName;

	public Long getFloorCd() {
		return floorCd;
	}

	public void setFloorCd(Long floorCd) {
		this.floorCd = floorCd;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

}
