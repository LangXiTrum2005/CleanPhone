package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class db<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f677a;
    public final B b;

    public db(long j, B b) {
        this.f677a = j;
        this.b = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.f677a == dbVar.f677a && AbstractC2995aW.i(this.b, dbVar.b);
    }

    public int hashCode() {
        long j = this.f677a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        B b = this.b;
        return i + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return "LongObjectPair(first=" + this.f677a + ", second=" + this.b + ")";
    }
}
