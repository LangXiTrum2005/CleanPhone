package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ZU implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, JXs, NXR {
    private com.bytedance.adsdk.LD.Lxb.LD.VVE JVA;
    private final RectF JXs;
    private final RectF LD;
    private final Paint Lxb;
    private final List<lk> OY;
    private final com.bytedance.adsdk.LD.QAg QAg;
    private final Path ZU;
    private final boolean ebl;
    private final String lc;
    private final Matrix lk;
    private List<NXR> nBu;

    public ZU(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.VVE vve, com.bytedance.adsdk.LD.ebl eblVar) {
        this(qAg, lxb, vve.Lxb(), vve.lk(), Lxb(qAg, eblVar, lxb, vve.LD()), Lxb(vve.LD()));
    }

    private boolean JXs() {
        int i = 0;
        for (int i2 = 0; i2 < this.OY.size(); i2++) {
            if ((this.OY.get(i2) instanceof JXs) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<lk> Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, List<com.bytedance.adsdk.LD.lk.LD.lk> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            lk lkVarLxb = list.get(i).Lxb(qAg, eblVar, lxb);
            if (lkVarLxb != null) {
                arrayList.add(lkVarLxb);
            }
        }
        return arrayList;
    }

    public List<NXR> LD() {
        if (this.nBu == null) {
            this.nBu = new ArrayList();
            for (int i = 0; i < this.OY.size(); i++) {
                lk lkVar = this.OY.get(i);
                if (lkVar instanceof NXR) {
                    this.nBu.add((NXR) lkVar);
                }
            }
        }
        return this.nBu;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        this.lk.reset();
        com.bytedance.adsdk.LD.Lxb.LD.VVE vve = this.JVA;
        if (vve != null) {
            this.lk.set(vve.ZU());
        }
        this.ZU.reset();
        if (this.ebl) {
            return this.ZU;
        }
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            lk lkVar = this.OY.get(size);
            if (lkVar instanceof NXR) {
                this.ZU.addPath(((NXR) lkVar).ZU(), this.lk);
            }
        }
        return this.ZU;
    }

    public Matrix lk() {
        com.bytedance.adsdk.LD.Lxb.LD.VVE vve = this.JVA;
        if (vve != null) {
            return vve.ZU();
        }
        this.lk.reset();
        return this.lk;
    }

    public ZU(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, String str, boolean z, List<lk> list, com.bytedance.adsdk.LD.lk.Lxb.sLN sln) {
        this.Lxb = new com.bytedance.adsdk.LD.Lxb.Lxb();
        this.LD = new RectF();
        this.lk = new Matrix();
        this.ZU = new Path();
        this.JXs = new RectF();
        this.lc = str;
        this.QAg = qAg;
        this.ebl = z;
        this.OY = list;
        if (sln != null) {
            com.bytedance.adsdk.LD.Lxb.LD.VVE vveNBu = sln.nBu();
            this.JVA = vveNBu;
            vveNBu.Lxb(lxb);
            this.JVA.Lxb(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            lk lkVar = list.get(size);
            if (lkVar instanceof nBu) {
                arrayList.add((nBu) lkVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((nBu) arrayList.get(size2)).Lxb(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.sLN Lxb(List<com.bytedance.adsdk.LD.lk.LD.lk> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.LD.lk.LD.lk lkVar = list.get(i);
            if (lkVar instanceof com.bytedance.adsdk.LD.lk.Lxb.sLN) {
                return (com.bytedance.adsdk.LD.lk.Lxb.sLN) lkVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.QAg.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        ArrayList arrayList = new ArrayList(this.OY.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            lk lkVar = this.OY.get(size);
            lkVar.Lxb(arrayList, this.OY.subList(0, size));
            arrayList.add(lkVar);
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        if (this.ebl) {
            return;
        }
        this.lk.set(matrix);
        com.bytedance.adsdk.LD.Lxb.LD.VVE vve = this.JVA;
        if (vve != null) {
            this.lk.preConcat(vve.ZU());
            i = (int) (((((this.JVA.Lxb() == null ? 100 : this.JVA.Lxb().ebl().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.QAg.QAg() && JXs() && i != 255;
        if (z) {
            this.LD.set(0.0f, 0.0f, 0.0f, 0.0f);
            Lxb(this.LD, this.lk, true);
            this.Lxb.setAlpha(i);
            com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.LD, this.Lxb);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            lk lkVar = this.OY.get(size);
            if (lkVar instanceof JXs) {
                ((JXs) lkVar).Lxb(canvas, this.lk, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        this.lk.set(matrix);
        com.bytedance.adsdk.LD.Lxb.LD.VVE vve = this.JVA;
        if (vve != null) {
            this.lk.preConcat(vve.ZU());
        }
        this.JXs.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            lk lkVar = this.OY.get(size);
            if (lkVar instanceof JXs) {
                ((JXs) lkVar).Lxb(this.JXs, this.lk, z);
                rectF.union(this.JXs);
            }
        }
    }
}
