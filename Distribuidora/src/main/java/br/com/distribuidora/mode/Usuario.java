package br.com.distribuidora.mode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author victorhadn
 *
 */
@Data
@Entity
@Table(name="tb_usuario")
	public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String login;
	private int senha;
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the senha
	 */
	public int getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
