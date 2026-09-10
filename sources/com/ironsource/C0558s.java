package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0558s implements InterfaceC0388i7, InterfaceC0388i7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, AtomicBoolean> f30189a = xj.b0.Q(new wj.f(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), new wj.f(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), new wj.f(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC0388i7.a
    public void a(IronSource.a adFormat, boolean z10) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f30189a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z10);
        }
    }

    @Override // com.ironsource.InterfaceC0388i7
    public boolean a(IronSource.a adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f30189a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
