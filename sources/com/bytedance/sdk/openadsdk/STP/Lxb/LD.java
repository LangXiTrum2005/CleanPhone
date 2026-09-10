package com.bytedance.sdk.openadsdk.STP.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private boolean JXs;
    private tD LD;
    private String Lxb;
    private int OY = 0;
    private int QAg = 0;
    private int ZU;
    private int ebl;
    private String lc;
    private String lk;

    public boolean JXs() {
        return this.JXs;
    }

    public tD LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public int OY() {
        return this.OY;
    }

    public int QAg() {
        return this.QAg;
    }

    public int ZU() {
        return this.ZU;
    }

    public int ebl() {
        return this.ebl;
    }

    public String lc() {
        return this.lc;
    }

    public String lk() {
        tD tDVar;
        if (TextUtils.isEmpty(this.lk) && (tDVar = this.LD) != null) {
            this.lk = nJ.Lxb(tDVar);
        }
        return this.lk;
    }

    public void LD(String str) {
        this.lk = str;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void ZU(int i) {
        this.QAg = i;
    }

    public void LD(int i) {
        this.ebl = i;
    }

    public void Lxb(tD tDVar) {
        this.LD = tDVar;
    }

    public void Lxb(int i) {
        this.ZU = i;
    }

    public void Lxb(boolean z) {
        this.JXs = z;
    }

    public void lk(String str) {
        this.lc = str;
    }

    public void lk(int i) {
        this.OY = i;
    }
}
