package com.bytedance.sdk.openadsdk.slm.ri;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private String di;
    private boolean fi;
    private String ik;
    private int ka;
    private wjv lr;
    private String ri;
    private int xha;
    private int mj = 0;
    private int jbs = 0;

    public String di() {
        return this.di;
    }

    public boolean fi() {
        return this.fi;
    }

    public String ik() {
        wjv wjvVar;
        if (TextUtils.isEmpty(this.ik) && (wjvVar = this.lr) != null) {
            this.ik = ig.ri(wjvVar);
        }
        return this.ik;
    }

    public int jbs() {
        return this.jbs;
    }

    public int ka() {
        return this.ka;
    }

    public wjv lr() {
        return this.lr;
    }

    public int mj() {
        return this.mj;
    }

    public String ri() {
        return this.ri;
    }

    public int xha() {
        return this.xha;
    }

    public void lr(String str) {
        this.ik = str;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(int i) {
        this.xha = i;
    }

    public void ri(wjv wjvVar) {
        this.lr = wjvVar;
    }

    public void ri(int i) {
        this.ka = i;
    }

    public void ik(String str) {
        this.di = str;
    }

    public void ri(boolean z) {
        this.fi = z;
    }
}
