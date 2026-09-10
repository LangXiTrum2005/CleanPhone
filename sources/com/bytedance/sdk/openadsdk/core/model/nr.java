package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class nr {
    private String di;
    private boolean fi;
    private int ik;
    private double ka;
    private int lr;
    private String ri;

    public boolean di() {
        return this.fi;
    }

    public boolean fi() {
        return !TextUtils.isEmpty(this.ri) && this.lr > 0 && this.ik > 0;
    }

    public int ik() {
        return this.ik;
    }

    public double ka() {
        return this.ka;
    }

    public int lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public String xha() {
        return this.di;
    }

    public void lr(int i) {
        this.ik = i;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(String str) {
        this.di = str;
    }

    public void ri(int i) {
        this.lr = i;
    }

    public void ri(boolean z) {
        this.fi = z;
    }
}
