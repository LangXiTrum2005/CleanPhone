package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Path;
import com.bytedance.adsdk.ud.qdl.qdl.exc;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class exu extends qdl<com.bytedance.adsdk.ud.lnr.ud.rdp, Path> {
    private final com.bytedance.adsdk.ud.lnr.ud.rdp mml;
    private List<exc> mo;
    private final Path mzz;

    public exu(List<com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.rdp>> list) {
        super(list);
        this.mml = new com.bytedance.adsdk.ud.lnr.ud.rdp();
        this.mzz = new Path();
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Path qdl(com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.rdp> qdlVar, float f) {
        this.mml.qdl(qdlVar.qdl, qdlVar.ud, f);
        com.bytedance.adsdk.ud.lnr.ud.rdp rdpVarQdl = this.mml;
        List<exc> list = this.mo;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                rdpVarQdl = this.mo.get(size).qdl(rdpVarQdl);
            }
        }
        com.bytedance.adsdk.ud.mo.mzz.qdl(rdpVarQdl, this.mzz);
        return this.mzz;
    }

    public void qdl(List<exc> list) {
        this.mo = list;
    }
}
