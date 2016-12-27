package io.commercelayer.api.model;

import java.util.Objects;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.json.JsonExclude;
import java.util.List;

/**
 * User
 */
public class User extends ApiResource {

	private static final long serialVersionUID = -1482880735363L;


	@JsonExclude
	private String name;
	private String firstName;
	private String lastName;
	private String email;
	@JsonExclude
	private String passwordHash;
	@JsonExclude
	private String passwordSalt;
	@JsonExclude
	private Object previousChanges;
	@JsonExclude
	private List<String> consumerRoles;
	@JsonExclude
	private List<String> roles;
	@JsonExclude
	private List<String> permissions;
	@JsonExclude
	private List<String> resourceImages;
	@JsonExclude
	private List<String> images;


	public User() {
		super();
	}
	

	public User(Long id) {
		super(id);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return this.name;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getFirstName() {
		return this.firstName;
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getLastName() {
		return this.lastName;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getEmail() {
		return this.email;
	}
	

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	

	public String getPasswordHash() {
		return this.passwordHash;
	}
	

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	

	public String getPasswordSalt() {
		return this.passwordSalt;
	}
	

	public void setPreviousChanges(Object previousChanges) {
		this.previousChanges = previousChanges;
	}
	

	public Object getPreviousChanges() {
		return this.previousChanges;
	}
	

	public void setConsumerRoles(List<String> consumerRoles) {
		this.consumerRoles = consumerRoles;
	}
	

	public List<String> getConsumerRoles() {
		return this.consumerRoles;
	}
	

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	

	public List<String> getRoles() {
		return this.roles;
	}
	

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	

	public List<String> getPermissions() {
		return this.permissions;
	}
	

	public void setResourceImages(List<String> resourceImages) {
		this.resourceImages = resourceImages;
	}
	

	public List<String> getResourceImages() {
		return this.resourceImages;
	}
	

	public void setImages(List<String> images) {
		this.images = images;
	}
	

	public List<String> getImages() {
		return this.images;
	}
	

	@Override
	public boolean equals(Object o) {
	
		if (this == o) return true;
		if ((o == null) || (getClass() != o.getClass())) return false;
	
		User x = (User)o;
	
		return super.equals(o)
			&& Objects.equals(this.name, x.name)
			&& Objects.equals(this.firstName, x.firstName)
			&& Objects.equals(this.lastName, x.lastName)
			&& Objects.equals(this.email, x.email)
			&& Objects.equals(this.passwordHash, x.passwordHash)
			&& Objects.equals(this.passwordSalt, x.passwordSalt)
			&& Objects.equals(this.previousChanges, x.previousChanges)
			&& Objects.equals(this.consumerRoles, x.consumerRoles)
			&& Objects.equals(this.roles, x.roles)
			&& Objects.equals(this.permissions, x.permissions)
			&& Objects.equals(this.resourceImages, x.resourceImages)
			&& Objects.equals(this.images, x.images)
		;
	
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(
			name, firstName, lastName, email, passwordHash,
			passwordSalt, previousChanges, consumerRoles, roles, permissions,
			resourceImages, images 
		);
	
	}
	

	@Override
	public User clone() {
	
		User no = new User();
	
		no.name = this.name;
		no.firstName = this.firstName;
		no.lastName = this.lastName;
		no.email = this.email;
		no.passwordHash = this.passwordHash;
		no.passwordSalt = this.passwordSalt;
		no.previousChanges = this.previousChanges;
		no.consumerRoles = this.consumerRoles;
		no.roles = this.roles;
		no.permissions = this.permissions;
		no.resourceImages = this.resourceImages;
		no.images = this.images;
	
		return no;
	
	}
	
}
