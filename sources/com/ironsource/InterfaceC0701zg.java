package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0701zg {
    void a() throws C0555re;

    default void a(boolean z10, jk.a lazyError) {
        kotlin.jvm.internal.n.f(lazyError, "lazyError");
        if (!z10) {
            throw new C0555re((IronSourceError) lazyError.invoke());
        }
    }
}
