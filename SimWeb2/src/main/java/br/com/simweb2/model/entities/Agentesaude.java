/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simweb2.model.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author 2r.rogerio
 */

@Entity
@Table(name="agentesaude")
@PrimaryKeyJoinColumn(name="PESSOA_idPESSOA")
public class Agentesaude extends Pessoa{
    
    private static final long serialVersionUID = 3855495870352177903L;

    private String registrodaunidade;
    private String cns;
    private String situacao;

    public Agentesaude() {
    }

    public String getRegistrodaunidade() {
        return registrodaunidade;
    }

    public void setRegistrodaunidade(String registrodaunidade) {
        this.registrodaunidade = registrodaunidade;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.registrodaunidade != null ? this.registrodaunidade.hashCode() : 0);
        hash = 31 * hash + (this.cns != null ? this.cns.hashCode() : 0);
        hash = 31 * hash + (this.situacao != null ? this.situacao.hashCode() : 0);
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
        final Agentesaude other = (Agentesaude) obj;
        if ((this.registrodaunidade == null) ? (other.registrodaunidade != null) : !this.registrodaunidade.equals(other.registrodaunidade)) {
            return false;
        }
        if ((this.cns == null) ? (other.cns != null) : !this.cns.equals(other.cns)) {
            return false;
        }
        if ((this.situacao == null) ? (other.situacao != null) : !this.situacao.equals(other.situacao)) {
            return false;
        }
        return true;
    }

    

        
    
    
}
