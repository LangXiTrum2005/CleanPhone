package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final td f15202a = new td();

    public final d2 a(Context context, i5 ctaConfig, Function0 function0) {
        Intrinsics.f(context, "context");
        Intrinsics.f(ctaConfig, "ctaConfig");
        d2 bkVar = ctaConfig.b() != null ? new bk(context, null, 0, null, function0, 14, null) : new sc(context, null, 0, null, null, null, null, function0, 126, null);
        bkVar.a(ctaConfig);
        return bkVar;
    }
}
