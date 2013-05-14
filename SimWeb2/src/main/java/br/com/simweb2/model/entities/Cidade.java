package br.com.simweb2.model.entities;
// Generated 23/02/2013 

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;




@Entity
@Table(name="cidade")

/**
 * Cidade generated by hbm2java
 */
public class Cidade implements Serializable{

     private static final long serialVersionUID = 1L;
   

     @Id
     @GeneratedValue
     @Column(name="idCidade" , nullable=true)
     
     private Integer idCidade;
     
     @ManyToOne(fetch = FetchType.EAGER)
     @JoinColumn(name="ESTADO_idESTADO")
     private Estado estados;
     
     private String nome;
     private Integer excluido;
     private String excluidopor;
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date datahoraexclusao;


     
    public Cidade() {
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public Estado getEstados() {
        return estados;
    }

    public void setEstados(Estado estados) {
        this.estados = estados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getExcluido() {
        return excluido;
    }

    public void setExcluido(Integer excluido) {
        this.excluido = excluido;
    }

    public String getExcluidopor() {
        return excluidopor;
    }

    public void setExcluidopor(String excluidopor) {
        this.excluidopor = excluidopor;
    }

    public Date getDatahoraexclusao() {
        return datahoraexclusao;
    }

    public void setDatahoraexclusao(Date datehoraexclusao) {
        this.datahoraexclusao = datehoraexclusao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.idCidade != null ? this.idCidade.hashCode() : 0);
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
        final Cidade other = (Cidade) obj;
        if (this.idCidade != other.idCidade && (this.idCidade == null || !this.idCidade.equals(other.idCidade))) {
            return false;
        }
        return true;
    }

   

    
    
}