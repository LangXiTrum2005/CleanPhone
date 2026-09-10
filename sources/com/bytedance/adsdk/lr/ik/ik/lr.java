package com.bytedance.adsdk.lr.ik.ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f17993co;
    private final RectF jbs;
    private final List<ri> mj;
    private final RectF qt;
    private final Paint sf;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.lr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[fi.lr.values().length];
            ri = iArr;
            try {
                iArr[fi.lr.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[fi.lr.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public lr(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar, List<fi> list, com.bytedance.adsdk.lr.xha xhaVar, Context context) {
        int i;
        ri riVar;
        fi.lr lrVarCo;
        int i2;
        super(jbsVar, fiVar);
        this.mj = new ArrayList();
        this.jbs = new RectF();
        this.qt = new RectF();
        this.sf = new Paint();
        this.f17993co = true;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarIhz = fiVar.ihz();
        if (lrVarIhz != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = lrVarIhz.ri();
            this.xha = riVarRi;
            ri(riVarRi);
            this.xha.ri(this);
        } else {
            this.xha = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(xhaVar.aw().size());
        int size = list.size() - 1;
        ri riVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            fi fiVar2 = list.get(size);
            ri riVarRi2 = ri.ri(this, fiVar2, jbsVar, xhaVar, context);
            if (riVarRi2 != null) {
                longSparseArray.put(riVarRi2.lr().fi(), riVarRi2);
                if (riVar2 != null) {
                    riVar2.ri(riVarRi2);
                    riVar2 = null;
                } else {
                    this.mj.add(0, riVarRi2);
                    if (fiVar2 != null && (lrVarCo = fiVar2.co()) != null && ((i2 = AnonymousClass1.ri[lrVarCo.ordinal()]) == 1 || i2 == 2)) {
                        riVar2 = riVarRi2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            ri riVar3 = (ri) longSparseArray.get(longSparseArray.keyAt(i));
            if (riVar3 != null && (riVar = (ri) longSparseArray.get(riVar3.lr().aw())) != null) {
                riVar3.lr(riVar);
            }
        }
    }

    public List<ri> co() {
        return this.mj;
    }

    public void lr(boolean z) {
        this.f17993co = z;
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void ri(boolean z) {
        super.ri(z);
        Iterator<ri> it = this.mj.iterator();
        while (it.hasNext()) {
            it.next().ri(z);
        }
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        super.lr(canvas, matrix, i);
        com.bytedance.adsdk.lr.fi.ri("CompositionLayer#draw");
        this.qt.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ik.mj(), this.ik.jbs());
        matrix.mapRect(this.qt);
        boolean z = this.lr.jbs() && this.mj.size() > 1 && i != 255;
        if (z) {
            this.sf.setAlpha(i);
            com.bytedance.adsdk.lr.di.di.ri(canvas, this.qt, this.sf);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            if (((this.f17993co || !"__container".equals(this.ik.di())) && !this.qt.isEmpty()) ? canvas.clipRect(this.qt) : true) {
                this.mj.get(size).ri(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.lr.fi.lr("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        super.ri(rectF, matrix, z);
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            this.jbs.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.mj.get(size).ri(this.jbs, this.ri, true);
            rectF.union(this.jbs);
        }
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void ri(float f) {
        super.ri(f);
        if (this.xha != null) {
            f = ((this.xha.xha().floatValue() * this.ik.ri().co()) - this.ik.ri().di()) / (this.lr.su().bu() + 0.01f);
        }
        if (this.xha == null) {
            f -= this.ik.ik();
        }
        if (this.ik.lr() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !"__container".equals(this.ik.di())) {
            f /= this.ik.lr();
        }
        for (int size = this.mj.size() - 1; size >= 0; size--) {
            this.mj.get(size).ri(f);
        }
    }
}
