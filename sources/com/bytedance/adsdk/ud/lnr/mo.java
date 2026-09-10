package com.bytedance.adsdk.ud.lnr;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    private final String lnr;
    public final float qdl;
    public final float ud;

    public mo(String str, float f, float f2) {
        this.lnr = str;
        this.ud = f2;
        this.qdl = f;
    }

    public boolean qdl(String str) {
        if (this.lnr.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.lnr.endsWith("\r")) {
            String str2 = this.lnr;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
