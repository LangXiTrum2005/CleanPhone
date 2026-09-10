package com.bytedance.sdk.component.ik.ri;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    long di;
    long fi;
    long ik;
    long ka;
    long lr;
    long mj;
    long ri = SystemClock.elapsedRealtime();
    long xha;

    public void aw() {
        this.mj = SystemClock.elapsedRealtime();
    }

    public long bgr() {
        return this.lr;
    }

    public long co() {
        return this.mj;
    }

    public long di() {
        return this.di;
    }

    public void fi() {
        this.di = SystemClock.elapsedRealtime();
    }

    public void ik() {
        this.fi = SystemClock.elapsedRealtime();
    }

    public long jbs() {
        return this.fi;
    }

    public long ka() {
        return this.ri;
    }

    public void lr() {
        this.ka = SystemClock.elapsedRealtime();
    }

    public long mj() {
        return this.ka;
    }

    public long qt() {
        return this.xha;
    }

    public void ri() {
        this.ik = SystemClock.elapsedRealtime();
    }

    public void sf() {
        this.xha = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.ri + ", asyncCallExecTs=" + this.lr + ", requestStartExecTs=" + this.ik + ", requestConnectStartTs=" + this.ka + ", requestConnectFinishTs=" + this.fi + ", reqCallServerStartTs=" + this.xha + ", reqCallServerFinishTs=" + this.mj + '}';
    }

    public void vr() {
        this.lr = SystemClock.elapsedRealtime();
    }

    public long xha() {
        return this.ik;
    }
}
