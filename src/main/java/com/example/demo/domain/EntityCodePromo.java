package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bfjzm0t7xwx85t9vpsya.table_promo_code")
public class EntityCodePromo {

	@Id
	@Column(name = "code")
	private int code;

	@Column(name = "type")
	private String type;

	@Column(name = "value")
	private int value;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

}