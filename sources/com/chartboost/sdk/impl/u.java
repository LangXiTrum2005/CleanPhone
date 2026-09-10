package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static final void a(xa xaVar, Function1 isSuccess, Function2 isError) {
        Intrinsics.f(xaVar, "<this>");
        Intrinsics.f(isSuccess, "isSuccess");
        Intrinsics.f(isError, "isError");
        if (xaVar.b() == null) {
            isSuccess.invoke(xaVar);
        } else {
            isError.invoke(xaVar, xaVar.b());
        }
    }
}
