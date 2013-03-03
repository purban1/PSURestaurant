/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.distjava.blueproject.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author production
 */
@Entity
@Table(name = "items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i"),
    @NamedQuery(name = "Items.findByItemId", query = "SELECT i FROM Items i WHERE i.itemId = :itemId"),
    @NamedQuery(name = "Items.findByDescription", query = "SELECT i FROM Items i WHERE i.description = :description"),
    @NamedQuery(name = "Items.findByCurrentBid", query = "SELECT i FROM Items i WHERE i.currentBid = :currentBid"),
    @NamedQuery(name = "Items.findByDateDonated", query = "SELECT i FROM Items i WHERE i.dateDonated = :dateDonated"),
    @NamedQuery(name = "Items.findByMemberId", query = "SELECT i FROM Items i WHERE i.memberId = :memberId")})
public class Items implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ITEM_ID")
    private Long itemId;
    @Size(max = 800)
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CURRENT_BID")
    private BigDecimal currentBid;
    @Column(name = "DATE_DONATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDonated;
    @Column(name = "MEMBER_ID")
    private BigInteger memberId;
    @OneToMany(mappedBy = "itemId")
    private Collection<Auctions> auctionsCollection;

    public Items() {
    }

    public Items(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(BigDecimal currentBid) {
        this.currentBid = currentBid;
    }

    public Date getDateDonated() {
        return dateDonated;
    }

    public void setDateDonated(Date dateDonated) {
        this.dateDonated = dateDonated;
    }

    public BigInteger getMemberId() {
        return memberId;
    }

    public void setMemberId(BigInteger memberId) {
        this.memberId = memberId;
    }

    @XmlTransient
    public Collection<Auctions> getAuctionsCollection() {
        return auctionsCollection;
    }

    public void setAuctionsCollection(Collection<Auctions> auctionsCollection) {
        this.auctionsCollection = auctionsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "controller.Items[ itemId=" + itemId + " ]";
//    }

    @Override
    public String toString() {
        return "Items{" + "itemId=" + itemId + ", description=" + description + 
                ", currentBid=" + currentBid + ", dateDonated=" + dateDonated + 
                ", memberId=" + memberId + ", auctionsCollection=" + auctionsCollection + '}';
    }
    
    
}
