package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15640c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mediation f15641e;

    public yf(String str, String location, int i2, String adTypeName, Mediation mediation) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adTypeName, "adTypeName");
        this.f15638a = str;
        this.f15639b = location;
        this.f15640c = i2;
        this.d = adTypeName;
        this.f15641e = mediation;
    }

    public final String a() {
        return this.f15638a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f15639b;
    }

    public final Mediation d() {
        return this.f15641e;
    }

    public final int e() {
        return this.f15640c;
    }
}
