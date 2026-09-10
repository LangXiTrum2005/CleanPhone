package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AcknowledgePurchaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7076a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7077a;

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.f7077a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams();
            acknowledgePurchaseParams.f7076a = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f7077a = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f7076a;
    }
}
