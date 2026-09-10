package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0491o3 extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491o3(AbstractC0649x0 adUnitData, Pg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.H
    public void a(B instance, H.b loadSelection) {
        String strO;
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        if (!instance.v()) {
            IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.p() + " (non-bidder) is ready to load");
            loadSelection.a().add(instance);
            return;
        }
        loadSelection.a(true);
        if (loadSelection.e()) {
            strO = defpackage.e.o("Advanced Loading: Starting to load bidder ", instance.p(), ". No other instances will be loaded at the same time.");
            loadSelection.a().add(instance);
        } else {
            strO = defpackage.e.o("Advanced Loading: Won't start loading bidder ", instance.p(), " as a non bidder is being loaded");
        }
        IronLog.INTERNAL.verbose(instance.d().name() + " - " + strO);
    }

    @Override // com.ironsource.H
    public boolean a(H.b loadSelection) {
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        return super.a(loadSelection) || loadSelection.d();
    }
}
