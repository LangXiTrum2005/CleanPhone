package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@zzn
public final class PendingPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7124a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @zzn
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7126b;

        @NonNull
        public PendingPurchasesParams build() {
            if (this.f7125a) {
                return new PendingPurchasesParams(this.f7126b);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        @NonNull
        public Builder enableOneTimeProducts() {
            this.f7125a = true;
            return this;
        }

        @NonNull
        public Builder enablePrepaidPlans() {
            this.f7126b = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z10) {
        this.f7124a = z10;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
