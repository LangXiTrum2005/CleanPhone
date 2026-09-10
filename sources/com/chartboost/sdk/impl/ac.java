package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum ac {
    DEFAULT("default"),
    EXPANDED("expanded"),
    HIDDEN("hidden"),
    LOADING("loading"),
    RESIZED("resized");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13425i = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13426b;

    ac(String str) {
        this.f13426b = str;
    }

    public final String b() {
        return this.f13426b;
    }
}
