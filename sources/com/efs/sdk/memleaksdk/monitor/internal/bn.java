package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes2.dex */
public final class bn extends bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f615a;
    public final InterfaceC2766Sw b;
    private final bx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(bx bxVar, String str, InterfaceC2766Sw interfaceC2766Sw) {
        super((byte) 0);
        AbstractC2995aW.q(bxVar, "pattern");
        AbstractC2995aW.q(str, "description");
        AbstractC2995aW.q(interfaceC2766Sw, "patternApplies");
        this.c = bxVar;
        this.f615a = str;
        this.b = interfaceC2766Sw;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bw
    public bx a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return AbstractC2995aW.i(a(), bnVar.a()) && AbstractC2995aW.i(this.f615a, bnVar.f615a) && AbstractC2995aW.i(this.b, bnVar.b);
    }

    public int hashCode() {
        bx bxVarA = a();
        int iHashCode = (bxVarA != null ? bxVarA.hashCode() : 0) * 31;
        String str = this.f615a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        InterfaceC2766Sw interfaceC2766Sw = this.b;
        return iHashCode2 + (interfaceC2766Sw != null ? interfaceC2766Sw.hashCode() : 0);
    }

    public String toString() {
        return "library leak: " + a();
    }
}
