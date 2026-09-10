package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f7195c;

    public PurchaseHistoryRecord(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f7193a = str;
        this.f7194b = str2;
        this.f7195c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f7195c;
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
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f7193a, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f7194b, purchaseHistoryRecord.getSignature());
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f7195c.optString("developerPayload");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f7193a;
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public long getPurchaseTime() {
        return this.f7195c.optLong(Constants.GP_IAP_PURCHASE_TIME);
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f7195c;
        return jSONObject.optString("token", jSONObject.optString(Constants.GP_IAP_PURCHASE_TOKEN));
    }

    public int getQuantity() {
        return this.f7195c.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.f7194b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f7193a.hashCode();
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f7193a));
    }
}
