package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class A5 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f25614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(String name) {
        super(name);
        kotlin.jvm.internal.n.f(name, "name");
    }

    public final void a(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        Handler handler = this.f25614a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.f25614a = new Handler(getLooper());
    }
}
