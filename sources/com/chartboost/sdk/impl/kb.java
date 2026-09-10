package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum kb {
    UNKNOWN(0),
    HTML(1),
    VIDEO(2),
    AUDIO(3),
    NATIVE(4);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14347i = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14348b;

    kb(int i2) {
        this.f14348b = i2;
    }

    public static EnumEntries b() {
        return f14347i;
    }

    public final int c() {
        return this.f14348b;
    }
}
