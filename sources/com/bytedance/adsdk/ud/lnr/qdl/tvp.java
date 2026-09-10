package com.bytedance.adsdk.ud.lnr.qdl;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tvp implements exu<PointF, PointF> {
    private final ud qdl;
    private final ud ud;

    public tvp(ud udVar, ud udVar2) {
        this.qdl = udVar;
        this.ud = udVar2;
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public List<com.bytedance.adsdk.ud.wd.qdl<PointF>> lnr() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public com.bytedance.adsdk.ud.qdl.ud.qdl<PointF, PointF> qdl() {
        return new com.bytedance.adsdk.ud.qdl.ud.rdp(this.qdl.qdl(), this.ud.qdl());
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public boolean ud() {
        return this.qdl.ud() && this.ud.ud();
    }
}
