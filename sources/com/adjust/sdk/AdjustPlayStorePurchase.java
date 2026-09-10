package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustPlayStorePurchase {
    private final String productId;
    private final String purchaseToken;

    public AdjustPlayStorePurchase(String str, String str2) {
        this.productId = str;
        this.purchaseToken = str2;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }
}
