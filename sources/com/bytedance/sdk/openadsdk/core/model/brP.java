package com.bytedance.sdk.openadsdk.core.model;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes2.dex */
public class brP {
    private long Lxb = WorkRequest.MIN_BACKOFF_MILLIS;
    private long LD = WorkRequest.MIN_BACKOFF_MILLIS;
    private long lk = 10;
    private long ZU = 20;
    private String JXs = "";

    public String JXs() {
        return this.JXs;
    }

    public long LD() {
        return this.LD;
    }

    public long Lxb() {
        return this.Lxb;
    }

    public long ZU() {
        return this.ZU;
    }

    public long lk() {
        return this.lk;
    }

    public void LD(long j) {
        if (j < 0) {
            this.LD = 20L;
        } else {
            this.LD = j;
        }
    }

    public void Lxb(long j) {
        if (j <= 0) {
            this.Lxb = 10L;
        } else {
            this.Lxb = j;
        }
    }

    public void ZU(long j) {
        if (j < 0) {
            this.ZU = 20L;
        } else {
            this.ZU = j;
        }
    }

    public void lk(long j) {
        if (j <= 0) {
            this.lk = 10L;
        } else {
            this.lk = j;
        }
    }

    public void Lxb(String str) {
        this.JXs = str;
    }
}
