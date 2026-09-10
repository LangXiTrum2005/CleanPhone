package com.inmobi.media;

import android.os.Handler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f22987a = LazyKt.b(Ld.f22954a);

    @JvmStatic
    public static final void a(Runnable runnable, long j) {
        Intrinsics.f(runnable, "runnable");
        ((Handler) f22987a.getX()).postDelayed(runnable, j);
    }

    @JvmStatic
    public static final void a(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        ((Handler) f22987a.getX()).post(runnable);
    }
}
