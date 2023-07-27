	package com.br.aula.aula02.entities;
	
	import jakarta.persistence.*;

	
	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
	@Entity
	@Table(name= "tb_user")
	public class User  implements Serializable {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    private String nome;
	    private String email;
	    private String password;
	    @JsonIgnore
	    @OneToMany(mappedBy = "client")
	    private List<Order> orders = new ArrayList<>();
	    
	    public User() {
	    }
	
	    public User(String nome, String email, String password) {
	        this.id = id;
	        this.nome = nome;
	        this.email = email;
	        this.password = password;
	    }
	
	    public long getId() {
	        return id;
	    }
	
	    public void setId(long id) {
	        this.id = id;
	    }
	
	    public String getNome() {
	        return nome;
	    }
	
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	
	    public String getEmail() {
	        return email;
	    }
	
	    public void setEmail(String email) {
	        this.email = email;
	    }
	
	    public String getPassword() {
	        return password;
	    }
	
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
		public List<Order> getOrders() {
			return orders;
		}
	
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof User user)) return false;
	        return getId() == user.getId();
	    }
	
	    @Override
	    public int hashCode() {
	        return Objects.hash(getId());
	    }

	
	    
	}
