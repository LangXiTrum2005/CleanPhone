package com.efs.sdk.memleaksdk.monitor.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;

/* JADX INFO: loaded from: classes2.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final au f662a;

    public cr(au auVar) {
        AbstractC2995aW.q(auVar, "graph");
        this.f662a = auVar;
    }

    public final int a(long j) {
        aw awVar;
        av avVarA = this.f662a.a(j);
        Long lValueOf = null;
        if (avVarA instanceof av.c) {
            av.c cVar = (av.c) avVarA;
            if (!AbstractC2995aW.i(cVar.h(), "java.lang.String")) {
                return cVar.i().g();
            }
            at atVarB = cVar.b("java.lang.String", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (atVarB != null && (awVar = atVarB.c) != null) {
                lValueOf = awVar.d();
            }
            return cVar.i().g() + (lValueOf != null ? a(lValueOf.longValue()) : 0);
        }
        if (!(avVarA instanceof av.d)) {
            if (avVarA instanceof av.e) {
                return ((av.e) avVarA).f();
            }
            if (avVarA instanceof av.b) {
                return avVarA.c();
            }
            throw new C3770jF(7, 0);
        }
        av.d dVar = (av.d) avVarA;
        if (!cp.a(dVar)) {
            return dVar.g();
        }
        long[] jArr = dVar.b().f589a;
        int length = jArr.length * this.f662a.a();
        for (long j2 : jArr) {
            if (j2 != 0) {
                lValueOf = Long.valueOf(j2);
                break;
            }
        }
        if (lValueOf == null) {
            return length;
        }
        int iA = a(lValueOf.longValue());
        int i = 0;
        for (long j3 : jArr) {
            if (j3 != 0) {
                i++;
            }
        }
        return (iA * i) + length;
    }
}
