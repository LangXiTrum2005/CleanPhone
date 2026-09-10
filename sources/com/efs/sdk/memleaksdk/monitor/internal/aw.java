package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb f572a;
    private final au b;

    public aw(au auVar, cb cbVar) {
        AbstractC2995aW.q(auVar, "graph");
        AbstractC2995aW.q(cbVar, "holder");
        this.b = auVar;
        this.f572a = cbVar;
    }

    public final Boolean a() {
        cb cbVar = this.f572a;
        if (cbVar instanceof cb.a) {
            return Boolean.valueOf(((cb.a) cbVar).b);
        }
        return null;
    }

    public final Integer b() {
        cb cbVar = this.f572a;
        if (cbVar instanceof cb.g) {
            return Integer.valueOf(((cb.g) cbVar).b);
        }
        return null;
    }

    public final Long c() {
        cb cbVar = this.f572a;
        if (cbVar instanceof cb.h) {
            return Long.valueOf(((cb.h) cbVar).b);
        }
        return null;
    }

    public final Long d() {
        cb cbVar = this.f572a;
        if (!(cbVar instanceof cb.i) || ((cb.i) cbVar).a()) {
            return null;
        }
        return Long.valueOf(((cb.i) this.f572a).b);
    }

    public final boolean e() {
        cb cbVar = this.f572a;
        return (cbVar instanceof cb.i) && !((cb.i) cbVar).a();
    }

    public final av f() {
        cb cbVar = this.f572a;
        if (!(cbVar instanceof cb.i) || ((cb.i) cbVar).a()) {
            return null;
        }
        return this.b.a(((cb.i) this.f572a).b);
    }

    public final String g() {
        av avVarB;
        av.c cVarE;
        cb cbVar = this.f572a;
        if (!(cbVar instanceof cb.i) || ((cb.i) cbVar).a() || (avVarB = this.b.b(((cb.i) this.f572a).b)) == null || (cVarE = avVarB.e()) == null) {
            return null;
        }
        return cVarE.m();
    }
}
