package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, fi, sf {
    private final List<com.bytedance.adsdk.lr.ri.lr.ri<?, Float>> aw;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> bgr;
    private com.bytedance.adsdk.lr.ri.lr.ik bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Integer> f18003co;
    float ik;
    final Paint lr;
    private final com.bytedance.adsdk.lr.jbs mj;
    private final float[] qt;
    protected final com.bytedance.adsdk.lr.ik.ik.ri ri;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> sf;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> slm;
    private com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> vr;
    private final PathMeasure ka = new PathMeasure();
    private final Path fi = new Path();
    private final Path di = new Path();
    private final RectF xha = new RectF();
    private final List<C0186ri> jbs = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.ri$ri, reason: collision with other inner class name */
    public static final class C0186ri {
        private final ihz lr;
        private final List<aw> ri;

        private C0186ri(ihz ihzVar) {
            this.ri = new ArrayList();
            this.lr = ihzVar;
        }
    }

    public ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.lr.ik.ri.ka kaVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar, List<com.bytedance.adsdk.lr.ik.ri.lr> list, com.bytedance.adsdk.lr.ik.ri.lr lrVar2) {
        com.bytedance.adsdk.lr.ri.ri riVar2 = new com.bytedance.adsdk.lr.ri.ri(1);
        this.lr = riVar2;
        this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.mj = jbsVar;
        this.ri = riVar;
        riVar2.setStyle(Paint.Style.STROKE);
        riVar2.setStrokeCap(cap);
        riVar2.setStrokeJoin(join);
        riVar2.setStrokeMiter(f);
        this.f18003co = kaVar.ri();
        this.sf = lrVar.ri();
        if (lrVar2 == null) {
            this.bgr = null;
        } else {
            this.bgr = lrVar2.ri();
        }
        this.aw = new ArrayList(list.size());
        this.qt = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.aw.add(list.get(i).ri());
        }
        riVar.ri(this.f18003co);
        riVar.ri(this.sf);
        for (int i2 = 0; i2 < this.aw.size(); i2++) {
            riVar.ri(this.aw.get(i2));
        }
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar3 = this.bgr;
        if (riVar3 != null) {
            riVar.ri(riVar3);
        }
        this.f18003co.ri(this);
        this.sf.ri(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.aw.get(i3).ri(this);
        }
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar4 = this.bgr;
        if (riVar4 != null) {
            riVar4.ri(this);
        }
        if (riVar.qt() != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = riVar.qt().ri().ri();
            this.slm = riVarRi;
            riVarRi.ri(this);
            riVar.ri(this.slm);
        }
        if (riVar.sf() != null) {
            this.bu = new com.bytedance.adsdk.lr.ri.lr.ik(this, riVar, riVar.sf());
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.mj.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        ihz ihzVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            ik ikVar = list.get(size);
            if (ikVar instanceof ihz) {
                ihz ihzVar2 = (ihz) ikVar;
                if (ihzVar2.lr() == com.bytedance.adsdk.lr.ik.lr.tan.ri.INDIVIDUALLY) {
                    ihzVar = ihzVar2;
                }
            }
        }
        if (ihzVar != null) {
            ihzVar.ri(this);
        }
        C0186ri c0186ri = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            ik ikVar2 = list2.get(size2);
            if (ikVar2 instanceof ihz) {
                ihz ihzVar3 = (ihz) ikVar2;
                if (ihzVar3.lr() == com.bytedance.adsdk.lr.ik.lr.tan.ri.INDIVIDUALLY) {
                    if (c0186ri != null) {
                        this.jbs.add(c0186ri);
                    }
                    c0186ri = new C0186ri(ihzVar3);
                    ihzVar3.ri(this);
                } else if (!(ikVar2 instanceof aw)) {
                    if (c0186ri == null) {
                        c0186ri = new C0186ri(ihzVar);
                    }
                    c0186ri.ri.add((aw) ikVar2);
                }
            } else if (!(ikVar2 instanceof aw)) {
                if (c0186ri == null) {
                    c0186ri = new C0186ri(ihzVar);
                }
                c0186ri.ri.add((aw) ikVar2);
            }
        }
        if (c0186ri != null) {
            this.jbs.add(c0186ri);
        }
    }

    public void ri(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lr.fi.ri("StrokeContent#draw");
        if (com.bytedance.adsdk.lr.di.di.lr(matrix)) {
            com.bytedance.adsdk.lr.fi.lr("StrokeContent#draw");
            return;
        }
        this.lr.setAlpha(com.bytedance.adsdk.lr.di.fi.ri((int) ((((i / 255.0f) * ((com.bytedance.adsdk.lr.ri.lr.di) this.f18003co).jbs()) / 100.0f) * 255.0f), 0, 255));
        this.lr.setStrokeWidth(((com.bytedance.adsdk.lr.ri.lr.ka) this.sf).jbs() * com.bytedance.adsdk.lr.di.di.ri(matrix));
        if (this.lr.getStrokeWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.adsdk.lr.fi.lr("StrokeContent#draw");
            return;
        }
        ri(matrix);
        com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> riVar = this.vr;
        if (riVar != null) {
            this.lr.setColorFilter(riVar.xha());
        }
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar2 = this.slm;
        if (riVar2 != null) {
            float fFloatValue = riVar2.xha().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.lr.setMaskFilter(null);
            } else if (fFloatValue != this.ik) {
                this.lr.setMaskFilter(this.ri.lr(fFloatValue));
            }
            this.ik = fFloatValue;
        }
        com.bytedance.adsdk.lr.ri.lr.ik ikVar = this.bu;
        if (ikVar != null) {
            ikVar.ri(this.lr);
        }
        for (int i2 = 0; i2 < this.jbs.size(); i2++) {
            C0186ri c0186ri = this.jbs.get(i2);
            if (c0186ri.lr != null) {
                ri(canvas, c0186ri, matrix);
            } else {
                com.bytedance.adsdk.lr.fi.ri("StrokeContent#buildPath");
                this.fi.reset();
                for (int size = c0186ri.ri.size() - 1; size >= 0; size--) {
                    this.fi.addPath(((aw) c0186ri.ri.get(size)).ka(), matrix);
                }
                com.bytedance.adsdk.lr.fi.lr("StrokeContent#buildPath");
                com.bytedance.adsdk.lr.fi.ri("StrokeContent#drawPath");
                canvas.drawPath(this.fi, this.lr);
                com.bytedance.adsdk.lr.fi.lr("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.lr.fi.lr("StrokeContent#draw");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    private void ri(Canvas canvas, C0186ri c0186ri, Matrix matrix) {
        float f;
        float f2;
        float fMin;
        com.bytedance.adsdk.lr.fi.ri("StrokeContent#applyTrimPath");
        if (c0186ri.lr == null) {
            com.bytedance.adsdk.lr.fi.lr("StrokeContent#applyTrimPath");
            return;
        }
        this.fi.reset();
        for (int size = c0186ri.ri.size() - 1; size >= 0; size--) {
            this.fi.addPath(((aw) c0186ri.ri.get(size)).ka(), matrix);
        }
        float fFloatValue = c0186ri.lr.ik().xha().floatValue() / 100.0f;
        float fFloatValue2 = c0186ri.lr.ka().xha().floatValue() / 100.0f;
        float fFloatValue3 = c0186ri.lr.fi().xha().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.fi, this.lr);
            com.bytedance.adsdk.lr.fi.lr("StrokeContent#applyTrimPath");
            return;
        }
        this.ka.setPath(this.fi, false);
        float length = this.ka.getLength();
        while (this.ka.nextContour()) {
            length += this.ka.getLength();
        }
        float f3 = fFloatValue3 * length;
        float f4 = (fFloatValue * length) + f3;
        float fMin2 = Math.min((fFloatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0186ri.ri.size() - 1; size2 >= 0; size2--) {
            this.di.set(((aw) c0186ri.ri.get(size2)).ka());
            this.di.transform(matrix);
            this.ka.setPath(this.di, false);
            float length2 = this.ka.getLength();
            if (fMin2 > length) {
                float f6 = fMin2 - length;
                if (f6 >= f5 + length2 || f5 >= f6) {
                    f = f5 + length2;
                    if (f < f4 && f5 <= fMin2) {
                        if (f > fMin2 || f4 >= f5) {
                            f2 = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                            fMin = fMin2 > f ? 1.0f : (fMin2 - f5) / length2;
                        } else {
                            canvas.drawPath(this.di, this.lr);
                        }
                    }
                } else {
                    f2 = f4 > length ? (f4 - length) / length2 : 0.0f;
                    fMin = Math.min(f6 / length2, 1.0f);
                }
                com.bytedance.adsdk.lr.di.di.ri(this.di, f2, fMin, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                canvas.drawPath(this.di, this.lr);
            } else {
                f = f5 + length2;
                if (f < f4) {
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.lr.fi.lr("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.lr.fi.ri("StrokeContent#getBounds");
        this.fi.reset();
        for (int i = 0; i < this.jbs.size(); i++) {
            C0186ri c0186ri = this.jbs.get(i);
            for (int i2 = 0; i2 < c0186ri.ri.size(); i2++) {
                this.fi.addPath(((aw) c0186ri.ri.get(i2)).ka(), matrix);
            }
        }
        this.fi.computeBounds(this.xha, false);
        float fJbs = ((com.bytedance.adsdk.lr.ri.lr.ka) this.sf).jbs();
        RectF rectF2 = this.xha;
        float f = fJbs / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.xha);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.lr.fi.lr("StrokeContent#getBounds");
    }

    private void ri(Matrix matrix) {
        com.bytedance.adsdk.lr.fi.ri("StrokeContent#applyDashPattern");
        if (this.aw.isEmpty()) {
            com.bytedance.adsdk.lr.fi.lr("StrokeContent#applyDashPattern");
            return;
        }
        float fRi = com.bytedance.adsdk.lr.di.di.ri(matrix);
        for (int i = 0; i < this.aw.size(); i++) {
            this.qt[i] = this.aw.get(i).xha().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.qt;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.qt;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.qt;
            fArr3[i] = fArr3[i] * fRi;
        }
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar = this.bgr;
        this.lr.setPathEffect(new DashPathEffect(this.qt, riVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : fRi * riVar.xha().floatValue()));
        com.bytedance.adsdk.lr.fi.lr("StrokeContent#applyDashPattern");
    }
}
