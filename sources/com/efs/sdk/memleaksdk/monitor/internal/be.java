package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class be extends bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bx f601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bx bxVar) {
        super((byte) 0);
        AbstractC2995aW.q(bxVar, "pattern");
        this.f601a = bxVar;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bw
    public bx a() {
        return this.f601a;
    }

    public String toString() {
        return "ignored ref: " + a();
    }
}
