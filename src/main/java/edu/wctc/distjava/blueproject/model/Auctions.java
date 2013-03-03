/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.distjava.blueproject.model;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author production
 */
@Entity
@Table(name = "auctions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auctions.findAll", query = "SELECT a FROM Auctions a"),
    @NamedQuery(name = "Auctions.findByAuctionId", query = "SELECT a FROM Auctions a WHERE a.auctionId = :auctionId"),
    @NamedQuery(name = "Auctions.findByAuctionStartDate", query = "SELECT a FROM Auctions a WHERE a.auctionStartDate = :auctionStartDate"),
    @NamedQuery(name = "Auctions.findByAuctionEndDate", query = "SELECT a FROM Auctions a WHERE a.auctionEndDate = :auctionEndDate"),
    @NamedQuery(name = "Auctions.findByWinningBid", query = "SELECT a FROM Auctions a WHERE a.winningBid = :winningBid"),
    @NamedQuery(name = "Auctions.findByMemberId", query = "SELECT a FROM Auctions a WHERE a.memberId = :memberId")})
public class Auctions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AUCTION_ID")
    private Long auctionId;
    @Column(name = "AUCTION_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctionStartDate;
    @Column(name = "AUCTION_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctionEndDate;
    @Column(name = "WINNING_BID")
    private Long winningBid;
    @Column(name = "MEMBER_ID")
    private BigInteger memberId;
    @JoinColumn(name = "ITEM_ID", referencedColumnName = "ITEM_ID")
    @ManyToOne
    private Items itemId;

    public Auctions() {
    }

    public Auctions(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Long getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Date getAuctionStartDate() {
        return auctionStartDate;
    }

    public void setAuctionStartDate(Date auctionStartDate) {
        this.auctionStartDate = auctionStartDate;
    }

    public Date getAuctionEndDate() {
        return auctionEndDate;
    }

    public void setAuctionEndDate(Date auctionEndDate) {
        this.auctionEndDate = auctionEndDate;
    }

    public Long getWinningBid() {
        return winningBid;
    }

    public void setWinningBid(Long winningBid) {
        this.winningBid = winningBid;
    }

    public BigInteger getMemberId() {
        return memberId;
    }

    public void setMemberId(BigInteger memberId) {
        this.memberId = memberId;
    }

    public Items getItemId() {
        return itemId;
    }

    public void setItemId(Items itemId) {
        this.itemId = itemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auctionId != null ? auctionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auctions)) {
            return false;
        }
        Auctions other = (Auctions) object;
        if ((this.auctionId == null && other.auctionId != null) || (this.auctionId != null && !this.auctionId.equals(other.auctionId))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "controller.Auctions[ auctionId=" + auctionId + " ]";
//    }

    @Override
    public String toString() {
        return "Auctions{" + "auctionId=" + auctionId + ", auctionStartDate=" 
                + auctionStartDate + ", auctionEndDate=" + auctionEndDate + 
                ", winningBid=" + winningBid + ", memberId=" + memberId + 
                ", itemId=" + itemId + '}';
    }
    
    
}
