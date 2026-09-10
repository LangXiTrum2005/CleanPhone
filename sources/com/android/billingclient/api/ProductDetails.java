package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.Constants;
import d5.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ProductDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f7136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f7137k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @zzj
    public static final class InstallmentPlanDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7139b;

        public InstallmentPlanDetails(JSONObject jSONObject) {
            this.f7138a = jSONObject.getInt("commitmentPaymentsCount");
            this.f7139b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzj
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.f7138a;
        }

        @zzj
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.f7139b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class OneTimePurchaseOfferDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f7145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f7146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f7147h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final DiscountDisplayInfo f7148i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ValidTimeWindow f7149j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final LimitedQuantityInfo f7150k;
        public final String l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final RentalDetails f7151m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final zzcs f7152n;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @zzl
        public static final class DiscountDisplayInfo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f7153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DiscountAmount f7154b;

            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @zzl
            public static final class DiscountAmount {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f7155a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f7156b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f7157c;

                public DiscountAmount(JSONObject jSONObject) {
                    this.f7155a = jSONObject.optString("formattedDiscountAmount");
                    this.f7156b = jSONObject.optLong("discountAmountMicros");
                    this.f7157c = jSONObject.optString("discountAmountCurrencyCode");
                }

                @NonNull
                public String getDiscountAmountCurrencyCode() {
                    return this.f7157c;
                }

                public long getDiscountAmountMicros() {
                    return this.f7156b;
                }

                @NonNull
                public String getFormattedDiscountAmount() {
                    return this.f7155a;
                }
            }

            public DiscountDisplayInfo(JSONObject jSONObject) {
                this.f7153a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f7154b = jSONObjectOptJSONObject != null ? new DiscountAmount(jSONObjectOptJSONObject) : null;
            }

            @Nullable
            @zzl
            public DiscountAmount getDiscountAmount() {
                return this.f7154b;
            }

            @Nullable
            @zzl
            public Integer getPercentageDiscount() {
                return this.f7153a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @zzl
        public static final class LimitedQuantityInfo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7158a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f7159b;

            public LimitedQuantityInfo(JSONObject jSONObject) {
                this.f7158a = jSONObject.getInt("maximumQuantity");
                this.f7159b = jSONObject.getInt("remainingQuantity");
            }

            @zzl
            public int getMaximumQuantity() {
                return this.f7158a;
            }

            @zzl
            public int getRemainingQuantity() {
                return this.f7159b;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @zzm
        public static final class RentalDetails {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f7160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f7161b;

            public RentalDetails(JSONObject jSONObject) {
                this.f7160a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f7161b = true == strOptString.isEmpty() ? null : strOptString;
            }

            @Nullable
            @zzm
            public String getRentalExpirationPeriod() {
                return this.f7161b;
            }

            @NonNull
            @zzm
            public String getRentalPeriod() {
                return this.f7160a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @zzl
        public static final class ValidTimeWindow {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Long f7162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Long f7163b;

            public ValidTimeWindow(JSONObject jSONObject) {
                this.f7162a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f7163b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            @Nullable
            @zzl
            public Long getEndTimeMillis() {
                return this.f7163b;
            }

            @Nullable
            @zzl
            public Long getStartTimeMillis() {
                return this.f7162a;
            }
        }

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f7140a = jSONObject.optString("formattedPrice");
            this.f7141b = jSONObject.optLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7);
            this.f7142c = jSONObject.optString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7);
            String strOptString = jSONObject.optString("offerIdToken");
            zzcs zzcsVar = null;
            this.f7143d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString(Constants.GP_IAP_OFFER_ID);
            this.f7144e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f7145f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f7146g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f7146g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f7147h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f7148i = jSONObjectOptJSONObject == null ? null : new DiscountDisplayInfo(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f7149j = jSONObjectOptJSONObject2 == null ? null : new ValidTimeWindow(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f7150k = jSONObjectOptJSONObject3 == null ? null : new LimitedQuantityInfo(jSONObjectOptJSONObject3);
            this.l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f7151m = jSONObjectOptJSONObject5 == null ? null : new RentalDetails(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject6 != null) {
                zzcsVar = new zzcs();
                jSONObjectOptJSONObject6.getString("type");
            }
            this.f7152n = zzcsVar;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES);
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new PricingPhases(jSONArrayOptJSONArray2);
        }

        @Nullable
        @zzl
        public DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.f7148i;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f7140a;
        }

        @Nullable
        @zzl
        public Long getFullPriceMicros() {
            return this.f7147h;
        }

        @Nullable
        @zzl
        public LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.f7150k;
        }

        @Nullable
        @zzm
        @zzl
        public String getOfferId() {
            return this.f7144e;
        }

        @Nullable
        @zzl
        public List<String> getOfferTags() {
            return this.f7146g;
        }

        @Nullable
        @zzm
        @zzl
        public String getOfferToken() {
            return this.f7143d;
        }

        public long getPriceAmountMicros() {
            return this.f7141b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f7142c;
        }

        @Nullable
        @zzm
        public String getPurchaseOptionId() {
            return this.f7145f;
        }

        @Nullable
        @zzm
        public RentalDetails getRentalDetails() {
            return this.f7151m;
        }

        @Nullable
        @zzl
        public ValidTimeWindow getValidTimeWindow() {
            return this.f7149j;
        }

        @Nullable
        public final zzcs zza() {
            return this.f7152n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class PricingPhase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7169f;

        public PricingPhase(JSONObject jSONObject) {
            this.f7167d = jSONObject.optString(Constants.GP_IAP_BILLING_PERIOD);
            this.f7166c = jSONObject.optString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7);
            this.f7164a = jSONObject.optString("formattedPrice");
            this.f7165b = jSONObject.optLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7);
            this.f7169f = jSONObject.optInt(Constants.GP_IAP_RECURRENCE_MODE);
            this.f7168e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f7168e;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.f7167d;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f7164a;
        }

        public long getPriceAmountMicros() {
            return this.f7165b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f7166c;
        }

        public int getRecurrenceMode() {
            return this.f7169f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class PricingPhases {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7170a;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f7170a = arrayList;
        }

        @NonNull
        public List<PricingPhase> getPricingPhaseList() {
            return this.f7170a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class SubscriptionOfferDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PricingPhases f7174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f7175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InstallmentPlanDetails f7176f;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f7171a = jSONObject.optString(Constants.GP_IAP_BASE_PLAN_ID);
            String strOptString = jSONObject.optString(Constants.GP_IAP_OFFER_ID);
            this.f7172b = true == strOptString.isEmpty() ? null : strOptString;
            this.f7173c = jSONObject.getString("offerIdToken");
            this.f7174d = new PricingPhases(jSONObject.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f7176f = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString(Constants.GP_IAP_BASE_PLAN_ID);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f7175e = arrayList;
        }

        @NonNull
        public String getBasePlanId() {
            return this.f7171a;
        }

        @Nullable
        @zzj
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f7176f;
        }

        @Nullable
        public String getOfferId() {
            return this.f7172b;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.f7175e;
        }

        @NonNull
        public String getOfferToken() {
            return this.f7173c;
        }

        @NonNull
        public PricingPhases getPricingPhases() {
            return this.f7174d;
        }
    }

    public ProductDetails(String str) {
        this.f7127a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7128b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f7129c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f7130d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f7131e = jSONObject.optString("title");
        this.f7132f = jSONObject.optString("name");
        this.f7133g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f7134h = jSONObject.optString("skuDetailsToken");
        this.f7135i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f7136j = arrayList;
        } else {
            this.f7136j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f7128b.optJSONObject(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS);
        JSONArray jSONArrayOptJSONArray2 = this.f7128b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f7137k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f7137k = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.f7137k = arrayList2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f7127a, ((ProductDetails) obj).f7127a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f7133g;
    }

    @NonNull
    public String getName() {
        return this.f7132f;
    }

    @Nullable
    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        ArrayList arrayList = this.f7137k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) arrayList.get(0);
    }

    @Nullable
    @zzm
    @zzl
    public List<OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.f7137k;
    }

    @NonNull
    public String getProductId() {
        return this.f7129c;
    }

    @NonNull
    public String getProductType() {
        return this.f7130d;
    }

    @Nullable
    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f7136j;
    }

    @NonNull
    public String getTitle() {
        return this.f7131e;
    }

    public int hashCode() {
        return this.f7127a.hashCode();
    }

    @NonNull
    public String toString() {
        String string = this.f7128b.toString();
        String strValueOf = String.valueOf(this.f7136j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        u.r(sb2, this.f7127a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f7129c);
        sb2.append("', productType='");
        sb2.append(this.f7130d);
        sb2.append("', title='");
        sb2.append(this.f7131e);
        sb2.append("', productDetailsToken='");
        return u.h(sb2, this.f7134h, "', subscriptionOfferDetails=", strValueOf, "}");
    }

    @NonNull
    public final String zza() {
        return this.f7128b.optString("packageName");
    }

    @Nullable
    public String zzc() {
        return this.f7135i;
    }
}
