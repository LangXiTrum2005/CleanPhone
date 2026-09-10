package com.bytedance.adsdk.lr.ik;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private final String ik;
    public final float lr;
    public final float ri;

    public di(String str, float f, float f2) {
        this.ik = str;
        this.lr = f2;
        this.ri = f;
    }

    public boolean ri(String str) {
        if (this.ik.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.ik.endsWith("\r")) {
            String str2 = this.ik;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
