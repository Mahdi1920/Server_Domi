/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "TITRE")
public class Titre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TITRE")
    private Integer codeTitre;
    @Size(max = 50)
    @Column(name = "LIB_TITRE")
    private String libTitre;
    @Column(name = "DUREE_VAL_TIT")
    private Integer dureeValTit;
    @Column(name = "DUREE_APUREMENT")
    private Integer dureeApurement;
    @Column(name = "NATURE_TITRE")
    private Integer natureTitre;
    @Size(max = 1)
    @Column(name = "AUTRE")
    private String autre;
    @Size(max = 1)
    @Column(name = "TYPE_DATE")
    private String typeDate;

    public Titre() {
    }

    public Titre(Integer codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Integer getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Integer codeTitre) {
        this.codeTitre = codeTitre;
    }

    public String getLibTitre() {
        return libTitre;
    }

    public void setLibTitre(String libTitre) {
        this.libTitre = libTitre;
    }

    public Integer getDureeValTit() {
        return dureeValTit;
    }

    public void setDureeValTit(Integer dureeValTit) {
        this.dureeValTit = dureeValTit;
    }

    public Integer getDureeApurement() {
        return dureeApurement;
    }

    public void setDureeApurement(Integer dureeApurement) {
        this.dureeApurement = dureeApurement;
    }

    public Integer getNatureTitre() {
        return natureTitre;
    }

    public void setNatureTitre(Integer natureTitre) {
        this.natureTitre = natureTitre;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    public String getTypeDate() {
        return typeDate;
    }

    public void setTypeDate(String typeDate) {
        this.typeDate = typeDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTitre != null ? codeTitre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titre)) {
            return false;
        }
        Titre other = (Titre) object;
        if ((this.codeTitre == null && other.codeTitre != null) || (this.codeTitre != null && !this.codeTitre.equals(other.codeTitre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Titre[ codeTitre=" + codeTitre + " ]";
    }
    
}
