package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum zc {
    UNKNOWN(0, "Unknown"),
    ETHERNET(1, "Ethernet"),
    WIFI(2, "WIFI"),
    CELLULAR_UNKNOWN(3, "Cellular_Unknown"),
    CELLULAR_2G(4, "Cellular_2G"),
    CELLULAR_3G(5, "Cellular_3G"),
    CELLULAR_4G(6, "Cellular_4G"),
    CELLULAR_5G(7, "Cellular_5G");

    public static final /* synthetic */ EnumEntries m = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15730c;

    zc(int i2, String str) {
        this.f15729b = i2;
        this.f15730c = str;
    }

    public final String b() {
        return this.f15730c;
    }

    public final int c() {
        return this.f15729b;
    }
}
