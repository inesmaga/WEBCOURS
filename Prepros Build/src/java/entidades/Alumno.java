/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author inesm
 */
@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")
	, @NamedQuery(name = "Alumno.findByRut", query = "SELECT a FROM Alumno a WHERE a.rut = :rut")
	, @NamedQuery(name = "Alumno.findByPsw", query = "SELECT a FROM Alumno a WHERE a.psw = :psw")
	, @NamedQuery(name = "Alumno.findById", query = "SELECT a FROM Alumno a WHERE a.id = :id")
	, @NamedQuery(name = "Alumno.findByNombre", query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre")
	, @NamedQuery(name = "Alumno.findByApellidos", query = "SELECT a FROM Alumno a WHERE a.apellidos = :apellidos")
	, @NamedQuery(name = "Alumno.findByEmail", query = "SELECT a FROM Alumno a WHERE a.email = :email")
	, @NamedQuery(name = "Alumno.findByTelefon", query = "SELECT a FROM Alumno a WHERE a.telefon = :telefon")})
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 5)
        @Column(name = "rut")
	private String rut;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 8)
        @Column(name = "PSW")
	private String psw;
	@Basic(optional = false)
        @Column(name = "id")
	private int id;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 50)
        @Column(name = "nombre")
	private String nombre;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 20)
        @Column(name = "apellidos")
	private String apellidos;
	// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 50)
        @Column(name = "email")
	private String email;
	@Basic(optional = false)
        @NotNull
        @Column(name = "telefon")
	private int telefon;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "alumn")
	private Collection<Cursos> cursosCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "rut")
	private Collection<Telefonos> telefonosCollection;

	public Alumno() {
	}

	public Alumno(String rut) {
		this.rut = rut;
	}

	public Alumno(String rut, String psw, int id, String nombre, String apellidos, String email, int telefon) {
		this.rut = rut;
		this.psw = psw;
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefon = telefon;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	@XmlTransient
	public Collection<Cursos> getCursosCollection() {
		return cursosCollection;
	}

	public void setCursosCollection(Collection<Cursos> cursosCollection) {
		this.cursosCollection = cursosCollection;
	}

	@XmlTransient
	public Collection<Telefonos> getTelefonosCollection() {
		return telefonosCollection;
	}

	public void setTelefonosCollection(Collection<Telefonos> telefonosCollection) {
		this.telefonosCollection = telefonosCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rut != null ? rut.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Alumno)) {
			return false;
		}
		Alumno other = (Alumno) object;
		if ((this.rut == null && other.rut != null) || (this.rut != null && !this.rut.equals(other.rut))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entidades.Alumno[ rut=" + rut + " ]";
	}
	
}
