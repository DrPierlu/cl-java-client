
package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * User
 */
public class User extends ApiObject {

	@SerializedName("first_name")
	private String firstName = null;

	@SerializedName("last_name")
	private String lastName = null;

	@SerializedName("email")
	private String email = null;

	@SerializedName("password_hash")
	private String passwordHash = null;

	@SerializedName("password_salt")
	private String passwordSalt = null;

	@SerializedName("creator_id")
	private String creatorId = null;

	@SerializedName("creator_resource")
	private String creatorResource = null;

	public User firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public User lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User email(String email) {
		this.email = email;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User passwordHash(String passwordHash) {
		this.passwordHash = passwordHash;
		return this;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public User passwordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
		return this;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public User creatorId(String creatorId) {
		this.creatorId = creatorId;
		return this;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public User creatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
		return this;
	}

	public String getCreatorResource() {
		return creatorResource;
	}

	public void setCreatorResource(String creatorResource) {
		this.creatorResource = creatorResource;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(this.resourceName, user.resourceName) && Objects.equals(this.id, user.id)
				&& Objects.equals(this.firstName, user.firstName) && Objects.equals(this.lastName, user.lastName)
				&& Objects.equals(this.email, user.email) && Objects.equals(this.passwordHash, user.passwordHash)
				&& Objects.equals(this.passwordSalt, user.passwordSalt)
				&& Objects.equals(this.creatorId, user.creatorId)
				&& Objects.equals(this.creatorResource, user.creatorResource)
				&& Objects.equals(this.createdAt, user.createdAt) && Objects.equals(this.updatedAt, user.updatedAt)
				&& Objects.equals(this.expanded, user.expanded);
	}

	@Override
	public int hashCode() {
		return Objects.hash(resourceName, id, firstName, lastName, email, passwordHash, passwordSalt, creatorId,
				creatorResource, createdAt, updatedAt, expanded);
	}

}
