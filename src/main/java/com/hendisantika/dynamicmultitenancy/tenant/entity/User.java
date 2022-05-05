package com.hendisantika.dynamicmultitenancy.tenant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


import java.io.Serializable;

@Entity
@Table(name = "tbl_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Size(max = 100)
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Size(max = 10)
    @Column(name = "gender", nullable = false)
    private String gender;

    @Size(max = 50)
    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;
    @Size(max = 100)
    @Column(name = "password", nullable = false)
    private String password;
    @Size(max = 10)
    @Column(name = "status", nullable = false)
    private String status;
    
    
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "roles_id", nullable = true)
    private Roles roles;

    public User(@Size(max = 100) String fullName, @Size(max = 10) String gender, @Size(max = 50) String userName,
                @Size(max = 100) String password, @Size(max = 10) String status,Roles roles) {
        this.fullName = fullName;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.roles = roles;
    }
}
