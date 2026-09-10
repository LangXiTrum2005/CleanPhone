package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum o8 {
    REQUEST_SUCCESS_START(200),
    REQUEST_SUCCESS_END(299),
    REDIRECTION_START(300),
    REDIRECTION_END(399);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14760h = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14761b;

    o8(int i2) {
        this.f14761b = i2;
    }

    public final int b() {
        return this.f14761b;
    }
}
