package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class IeN {
    private boolean JXs;
    private int LD;
    private String Lxb;
    private double ZU;
    private String lc;
    private int lk;

    public boolean JXs() {
        return !TextUtils.isEmpty(this.Lxb) && this.LD > 0 && this.lk > 0;
    }

    public int LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public double ZU() {
        return this.ZU;
    }

    public String ebl() {
        return this.lc;
    }

    public boolean lc() {
        return this.JXs;
    }

    public int lk() {
        return this.lk;
    }

    public void LD(int i) {
        this.lk = i;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void LD(String str) {
        this.lc = str;
    }

    public void Lxb(int i) {
        this.LD = i;
    }

    public void Lxb(boolean z) {
        this.JXs = z;
    }
}
