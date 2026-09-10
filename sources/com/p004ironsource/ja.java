package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ironsource/ja;", "Lcom/ironsource/f0;", "Lcom/ironsource/z;", m5.f25675p, "Lcom/ironsource/f0$b;", "loadSelection", "", "a", "Lcom/ironsource/u1;", "adUnitData", "Lcom/ironsource/jx;", "waterfallInstances", "<init>", "(Lcom/ironsource/u1;Lcom/ironsource/jx;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class ja extends AbstractC3355f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(u1 adUnitData, jx waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(waterfallInstances, "waterfallInstances");
    }

    @Override // com.p004ironsource.AbstractC3355f0
    public void a(AbstractC3389z instance, AbstractC3355f0.b loadSelection) {
        Intrinsics.f(instance, "instance");
        Intrinsics.f(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.getAdFormat().name() + " - Instance " + instance.getInstanceSignature() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
