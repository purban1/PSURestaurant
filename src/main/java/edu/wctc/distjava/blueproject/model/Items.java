/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.distjava.blueproject.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
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
    @NamedQuery(name = "Items.findByDateDonated", query = "SELECT i FROM Items i WHERE i.dateDonated = :dateDonated"),
    @NamedQuery(name = "Items.findByMemberId", query = "SELECT i FROM Items i WHERE i.memberId = :memberId"),
    @NamedQuery(name = "Items.findByPicture1", query = "SELECT i FROM Items i WHERE i.picture1 = :picture1"),
    @NamedQuery(name = "Items.findByPicture2", query = "SELECT i FROM Items i WHERE i.picture2 = :picture2"),
    @NamedQuery(name = "Items.findByPicture3", query = "SELECT i FROM Items i WHERE i.picture3 = :picture3"),
    @NamedQuery(name = "Items.findByPicture4", query = "SELECT i FROM Items i WHERE i.picture4 = :picture4"),
    @NamedQuery(name = "Items.findByPicture5", query = "SELECT i FROM Items i WHERE i.picture5 = :picture5")})
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
    @Column(name = "DATE_DONATED")
    @Temporal(TemporalType.DATE)
    private Date dateDonated;
    @Column(name = "MEMBER_ID")
    private BigInteger memberId;
    @Size(max = 45)
    @Column(name = "PICTURE_1")
    private String picture1;
    @Size(max = 45)
    @Column(name = "PICTURE_2")
    private String picture2;
    @Size(max = 45)
    @Column(name = "PICTURE_3")
    private String picture3;
    @Size(max = 45)
    @Column(name = "PICTURE_4")
    private String picture4;
    @Size(max = 45)
    @Column(name = "PICTURE_5")
    private String picture5;
    @OneToMany(mappedBy = "itemId")
    private Collection<Auctions> auctionsCollection;
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    @ManyToOne
    private Category categoryId;

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

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4;
    }

    public String getPicture5() {
        return picture5;
    }

    public void setPicture5(String picture5) {
        this.picture5 = picture5;
    }

    @XmlTransient
    public Collection<Auctions> getAuctionsCollection() {
        return auctionsCollection;
    }

    public void setAuctionsCollection(Collection<Auctions> auctionsCollection) {
        this.auctionsCollection = auctionsCollection;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return "model.Items[ itemId=" + itemId + " ]";
    }
    
}
