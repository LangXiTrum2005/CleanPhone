package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class jl {
    private int lnr;
    private double mml;
    private String mo;
    private boolean mzz;
    private String qdl;
    private int ud;

    public int lnr() {
        return this.lnr;
    }

    public double mml() {
        return this.mml;
    }

    public boolean mo() {
        return this.mzz;
    }

    public boolean mzz() {
        return !TextUtils.isEmpty(this.qdl) && this.ud > 0 && this.lnr > 0;
    }

    public String qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.ud;
    }

    public String wd() {
        return this.mo;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(int i2) {
        this.lnr = i2;
    }

    public void qdl(int i2) {
        this.ud = i2;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(boolean z2) {
        this.mzz = z2;
    }
}
