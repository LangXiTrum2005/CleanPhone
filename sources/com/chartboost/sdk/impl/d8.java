package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13686a;

    public d8(SharedPreferences defaultSharedPreferences) {
        Intrinsics.f(defaultSharedPreferences, "defaultSharedPreferences");
        this.f13686a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f13686a.getString("IABGPP_GppSID", null);
    }

    public final String b() {
        return this.f13686a.getString("IABGPP_HDR_GppString", null);
    }
}
