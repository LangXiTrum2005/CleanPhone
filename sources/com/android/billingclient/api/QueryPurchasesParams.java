package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7205a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7206a;

        @NonNull
        public QueryPurchasesParams build() {
            if (this.f7206a != null) {
                return new QueryPurchasesParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f7206a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder) {
        this.f7205a = builder.f7206a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public final String zza() {
        return this.f7205a;
    }
}
