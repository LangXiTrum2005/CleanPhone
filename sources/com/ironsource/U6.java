package com.ironsource;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class U6 implements InterfaceC0396ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f27307a;

    public U6(Handler handler) {
        kotlin.jvm.internal.n.f(handler, "handler");
        this.f27307a = handler;
    }

    @Override // com.ironsource.InterfaceC0396ig
    public void a(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        this.f27307a.post(task);
    }

    @Override // com.ironsource.InterfaceC0396ig
    public boolean a() {
        return Thread.currentThread() == this.f27307a.getLooper().getThread();
    }
}
