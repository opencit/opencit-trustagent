/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intel.mtwilson.as.data;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ssbangal
 */
@Entity
@Table(name = "mw_mle_source")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MwMleSource.findAll", query = "SELECT t FROM MwMleSource t"),
    @NamedQuery(name = "MwMleSource.findById", query = "SELECT t FROM MwMleSource t WHERE t.id = :id"),
    @NamedQuery(name = "MwMleSource.findByHostName", query = "SELECT t FROM MwMleSource t WHERE t.hostName = :hostName"),
    @NamedQuery(name = "MwMleSource.findByMleID", query = "SELECT t FROM MwMleSource t WHERE t.mleId.id =:mleId")})

public class MwMleSource implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Host_Name")
    private String hostName;
    @JoinColumn(name = "MLE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TblMle mleId;

    public MwMleSource() {
    }

    public MwMleSource(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public TblMle getMleId() {
        return mleId;
    }

    public void setMleId(TblMle mleId) {
        this.mleId = mleId;
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
        if (!(object instanceof MwMleSource)) {
            return false;
        }
        MwMleSource other = (MwMleSource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intel.mountwilson.as.data.TblMleSource[ id=" + id + " ]";
    }
    
}