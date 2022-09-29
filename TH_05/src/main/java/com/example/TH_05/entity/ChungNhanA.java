package com.example.TH_05.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChungNhanA implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String maNV;
	private int MaMB;
	public ChungNhanA() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(MaMB, maNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChungNhanA other = (ChungNhanA) obj;
		return MaMB == other.MaMB && Objects.equals(maNV, other.maNV);
	}
	
}