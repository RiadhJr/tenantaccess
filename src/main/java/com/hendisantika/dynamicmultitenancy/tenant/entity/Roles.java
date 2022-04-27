package com.hendisantika.dynamicmultitenancy.tenant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {

	
	@Id
    @Column(name = "roles_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roles_id;
     
    private String name;
    
    @OneToMany( targetEntity=User.class, mappedBy="roles" )
	@JsonIgnore
	private List<User> user = new ArrayList<>();

	
	public Long getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(Long roles_id) {
		this.roles_id = roles_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUsers(List<User> user) {
		this.user = user;
	}
    
   

   
	


	
    


	
}