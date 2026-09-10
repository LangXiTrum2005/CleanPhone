package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class G4 extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4(AbstractC0649x0 adUnitData, Pg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.H
    public void a(B instance, H.b loadSelection) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.q() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
