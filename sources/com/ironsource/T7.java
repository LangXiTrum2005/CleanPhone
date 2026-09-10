package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class T7 implements P1 {
    @Override // com.ironsource.P1
    public void a(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(observer);
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC0408ja observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(observer);
    }
}
