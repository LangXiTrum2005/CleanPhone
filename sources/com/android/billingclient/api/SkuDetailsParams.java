package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f7210b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f7212b;

        @NonNull
        public SkuDetailsParams build() {
            String str = this.f7211a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f7212b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f7209a = str;
            skuDetailsParams.f7210b = this.f7212b;
            return skuDetailsParams;
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.f7212b = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.f7211a = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public String getSkuType() {
        return this.f7209a;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.f7210b;
    }
}
