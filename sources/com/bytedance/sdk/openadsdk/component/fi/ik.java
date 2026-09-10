package com.bytedance.sdk.openadsdk.component.fi;

import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private String di;
    private int fi;
    private wjv ik;
    private com.bytedance.sdk.openadsdk.core.model.ri ka;
    private int lr;
    private int ri;
    private boolean xha;

    public ik(int i, int i2, wjv wjvVar, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ri = i;
        this.lr = i2;
        this.ik = wjvVar;
        this.ka = riVar;
    }

    public String di() {
        return this.di;
    }

    public int fi() {
        return this.fi;
    }

    public int ik() {
        return this.lr;
    }

    public wjv ka() {
        return this.ik;
    }

    public int lr() {
        return this.ri;
    }

    public com.bytedance.sdk.openadsdk.core.model.ri ri() {
        return this.ka;
    }

    public void ri(boolean z) {
        this.xha = z;
    }

    public ik(int i, int i2, int i3, String str) {
        this.ri = i;
        this.lr = i2;
        this.fi = i3;
        this.di = str;
    }
}
