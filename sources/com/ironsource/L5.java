package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class L5 implements InterfaceC0396ig {
    @Override // com.ironsource.InterfaceC0396ig
    public void a(Runnable task) {
        kotlin.jvm.internal.n.f(task, "task");
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().submit(task);
    }

    @Override // com.ironsource.InterfaceC0396ig
    public boolean a() {
        return IronSourceThreadManager.INSTANCE.getLevelPlayThread().a();
    }
}
