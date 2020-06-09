package com.sudha.api.serenity.model;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Items {

    private int itemId;

    private int parentItemId;

    private String name;

    private double salePrice;

    private String upc;

    private String categoryPath;

    private String shortDescription;

    private String longDescription;

    private String thumbnailImage;

    private String mediumImage;

    private String largeImage;

    private String productTrackingUrl;

    private int standardShipRate;

    private boolean marketplace;

    private String modelNumber;

    private String sellerInfo;

    private String productUrl;

    private String customerRating;

    private int numReviews;

    private String customerRatingImage;

    private String categoryNode;

    private String rhid;

    private boolean bundle;

    private String stock;

    private String addToCartUrl;

    private String affiliateAddToCartUrl;

    private boolean freeShippingOver35Dollars;

    private GiftOptions giftOptions;

    private List<ImageEntities> imageEntities;

    private String offerType;

    private boolean availableOnline;

}
