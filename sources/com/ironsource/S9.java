package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class S9 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f27180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9(String name) {
        super(name);
        kotlin.jvm.internal.n.f(name, "name");
    }

    public final void a(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void b(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        Handler handler = this.f27180a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(S9 s10, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        s10.a(runnable, j10);
    }

    public final void a(Runnable task, long j10) {
        kotlin.jvm.internal.n.f(task, "task");
        Handler handler = this.f27180a;
        if (handler != null) {
            handler.postDelayed(task, j10);
        }
    }

    public final void a() {
        this.f27180a = new Handler(getLooper());
    }
}
