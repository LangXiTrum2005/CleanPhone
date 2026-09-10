package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3730s implements InterfaceC3527g7, InterfaceC3527g7.a {
    private final Map<IronSource.a, AtomicBoolean> a = p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal(IronSource.a.REWARDED_VIDEO, new AtomicBoolean(false)), patroclinal.formularize.attabal(IronSource.a.INTERSTITIAL, new AtomicBoolean(false)), patroclinal.formularize.attabal(IronSource.a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC3527g7.a
    public void a(IronSource.a adFormat, boolean z) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC3527g7
    public boolean a(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
