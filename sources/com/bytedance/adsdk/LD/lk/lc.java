package com.bytedance.adsdk.LD.lk;

/* JADX INFO: loaded from: classes.dex */
public class lc {
    public final float LD;
    public final float Lxb;
    private final String lk;

    public lc(String str, float f, float f2) {
        this.lk = str;
        this.LD = f2;
        this.Lxb = f;
    }

    public boolean Lxb(String str) {
        if (this.lk.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.lk.endsWith("\r")) {
            String str2 = this.lk;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
