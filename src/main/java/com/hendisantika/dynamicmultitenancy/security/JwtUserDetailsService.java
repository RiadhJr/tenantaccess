package com.hendisantika.dynamicmultitenancy.security;

import com.hendisantika.dynamicmultitenancy.tenant.entity.Roles;
import com.hendisantika.dynamicmultitenancy.tenant.entity.User;
import com.hendisantika.dynamicmultitenancy.tenant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-rest-api-dynamic-multi-tenancy-mysql-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/05/20
 * Time: 06.08
 */

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);
   

        
        if (null == user) {
            throw new UsernameNotFoundException("Invalid user name or password.");
        }
        Roles roles =  user.getRoles();
   		 List<SimpleGrantedAuthority> authorities = new ArrayList<>();
   		   authorities.add(new SimpleGrantedAuthority(roles.getName()));
   		   
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
        		authorities);
    }
/*
    private List<SimpleGrantedAuthority> getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }*/
}
