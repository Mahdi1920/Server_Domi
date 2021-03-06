/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DEVISE")
@NamedQueries({
    @NamedQuery(name = "Devise.findAll", query = "SELECT d FROM Devise d")})
public class Devise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEVISE")
    private Integer codeDevise;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SIGLE_DEVISE")
    private String sigleDevise;
    @Size(max = 35)
    @Column(name = "LIB_DEVISE")
    private String libDevise;
    @Column(name = "UNITE_DEVISE")
    private Integer uniteDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COURS_FIXE")
    private BigDecimal coursFixe;
    @Column(name = "DECIMAL_DEVISE")
    private Integer decimalDevise;
    @Size(max = 10)
    @Column(name = "SOUS_UNITE")
    private String sousUnite;
    @Size(max = 1)
    @Column(name = "QUOTE")
    private String quote;
    @Size(max = 3)
    @Column(name = "CODE_ISO")
    private String codeIso;

    public Devise() {
    }

    public Devise(Integer codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Devise(Integer codeDevise, String sigleDevise) {
        this.codeDevise = codeDevise;
        this.sigleDevise = sigleDevise;
    }

    public Integer getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Integer codeDevise) {
        this.codeDevise = codeDevise;
    }

    public String getSigleDevise() {
        return sigleDevise;
    }

    public void setSigleDevise(String sigleDevise) {
        this.sigleDevise = sigleDevise;
    }

    public String getLibDevise() {
        return libDevise;
    }

    public void setLibDevise(String libDevise) {
        this.libDevise = libDevise;
    }

    public Integer getUniteDevise() {
        return uniteDevise;
    }

    public void setUniteDevise(Integer uniteDevise) {
        this.uniteDevise = uniteDevise;
    }

    public BigDecimal getCoursFixe() {
        return coursFixe;
    }

    public void setCoursFixe(BigDecimal coursFixe) {
        this.coursFixe = coursFixe;
    }

    public Integer getDecimalDevise() {
        return decimalDevise;
    }

    public void setDecimalDevise(Integer decimalDevise) {
        this.decimalDevise = decimalDevise;
    }

    public String getSousUnite() {
        return sousUnite;
    }

    public void setSousUnite(String sousUnite) {
        this.sousUnite = sousUnite;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeDevise != null ? codeDevise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devise)) {
            return false;
        }
        Devise other = (Devise) object;
        if ((this.codeDevise == null && other.codeDevise != null) || (this.codeDevise != null && !this.codeDevise.equals(other.codeDevise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Devise[ codeDevise=" + codeDevise + " ]";
    }
    
}
