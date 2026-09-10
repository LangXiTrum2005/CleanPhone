package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class OY implements Comparable<OY> {
    private String JXs;
    private final String LD;
    private final String Lxb;
    private final String OY;
    private final int ZU;
    private final int ebl;
    private final int lc;
    private final int lk;

    public OY(String str, String str2, int i, int i2, String str3, int i3, int i4, String str4) {
        this.Lxb = str;
        this.LD = str2;
        this.lk = i;
        this.ZU = i2;
        this.JXs = str3;
        if (TextUtils.isEmpty(str3)) {
            this.JXs = "0";
        }
        this.lc = i3;
        this.ebl = i4;
        this.OY = str4;
    }

    public int Lxb() {
        return this.lc;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(OY oy) {
        if (this.lc < oy.Lxb()) {
            return -1;
        }
        return this.lc == oy.Lxb() ? 0 : 1;
    }
}
