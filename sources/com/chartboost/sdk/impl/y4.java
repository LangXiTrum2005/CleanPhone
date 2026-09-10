package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum y4 {
    CONNECTION_UNKNOWN(-1),
    CONNECTION_ERROR(0),
    CONNECTION_WIFI(1),
    CONNECTION_MOBILE(2);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f15609h = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15610b;

    y4(int i2) {
        this.f15610b = i2;
    }

    public final int b() {
        return this.f15610b;
    }
}
