package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0940i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH("refresh"),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10927a;

    EnumC0940i(String str) {
        this.f10927a = str;
    }

    public String b() {
        return this.f10927a;
    }
}
