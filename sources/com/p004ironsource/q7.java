package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSourceSegment;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.r7;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q7<Smash extends r7<?>> extends n7<Smash, AdapterAdRewardListener> implements t2 {
    public q7(t0 t0Var, xk xkVar, IronSourceSegment ironSourceSegment) {
        super(t0Var, xkVar, ironSourceSegment);
    }

    @Override // com.p004ironsource.t2
    public void a(r7<?> r7Var, Placement placement) {
        IronLog.INTERNAL.verbose(b(r7Var.k()));
        this.t.b(placement, r7Var.f());
    }
}
