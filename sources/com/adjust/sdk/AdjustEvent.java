package com.adjust.sdk;

import com.ironsource.X3;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustEvent {
    private static ILogger logger = AdjustFactory.getLogger();
    String callbackId;
    Map<String, String> callbackParameters;
    String currency;
    String deduplicationId;
    String eventToken;
    String orderId;
    Map<String, String> partnerParameters;
    String productId;
    String purchaseToken;
    Double revenue;

    public AdjustEvent(String str) {
        if (checkEventToken(str, logger)) {
            this.eventToken = str;
        }
    }

    private static boolean checkEventToken(String str, ILogger iLogger) {
        if (str == null) {
            iLogger.error("Missing Event Token", new Object[0]);
            return false;
        }
        if (str.length() > 0) {
            return true;
        }
        iLogger.error("Event Token can't be empty", new Object[0]);
        return false;
    }

    private boolean checkRevenue(Double d10, String str) {
        if (d10 == null) {
            if (str == null) {
                return true;
            }
            logger.error("Revenue must be set with currency", new Object[0]);
            return false;
        }
        if (d10.doubleValue() < 0.0d) {
            logger.error("Invalid amount %.5f", d10);
            return false;
        }
        if (str == null) {
            logger.error("Currency must be set with revenue", new Object[0]);
            return false;
        }
        if (!str.equals("")) {
            return true;
        }
        logger.error("Currency is empty", new Object[0]);
        return false;
    }

    public void addCallbackParameter(String str, String str2) {
        if (Util.isValidParameter(str, X3.i.W, "Callback") && Util.isValidParameter(str2, X3.i.X, "Callback")) {
            if (this.callbackParameters == null) {
                this.callbackParameters = new LinkedHashMap();
            }
            if (this.callbackParameters.put(str, str2) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public void addPartnerParameter(String str, String str2) {
        if (Util.isValidParameter(str, X3.i.W, "Partner") && Util.isValidParameter(str2, X3.i.X, "Partner")) {
            if (this.partnerParameters == null) {
                this.partnerParameters = new LinkedHashMap();
            }
            if (this.partnerParameters.put(str, str2) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public Map<String, String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDeduplicationId() {
        return this.deduplicationId;
    }

    public String getEventToken() {
        return this.eventToken;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public Map<String, String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public boolean isValid() {
        return this.eventToken != null;
    }

    public void setCallbackId(String str) {
        this.callbackId = str;
    }

    public void setDeduplicationId(String str) {
        this.deduplicationId = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPurchaseToken(String str) {
        this.purchaseToken = str;
    }

    public void setRevenue(double d10, String str) {
        if (checkRevenue(Double.valueOf(d10), str)) {
            this.revenue = Double.valueOf(d10);
            this.currency = str;
        }
    }
}
