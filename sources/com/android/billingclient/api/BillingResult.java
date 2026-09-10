package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.a0;
import com.google.android.gms.internal.play_billing.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class BillingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7113c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f7116c;

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f7111a = this.f7114a;
            billingResult.f7112b = this.f7115b;
            billingResult.f7113c = this.f7116c;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.f7116c = str;
            return this;
        }

        @NonNull
        @zzk
        public Builder setOnPurchasesUpdatedSubResponseCode(int i10) {
            this.f7115b = i10;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i10) {
            this.f7114a = i10;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.f7115b = 0;
        builder.f7116c = "";
        return builder;
    }

    @NonNull
    public String getDebugMessage() {
        return this.f7113c;
    }

    @zzk
    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.f7112b;
    }

    public int getResponseCode() {
        return this.f7111a;
    }

    @NonNull
    public String toString() {
        int i10 = this.f7111a;
        int i11 = u.f24478a;
        a0 a0Var = com.google.android.gms.internal.play_billing.k.f24389c;
        Integer numValueOf = Integer.valueOf(i10);
        return l1.d.g("Response Code: ", (!a0Var.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.k.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.k) a0Var.get(numValueOf)).toString(), ", Debug Message: ", this.f7113c);
    }
}
