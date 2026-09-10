package com.bytedance.adsdk.lr.ik.ik;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.lr.ik.lr.bgr;
import com.bytedance.adsdk.lr.ri.lr.slm;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, com.bytedance.adsdk.lr.ri.ri.fi {
    private final String ac;
    private final Paint aw;
    private ri ay;
    private final Paint bgr;
    private final RectF bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final Paint f17995co;
    BlurMaskFilter di;
    private Paint dw;
    float fi;
    private List<ri> fr;
    private float hcw;
    private boolean igq;
    private com.bytedance.adsdk.lr.ri.lr.mj ihz;
    final fi ik;
    final slm ka;
    final com.bytedance.adsdk.lr.jbs lr;
    private final RectF nr;
    private final Matrix ory;
    final Matrix ri;
    private final Paint sf;
    private final RectF slm;
    private final List<com.bytedance.adsdk.lr.ri.lr.ri<?, ?>> su;
    private final RectF tan;
    private com.bytedance.adsdk.lr.ri.lr.ka uq;
    private final RectF vr;
    private ri wjv;
    private boolean zf;
    private final Path xha = new Path();
    private final Matrix mj = new Matrix();
    private final Matrix jbs = new Matrix();
    private final Paint qt = new com.bytedance.adsdk.lr.ri.ri(1);

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.ri$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] lr;
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[com.bytedance.adsdk.lr.ik.lr.mj.ri.values().length];
            lr = iArr;
            try {
                iArr[com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lr[com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                lr[com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                lr[com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[fi.ri.values().length];
            ri = iArr2;
            try {
                iArr2[fi.ri.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ri[fi.ri.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ri[fi.ri.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ri[fi.ri.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ri[fi.ri.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ri[fi.ri.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ri[fi.ri.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public ri(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.sf = new com.bytedance.adsdk.lr.ri.ri(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f17995co = new com.bytedance.adsdk.lr.ri.ri(1, mode2);
        com.bytedance.adsdk.lr.ri.ri riVar = new com.bytedance.adsdk.lr.ri.ri(1);
        this.aw = riVar;
        this.bgr = new com.bytedance.adsdk.lr.ri.ri(PorterDuff.Mode.CLEAR);
        this.vr = new RectF();
        this.slm = new RectF();
        this.bu = new RectF();
        this.nr = new RectF();
        this.tan = new RectF();
        this.ri = new Matrix();
        this.su = new ArrayList();
        this.igq = true;
        this.fi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ory = new Matrix();
        this.hcw = 1.0f;
        this.lr = jbsVar;
        this.ik = fiVar;
        this.ac = fiVar.di() + "#draw";
        if (fiVar.co() == fi.lr.INVERT) {
            riVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            riVar.setXfermode(new PorterDuffXfermode(mode));
        }
        slm slmVarQt = fiVar.vr().qt();
        this.ka = slmVarQt;
        slmVarQt.ri((com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri) this);
        if (fiVar.qt() != null && !fiVar.qt().isEmpty()) {
            com.bytedance.adsdk.lr.ri.lr.mj mjVar = new com.bytedance.adsdk.lr.ri.lr.mj(fiVar.qt());
            this.ihz = mjVar;
            Iterator<com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path>> it = mjVar.lr().iterator();
            while (it.hasNext()) {
                it.next().ri(this);
            }
            for (com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2 : this.ihz.ik()) {
                ri(riVar2);
                riVar2.ri(this);
            }
        }
        co();
    }

    private void aw() {
        this.lr.invalidateSelf();
    }

    private boolean bgr() {
        if (this.ihz.lr().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.ihz.ri().size(); i++) {
            if (this.ihz.ri().get(i).ri() != com.bytedance.adsdk.lr.ik.lr.mj.ri.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void co() {
        if (this.ik.ka().isEmpty()) {
            lr(true);
            return;
        }
        com.bytedance.adsdk.lr.ri.lr.ka kaVar = new com.bytedance.adsdk.lr.ri.lr.ka(this.ik.ka());
        this.uq = kaVar;
        kaVar.ri();
        this.uq.ri(new com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri() { // from class: com.bytedance.adsdk.lr.ik.ik.ri.1
            @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
            public void ri() {
                ri riVar = ri.this;
                riVar.lr(riVar.uq.jbs() == 1.0f);
            }
        });
        lr(this.uq.xha().floatValue() == 1.0f);
        ri(this.uq);
    }

    private void vr() {
        if (this.fr != null) {
            return;
        }
        if (this.ay == null) {
            this.fr = Collections.EMPTY_LIST;
            return;
        }
        this.fr = new ArrayList();
        for (ri riVar = this.ay; riVar != null; riVar = riVar.ay) {
            this.fr.add(riVar);
        }
    }

    public float di() {
        return this.hcw;
    }

    public String fi() {
        fi fiVar = this.ik;
        if (fiVar != null) {
            return fiVar.xha();
        }
        return null;
    }

    public String jbs() {
        return this.ik.di();
    }

    public Matrix ka() {
        return this.ory;
    }

    public fi lr() {
        return this.ik;
    }

    public boolean mj() {
        return this.igq;
    }

    public com.bytedance.adsdk.lr.ik.lr.ri qt() {
        return this.ik.wjv();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<com.bytedance.adsdk.lr.ri.ri.ik> list, List<com.bytedance.adsdk.lr.ri.ri.ik> list2) {
    }

    public com.bytedance.adsdk.lr.fi.qt sf() {
        return this.ik.ay();
    }

    public boolean xha() {
        com.bytedance.adsdk.lr.ri.lr.mj mjVar = this.ihz;
        return (mjVar == null || mjVar.lr().isEmpty()) ? false : true;
    }

    private void ka(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar, com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2) {
        com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.sf);
        this.xha.set(riVar.xha());
        this.xha.transform(matrix);
        this.qt.setAlpha((int) (riVar2.xha().intValue() * 2.55f));
        canvas.drawPath(this.xha, this.qt);
        canvas.restore();
    }

    public boolean ik() {
        return this.wjv != null;
    }

    public void lr(ri riVar) {
        this.ay = riVar;
    }

    private void fi(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar, com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2) {
        com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.sf);
        canvas.drawRect(this.vr, this.qt);
        this.f17995co.setAlpha((int) (riVar2.xha().intValue() * 2.55f));
        this.xha.set(riVar.xha());
        this.xha.transform(matrix);
        canvas.drawPath(this.xha, this.f17995co);
        canvas.restore();
    }

    private void ik(float f) {
        this.lr.su().ik().ri(this.ik.di(), f);
    }

    private void lr(RectF rectF, Matrix matrix) {
        if (ik() && this.ik.co() != fi.lr.INVERT) {
            this.nr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.wjv.ri(this.nr, matrix, true);
            if (rectF.intersect(this.nr)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public static ri ri(lr lrVar, fi fiVar, com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, Context context) {
        switch (AnonymousClass2.ri[fiVar.sf().ordinal()]) {
            case 1:
                return new xha(jbsVar, fiVar, lrVar, xhaVar);
            case 2:
                return new lr(jbsVar, fiVar, xhaVar.lr(fiVar.xha()), xhaVar, context);
            case 3:
                return new mj(jbsVar, fiVar);
            case 4:
                if (ri(jbsVar, fiVar, "text:")) {
                    return new ik(jbsVar, fiVar, context);
                }
                if (ri(jbsVar, fiVar, "videoview:")) {
                    return new qt(jbsVar, fiVar, context);
                }
                return new ka(jbsVar, fiVar);
            case 5:
                return new di(jbsVar, fiVar);
            case 6:
                return new jbs(jbsVar, fiVar);
            default:
                Objects.toString(fiVar.sf());
                return null;
        }
    }

    private void ik(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar, com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2) {
        com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.f17995co);
        canvas.drawRect(this.vr, this.qt);
        this.f17995co.setAlpha((int) (riVar2.xha().intValue() * 2.55f));
        this.xha.set(riVar.xha());
        this.xha.transform(matrix);
        canvas.drawPath(this.xha, this.f17995co);
        canvas.restore();
    }

    public void lr(Canvas canvas, Matrix matrix, int i) {
        ri(i);
    }

    private void lr(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar, com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2) {
        com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.qt);
        canvas.drawRect(this.vr, this.qt);
        this.xha.set(riVar.xha());
        this.xha.transform(matrix);
        this.qt.setAlpha((int) (riVar2.xha().intValue() * 2.55f));
        canvas.drawPath(this.xha, this.f17995co);
        canvas.restore();
    }

    private static boolean ri(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar, String str) {
        com.bytedance.adsdk.lr.qt qtVarDi;
        if (jbsVar == null || fiVar == null || str == null || (qtVarDi = jbsVar.di(fiVar.xha())) == null) {
            return false;
        }
        return str.equals(qtVarDi.qt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(boolean z) {
        if (z != this.igq) {
            this.igq = z;
            aw();
        }
    }

    public void ri(boolean z) {
        if (z && this.dw == null) {
            this.dw = new com.bytedance.adsdk.lr.ri.ri();
        }
        this.zf = z;
    }

    public BlurMaskFilter lr(float f) {
        if (this.fi == f) {
            return this.di;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.di = blurMaskFilter;
        this.fi = f;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        aw();
    }

    public void ri(ri riVar) {
        this.wjv = riVar;
    }

    public void ri(com.bytedance.adsdk.lr.ri.lr.ri<?, ?> riVar) {
        if (riVar == null) {
            return;
        }
        this.su.add(riVar);
    }

    public void ri(RectF rectF, Matrix matrix, boolean z) {
        this.vr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vr();
        this.ri.set(matrix);
        if (z) {
            List<ri> list = this.fr;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.ri.preConcat(this.fr.get(size).ka.ka());
                }
            } else {
                ri riVar = this.ay;
                if (riVar != null) {
                    this.ri.preConcat(riVar.ka.ka());
                }
            }
        }
        this.ri.preConcat(this.ka.ka());
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numXha;
        com.bytedance.adsdk.lr.fi.ri(this.ac);
        if (this.igq && !this.ik.uq()) {
            vr();
            com.bytedance.adsdk.lr.fi.ri("Layer#parentMatrix");
            this.ory.set(matrix);
            this.mj.reset();
            this.mj.set(matrix);
            for (int size = this.fr.size() - 1; size >= 0; size--) {
                this.mj.preConcat(this.fr.get(size).ka.ka());
            }
            com.bytedance.adsdk.lr.fi.lr("Layer#parentMatrix");
            com.bytedance.adsdk.lr.ri.lr.ri<?, Integer> riVarRi = this.ka.ri();
            int iIntValue = (int) ((((i / 255.0f) * ((riVarRi == null || (numXha = riVarRi.xha()) == null) ? 100 : numXha.intValue())) / 100.0f) * 255.0f);
            if (!ik() && !xha()) {
                this.mj.preConcat(this.ka.ka());
                com.bytedance.adsdk.lr.fi.ri("Layer#drawLayer");
                lr(canvas, this.mj, iIntValue);
                com.bytedance.adsdk.lr.fi.lr("Layer#drawLayer");
                ik(com.bytedance.adsdk.lr.fi.lr(this.ac));
                return;
            }
            com.bytedance.adsdk.lr.fi.ri("Layer#computeBounds");
            ri(this.vr, this.mj, false);
            lr(this.vr, matrix);
            this.mj.preConcat(this.ka.ka());
            ri(this.vr, this.mj);
            this.slm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.jbs);
            if (!this.jbs.isIdentity()) {
                Matrix matrix2 = this.jbs;
                matrix2.invert(matrix2);
                this.jbs.mapRect(this.slm);
            }
            if (!this.vr.intersect(this.slm)) {
                this.vr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            com.bytedance.adsdk.lr.fi.lr("Layer#computeBounds");
            if (this.vr.width() >= 1.0f && this.vr.height() >= 1.0f) {
                com.bytedance.adsdk.lr.fi.ri("Layer#saveLayer");
                this.qt.setAlpha(255);
                com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.qt);
                com.bytedance.adsdk.lr.fi.lr("Layer#saveLayer");
                ri(canvas);
                com.bytedance.adsdk.lr.fi.ri("Layer#drawLayer");
                lr(canvas, this.mj, iIntValue);
                com.bytedance.adsdk.lr.fi.lr("Layer#drawLayer");
                if (xha()) {
                    ri(canvas, this.mj);
                }
                if (ik()) {
                    com.bytedance.adsdk.lr.fi.ri("Layer#drawMatte");
                    com.bytedance.adsdk.lr.fi.ri("Layer#saveLayer");
                    com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.aw, 19);
                    com.bytedance.adsdk.lr.fi.lr("Layer#saveLayer");
                    ri(canvas);
                    this.wjv.ri(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.lr.fi.ri("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.lr.fi.lr("Layer#restoreLayer");
                    com.bytedance.adsdk.lr.fi.lr("Layer#drawMatte");
                }
                com.bytedance.adsdk.lr.fi.ri("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.lr.fi.lr("Layer#restoreLayer");
            }
            if (this.zf && (paint = this.dw) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.dw.setColor(-251901);
                this.dw.setStrokeWidth(4.0f);
                canvas.drawRect(this.vr, this.dw);
                this.dw.setStyle(Paint.Style.FILL);
                this.dw.setColor(1357638635);
                canvas.drawRect(this.vr, this.dw);
            }
            ik(com.bytedance.adsdk.lr.fi.lr(this.ac));
            return;
        }
        com.bytedance.adsdk.lr.fi.lr(this.ac);
    }

    private void ri(Canvas canvas) {
        com.bytedance.adsdk.lr.fi.ri("Layer#clearLayer");
        RectF rectF = this.vr;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.bgr);
        com.bytedance.adsdk.lr.fi.lr("Layer#clearLayer");
    }

    private void ri(RectF rectF, Matrix matrix) {
        this.bu.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (xha()) {
            int size = this.ihz.ri().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.lr.ik.lr.mj mjVar = this.ihz.ri().get(i);
                Path pathXha = this.ihz.lr().get(i).xha();
                if (pathXha != null) {
                    this.xha.set(pathXha);
                    this.xha.transform(matrix);
                    int i2 = AnonymousClass2.lr[mjVar.ri().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mjVar.ka()) {
                        return;
                    }
                    this.xha.computeBounds(this.tan, false);
                    if (i == 0) {
                        this.bu.set(this.tan);
                    } else {
                        RectF rectF2 = this.bu;
                        rectF2.set(Math.min(rectF2.left, this.tan.left), Math.min(this.bu.top, this.tan.top), Math.max(this.bu.right, this.tan.right), Math.max(this.bu.bottom, this.tan.bottom));
                    }
                }
            }
            if (rectF.intersect(this.bu)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void ri(int i) {
        this.hcw = ((this.ka.ri() != null ? this.ka.ri().xha().intValue() : 100) / 100.0f) * (i / 255.0f);
    }

    private void ri(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.lr.fi.ri("Layer#saveLayer");
        com.bytedance.adsdk.lr.di.di.ri(canvas, this.vr, this.sf, 19);
        if (Build.VERSION.SDK_INT < 28) {
            ri(canvas);
        }
        com.bytedance.adsdk.lr.fi.lr("Layer#saveLayer");
        for (int i = 0; i < this.ihz.ri().size(); i++) {
            com.bytedance.adsdk.lr.ik.lr.mj mjVar = this.ihz.ri().get(i);
            com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar = this.ihz.lr().get(i);
            com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2 = this.ihz.ik().get(i);
            int i2 = AnonymousClass2.lr[mjVar.ri().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.qt.setColor(-16777216);
                        this.qt.setAlpha(255);
                        canvas.drawRect(this.vr, this.qt);
                    }
                    if (mjVar.ka()) {
                        ik(canvas, matrix, riVar, riVar2);
                    } else {
                        ri(canvas, matrix, riVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mjVar.ka()) {
                            lr(canvas, matrix, riVar, riVar2);
                        } else {
                            ri(canvas, matrix, riVar, riVar2);
                        }
                    }
                } else if (mjVar.ka()) {
                    fi(canvas, matrix, riVar, riVar2);
                } else {
                    ka(canvas, matrix, riVar, riVar2);
                }
            } else if (bgr()) {
                this.qt.setAlpha(255);
                canvas.drawRect(this.vr, this.qt);
            }
        }
        com.bytedance.adsdk.lr.fi.ri("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.lr.fi.lr("Layer#restoreLayer");
    }

    private void ri(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar, com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2) {
        this.xha.set(riVar.xha());
        this.xha.transform(matrix);
        this.qt.setAlpha((int) (riVar2.xha().intValue() * 2.55f));
        canvas.drawPath(this.xha, this.qt);
    }

    private void ri(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lr.ri.lr.ri<bgr, Path> riVar) {
        this.xha.set(riVar.xha());
        this.xha.transform(matrix);
        canvas.drawPath(this.xha, this.f17995co);
    }

    public void ri(float f) {
        this.ka.ri(f);
        if (this.ihz != null) {
            for (int i = 0; i < this.ihz.lr().size(); i++) {
                this.ihz.lr().get(i).ri(f);
            }
        }
        com.bytedance.adsdk.lr.ri.lr.ka kaVar = this.uq;
        if (kaVar != null) {
            kaVar.ri(f);
        }
        ri riVar = this.wjv;
        if (riVar != null) {
            riVar.ri(f);
        }
        for (int i2 = 0; i2 < this.su.size(); i2++) {
            this.su.get(i2).ri(f);
        }
    }
}
