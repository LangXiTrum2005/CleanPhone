package com.thinkup.core.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TUWaterfallFilter extends TUAdFilter {
    public static String C2S = "2";
    public static String NORMAL = "0";
    public static String S2S = "1";

    public static class PriceInterval {
        private Double lessPrice;
        private Double morePrice;
        private final TUAdConst.CURRENCY scurrency;

        public PriceInterval(TUAdConst.CURRENCY currency) {
            this.scurrency = currency;
        }

        public JSONObject getJsonObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("lessPrice", this.lessPrice);
                jSONObject.put("morePrice", this.morePrice);
                TUAdConst.CURRENCY currency = this.scurrency;
                if (currency != null) {
                    jSONObject.put("currency", currency.name());
                    return jSONObject;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        public Double getLessPrice() {
            return this.lessPrice;
        }

        public Double getMorePrice() {
            return this.morePrice;
        }

        public TUAdConst.CURRENCY getScurrency() {
            return this.scurrency;
        }

        public PriceInterval lessThanPrice(double d) {
            this.lessPrice = Double.valueOf(d);
            return this;
        }

        public PriceInterval moreThanPrice(double d) {
            this.morePrice = Double.valueOf(d);
            return this;
        }
    }
}
