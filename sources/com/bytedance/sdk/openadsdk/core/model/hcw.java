package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.pv;

/* JADX INFO: loaded from: classes2.dex */
public class hcw {
    private int aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private long f18138co;
    private long di;
    private long fi;
    private long jbs;
    public long lr;
    private long mj;
    private long qt;
    public boolean ri;
    private int sf;
    private long xha;
    private pv ik = pv.ik();
    private pv ka = pv.ik();

    public long di() {
        return this.jbs;
    }

    public long fi() {
        return this.mj;
    }

    public long ik() {
        return this.di;
    }

    public long jbs() {
        return this.f18138co;
    }

    public long ka() {
        return this.xha;
    }

    public void lr(pv pvVar) {
        this.ka = pvVar;
        this.jbs = pvVar.ri(this.ik);
    }

    public int mj() {
        return this.sf;
    }

    public synchronized int qt() {
        return this.aw;
    }

    public void ri(pv pvVar, pv pvVar2, int i, pv pvVar3) {
        this.fi = pvVar.ri(this.ik);
        this.di = pvVar2.ri(pvVar);
        this.xha = i;
        this.mj = pvVar3.ri(pvVar2);
    }

    public long xha() {
        return this.qt;
    }

    public long lr() {
        return this.fi;
    }

    public void lr(long j) {
        this.f18138co = j;
    }

    public synchronized void lr(int i) {
        this.aw = i;
    }

    public void ri(pv pvVar) {
        this.ik = pvVar;
    }

    public pv ri() {
        return this.ik;
    }

    public void ri(long j) {
        this.qt = j;
    }

    public void ri(int i) {
        this.sf = i;
    }
}
