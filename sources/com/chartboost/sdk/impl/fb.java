package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum fb {
    VAST("vast"),
    HTML("html"),
    NATIVE("native");

    public static final /* synthetic */ EnumEntries g = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13891b;

    fb(String str) {
        this.f13891b = str;
    }

    public final String b() {
        return this.f13891b;
    }
}
