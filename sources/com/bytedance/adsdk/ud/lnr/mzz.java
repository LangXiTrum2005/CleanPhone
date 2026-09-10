package com.bytedance.adsdk.ud.lnr;

import com.bytedance.adsdk.ud.rdp;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private static final mzz qdl = new mzz();
    private final rdp<String, com.bytedance.adsdk.ud.wd> ud = new rdp<>(20);

    public static mzz qdl() {
        return qdl;
    }

    public com.bytedance.adsdk.ud.wd qdl(String str) {
        if (str == null) {
            return null;
        }
        return this.ud.qdl(str);
    }

    public void qdl(String str, com.bytedance.adsdk.ud.wd wdVar) {
        if (str == null) {
            return;
        }
        this.ud.qdl(str, wdVar);
    }
}
