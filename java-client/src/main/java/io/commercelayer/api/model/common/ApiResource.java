package io.commercelayer.api.model.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.util.LogUtils;

public abstract class ApiResource extends ApiObject implements Serializable {

	private static final long serialVersionUID = -7418858525047434358L;
	
	protected String resourceName = null;
	protected Long id = null;
//	protected String creatorId = null;
	protected String creatorResource = null;
	protected LocalDateTime createdAt = null;
	protected LocalDateTime updatedAt = null;
	
	public ApiResource() {
		super();
	}
	
	public ApiResource(Long id) {
		this();
		this.id = id;
	}
	
	public String getPlural() {
		return getClass().getSimpleName().concat("s");
	}

	// @SuppressWarnings("unchecked")
	// public T resourceName(String resourceName) {
	// this.resourceName = resourceName;
	// return (T)this;
	// }

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	// @SuppressWarnings("unchecked")
	// public T id(String id) {
	// this.id = id;
	// return (T)this;
	// }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// @SuppressWarnings("unchecked")
	// public T creatorId(String creatorId) {
	// this.creatorId = creatorId;
	// return (T)this;
	// }

//	public String getCreatorId() {
//		return creatorId;
//	}
//
//	public void setCreatorId(String creatorId) {
//		this.creatorId = creatorId;
//	}

	// @SuppressWarnings("unchecked")
	// public T creatorResource(String creatorResource) {
	// this.creatorResource = creatorResource;
	// return (T)this;
	// }

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
	}

	// @SuppressWarnings("unchecked")
	// public T createdAt(DateTime createdAt) {
	// this.createdAt = createdAt;
	// return (T)this;
	// }

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	// @SuppressWarnings("unchecked")
	// public T updatedAt(DateTime updatedAt) {
	// this.updatedAt = updatedAt;
	// return (T)this;
	// }

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, LogUtils.TO_STRING_STYLE, false, ApiResource.class);
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		else
		if (o == null || getClass() != o.getClass()) return false;

		ApiResource address = (ApiResource) o;
		
		return Objects.equals(this.resourceName, address.resourceName) 
				&& Objects.equals(this.id, address.id)
//				&& Objects.equals(this.creatorId, address.creatorId)
				&& Objects.equals(this.creatorResource, address.creatorResource)
				&& Objects.equals(this.createdAt, address.createdAt)
				&& Objects.equals(this.updatedAt, address.updatedAt);
	}

}
