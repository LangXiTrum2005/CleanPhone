package com.bytedance.sdk.component.lk.Lxb;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    long JXs;
    long LD;
    long Lxb = SystemClock.elapsedRealtime();
    long OY;
    long ZU;
    long ebl;
    long lc;
    long lk;

    public void IeN() {
        this.LD = SystemClock.elapsedRealtime();
    }

    public void JVA() {
        this.ebl = SystemClock.elapsedRealtime();
    }

    public void JXs() {
        this.lc = SystemClock.elapsedRealtime();
    }

    public void LD() {
        this.ZU = SystemClock.elapsedRealtime();
    }

    public void Lxb() {
        this.lk = SystemClock.elapsedRealtime();
    }

    public void NXR() {
        this.OY = SystemClock.elapsedRealtime();
    }

    public long OY() {
        return this.ZU;
    }

    public long QAg() {
        return this.JXs;
    }

    public long STP() {
        return this.LD;
    }

    public long ZU() {
        return this.Lxb;
    }

    public long ebl() {
        return this.lk;
    }

    public long lc() {
        return this.lc;
    }

    public void lk() {
        this.JXs = SystemClock.elapsedRealtime();
    }

    public long nBu() {
        return this.ebl;
    }

    public long sLN() {
        return this.OY;
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.Lxb + ", asyncCallExecTs=" + this.LD + ", requestStartExecTs=" + this.lk + ", requestConnectStartTs=" + this.ZU + ", requestConnectFinishTs=" + this.JXs + ", reqCallServerStartTs=" + this.ebl + ", reqCallServerFinishTs=" + this.OY + '}';
    }
}
