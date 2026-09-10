package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7208b;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.f7207a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7208b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f7207a, ((SkuDetails) obj).f7207a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f7208b.optString("description");
    }

    @NonNull
    public String getFreeTrialPeriod() {
        return this.f7208b.optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
    }

    @NonNull
    public String getIconUrl() {
        return this.f7208b.optString("iconUrl");
    }

    @NonNull
    public String getIntroductoryPrice() {
        return this.f7208b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f7208b.optLong(Constants.GP_IAP_INTRODUCTORY_PRICE_AMOUNT_MICROS);
    }

    public int getIntroductoryPriceCycles() {
        return this.f7208b.optInt(Constants.GP_IAP_INTRODUCTORY_PRICE_CYCLES);
    }

    @NonNull
    public String getIntroductoryPricePeriod() {
        return this.f7208b.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_PERIOD);
    }

    @NonNull
    public String getOriginalJson() {
        return this.f7207a;
    }

    @NonNull
    public String getOriginalPrice() {
        JSONObject jSONObject = this.f7208b;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        JSONObject jSONObject = this.f7208b;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    @NonNull
    public String getPrice() {
        return this.f7208b.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.f7208b.optLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4);
    }

    @NonNull
    public String getPriceCurrencyCode() {
        return this.f7208b.optString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4);
    }

    @NonNull
    public String getSku() {
        return this.f7208b.optString("productId");
    }

    @NonNull
    public String getSubscriptionPeriod() {
        return this.f7208b.optString(Constants.GP_IAP_SUBSCRIPTION_PERIOD);
    }

    @NonNull
    public String getTitle() {
        return this.f7208b.optString("title");
    }

    @NonNull
    public String getType() {
        return this.f7208b.optString("type");
    }

    public int hashCode() {
        return this.f7207a.hashCode();
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f7207a));
    }

    public int zza() {
        return this.f7208b.optInt(CampaignEx.JSON_KEY_OFFER_TYPE);
    }

    @NonNull
    public String zzb() {
        return this.f7208b.optString("offer_id");
    }

    @NonNull
    public String zzc() {
        JSONObject jSONObject = this.f7208b;
        String strOptString = jSONObject.optString("offerIdToken");
        return strOptString.isEmpty() ? jSONObject.optString("offer_id_token") : strOptString;
    }

    @NonNull
    public final String zzd() {
        return this.f7208b.optString("packageName");
    }

    @NonNull
    public String zze() {
        return this.f7208b.optString("serializedDocid");
    }
}
