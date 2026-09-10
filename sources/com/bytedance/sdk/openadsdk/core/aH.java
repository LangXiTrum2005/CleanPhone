package com.bytedance.sdk.openadsdk.core;

import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes2.dex */
public class aH {
    private static aH Lxb;
    private com.bytedance.sdk.openadsdk.Lxb.lk.LD JXs;
    private com.bytedance.sdk.openadsdk.core.model.Lxb LD;
    private com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb ZU;
    private com.bytedance.sdk.openadsdk.Lxb.ZU.LD lc;
    private com.bytedance.sdk.openadsdk.core.model.tD lk;

    private aH() {
    }

    @MainThread
    public static aH Lxb() {
        if (Lxb == null) {
            Lxb = new aH();
        }
        return Lxb;
    }

    public com.bytedance.sdk.openadsdk.Lxb.ZU.LD JXs() {
        return this.lc;
    }

    public com.bytedance.sdk.openadsdk.core.model.tD LD() {
        return this.lk;
    }

    public com.bytedance.sdk.openadsdk.Lxb.lk.LD ZU() {
        return this.JXs;
    }

    public com.bytedance.sdk.openadsdk.core.model.Lxb ebl() {
        return this.LD;
    }

    public void lc() {
        this.lk = null;
        this.LD = null;
        this.ZU = null;
        this.JXs = null;
        this.lc = null;
    }

    public com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lk() {
        return this.ZU;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        this.lk = tDVar;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.Lxb.lk.LD ld) {
        this.JXs = ld;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb) {
        this.ZU = lxb;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.Lxb.ZU.LD ld) {
        this.lc = ld;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        this.LD = lxb;
    }
}
