package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3666o3 extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3666o3(AbstractC3816x0 adUnitData, wg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.H
    public void a(B instance, H.b loadSelection) {
        String str;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        if (!instance.u()) {
            IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.p() + " (non-bidder) is ready to load");
            loadSelection.a().add(instance);
            return;
        }
        loadSelection.a(true);
        if (loadSelection.e()) {
            str = "Advanced Loading: Starting to load bidder " + instance.p() + ". No other instances will be loaded at the same time.";
            loadSelection.a().add(instance);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + instance.p() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(instance.d().name() + " - " + str);
    }

    @Override // com.ironsource.H
    public boolean a(H.b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return super.a(loadSelection) || loadSelection.d();
    }
}
