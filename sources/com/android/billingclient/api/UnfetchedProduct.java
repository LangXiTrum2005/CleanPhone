package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@zzo
public final class UnfetchedProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7217e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {

        @zzo
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;

        @zzo
        public static final int NO_ELIGIBLE_OFFER = 4;

        @zzo
        public static final int PRODUCT_NOT_FOUND = 3;

        @zzo
        public static final int UNKNOWN = 0;
    }

    public UnfetchedProduct(String str) {
        this.f7213a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7214b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f7215c = strOptString;
        this.f7216d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f7217e = jSONObject.optString("serializedDocid");
    }

    @NonNull
    public static UnfetchedProduct fromJson(@NonNull String str) throws JSONException {
        return new UnfetchedProduct(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnfetchedProduct) {
            return TextUtils.equals(this.f7213a, ((UnfetchedProduct) obj).f7213a);
        }
        return false;
    }

    @NonNull
    @zzo
    public String getProductId() {
        return this.f7214b;
    }

    @NonNull
    @zzo
    public String getProductType() {
        return this.f7215c;
    }

    @Nullable
    public String getSerializedDocid() {
        return this.f7217e;
    }

    @zzo
    public int getStatusCode() {
        return this.f7216d;
    }

    public int hashCode() {
        return this.f7213a.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f7214b);
        sb2.append("', productType='");
        sb2.append(this.f7215c);
        sb2.append("', statusCode=");
        return l1.d.i(sb2, this.f7216d, "}");
    }
}
