package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.mrf;

/* JADX INFO: loaded from: classes3.dex */
public class kdv {
    private int exu;
    private long fs;
    private long jpc;
    private mrf lnr = mrf.lnr();
    private mrf mml = mrf.lnr();
    private long mo;
    private long mzz;
    public boolean qdl;
    private int rq;
    private long to;
    private long tvp;
    public long ud;
    private long wd;

    public int jpc() {
        return this.rq;
    }

    public long lnr() {
        return this.mo;
    }

    public long mml() {
        return this.wd;
    }

    public long mo() {
        return this.tvp;
    }

    public long mzz() {
        return this.jpc;
    }

    public void qdl(mrf mrfVar, mrf mrfVar2, int i2, mrf mrfVar3) {
        this.mzz = mrfVar.qdl(this.lnr);
        this.mo = mrfVar2.qdl(mrfVar);
        this.wd = i2;
        this.jpc = mrfVar3.qdl(mrfVar2);
    }

    public synchronized long to() {
        return this.exu;
    }

    public long tvp() {
        return this.fs;
    }

    public void ud(mrf mrfVar) {
        this.mml = mrfVar;
        this.tvp = mrfVar.qdl(this.lnr);
    }

    public long wd() {
        return this.to;
    }

    public long ud() {
        return this.mzz;
    }

    public void ud(long j) {
        this.fs = j;
    }

    public void qdl(mrf mrfVar) {
        this.lnr = mrfVar;
    }

    public synchronized void ud(int i2) {
        this.exu = i2;
    }

    public mrf qdl() {
        return this.lnr;
    }

    public void qdl(long j) {
        this.to = j;
    }

    public void qdl(int i2) {
        this.rq = i2;
    }
}
