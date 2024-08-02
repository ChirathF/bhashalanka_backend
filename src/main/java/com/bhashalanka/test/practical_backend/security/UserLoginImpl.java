package com.bhashalanka.test.practical_backend.security;

import com.bhashalanka.test.practical_backend.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Objects;

@Getter
@Setter
public class UserLoginImpl {
    private static final long serialVersionUID = 1L;
    private String id;
    private String username;
    @JsonIgnore
    private String password;


    private Collection<? extends GrantedAuthority> authorities;
    public UserLoginImpl(String id, String username, String password){
        this.id= id;
        this.username= username;
        this.password = password;
    }

    public static UserLoginImpl build(User user){

        return new UserLoginImpl (user.getId(),user.getUsername(),user.getPassword());
    }

    public Collection<? extends GrantedAuthority>  getAuthorities(){
        return authorities;
    }

    public boolean isAccountNonLocked(){
        return true;
    }
    public boolean isAccountNonExpired(){
        return true;
    }
    public boolean isCredentialsNonExpired(){
        return true;
    }
    public boolean isEnabled(){
        return true;
    }
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserLoginImpl user = (UserLoginImpl) o;
        return Objects.equals(id,user.id);
    }
}
