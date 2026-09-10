package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.events.ChartboostError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc f14245a;

    public ja(Context context) {
        Intrinsics.f(context, "context");
        yc ycVar = new yc(context);
        yc.a(ycVar, null, 1, null);
        this.f14245a = ycVar;
    }

    public final void a() {
        this.f14245a.b();
    }

    public final Object b() {
        return Unit.f43263a;
    }

    public final Object c() {
        if (this.f14245a.a()) {
            return Unit.f43263a;
        }
        za.b("Internet connection is not available.", (Throwable) null, 2, (Object) null);
        return ResultKt.a(ChartboostError.Connectivity.NoInternet.INSTANCE);
    }

    public final Object d() {
        Object objB = b();
        if (objB instanceof Result.Failure) {
            return objB;
        }
        Object objC = c();
        return objC instanceof Result.Failure ? objC : Unit.f43263a;
    }
}
