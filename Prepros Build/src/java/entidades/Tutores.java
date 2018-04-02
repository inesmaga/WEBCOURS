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
@Table(name = "tutores")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Tutores.findAll", query = "SELECT t FROM Tutores t")
	, @NamedQuery(name = "Tutores.findById", query = "SELECT t FROM Tutores t WHERE t.id = :id")
	, @NamedQuery(name = "Tutores.findByNombre", query = "SELECT t FROM Tutores t WHERE t.nombre = :nombre")
	, @NamedQuery(name = "Tutores.findByApellidos", query = "SELECT t FROM Tutores t WHERE t.apellidos = :apellidos")
	, @NamedQuery(name = "Tutores.findByEmail", query = "SELECT t FROM Tutores t WHERE t.email = :email")})
public class Tutores implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @Basic(optional = false)
        @NotNull
        @Column(name = "id")
	private Integer id;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 100)
        @Column(name = "nombre")
	private String nombre;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 50)
        @Column(name = "apellidos")
	private String apellidos;
	// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 100)
        @Column(name = "email")
	private String email;
	@JoinColumn(name = "idcurso", referencedColumnName = "id")
        @ManyToOne(optional = false)
	private Cursos idcurso;

	public Tutores() {
	}

	public Tutores(Integer id) {
		this.id = id;
	}

	public Tutores(Integer id, String nombre, String apellidos, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cursos getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Cursos idcurso) {
		this.idcurso = idcurso;
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
		if (!(object instanceof Tutores)) {
			return false;
		}
		Tutores other = (Tutores) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entidades.Tutores[ id=" + id + " ]";
	}
	
}
