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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cursos")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c")
	, @NamedQuery(name = "Cursos.findById", query = "SELECT c FROM Cursos c WHERE c.id = :id")
	, @NamedQuery(name = "Cursos.findByNombre", query = "SELECT c FROM Cursos c WHERE c.nombre = :nombre")
	, @NamedQuery(name = "Cursos.findByModulos", query = "SELECT c FROM Cursos c WHERE c.modulos = :modulos")
	, @NamedQuery(name = "Cursos.findByUrl", query = "SELECT c FROM Cursos c WHERE c.url = :url")
	, @NamedQuery(name = "Cursos.findByHoras", query = "SELECT c FROM Cursos c WHERE c.horas = :horas")
	, @NamedQuery(name = "Cursos.findByGfy", query = "SELECT c FROM Cursos c WHERE c.gfy = :gfy")
	, @NamedQuery(name = "Cursos.findByValor", query = "SELECT c FROM Cursos c WHERE c.valor = :valor")})
public class Cursos implements Serializable {

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
	@Basic(optional = false)
        @NotNull
        @Column(name = "modulos")
	private int modulos;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 100)
        @Column(name = "url")
	private String url;
	@Basic(optional = false)
        @NotNull
        @Column(name = "horas")
	private int horas;
	@Basic(optional = false)
        @NotNull
        @Column(name = "GFY")
	private boolean gfy;
	@Basic(optional = false)
        @NotNull
        @Column(name = "valor")
	private double valor;
	@JoinColumn(name = "alumn", referencedColumnName = "rut")
        @ManyToOne(optional = false)
	private Alumno alumn;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idcurso")
	private Collection<Tutores> tutoresCollection;

	public Cursos() {
	}

	public Cursos(Integer id) {
		this.id = id;
	}

	public Cursos(Integer id, String nombre, int modulos, String url, int horas, boolean gfy, double valor) {
		this.id = id;
		this.nombre = nombre;
		this.modulos = modulos;
		this.url = url;
		this.horas = horas;
		this.gfy = gfy;
		this.valor = valor;
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

	public int getModulos() {
		return modulos;
	}

	public void setModulos(int modulos) {
		this.modulos = modulos;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public boolean getGfy() {
		return gfy;
	}

	public void setGfy(boolean gfy) {
		this.gfy = gfy;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Alumno getAlumn() {
		return alumn;
	}

	public void setAlumn(Alumno alumn) {
		this.alumn = alumn;
	}

	@XmlTransient
	public Collection<Tutores> getTutoresCollection() {
		return tutoresCollection;
	}

	public void setTutoresCollection(Collection<Tutores> tutoresCollection) {
		this.tutoresCollection = tutoresCollection;
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
		if (!(object instanceof Cursos)) {
			return false;
		}
		Cursos other = (Cursos) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entidades.Cursos[ id=" + id + " ]";
	}
	
}
