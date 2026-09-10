package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.PointF;
import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class rdp {
    private boolean lnr;
    private final List<com.bytedance.adsdk.ud.lnr.qdl> qdl;
    private PointF ud;

    public rdp(PointF pointF, boolean z2, List<com.bytedance.adsdk.ud.lnr.qdl> list) {
        this.ud = pointF;
        this.lnr = z2;
        this.qdl = new ArrayList(list);
    }

    public List<com.bytedance.adsdk.ud.lnr.qdl> lnr() {
        return this.qdl;
    }

    public void qdl(float f, float f2) {
        if (this.ud == null) {
            this.ud = new PointF();
        }
        this.ud.set(f, f2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.qdl.size());
        sb.append("closed=");
        return a.r(sb, this.lnr, AbstractJsonLexerKt.END_OBJ);
    }

    public boolean ud() {
        return this.lnr;
    }

    public PointF qdl() {
        return this.ud;
    }

    public rdp() {
        this.qdl = new ArrayList();
    }

    public void qdl(boolean z2) {
        this.lnr = z2;
    }

    public void qdl(rdp rdpVar, rdp rdpVar2, float f) {
        if (this.ud == null) {
            this.ud = new PointF();
        }
        this.lnr = rdpVar.ud() || rdpVar2.ud();
        if (rdpVar.lnr().size() != rdpVar2.lnr().size()) {
            rdpVar.lnr().size();
            rdpVar2.lnr().size();
        }
        int iMin = Math.min(rdpVar.lnr().size(), rdpVar2.lnr().size());
        if (this.qdl.size() < iMin) {
            for (int size = this.qdl.size(); size < iMin; size++) {
                this.qdl.add(new com.bytedance.adsdk.ud.lnr.qdl());
            }
        } else if (this.qdl.size() > iMin) {
            for (int size2 = this.qdl.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.ud.lnr.qdl> list = this.qdl;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFQdl = rdpVar.qdl();
        PointF pointFQdl2 = rdpVar2.qdl();
        qdl(com.bytedance.adsdk.ud.mo.mzz.qdl(pointFQdl.x, pointFQdl2.x, f), com.bytedance.adsdk.ud.mo.mzz.qdl(pointFQdl.y, pointFQdl2.y, f));
        for (int size3 = this.qdl.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.ud.lnr.qdl qdlVar = rdpVar.lnr().get(size3);
            com.bytedance.adsdk.ud.lnr.qdl qdlVar2 = rdpVar2.lnr().get(size3);
            PointF pointFQdl3 = qdlVar.qdl();
            PointF pointFUd = qdlVar.ud();
            PointF pointFLnr = qdlVar.lnr();
            PointF pointFQdl4 = qdlVar2.qdl();
            PointF pointFUd2 = qdlVar2.ud();
            PointF pointFLnr2 = qdlVar2.lnr();
            this.qdl.get(size3).qdl(com.bytedance.adsdk.ud.mo.mzz.qdl(pointFQdl3.x, pointFQdl4.x, f), com.bytedance.adsdk.ud.mo.mzz.qdl(pointFQdl3.y, pointFQdl4.y, f));
            this.qdl.get(size3).ud(com.bytedance.adsdk.ud.mo.mzz.qdl(pointFUd.x, pointFUd2.x, f), com.bytedance.adsdk.ud.mo.mzz.qdl(pointFUd.y, pointFUd2.y, f));
            this.qdl.get(size3).lnr(com.bytedance.adsdk.ud.mo.mzz.qdl(pointFLnr.x, pointFLnr2.x, f), com.bytedance.adsdk.ud.mo.mzz.qdl(pointFLnr.y, pointFLnr2.y, f));
        }
    }
}
