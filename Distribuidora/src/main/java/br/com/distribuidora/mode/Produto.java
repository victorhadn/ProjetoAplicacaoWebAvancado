/**
 * 
 */
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
@Table(name="tb_produto")
	public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long codigo;
	private String nome;
	private double preço;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the preço
	 */
	public double getPreço() {
		return preço;
	}
	/**
	 * @param preço the preço to set
	 */
	public void setPreço(double preço) {
		this.preço = preço;
	}
}
