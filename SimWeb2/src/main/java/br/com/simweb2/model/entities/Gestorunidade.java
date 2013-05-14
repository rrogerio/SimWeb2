package br.com.simweb2.model.entities;
// Generated 23/02/2013 11:46:33 


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;




/**
 * Gestorunidade generated by hbm2java
 */

@Entity
@Table(name="gestorunidade")
@PrimaryKeyJoinColumn(name="PESSOA_idPESSOA")

public class Gestorunidade extends Pessoa implements java.io.Serializable {
    
    
    
    private static final long serialVersionUID = -458228392078838847L;
 


    private Integer registro;

    public Gestorunidade() {
    }

    public Integer getRegistro() {
        return this.registro;
    }
    
    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.registro != null ? this.registro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gestorunidade other = (Gestorunidade) obj;
        if (this.registro != other.registro && (this.registro == null || !this.registro.equals(other.registro))) {
            return false;
        }
        return true;
    }
}

