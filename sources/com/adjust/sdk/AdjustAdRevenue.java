package com.adjust.sdk;

import com.ironsource.X3;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustAdRevenue {
    private static final ILogger logger = AdjustFactory.getLogger();
    Integer adImpressionsCount;
    String adRevenueNetwork;
    String adRevenuePlacement;
    String adRevenueUnit;
    Map<String, String> callbackParameters;
    String currency;
    Map<String, String> partnerParameters;
    Double revenue;
    String source;

    public AdjustAdRevenue(String str) {
        if (isValidSource(str)) {
            this.source = str;
        }
    }

    private boolean isValidSource(String str) {
        if (str == null) {
            logger.error("Missing source", new Object[0]);
            return false;
        }
        if (!str.isEmpty()) {
            return true;
        }
        logger.error("Source can't be empty", new Object[0]);
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

    public Integer getAdImpressionsCount() {
        return this.adImpressionsCount;
    }

    public String getAdRevenueNetwork() {
        return this.adRevenueNetwork;
    }

    public String getAdRevenuePlacement() {
        return this.adRevenuePlacement;
    }

    public String getAdRevenueUnit() {
        return this.adRevenueUnit;
    }

    public Map<String, String> getCallbackParameters() {
        return this.callbackParameters;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Map<String, String> getPartnerParameters() {
        return this.partnerParameters;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public String getSource() {
        return this.source;
    }

    public boolean isValid() {
        return isValidSource(this.source);
    }

    public void setAdImpressionsCount(Integer num) {
        this.adImpressionsCount = num;
    }

    public void setAdRevenueNetwork(String str) {
        this.adRevenueNetwork = str;
    }

    public void setAdRevenuePlacement(String str) {
        this.adRevenuePlacement = str;
    }

    public void setAdRevenueUnit(String str) {
        this.adRevenueUnit = str;
    }

    public void setRevenue(Double d10, String str) {
        this.revenue = d10;
        this.currency = str;
    }
}
