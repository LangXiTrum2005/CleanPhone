package com.bytedance.adsdk.LD.lk.lk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.google.android.material.color.utilities.Contrast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Lxb {
    private final Paint JVA;
    private final List<Lxb> OY;
    private final RectF QAg;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> ebl;
    private final RectF nBu;
    private boolean sLN;

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.lk.lk.LD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[JXs.LD.values().length];
            Lxb = iArr;
            try {
                iArr[JXs.LD.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[JXs.LD.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LD(com.bytedance.adsdk.LD.QAg qAg, JXs jXs, List<JXs> list, com.bytedance.adsdk.LD.ebl eblVar, Context context) {
        int i;
        Lxb lxb;
        JXs.LD ldSLN;
        int i2;
        super(qAg, jXs);
        this.OY = new ArrayList();
        this.QAg = new RectF();
        this.nBu = new RectF();
        this.JVA = new Paint();
        this.sLN = true;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldSfi = jXs.Sfi();
        if (ldSfi != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = ldSfi.Lxb();
            this.ebl = Lxb;
            Lxb(Lxb);
            this.ebl.Lxb(this);
        } else {
            this.ebl = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(eblVar.NXR().size());
        int size = list.size() - 1;
        Lxb lxb2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            JXs jXs2 = list.get(size);
            Lxb Lxb2 = Lxb.Lxb(this, jXs2, qAg, eblVar, context);
            if (Lxb2 != null) {
                longSparseArray.put(Lxb2.LD().JXs(), Lxb2);
                if (lxb2 != null) {
                    lxb2.Lxb(Lxb2);
                    lxb2 = null;
                } else {
                    this.OY.add(0, Lxb2);
                    if (jXs2 != null && (ldSLN = jXs2.sLN()) != null && ((i2 = AnonymousClass1.Lxb[ldSLN.ordinal()]) == 1 || i2 == 2)) {
                        lxb2 = Lxb2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            Lxb lxb3 = (Lxb) longSparseArray.get(longSparseArray.keyAt(i));
            if (lxb3 != null && (lxb = (Lxb) longSparseArray.get(lxb3.LD().NXR())) != null) {
                lxb3.LD(lxb);
            }
        }
    }

    public void LD(boolean z) {
        this.sLN = z;
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void Lxb(boolean z) {
        super.Lxb(z);
        Iterator<Lxb> it = this.OY.iterator();
        while (it.hasNext()) {
            it.next().Lxb(z);
        }
    }

    public List<Lxb> sLN() {
        return this.OY;
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        super.LD(canvas, matrix, i);
        com.bytedance.adsdk.LD.JXs.Lxb("CompositionLayer#draw");
        this.nBu.set(0.0f, 0.0f, this.lk.OY(), this.lk.QAg());
        matrix.mapRect(this.nBu);
        boolean z = this.LD.QAg() && this.OY.size() > 1 && i != 255;
        if (z) {
            this.JVA.setAlpha(i);
            com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.nBu, this.JVA);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            if ((!this.sLN && "__container".equals(this.lk.lc())) || this.nBu.isEmpty() || canvas.clipRect(this.nBu)) {
                this.OY.get(size).Lxb(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.LD.JXs.LD("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        super.Lxb(rectF, matrix, z);
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            this.QAg.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.OY.get(size).Lxb(this.QAg, this.Lxb, true);
            rectF.union(this.QAg);
        }
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void Lxb(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        super.Lxb(f);
        if (this.ebl != null) {
            f = ((this.lk.Lxb().sLN() * this.ebl.ebl().floatValue()) - this.lk.Lxb().lc()) / (this.LD.id().kqm() + 0.01f);
        }
        if (this.ebl == null) {
            f -= this.lk.lk();
        }
        if (this.lk.LD() != 0.0f && !"__container".equals(this.lk.lc())) {
            f /= this.lk.LD();
        }
        for (int size = this.OY.size() - 1; size >= 0; size--) {
            this.OY.get(size).Lxb(f);
        }
    }
}
