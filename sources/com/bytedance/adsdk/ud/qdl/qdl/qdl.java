package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl implements mzz, rq, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> bjy;
    private final List<com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float>> exu;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Integer> fs;
    private final com.bytedance.adsdk.ud.tvp jpc;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> jtx;
    float lnr;
    protected final com.bytedance.adsdk.ud.lnr.lnr.qdl qdl;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> rdp;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> rq;
    private final float[] to;
    final Paint ud;
    private com.bytedance.adsdk.ud.qdl.ud.lnr yt;
    private final PathMeasure mml = new PathMeasure();
    private final Path mzz = new Path();
    private final Path mo = new Path();
    private final RectF wd = new RectF();
    private final List<C0059qdl> tvp = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.qdl.qdl.qdl$qdl, reason: collision with other inner class name */
    public static final class C0059qdl {
        private final List<exu> qdl;
        private final jyq ud;

        private C0059qdl(jyq jyqVar) {
            this.qdl = new ArrayList();
            this.ud = jyqVar;
        }
    }

    public qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, List<com.bytedance.adsdk.ud.lnr.qdl.ud> list, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2) {
        com.bytedance.adsdk.ud.qdl.qdl qdlVar2 = new com.bytedance.adsdk.ud.qdl.qdl(1);
        this.ud = qdlVar2;
        this.lnr = 0.0f;
        this.jpc = tvpVar;
        this.qdl = qdlVar;
        qdlVar2.setStyle(Paint.Style.STROKE);
        qdlVar2.setStrokeCap(cap);
        qdlVar2.setStrokeJoin(join);
        qdlVar2.setStrokeMiter(f);
        this.fs = mmlVar.qdl();
        this.rq = udVar.qdl();
        if (udVar2 == null) {
            this.rdp = null;
        } else {
            this.rdp = udVar2.qdl();
        }
        this.exu = new ArrayList(list.size());
        this.to = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.exu.add(list.get(i2).qdl());
        }
        qdlVar.qdl(this.fs);
        qdlVar.qdl(this.rq);
        for (int i3 = 0; i3 < this.exu.size(); i3++) {
            qdlVar.qdl(this.exu.get(i3));
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar3 = this.rdp;
        if (qdlVar3 != null) {
            qdlVar.qdl(qdlVar3);
        }
        this.fs.qdl(this);
        this.rq.qdl(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.exu.get(i4).qdl(this);
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar4 = this.rdp;
        if (qdlVar4 != null) {
            qdlVar4.qdl(this);
        }
        if (qdlVar.to() != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = qdlVar.to().qdl().qdl();
            this.jtx = qdlVarQdl;
            qdlVarQdl.qdl(this);
            qdlVar.qdl(this.jtx);
        }
        if (qdlVar.rq() != null) {
            this.yt = new com.bytedance.adsdk.ud.qdl.ud.lnr(this, qdlVar, qdlVar.rq());
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.jpc.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        jyq jyqVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            lnr lnrVar = list.get(size);
            if (lnrVar instanceof jyq) {
                jyq jyqVar2 = (jyq) lnrVar;
                if (jyqVar2.ud() == com.bytedance.adsdk.ud.lnr.ud.exc.qdl.INDIVIDUALLY) {
                    jyqVar = jyqVar2;
                }
            }
        }
        if (jyqVar != null) {
            jyqVar.qdl(this);
        }
        C0059qdl c0059qdl = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            lnr lnrVar2 = list2.get(size2);
            if (lnrVar2 instanceof jyq) {
                jyq jyqVar3 = (jyq) lnrVar2;
                if (jyqVar3.ud() == com.bytedance.adsdk.ud.lnr.ud.exc.qdl.INDIVIDUALLY) {
                    if (c0059qdl != null) {
                        this.tvp.add(c0059qdl);
                    }
                    c0059qdl = new C0059qdl(jyqVar3);
                    jyqVar3.qdl(this);
                } else if (!(lnrVar2 instanceof exu)) {
                    if (c0059qdl == null) {
                        c0059qdl = new C0059qdl(jyqVar);
                    }
                    c0059qdl.qdl.add((exu) lnrVar2);
                }
            } else if (!(lnrVar2 instanceof exu)) {
                if (c0059qdl == null) {
                    c0059qdl = new C0059qdl(jyqVar);
                }
                c0059qdl.qdl.add((exu) lnrVar2);
            }
        }
        if (c0059qdl != null) {
            this.tvp.add(c0059qdl);
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(Canvas canvas, Matrix matrix, int i2) {
        com.bytedance.adsdk.ud.mzz.qdl("StrokeContent#draw");
        if (com.bytedance.adsdk.ud.mo.mo.ud(matrix)) {
            com.bytedance.adsdk.ud.mzz.ud("StrokeContent#draw");
            return;
        }
        this.ud.setAlpha(com.bytedance.adsdk.ud.mo.mzz.qdl((int) ((((i2 / 255.0f) * ((com.bytedance.adsdk.ud.qdl.ud.mo) this.fs).tvp()) / 100.0f) * 255.0f), 0, 255));
        this.ud.setStrokeWidth(com.bytedance.adsdk.ud.mo.mo.qdl(matrix) * ((com.bytedance.adsdk.ud.qdl.ud.mml) this.rq).tvp());
        if (this.ud.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.ud.mzz.ud("StrokeContent#draw");
            return;
        }
        qdl(matrix);
        com.bytedance.adsdk.ud.qdl.ud.qdl<ColorFilter, ColorFilter> qdlVar = this.bjy;
        if (qdlVar != null) {
            this.ud.setColorFilter(qdlVar.wd());
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar2 = this.jtx;
        if (qdlVar2 != null) {
            float fFloatValue = qdlVar2.wd().floatValue();
            if (fFloatValue == 0.0f) {
                this.ud.setMaskFilter(null);
            } else if (fFloatValue != this.lnr) {
                this.ud.setMaskFilter(this.qdl.ud(fFloatValue));
            }
            this.lnr = fFloatValue;
        }
        com.bytedance.adsdk.ud.qdl.ud.lnr lnrVar = this.yt;
        if (lnrVar != null) {
            lnrVar.qdl(this.ud);
        }
        for (int i3 = 0; i3 < this.tvp.size(); i3++) {
            C0059qdl c0059qdl = this.tvp.get(i3);
            if (c0059qdl.ud != null) {
                qdl(canvas, c0059qdl, matrix);
            } else {
                com.bytedance.adsdk.ud.mzz.qdl("StrokeContent#buildPath");
                this.mzz.reset();
                for (int size = c0059qdl.qdl.size() - 1; size >= 0; size--) {
                    this.mzz.addPath(((exu) c0059qdl.qdl.get(size)).mml(), matrix);
                }
                com.bytedance.adsdk.ud.mzz.ud("StrokeContent#buildPath");
                com.bytedance.adsdk.ud.mzz.qdl("StrokeContent#drawPath");
                canvas.drawPath(this.mzz, this.ud);
                com.bytedance.adsdk.ud.mzz.ud("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.ud.mzz.ud("StrokeContent#draw");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    private void qdl(Canvas canvas, C0059qdl c0059qdl, Matrix matrix) {
        float f;
        float f2;
        float fMin;
        com.bytedance.adsdk.ud.mzz.qdl("StrokeContent#applyTrimPath");
        if (c0059qdl.ud == null) {
            com.bytedance.adsdk.ud.mzz.ud("StrokeContent#applyTrimPath");
            return;
        }
        this.mzz.reset();
        for (int size = c0059qdl.qdl.size() - 1; size >= 0; size--) {
            this.mzz.addPath(((exu) c0059qdl.qdl.get(size)).mml(), matrix);
        }
        float fFloatValue = c0059qdl.ud.lnr().wd().floatValue() / 100.0f;
        float fFloatValue2 = c0059qdl.ud.mml().wd().floatValue() / 100.0f;
        float fFloatValue3 = c0059qdl.ud.mzz().wd().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.mzz, this.ud);
            com.bytedance.adsdk.ud.mzz.ud("StrokeContent#applyTrimPath");
            return;
        }
        this.mml.setPath(this.mzz, false);
        float length = this.mml.getLength();
        while (this.mml.nextContour()) {
            length += this.mml.getLength();
        }
        float f3 = fFloatValue3 * length;
        float f4 = (fFloatValue * length) + f3;
        float fMin2 = Math.min((fFloatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0059qdl.qdl.size() - 1; size2 >= 0; size2--) {
            this.mo.set(((exu) c0059qdl.qdl.get(size2)).mml());
            this.mo.transform(matrix);
            this.mml.setPath(this.mo, false);
            float length2 = this.mml.getLength();
            if (fMin2 > length) {
                float f6 = fMin2 - length;
                if (f6 >= f5 + length2 || f5 >= f6) {
                    f = f5 + length2;
                    if (f < f4 && f5 <= fMin2) {
                        if (f > fMin2 || f4 >= f5) {
                            f2 = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                            fMin = fMin2 > f ? 1.0f : (fMin2 - f5) / length2;
                        } else {
                            canvas.drawPath(this.mo, this.ud);
                        }
                    }
                } else {
                    f2 = f4 > length ? (f4 - length) / length2 : 0.0f;
                    fMin = Math.min(f6 / length2, 1.0f);
                }
                com.bytedance.adsdk.ud.mo.mo.qdl(this.mo, f2, fMin, 0.0f);
                canvas.drawPath(this.mo, this.ud);
            } else {
                f = f5 + length2;
                if (f < f4) {
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.ud.mzz.ud("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        com.bytedance.adsdk.ud.mzz.qdl("StrokeContent#getBounds");
        this.mzz.reset();
        for (int i2 = 0; i2 < this.tvp.size(); i2++) {
            C0059qdl c0059qdl = this.tvp.get(i2);
            for (int i3 = 0; i3 < c0059qdl.qdl.size(); i3++) {
                this.mzz.addPath(((exu) c0059qdl.qdl.get(i3)).mml(), matrix);
            }
        }
        this.mzz.computeBounds(this.wd, false);
        float fTvp = ((com.bytedance.adsdk.ud.qdl.ud.mml) this.rq).tvp();
        RectF rectF2 = this.wd;
        float f = fTvp / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.wd);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.ud.mzz.ud("StrokeContent#getBounds");
    }

    private void qdl(Matrix matrix) {
        com.bytedance.adsdk.ud.mzz.qdl("StrokeContent#applyDashPattern");
        if (this.exu.isEmpty()) {
            com.bytedance.adsdk.ud.mzz.ud("StrokeContent#applyDashPattern");
            return;
        }
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl(matrix);
        for (int i2 = 0; i2 < this.exu.size(); i2++) {
            this.to[i2] = this.exu.get(i2).wd().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.to;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.to;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.to;
            fArr3[i2] = fArr3[i2] * fQdl;
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> qdlVar = this.rdp;
        this.ud.setPathEffect(new DashPathEffect(this.to, qdlVar == null ? 0.0f : fQdl * qdlVar.wd().floatValue()));
        com.bytedance.adsdk.ud.mzz.ud("StrokeContent#applyDashPattern");
    }
}
