package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mml implements exu, mzz, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private final List<lnr> jpc;
    private final Matrix lnr;
    private final Path mml;
    private final String mo;
    private final RectF mzz;
    private final Paint qdl;
    private com.bytedance.adsdk.ud.qdl.ud.jtx rq;
    private List<exu> to;
    private final com.bytedance.adsdk.ud.tvp tvp;
    private final RectF ud;
    private final boolean wd;

    public mml(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.jtx jtxVar, com.bytedance.adsdk.ud.wd wdVar) {
        this(tvpVar, qdlVar, jtxVar.qdl(), jtxVar.lnr(), qdl(tvpVar, wdVar, qdlVar, jtxVar.ud()), qdl(jtxVar.ud()));
    }

    private boolean mzz() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.jpc.size(); i3++) {
            if ((this.jpc.get(i3) instanceof mzz) && (i2 = i2 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<lnr> qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, List<com.bytedance.adsdk.ud.lnr.ud.lnr> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            lnr lnrVarQdl = list.get(i2).qdl(tvpVar, wdVar, qdlVar);
            if (lnrVarQdl != null) {
                arrayList.add(lnrVarQdl);
            }
        }
        return arrayList;
    }

    public Matrix lnr() {
        com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = this.rq;
        if (jtxVar != null) {
            return jtxVar.mml();
        }
        this.lnr.reset();
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        this.lnr.reset();
        com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = this.rq;
        if (jtxVar != null) {
            this.lnr.set(jtxVar.mml());
        }
        this.mml.reset();
        if (this.wd) {
            return this.mml;
        }
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            lnr lnrVar = this.jpc.get(size);
            if (lnrVar instanceof exu) {
                this.mml.addPath(((exu) lnrVar).mml(), this.lnr);
            }
        }
        return this.mml;
    }

    public List<exu> ud() {
        if (this.to == null) {
            this.to = new ArrayList();
            for (int i2 = 0; i2 < this.jpc.size(); i2++) {
                lnr lnrVar = this.jpc.get(i2);
                if (lnrVar instanceof exu) {
                    this.to.add((exu) lnrVar);
                }
            }
        }
        return this.to;
    }

    public mml(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, String str, boolean z2, List<lnr> list, com.bytedance.adsdk.ud.lnr.qdl.fs fsVar) {
        this.qdl = new com.bytedance.adsdk.ud.qdl.qdl();
        this.ud = new RectF();
        this.lnr = new Matrix();
        this.mml = new Path();
        this.mzz = new RectF();
        this.mo = str;
        this.tvp = tvpVar;
        this.wd = z2;
        this.jpc = list;
        if (fsVar != null) {
            com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = fsVar.to();
            this.rq = jtxVar;
            jtxVar.qdl(qdlVar);
            this.rq.qdl(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            lnr lnrVar = list.get(size);
            if (lnrVar instanceof to) {
                arrayList.add((to) lnrVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((to) arrayList.get(size2)).qdl(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.fs qdl(List<com.bytedance.adsdk.ud.lnr.ud.lnr> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.bytedance.adsdk.ud.lnr.ud.lnr lnrVar = list.get(i2);
            if (lnrVar instanceof com.bytedance.adsdk.ud.lnr.qdl.fs) {
                return (com.bytedance.adsdk.ud.lnr.qdl.fs) lnrVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.tvp.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        ArrayList arrayList = new ArrayList(this.jpc.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            lnr lnrVar = this.jpc.get(size);
            lnrVar.qdl(arrayList, this.jpc.subList(0, size));
            arrayList.add(lnrVar);
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        if (this.wd) {
            return;
        }
        this.lnr.set(matrix);
        com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = this.rq;
        if (jtxVar != null) {
            this.lnr.preConcat(jtxVar.mml());
            i2 = (int) (((((this.rq.qdl() == null ? 100 : this.rq.qdl().wd().intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        boolean z2 = this.tvp.tvp() && mzz() && i2 != 255;
        if (z2) {
            this.ud.set(0.0f, 0.0f, 0.0f, 0.0f);
            qdl(this.ud, this.lnr, true);
            this.qdl.setAlpha(i2);
            com.bytedance.adsdk.ud.mo.mo.qdl(canvas, this.ud, this.qdl);
        }
        if (z2) {
            i2 = 255;
        }
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            lnr lnrVar = this.jpc.get(size);
            if (lnrVar instanceof mzz) {
                ((mzz) lnrVar).qdl(canvas, this.lnr, i2);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        this.lnr.set(matrix);
        com.bytedance.adsdk.ud.qdl.ud.jtx jtxVar = this.rq;
        if (jtxVar != null) {
            this.lnr.preConcat(jtxVar.mml());
        }
        this.mzz.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.jpc.size() - 1; size >= 0; size--) {
            lnr lnrVar = this.jpc.get(size);
            if (lnrVar instanceof mzz) {
                ((mzz) lnrVar).qdl(this.mzz, this.lnr, z2);
                rectF.union(this.mzz);
            }
        }
    }
}
