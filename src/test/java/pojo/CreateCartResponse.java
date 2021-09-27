package pojo;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CreateCartResponse {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("cartType")
    @Expose
    private String cartType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("entries")
    @Expose
    private List<Object> entries = null;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("payWithPoints")
    @Expose
    private Integer payWithPoints;
    @SerializedName("pointTotalAfterOrder")
    @Expose
    private Integer pointTotalAfterOrder;
    @SerializedName("redeemLoyaltyPoints")
    @Expose
    private Integer redeemLoyaltyPoints;
    @SerializedName("rewardLoyaltyPoints")
    @Expose
    private Integer rewardLoyaltyPoints;
    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;
    @SerializedName("totalPrice")
    @Expose
    private TotalPrice totalPrice;
    @SerializedName("totalPriceWithTax")
    @Expose
    private TotalPriceWithTax totalPriceWithTax;
    @SerializedName("adultCustomer")
    @Expose
    private Boolean adultCustomer;
    @SerializedName("checkoutBlocked")
    @Expose
    private Boolean checkoutBlocked;
    @SerializedName("consistentAddress")
    @Expose
    private Boolean consistentAddress;
    @SerializedName("containsOtcProducts")
    @Expose
    private Boolean containsOtcProducts;
    @SerializedName("guestCheckoutAllowed")
    @Expose
    private Boolean guestCheckoutAllowed;
    @SerializedName("homeDeliveryOnly")
    @Expose
    private Boolean homeDeliveryOnly;
    @SerializedName("placeOrderBlocked")
    @Expose
    private Boolean placeOrderBlocked;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCartType() {
        return cartType;
    }

    public void setCartType(String cartType) {
        this.cartType = cartType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Object> getEntries() {
        return entries;
    }

    public void setEntries(List<Object> entries) {
        this.entries = entries;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getPayWithPoints() {
        return payWithPoints;
    }

    public void setPayWithPoints(Integer payWithPoints) {
        this.payWithPoints = payWithPoints;
    }

    public Integer getPointTotalAfterOrder() {
        return pointTotalAfterOrder;
    }

    public void setPointTotalAfterOrder(Integer pointTotalAfterOrder) {
        this.pointTotalAfterOrder = pointTotalAfterOrder;
    }

    public Integer getRedeemLoyaltyPoints() {
        return redeemLoyaltyPoints;
    }

    public void setRedeemLoyaltyPoints(Integer redeemLoyaltyPoints) {
        this.redeemLoyaltyPoints = redeemLoyaltyPoints;
    }

    public Integer getRewardLoyaltyPoints() {
        return rewardLoyaltyPoints;
    }

    public void setRewardLoyaltyPoints(Integer rewardLoyaltyPoints) {
        this.rewardLoyaltyPoints = rewardLoyaltyPoints;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    public TotalPriceWithTax getTotalPriceWithTax() {
        return totalPriceWithTax;
    }

    public void setTotalPriceWithTax(TotalPriceWithTax totalPriceWithTax) {
        this.totalPriceWithTax = totalPriceWithTax;
    }

    public Boolean getAdultCustomer() {
        return adultCustomer;
    }

    public void setAdultCustomer(Boolean adultCustomer) {
        this.adultCustomer = adultCustomer;
    }

    public Boolean getCheckoutBlocked() {
        return checkoutBlocked;
    }

    public void setCheckoutBlocked(Boolean checkoutBlocked) {
        this.checkoutBlocked = checkoutBlocked;
    }

    public Boolean getConsistentAddress() {
        return consistentAddress;
    }

    public void setConsistentAddress(Boolean consistentAddress) {
        this.consistentAddress = consistentAddress;
    }

    public Boolean getContainsOtcProducts() {
        return containsOtcProducts;
    }

    public void setContainsOtcProducts(Boolean containsOtcProducts) {
        this.containsOtcProducts = containsOtcProducts;
    }

    public Boolean getGuestCheckoutAllowed() {
        return guestCheckoutAllowed;
    }

    public void setGuestCheckoutAllowed(Boolean guestCheckoutAllowed) {
        this.guestCheckoutAllowed = guestCheckoutAllowed;
    }

    public Boolean getHomeDeliveryOnly() {
        return homeDeliveryOnly;
    }

    public void setHomeDeliveryOnly(Boolean homeDeliveryOnly) {
        this.homeDeliveryOnly = homeDeliveryOnly;
    }

    public Boolean getPlaceOrderBlocked() {
        return placeOrderBlocked;
    }

    public void setPlaceOrderBlocked(Boolean placeOrderBlocked) {
        this.placeOrderBlocked = placeOrderBlocked;
    }
}