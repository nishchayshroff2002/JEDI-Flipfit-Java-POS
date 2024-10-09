package com.flipfit.bean;

import java.util.List;

public class GymOwner {
    private String ownerID;
    private String panNumber;
    private String ownerName;
    private boolean isApproved;

    public List<String> getCentreLists() {
        return centreLists;
    }

    public void setCentreLists(List<String> centreLists) {
        this.centreLists = centreLists;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    private List<String> centreLists;
    private String cardDetails;
}
