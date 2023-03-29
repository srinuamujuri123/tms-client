package com.tms.client.model;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@Data
@MappedSuperclass
public class BaseEntity {

	boolean isActive;
	public Integer createdBy;
	public Integer updatedBy;
	public Date createdOn;
	public Date updatedOn;

}
