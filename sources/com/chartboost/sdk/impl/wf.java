package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15488a;

    public wf(SharedPreferences sharedPrefs) {
        Intrinsics.f(sharedPrefs, "sharedPrefs");
        this.f15488a = sharedPrefs;
    }

    public final String a(String sharedPrefsKey) {
        Intrinsics.f(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.f15488a.getString(sharedPrefsKey, null);
        } catch (Exception e2) {
            za.b("Load from shared prefs exception", e2);
            return null;
        }
    }

    public final void a(String sharedPrefsKey, String str) {
        Intrinsics.f(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.f15488a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e2) {
            za.b("Save to shared prefs exception", e2);
        }
    }
}
