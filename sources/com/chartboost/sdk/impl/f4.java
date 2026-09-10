package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f4 {
    public static final Context a() {
        Context applicationContext = w3.f15454b.d().getContext().getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final la b() {
        return w3.f15454b.a().v();
    }
}
