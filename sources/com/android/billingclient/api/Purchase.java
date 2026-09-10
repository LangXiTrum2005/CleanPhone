package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f7191c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @zzn
    public static final class PendingPurchaseUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JSONObject f7192a;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.f7192a = jSONObject;
        }

        @NonNull
        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = this.f7192a;
            if (jSONObject.has("productIds") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.f7192a.optString(Constants.GP_IAP_PURCHASE_TOKEN);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f7189a = str;
        this.f7190b = str2;
        this.f7191c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f7191c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f7189a, purchase.getOriginalJson()) && TextUtils.equals(this.f7190b, purchase.getSignature());
    }

    @Nullable
    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f7191c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f7191c.optString("developerPayload");
    }

    @Nullable
    public String getOrderId() {
        String strOptString = this.f7191c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String getOriginalJson() {
        return this.f7189a;
    }

    @NonNull
    public String getPackageName() {
        return this.f7191c.optString("packageName");
    }

    @Nullable
    @zzn
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f7191c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.f7191c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f7191c.optLong(Constants.GP_IAP_PURCHASE_TIME);
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f7191c;
        return jSONObject.optString("token", jSONObject.optString(Constants.GP_IAP_PURCHASE_TOKEN));
    }

    public int getQuantity() {
        return this.f7191c.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.f7190b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f7189a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f7191c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f7191c.optBoolean(Constants.GP_IAP_AUTORENEWING);
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f7189a));
    }
}
