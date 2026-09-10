package com.ironsource;

import com.ironsource.AbstractC0401j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class I4<Smash extends AbstractC0401j3<?>> extends ch<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(int i10, boolean z10, List<? extends Smash> waterfall) {
        super(i10, z10, waterfall);
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
    }

    @Override // com.ironsource.ch
    public void c(Smash smash) {
        kotlin.jvm.internal.n.f(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
