package com.visualpathit.account.model;

import javax.persistence.*;
import java.util.Set;
<<<<<<< HEAD
=======
/**{@author waheedk} !*/
>>>>>>> vp-rem
@Entity
@Table(name = "role")
public class Role {
	/** the id field !*/
    private Long id;
    /** the name field !*/
    private String name;
    /** the user field !*/
    private Set<User> users;
    /** {@inheritDoc}} !*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * {@link Role#id}
     !*/
    public Long getId() {
        return id;
    }
    /** {@inheritDoc}} !*/
<<<<<<< HEAD
    public final void setId(final Long id) {
=======
    public  void setId(final Long id) {
>>>>>>> vp-rem
        this.id = id;
    }
    /**
     * {@link Role#name}
     !*/
    public String getName() {
        return name;
    }
    /** {@inheritDoc}} !*/
<<<<<<< HEAD
    public final void setName(final String name) {
=======
    public  void setName(final String name) {
>>>>>>> vp-rem
        this.name = name;
    }
    /**
     * {@inheritDoc}} 
     !*/
<<<<<<< HEAD
    @ManyToMany(mappedBy = "roles")
    /**
     * {@link Role#id}
     !*/
    public Set<User> getUsers() {
=======
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles",cascade = CascadeType.ALL)
    /**
     * {@link Role#id}
     !*/
    public Set <User> getUsers() {
>>>>>>> vp-rem
        return users;
    }
    /**
     * {@inheritDoc}} 
     !*/
    public final void setUsers(Set<User> users) {
        this.users = users;
    }
}
