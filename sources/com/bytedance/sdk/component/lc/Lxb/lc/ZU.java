package com.bytedance.sdk.component.lc.Lxb.lc;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private boolean JVA;
    private final int JXs;
    private final String LD;
    private final String Lxb;
    private String OY;
    private String ebl;
    private final String lc;
    private final boolean lk;
    private int ZU = -1;
    private int QAg = 0;
    private String nBu = null;

    public ZU(String str, String str2, boolean z, int i, String str3) {
        this.Lxb = str;
        this.LD = str2;
        this.lk = z;
        this.JXs = i;
        this.lc = str3;
    }

    public boolean JVA() {
        return this.ZU == -1;
    }

    public int JXs() {
        return this.JXs;
    }

    public String LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public int OY() {
        return this.QAg;
    }

    public String QAg() {
        return this.OY;
    }

    public int ZU() {
        return this.ZU;
    }

    public String ebl() {
        return this.ebl;
    }

    public String lc() {
        return this.lc;
    }

    public boolean lk() {
        return this.lk;
    }

    public boolean nBu() {
        return this.JVA;
    }

    public void LD(int i) {
        this.QAg = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.ebl)) {
            this.ebl = String.valueOf(this.QAg);
            return;
        }
        this.ebl += "," + this.QAg;
    }

    public void Lxb(int i) {
        this.ZU = i;
    }

    public void lk(String str) {
        this.nBu = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.OY)) {
            this.OY = String.valueOf(this.nBu);
            return;
        }
        this.OY += "," + this.nBu;
    }

    public void Lxb(String str) {
        this.ebl = str;
    }

    public void Lxb(boolean z) {
        this.JVA = z;
    }

    public Runnable Lxb(String str, Map<String, String> map) {
        return Lxb.Lxb().Lxb(this, str, map);
    }

    public void LD(String str) {
        this.OY = str;
    }
}
