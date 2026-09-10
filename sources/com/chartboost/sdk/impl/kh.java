package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum kh {
    TRACKING_UNKNOWN(-1),
    TRACKING_ENABLED(0),
    TRACKING_LIMITED(1);

    public static final /* synthetic */ EnumEntries g = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14367b;

    kh(int i2) {
        this.f14367b = i2;
    }

    public final int b() {
        return this.f14367b;
    }
}
