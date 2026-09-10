package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f14033a = new h();

    public Object a(String str, b2 base64Wrapper, Function2 onLoadFailure) {
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        Intrinsics.f(onLoadFailure, "onLoadFailure");
        if (str == null) {
            return null;
        }
        String strB = base64Wrapper.b(str);
        if (strB.length() != 0) {
            return strB;
        }
        za.b("Cannot decode provided bidResponse.", (Throwable) null, 2, (Object) null);
        onLoadFailure.invoke("", CBError.Impression.INVALID_RESPONSE);
        return ResultKt.a(g.a.f13970b);
    }
}
