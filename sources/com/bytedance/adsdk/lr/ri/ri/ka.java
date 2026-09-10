package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, aw, fi {
    private final String di;
    private final RectF fi;
    private final Matrix ik;
    private final com.bytedance.adsdk.lr.jbs jbs;
    private final Path ka;
    private final RectF lr;
    private final List<ik> mj;
    private List<aw> qt;
    private final Paint ri;
    private com.bytedance.adsdk.lr.ri.lr.slm sf;
    private final boolean xha;

    public ka(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.slm slmVar, com.bytedance.adsdk.lr.xha xhaVar) {
        this(jbsVar, riVar, slmVar.ri(), slmVar.ik(), ri(jbsVar, xhaVar, riVar, slmVar.lr()), ri(slmVar.lr()));
    }

    private boolean fi() {
        int i = 0;
        for (int i2 = 0; i2 < this.mj.size(); i2++) {
            if ((this.mj.get(i2) instanceof fi) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<ik> ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, List<com.bytedance.adsdk.lr.ik.lr.ik> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ik ikVarRi = list.get(i).ri(jbsVar, xhaVar, riVar);
            if (ikVarRi != null) {
                arrayList.add(ikVarRi);
            }
        }
        return arrayList;
    }

    public Matrix ik() {
        com.bytedance.adsdk.lr.ri.lr.slm slmVar = this.sf;
        if (slmVar != null) {
            return slmVar.ka();
        }
        this.ik.reset();
        return this.ik;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        this.ik.reset();
        com.bytedance.adsdk.lr.ri.lr.slm slmVar = this.sf;
        if (slmVar != null) {
            this.ik.set(slmVar.ka());
        }
        this.ka.reset();
        if (this.xha) {
            return this.ka;
        }
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            ik ikVar = this.mj.get(size);
            if (ikVar instanceof aw) {
                this.ka.addPath(((aw) ikVar).ka(), this.ik);
            }
        }
        return this.ka;
    }

    public List<aw> lr() {
        if (this.qt == null) {
            this.qt = new ArrayList();
            for (int i = 0; i < this.mj.size(); i++) {
                ik ikVar = this.mj.get(i);
                if (ikVar instanceof aw) {
                    this.qt.add((aw) ikVar);
                }
            }
        }
        return this.qt;
    }

    public ka(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, String str, boolean z, List<ik> list, com.bytedance.adsdk.lr.ik.ri.co coVar) {
        this.ri = new com.bytedance.adsdk.lr.ri.ri();
        this.lr = new RectF();
        this.ik = new Matrix();
        this.ka = new Path();
        this.fi = new RectF();
        this.di = str;
        this.jbs = jbsVar;
        this.xha = z;
        this.mj = list;
        if (coVar != null) {
            com.bytedance.adsdk.lr.ri.lr.slm slmVarQt = coVar.qt();
            this.sf = slmVarQt;
            slmVarQt.ri(riVar);
            this.sf.ri(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            ik ikVar = list.get(size);
            if (ikVar instanceof qt) {
                arrayList.add((qt) ikVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((qt) arrayList.get(size2)).ri(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.lr.ik.ri.co ri(List<com.bytedance.adsdk.lr.ik.lr.ik> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.lr.ik.lr.ik ikVar = list.get(i);
            if (ikVar instanceof com.bytedance.adsdk.lr.ik.ri.co) {
                return (com.bytedance.adsdk.lr.ik.ri.co) ikVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.jbs.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.mj.size());
        arrayList.addAll(list);
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            ik ikVar = this.mj.get(size);
            ikVar.ri(arrayList, this.mj.subList(0, size));
            arrayList.add(ikVar);
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        if (this.xha) {
            return;
        }
        this.ik.set(matrix);
        com.bytedance.adsdk.lr.ri.lr.slm slmVar = this.sf;
        if (slmVar != null) {
            this.ik.preConcat(slmVar.ka());
            i = (int) (((((this.sf.ri() == null ? 100 : this.sf.ri().xha().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.jbs.jbs() && fi() && i != 255;
        if (z) {
            this.lr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ri(this.lr, this.ik, true);
            this.ri.setAlpha(i);
            com.bytedance.adsdk.lr.di.di.ri(canvas, this.lr, this.ri);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            ik ikVar = this.mj.get(size);
            if (ikVar instanceof fi) {
                ((fi) ikVar).ri(canvas, this.ik, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        this.ik.set(matrix);
        com.bytedance.adsdk.lr.ri.lr.slm slmVar = this.sf;
        if (slmVar != null) {
            this.ik.preConcat(slmVar.ka());
        }
        this.fi.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            ik ikVar = this.mj.get(size);
            if (ikVar instanceof fi) {
                ((fi) ikVar).ri(this.fi, this.ik, z);
                rectF.union(this.fi);
            }
        }
    }
}
