package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum ae {
    IMMEDIATE(0),
    HIGH(1),
    NORMAL(2),
    LOW(3);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13451h = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13452b;

    ae(int i2) {
        this.f13452b = i2;
    }

    public final int b() {
        return this.f13452b;
    }
}
