package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class cy<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f671a;
    public final B b;

    public cy(int i, B b) {
        this.f671a = i;
        this.b = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return this.f671a == cyVar.f671a && AbstractC2995aW.i(this.b, cyVar.b);
    }

    public int hashCode() {
        int i = this.f671a * 31;
        B b = this.b;
        return i + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return "IntObjectPair(first=" + this.f671a + ", second=" + this.b + ")";
    }
}
