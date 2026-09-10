package com.bytedance.adsdk.LD.lk.lk;

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
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.LD.Lxb.LD.VVE;
import com.bytedance.adsdk.LD.lk.LD.STP;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.google.android.material.color.utilities.Contrast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs {
    private List<Lxb> CSn;
    private final String DY;
    private com.bytedance.adsdk.LD.Lxb.LD.ZU HD;
    private final RectF IeN;
    private Paint Ivz;
    private final Paint JVA;
    float JXs;
    private boolean KPU;
    final com.bytedance.adsdk.LD.QAg LD;
    final Matrix Lxb;
    private final Paint NXR;
    private final Paint STP;
    private com.bytedance.adsdk.LD.Lxb.LD.OY Sfi;
    private final RectF VVE;
    final VVE ZU;
    private Lxb aH;
    private final RectF brP;
    private Lxb eK;
    private boolean foI;
    private final List<com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, ?>> id;
    private final RectF kqm;
    BlurMaskFilter lc;
    final JXs lk;
    private final Matrix nE;
    private final Paint sLN;
    private final RectF tD;
    private float xan;
    private final Path ebl = new Path();
    private final Matrix OY = new Matrix();
    private final Matrix QAg = new Matrix();
    private final Paint nBu = new com.bytedance.adsdk.LD.Lxb.Lxb(1);

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.lk.lk.Lxb$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] LD;
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.LD.lk.LD.OY.Lxb.values().length];
            LD = iArr;
            try {
                iArr[com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LD[com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LD[com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LD[com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JXs.Lxb.values().length];
            Lxb = iArr2;
            try {
                iArr2[JXs.Lxb.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lxb[JXs.Lxb.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Lxb[JXs.Lxb.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Lxb[JXs.Lxb.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Lxb[JXs.Lxb.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Lxb[JXs.Lxb.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Lxb[JXs.Lxb.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public Lxb(com.bytedance.adsdk.LD.QAg qAg, JXs jXs) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.JVA = new com.bytedance.adsdk.LD.Lxb.Lxb(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.sLN = new com.bytedance.adsdk.LD.Lxb.Lxb(1, mode2);
        com.bytedance.adsdk.LD.Lxb.Lxb lxb = new com.bytedance.adsdk.LD.Lxb.Lxb(1);
        this.NXR = lxb;
        this.STP = new com.bytedance.adsdk.LD.Lxb.Lxb(PorterDuff.Mode.CLEAR);
        this.IeN = new RectF();
        this.VVE = new RectF();
        this.kqm = new RectF();
        this.brP = new RectF();
        this.tD = new RectF();
        this.Lxb = new Matrix();
        this.id = new ArrayList();
        this.foI = true;
        this.JXs = 0.0f;
        this.nE = new Matrix();
        this.xan = 1.0f;
        this.LD = qAg;
        this.lk = jXs;
        this.DY = jXs.lc() + "#draw";
        if (jXs.sLN() == JXs.LD.INVERT) {
            lxb.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lxb.setXfermode(new PorterDuffXfermode(mode));
        }
        VVE vveNBu = jXs.IeN().nBu();
        this.ZU = vveNBu;
        vveNBu.Lxb((com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb) this);
        if (jXs.nBu() != null && !jXs.nBu().isEmpty()) {
            com.bytedance.adsdk.LD.Lxb.LD.OY oy = new com.bytedance.adsdk.LD.Lxb.LD.OY(jXs.nBu());
            this.Sfi = oy;
            Iterator<com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path>> it = oy.LD().iterator();
            while (it.hasNext()) {
                it.next().Lxb(this);
            }
            for (com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2 : this.Sfi.lk()) {
                Lxb(lxb2);
                lxb2.Lxb(this);
            }
        }
        sLN();
    }

    private void IeN() {
        if (this.CSn != null) {
            return;
        }
        if (this.aH == null) {
            this.CSn = Collections.emptyList();
            return;
        }
        this.CSn = new ArrayList();
        for (Lxb lxb = this.aH; lxb != null; lxb = lxb.aH) {
            this.CSn.add(lxb);
        }
    }

    private void NXR() {
        this.LD.invalidateSelf();
    }

    private boolean STP() {
        if (this.Sfi.LD().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.Sfi.Lxb().size(); i++) {
            if (this.Sfi.Lxb().get(i).Lxb() != com.bytedance.adsdk.LD.lk.LD.OY.Lxb.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void sLN() {
        if (this.lk.ZU().isEmpty()) {
            LD(true);
            return;
        }
        com.bytedance.adsdk.LD.Lxb.LD.ZU zu = new com.bytedance.adsdk.LD.Lxb.LD.ZU(this.lk.ZU());
        this.HD = zu;
        zu.Lxb();
        this.HD.Lxb(new com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb() { // from class: com.bytedance.adsdk.LD.lk.lk.Lxb.1
            @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
            public void Lxb() {
                Lxb lxb = Lxb.this;
                lxb.LD(lxb.HD.QAg() == 1.0f);
            }
        });
        LD(this.HD.ebl().floatValue() == 1.0f);
        Lxb(this.HD);
    }

    public com.bytedance.adsdk.LD.JXs.nBu JVA() {
        return this.lk.aH();
    }

    public String JXs() {
        JXs jXs = this.lk;
        if (jXs != null) {
            return jXs.ebl();
        }
        return null;
    }

    public JXs LD() {
        return this.lk;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<com.bytedance.adsdk.LD.Lxb.Lxb.lk> list, List<com.bytedance.adsdk.LD.Lxb.Lxb.lk> list2) {
    }

    public boolean OY() {
        return this.foI;
    }

    public String QAg() {
        return this.lk.lc();
    }

    public Matrix ZU() {
        return this.nE;
    }

    public boolean ebl() {
        com.bytedance.adsdk.LD.Lxb.LD.OY oy = this.Sfi;
        return (oy == null || oy.LD().isEmpty()) ? false : true;
    }

    public float lc() {
        return this.xan;
    }

    public com.bytedance.adsdk.LD.lk.LD.Lxb nBu() {
        return this.lk.eK();
    }

    private void ZU(Canvas canvas, Matrix matrix, com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb, com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2) {
        com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.JVA);
        this.ebl.set(lxb.ebl());
        this.ebl.transform(matrix);
        this.nBu.setAlpha((int) (lxb2.ebl().intValue() * 2.55f));
        canvas.drawPath(this.ebl, this.nBu);
        canvas.restore();
    }

    public void LD(Lxb lxb) {
        this.aH = lxb;
    }

    public boolean lk() {
        return this.eK != null;
    }

    private void JXs(Canvas canvas, Matrix matrix, com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb, com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2) {
        com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.JVA);
        canvas.drawRect(this.IeN, this.nBu);
        this.sLN.setAlpha((int) (lxb2.ebl().intValue() * 2.55f));
        this.ebl.set(lxb.ebl());
        this.ebl.transform(matrix);
        canvas.drawPath(this.ebl, this.sLN);
        canvas.restore();
    }

    private void LD(RectF rectF, Matrix matrix) {
        if (lk() && this.lk.sLN() != JXs.LD.INVERT) {
            this.brP.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.eK.Lxb(this.brP, matrix, true);
            if (rectF.intersect(this.brP)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static Lxb Lxb(LD ld, JXs jXs, com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, Context context) {
        switch (AnonymousClass2.Lxb[jXs.JVA().ordinal()]) {
            case 1:
                return new ebl(qAg, jXs, ld, eblVar);
            case 2:
                return new LD(qAg, jXs, eblVar.LD(jXs.ebl()), eblVar, context);
            case 3:
                return new OY(qAg, jXs);
            case 4:
                if (Lxb(qAg, jXs, "text:")) {
                    return new lk(qAg, jXs, context);
                }
                if (Lxb(qAg, jXs, "videoview:")) {
                    return new nBu(qAg, jXs, context);
                }
                return new ZU(qAg, jXs);
            case 5:
                return new lc(qAg, jXs);
            case 6:
                return new QAg(qAg, jXs);
            default:
                Objects.toString(jXs.JVA());
                return null;
        }
    }

    private void lk(float f) {
        this.LD.id().lk().Lxb(this.lk.lc(), f);
    }

    private void lk(Canvas canvas, Matrix matrix, com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb, com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2) {
        com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.sLN);
        canvas.drawRect(this.IeN, this.nBu);
        this.sLN.setAlpha((int) (lxb2.ebl().intValue() * 2.55f));
        this.ebl.set(lxb.ebl());
        this.ebl.transform(matrix);
        canvas.drawPath(this.ebl, this.sLN);
        canvas.restore();
    }

    public void LD(Canvas canvas, Matrix matrix, int i) {
        Lxb(i);
    }

    private void LD(Canvas canvas, Matrix matrix, com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb, com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2) {
        com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.nBu);
        canvas.drawRect(this.IeN, this.nBu);
        this.ebl.set(lxb.ebl());
        this.ebl.transform(matrix);
        this.nBu.setAlpha((int) (lxb2.ebl().intValue() * 2.55f));
        canvas.drawPath(this.ebl, this.sLN);
        canvas.restore();
    }

    private static boolean Lxb(com.bytedance.adsdk.LD.QAg qAg, JXs jXs, String str) {
        com.bytedance.adsdk.LD.nBu nbuLc;
        if (qAg == null || jXs == null || str == null || (nbuLc = qAg.lc(jXs.ebl())) == null) {
            return false;
        }
        return str.equals(nbuLc.nBu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(boolean z) {
        if (z != this.foI) {
            this.foI = z;
            NXR();
        }
    }

    public void Lxb(boolean z) {
        if (z && this.Ivz == null) {
            this.Ivz = new com.bytedance.adsdk.LD.Lxb.Lxb();
        }
        this.KPU = z;
    }

    public BlurMaskFilter LD(float f) {
        if (this.JXs == f) {
            return this.lc;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.lc = blurMaskFilter;
        this.JXs = f;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        NXR();
    }

    public void Lxb(Lxb lxb) {
        this.eK = lxb;
    }

    public void Lxb(com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, ?> lxb) {
        if (lxb == null) {
            return;
        }
        this.id.add(lxb);
    }

    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        this.IeN.set(0.0f, 0.0f, 0.0f, 0.0f);
        IeN();
        this.Lxb.set(matrix);
        if (z) {
            List<Lxb> list = this.CSn;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.Lxb.preConcat(this.CSn.get(size).ZU.ZU());
                }
            } else {
                Lxb lxb = this.aH;
                if (lxb != null) {
                    this.Lxb.preConcat(lxb.ZU.ZU());
                }
            }
        }
        this.Lxb.preConcat(this.ZU.ZU());
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numEbl;
        com.bytedance.adsdk.LD.JXs.Lxb(this.DY);
        if (this.foI && !this.lk.HD()) {
            IeN();
            com.bytedance.adsdk.LD.JXs.Lxb("Layer#parentMatrix");
            this.nE.set(matrix);
            this.OY.reset();
            this.OY.set(matrix);
            for (int size = this.CSn.size() - 1; size >= 0; size--) {
                this.OY.preConcat(this.CSn.get(size).ZU.ZU());
            }
            com.bytedance.adsdk.LD.JXs.LD("Layer#parentMatrix");
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<?, Integer> Lxb = this.ZU.Lxb();
            int iIntValue = (int) ((((i / 255.0f) * ((Lxb == null || (numEbl = Lxb.ebl()) == null) ? 100 : numEbl.intValue())) / 100.0f) * 255.0f);
            if (!lk() && !ebl()) {
                this.OY.preConcat(this.ZU.ZU());
                com.bytedance.adsdk.LD.JXs.Lxb("Layer#drawLayer");
                LD(canvas, this.OY, iIntValue);
                com.bytedance.adsdk.LD.JXs.LD("Layer#drawLayer");
                lk(com.bytedance.adsdk.LD.JXs.LD(this.DY));
                return;
            }
            com.bytedance.adsdk.LD.JXs.Lxb("Layer#computeBounds");
            Lxb(this.IeN, this.OY, false);
            LD(this.IeN, matrix);
            this.OY.preConcat(this.ZU.ZU());
            Lxb(this.IeN, this.OY);
            this.VVE.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.QAg);
            if (!this.QAg.isIdentity()) {
                Matrix matrix2 = this.QAg;
                matrix2.invert(matrix2);
                this.QAg.mapRect(this.VVE);
            }
            if (!this.IeN.intersect(this.VVE)) {
                this.IeN.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.LD.JXs.LD("Layer#computeBounds");
            if (this.IeN.width() >= 1.0f && this.IeN.height() >= 1.0f) {
                com.bytedance.adsdk.LD.JXs.Lxb("Layer#saveLayer");
                this.nBu.setAlpha(255);
                com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.nBu);
                com.bytedance.adsdk.LD.JXs.LD("Layer#saveLayer");
                Lxb(canvas);
                com.bytedance.adsdk.LD.JXs.Lxb("Layer#drawLayer");
                LD(canvas, this.OY, iIntValue);
                com.bytedance.adsdk.LD.JXs.LD("Layer#drawLayer");
                if (ebl()) {
                    Lxb(canvas, this.OY);
                }
                if (lk()) {
                    com.bytedance.adsdk.LD.JXs.Lxb("Layer#drawMatte");
                    com.bytedance.adsdk.LD.JXs.Lxb("Layer#saveLayer");
                    com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.NXR, 19);
                    com.bytedance.adsdk.LD.JXs.LD("Layer#saveLayer");
                    Lxb(canvas);
                    this.eK.Lxb(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.LD.JXs.Lxb("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.LD.JXs.LD("Layer#restoreLayer");
                    com.bytedance.adsdk.LD.JXs.LD("Layer#drawMatte");
                }
                com.bytedance.adsdk.LD.JXs.Lxb("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.LD.JXs.LD("Layer#restoreLayer");
            }
            if (this.KPU && (paint = this.Ivz) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.Ivz.setColor(-251901);
                this.Ivz.setStrokeWidth(4.0f);
                canvas.drawRect(this.IeN, this.Ivz);
                this.Ivz.setStyle(Paint.Style.FILL);
                this.Ivz.setColor(1357638635);
                canvas.drawRect(this.IeN, this.Ivz);
            }
            lk(com.bytedance.adsdk.LD.JXs.LD(this.DY));
            return;
        }
        com.bytedance.adsdk.LD.JXs.LD(this.DY);
    }

    private void Lxb(Canvas canvas) {
        com.bytedance.adsdk.LD.JXs.Lxb("Layer#clearLayer");
        RectF rectF = this.IeN;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.STP);
        com.bytedance.adsdk.LD.JXs.LD("Layer#clearLayer");
    }

    private void Lxb(RectF rectF, Matrix matrix) {
        this.kqm.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (ebl()) {
            int size = this.Sfi.Lxb().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.LD.lk.LD.OY oy = this.Sfi.Lxb().get(i);
                Path pathEbl = this.Sfi.LD().get(i).ebl();
                if (pathEbl != null) {
                    this.ebl.set(pathEbl);
                    this.ebl.transform(matrix);
                    int i2 = AnonymousClass2.LD[oy.Lxb().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && oy.ZU()) {
                        return;
                    }
                    this.ebl.computeBounds(this.tD, false);
                    if (i == 0) {
                        this.kqm.set(this.tD);
                    } else {
                        RectF rectF2 = this.kqm;
                        rectF2.set(Math.min(rectF2.left, this.tD.left), Math.min(this.kqm.top, this.tD.top), Math.max(this.kqm.right, this.tD.right), Math.max(this.kqm.bottom, this.tD.bottom));
                    }
                }
            }
            if (rectF.intersect(this.kqm)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void Lxb(int i) {
        this.xan = (i / 255.0f) * ((this.ZU.Lxb() != null ? this.ZU.Lxb().ebl().intValue() : 100) / 100.0f);
    }

    private void Lxb(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.LD.JXs.Lxb("Layer#saveLayer");
        com.bytedance.adsdk.LD.lc.lc.Lxb(canvas, this.IeN, this.JVA, 19);
        if (Build.VERSION.SDK_INT < 28) {
            Lxb(canvas);
        }
        com.bytedance.adsdk.LD.JXs.LD("Layer#saveLayer");
        for (int i = 0; i < this.Sfi.Lxb().size(); i++) {
            com.bytedance.adsdk.LD.lk.LD.OY oy = this.Sfi.Lxb().get(i);
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb = this.Sfi.LD().get(i);
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2 = this.Sfi.lk().get(i);
            int i2 = AnonymousClass2.LD[oy.Lxb().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.nBu.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.nBu.setAlpha(255);
                        canvas.drawRect(this.IeN, this.nBu);
                    }
                    if (oy.ZU()) {
                        lk(canvas, matrix, lxb, lxb2);
                    } else {
                        Lxb(canvas, matrix, lxb);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (oy.ZU()) {
                            LD(canvas, matrix, lxb, lxb2);
                        } else {
                            Lxb(canvas, matrix, lxb, lxb2);
                        }
                    }
                } else if (oy.ZU()) {
                    JXs(canvas, matrix, lxb, lxb2);
                } else {
                    ZU(canvas, matrix, lxb, lxb2);
                }
            } else if (STP()) {
                this.nBu.setAlpha(255);
                canvas.drawRect(this.IeN, this.nBu);
            }
        }
        com.bytedance.adsdk.LD.JXs.Lxb("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.LD.JXs.LD("Layer#restoreLayer");
    }

    private void Lxb(Canvas canvas, Matrix matrix, com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb, com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2) {
        this.ebl.set(lxb.ebl());
        this.ebl.transform(matrix);
        this.nBu.setAlpha((int) (lxb2.ebl().intValue() * 2.55f));
        canvas.drawPath(this.ebl, this.nBu);
    }

    private void Lxb(Canvas canvas, Matrix matrix, com.bytedance.adsdk.LD.Lxb.LD.Lxb<STP, Path> lxb) {
        this.ebl.set(lxb.ebl());
        this.ebl.transform(matrix);
        canvas.drawPath(this.ebl, this.sLN);
    }

    public void Lxb(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        this.ZU.Lxb(f);
        if (this.Sfi != null) {
            for (int i = 0; i < this.Sfi.LD().size(); i++) {
                this.Sfi.LD().get(i).Lxb(f);
            }
        }
        com.bytedance.adsdk.LD.Lxb.LD.ZU zu = this.HD;
        if (zu != null) {
            zu.Lxb(f);
        }
        Lxb lxb = this.eK;
        if (lxb != null) {
            lxb.Lxb(f);
        }
        for (int i2 = 0; i2 < this.id.size(); i2++) {
            this.id.get(i2).Lxb(f);
        }
    }
}
