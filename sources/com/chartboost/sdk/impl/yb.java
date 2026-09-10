package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum yb {
    LANDSCAPE(com.ironsource.d9.h.C),
    PORTRAIT(com.ironsource.d9.h.D),
    NONE("");

    public static final /* synthetic */ EnumEntries g = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15633b;

    yb(String str) {
        this.f15633b = str;
    }

    public final String b() {
        return this.f15633b;
    }
}
