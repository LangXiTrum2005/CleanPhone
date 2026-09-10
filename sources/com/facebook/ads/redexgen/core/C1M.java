package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1M<T> {
    public boolean A00;
    public boolean A01 = true;
    public final C1G<T> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1G != com.facebook.ads.cache.api.ResponseAdapter<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public C1M(C1G<T> c1g) {
        this.A02 = c1g;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final C1G<T> A00() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final void A01(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final void A02(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final boolean A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final boolean A04() {
        return this.A01;
    }
}
