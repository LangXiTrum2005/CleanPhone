package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes2.dex */
public final class cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f672a;
    public final long b;

    public cz(long j, long j2) {
        this.f672a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return this.f672a == czVar.f672a && this.b == czVar.b;
    }

    public int hashCode() {
        long j = this.f672a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LongLongPair(first=");
        sb.append(this.f672a);
        sb.append(", second=");
        return AbstractC3950lJ.s(sb, this.b, ")");
    }
}
