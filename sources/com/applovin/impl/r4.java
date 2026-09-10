package com.applovin.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9171c;

    public r4(String str, String str2, Context context) {
        this.f9169a = str.replace("android.permission.", "");
        this.f9170b = str2;
        this.f9171c = p0.a(str, context);
    }

    public String a() {
        return this.f9170b;
    }

    public String b() {
        return this.f9169a;
    }

    public boolean c() {
        return this.f9171c;
    }
}
