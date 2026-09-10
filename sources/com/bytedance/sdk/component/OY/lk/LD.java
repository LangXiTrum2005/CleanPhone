package com.bytedance.sdk.component.OY.lk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LD implements Comparable<LD>, Runnable {
    private long JXs;
    private String LD;
    private int Lxb;
    private long ZU;
    private long lc;
    private Runnable lk;

    public LD(String str) {
        this.Lxb = 5;
        this.LD = str;
    }

    public long JXs() {
        return this.lc;
    }

    public String LD() {
        return this.LD;
    }

    public void Lxb(int i) {
        this.Lxb = i;
    }

    public Runnable OY() {
        return this.lk;
    }

    public long ZU() {
        return this.JXs;
    }

    public long ebl() {
        return this.lc - this.JXs;
    }

    public long lc() {
        return this.JXs - this.ZU;
    }

    public long lk() {
        return this.ZU;
    }

    public void LD(long j) {
        this.JXs = j;
    }

    public int Lxb() {
        return this.Lxb;
    }

    public void lk(long j) {
        this.lc = j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(LD ld) {
        if (Lxb() < ld.Lxb()) {
            return 1;
        }
        return Lxb() >= ld.Lxb() ? -1 : 0;
    }

    public LD(int i, String str) {
        this.Lxb = i;
        this.LD = str;
    }

    public void Lxb(long j) {
        this.ZU = j;
    }

    public LD(String str, Runnable runnable) {
        this.Lxb = 5;
        this.LD = str;
        this.lk = runnable;
    }
}
