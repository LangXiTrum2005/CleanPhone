package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jpc {
    private final List<com.bytedance.adsdk.ud.lnr.ud.jpc> lnr;
    private final List<qdl<com.bytedance.adsdk.ud.lnr.ud.rdp, Path>> qdl;
    private final List<qdl<Integer, Integer>> ud;

    public jpc(List<com.bytedance.adsdk.ud.lnr.ud.jpc> list) {
        this.lnr = list;
        this.qdl = new ArrayList(list.size());
        this.ud = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.qdl.add(list.get(i2).ud().qdl());
            this.ud.add(list.get(i2).lnr().qdl());
        }
    }

    public List<qdl<Integer, Integer>> lnr() {
        return this.ud;
    }

    public List<com.bytedance.adsdk.ud.lnr.ud.jpc> qdl() {
        return this.lnr;
    }

    public List<qdl<com.bytedance.adsdk.ud.lnr.ud.rdp, Path>> ud() {
        return this.qdl;
    }
}
