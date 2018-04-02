/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author inesm
 */
@Entity
@Table(name = "modulos")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Modulos.findAll", query = "SELECT m FROM Modulos m")
	, @NamedQuery(name = "Modulos.findById", query = "SELECT m FROM Modulos m WHERE m.id = :id")
	, @NamedQuery(name = "Modulos.findByNombre", query = "SELECT m FROM Modulos m WHERE m.nombre = :nombre")})
public class Modulos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
	private Integer id;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 300)
        @Column(name = "nombre")
	private String nombre;
	@JoinColumn(name = "cursos", referencedColumnName = "id")
        @ManyToOne(optional = false)
	private Cursos cursos;

	public Modulos() {
	}

	public Modulos(Integer id) {
		this.id = id;
	}

	public Modulos(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Modulos)) {
			return false;
		}
		Modulos other = (Modulos) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entidades.Modulos[ id=" + id + " ]";
	}
	
}
