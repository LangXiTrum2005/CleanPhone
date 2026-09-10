package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@zzp
public final class UserChoiceDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f7218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7219b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @zzp
    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7222c;

        public Product(JSONObject jSONObject) {
            this.f7220a = jSONObject.optString("productId");
            this.f7221b = jSONObject.optString(X3.i.f27802m);
            String strOptString = jSONObject.optString("offerToken");
            this.f7222c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f7220a.equals(product.getId()) && this.f7221b.equals(product.getType()) && Objects.equals(this.f7222c, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.f7220a;
        }

        @Nullable
        public String getOfferToken() {
            return this.f7222c;
        }

        @NonNull
        public String getType() {
            return this.f7221b;
        }

        public int hashCode() {
            return Objects.hash(this.f7220a, this.f7221b, this.f7222c);
        }

        @NonNull
        public String toString() {
            return defpackage.e.q(this.f7222c, "}", defpackage.e.v("{id: ", this.f7220a, ", type: ", this.f7221b, ", offer token: "));
        }
    }

    public UserChoiceDetails(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f7218a = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        this.f7219b = arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f7218a.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String strOptString = this.f7218a.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.f7219b;
    }
}
