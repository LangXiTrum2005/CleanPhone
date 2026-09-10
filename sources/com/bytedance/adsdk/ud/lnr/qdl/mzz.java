package com.bytedance.adsdk.ud.lnr.qdl;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz implements exu<PointF, PointF> {
    private final List<com.bytedance.adsdk.ud.wd.qdl<PointF>> qdl;

    public mzz(List<com.bytedance.adsdk.ud.wd.qdl<PointF>> list) {
        this.qdl = list;
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public List<com.bytedance.adsdk.ud.wd.qdl<PointF>> lnr() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdl() {
        return this.qdl.get(0).mzz() ? new com.bytedance.adsdk.ud.qdl.ud.rq(this.qdl) : new com.bytedance.adsdk.ud.qdl.ud.to(this.qdl);
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public boolean ud() {
        return this.qdl.size() == 1 && this.qdl.get(0).mzz();
    }
}
