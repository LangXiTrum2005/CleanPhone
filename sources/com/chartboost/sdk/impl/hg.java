package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14115a;

    public hg(SharedPreferences defaultSharedPreferences) {
        Intrinsics.f(defaultSharedPreferences, "defaultSharedPreferences");
        this.f14115a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f14115a.getString("IABTCF_TCString", null);
    }
}
