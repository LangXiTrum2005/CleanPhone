package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ConsumeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7117a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7118a;

        @NonNull
        public ConsumeParams build() {
            String str = this.f7118a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams();
            consumeParams.f7117a = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f7118a = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f7117a;
    }
}
