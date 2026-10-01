package com.example.jwtcreation;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		Integer id;
	@Column(unique = true, nullable = false)
		String username;
		String password; 
		Integer role;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Integer getRole() {
			return role;
		}
		public void setRole(Integer role) {
			this.role = role;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, password, role, username);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(id, other.id) && Objects.equals(password, other.password)
					&& Objects.equals(role, other.role) && Objects.equals(username, other.username);
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
		}
		public User(Integer id, String username, String password, Integer role) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.role = role;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		} 
		
}
