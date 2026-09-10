package com.bytedance.adsdk.LD.lk.lk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.LD.DY;
import com.bytedance.adsdk.LD.Lxb.LD.IeN;
import com.bytedance.adsdk.LD.lk.LD.VVE;
import com.bytedance.adsdk.LD.lk.Lxb.JVA;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends com.bytedance.adsdk.LD.lk.lk.Lxb {
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> CSn;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> DY;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> HD;
    private final IeN IeN;
    private final Paint JVA;
    private final LongSparseArray<String> NXR;
    private final RectF OY;
    private final Matrix QAg;
    private final List<Lxb> STP;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Sfi;
    private final com.bytedance.adsdk.LD.QAg VVE;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> aH;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> brP;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> eK;
    private final StringBuilder ebl;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Typeface, Typeface> foI;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> id;
    private final com.bytedance.adsdk.LD.ebl kqm;
    private final Paint nBu;
    private final Map<com.bytedance.adsdk.LD.lk.ZU, List<com.bytedance.adsdk.LD.Lxb.Lxb.ZU>> sLN;
    private com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> tD;

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.lk.lk.QAg$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.LD.lk.LD.Lxb.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.adsdk.LD.lk.LD.Lxb.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.Lxb.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.Lxb.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Lxb {
        private float LD;
        private String Lxb;

        private Lxb() {
            this.Lxb = "";
            this.LD = 0.0f;
        }

        public void Lxb(String str, float f) {
            this.Lxb = str;
            this.LD = f;
        }
    }

    public QAg(com.bytedance.adsdk.LD.QAg qAg, JXs jXs) {
        com.bytedance.adsdk.LD.lk.Lxb.LD ld;
        com.bytedance.adsdk.LD.lk.Lxb.LD ld2;
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxb;
        com.bytedance.adsdk.LD.lk.Lxb.Lxb lxb2;
        super(qAg, jXs);
        this.ebl = new StringBuilder(2);
        this.OY = new RectF();
        this.QAg = new Matrix();
        int i = 1;
        this.nBu = new Paint(i) { // from class: com.bytedance.adsdk.LD.lk.lk.QAg.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.JVA = new Paint(i) { // from class: com.bytedance.adsdk.LD.lk.lk.QAg.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.sLN = new HashMap();
        this.NXR = new LongSparseArray<>();
        this.STP = new ArrayList();
        this.VVE = qAg;
        this.kqm = jXs.Lxb();
        IeN ieNLxb = jXs.tD().Lxb();
        this.IeN = ieNLxb;
        ieNLxb.Lxb(this);
        Lxb(ieNLxb);
        JVA jvaDY = jXs.DY();
        if (jvaDY != null && (lxb2 = jvaDY.Lxb) != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Lxb2 = lxb2.Lxb();
            this.brP = Lxb2;
            Lxb2.Lxb(this);
            Lxb(this.brP);
        }
        if (jvaDY != null && (lxb = jvaDY.LD) != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> Lxb3 = lxb.Lxb();
            this.DY = Lxb3;
            Lxb3.Lxb(this);
            Lxb(this.DY);
        }
        if (jvaDY != null && (ld2 = jvaDY.lk) != null) {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb4 = ld2.Lxb();
            this.HD = Lxb4;
            Lxb4.Lxb(this);
            Lxb(this.HD);
        }
        if (jvaDY == null || (ld = jvaDY.ZU) == null) {
            return;
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb5 = ld.Lxb();
        this.aH = Lxb5;
        Lxb5.Lxb(this);
        Lxb(this.aH);
    }

    private boolean lk(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb
    public void LD(Canvas canvas, Matrix matrix, int i) {
        super.LD(canvas, matrix, i);
        com.bytedance.adsdk.LD.lk.LD ldEbl = this.IeN.ebl();
        com.bytedance.adsdk.LD.lk.lk lkVar = this.kqm.IeN().get(ldEbl.LD);
        if (lkVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Lxb(ldEbl, matrix);
        if (this.VVE.CSn()) {
            Lxb(ldEbl, matrix, lkVar, canvas);
        } else {
            Lxb(ldEbl, lkVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.LD.lk.lk.Lxb, com.bytedance.adsdk.LD.Lxb.Lxb.JXs
    public void Lxb(RectF rectF, Matrix matrix, boolean z) {
        super.Lxb(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.kqm.ZU().width(), this.kqm.ZU().height());
    }

    private void Lxb(com.bytedance.adsdk.LD.lk.LD ld, Matrix matrix) {
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb = this.tD;
        if (lxb != null) {
            this.nBu.setColor(lxb.ebl().intValue());
        } else {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb2 = this.brP;
            if (lxb2 != null) {
                this.nBu.setColor(lxb2.ebl().intValue());
            } else {
                this.nBu.setColor(ld.OY);
            }
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb3 = this.Sfi;
        if (lxb3 != null) {
            this.JVA.setColor(lxb3.ebl().intValue());
        } else {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Integer, Integer> lxb4 = this.DY;
            if (lxb4 != null) {
                this.JVA.setColor(lxb4.ebl().intValue());
            } else {
                this.JVA.setColor(ld.QAg);
            }
        }
        int iIntValue = ((this.ZU.Lxb() == null ? 100 : this.ZU.Lxb().ebl().intValue()) * 255) / 100;
        this.nBu.setAlpha(iIntValue);
        this.JVA.setAlpha(iIntValue);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb5 = this.eK;
        if (lxb5 != null) {
            this.JVA.setStrokeWidth(lxb5.ebl().floatValue());
            return;
        }
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb6 = this.HD;
        if (lxb6 != null) {
            this.JVA.setStrokeWidth(lxb6.ebl().floatValue());
        } else {
            this.JVA.setStrokeWidth(com.bytedance.adsdk.LD.lc.lc.Lxb() * ld.nBu);
        }
    }

    private Lxb LD(int i) {
        for (int size = this.STP.size(); size < i; size++) {
            this.STP.add(new Lxb());
        }
        return this.STP.get(i - 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[LOOP:1: B:21:0x0075->B:23:0x007b, LOOP_END] */
    private void Lxb(com.bytedance.adsdk.LD.lk.LD ld, Matrix matrix, com.bytedance.adsdk.LD.lk.lk lkVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float f;
        int i;
        int i2;
        PointF pointF;
        float f2;
        List<Lxb> listLxb;
        int i3;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb = this.id;
        if (lxb != null) {
            fFloatValue = lxb.ebl().floatValue();
        } else {
            fFloatValue = ld.lk;
        }
        float f3 = fFloatValue / 100.0f;
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb(matrix);
        List<String> listLxb2 = Lxb(ld.Lxb);
        int size = listLxb2.size();
        float f4 = ld.JXs / 10.0f;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb2 = this.CSn;
        if (lxb2 != null) {
            fFloatValue2 = lxb2.ebl().floatValue();
        } else {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb3 = this.aH;
            if (lxb3 != null) {
                fFloatValue2 = lxb3.ebl().floatValue();
            }
            f = f4;
            i = 0;
            i2 = -1;
            while (i < size) {
                String str = listLxb2.get(i);
                pointF = ld.NXR;
                if (pointF == null) {
                    f2 = 0.0f;
                } else {
                    f2 = pointF.x;
                }
                int i4 = i;
                listLxb = Lxb(str, f2, lkVar, f3, f, true);
                i3 = 0;
                while (i3 < listLxb.size()) {
                    Lxb lxb4 = listLxb.get(i3);
                    int i5 = i2 + 1;
                    canvas.save();
                    Lxb(canvas, ld, i5, lxb4.LD);
                    Lxb(lxb4.Lxb, ld, lkVar, canvas, fLxb, f3, f);
                    canvas.restore();
                    i3++;
                    listLxb = listLxb;
                    i2 = i5;
                }
                i = i4 + 1;
            }
        }
        f4 += fFloatValue2;
        f = f4;
        i = 0;
        i2 = -1;
        while (i < size) {
            String str2 = listLxb2.get(i);
            pointF = ld.NXR;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
            }
            int i6 = i;
            listLxb = Lxb(str2, f2, lkVar, f3, f, true);
            i3 = 0;
            while (i3 < listLxb.size()) {
                Lxb lxb5 = listLxb.get(i3);
                int i7 = i2 + 1;
                canvas.save();
                Lxb(canvas, ld, i7, lxb5.LD);
                Lxb(lxb5.Lxb, ld, lkVar, canvas, fLxb, f3, f);
                canvas.restore();
                i3++;
                listLxb = listLxb;
                i2 = i7;
            }
            i = i6 + 1;
        }
    }

    private void Lxb(String str, com.bytedance.adsdk.LD.lk.LD ld, com.bytedance.adsdk.LD.lk.lk lkVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.LD.lk.ZU zu = this.kqm.STP().get(com.bytedance.adsdk.LD.lk.ZU.Lxb(str.charAt(i), lkVar.Lxb(), lkVar.lk()));
            if (zu != null) {
                Lxb(zu, f2, ld, canvas);
                canvas.translate((com.bytedance.adsdk.LD.lc.lc.Lxb() * ((float) zu.LD()) * f2) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf A[LOOP:1: B:26:0x00b9->B:28:0x00bf, LOOP_END] */
    private void Lxb(com.bytedance.adsdk.LD.lk.LD ld, com.bytedance.adsdk.LD.lk.lk lkVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fLxb;
        List<String> listLxb;
        int size;
        int i;
        int i2;
        PointF pointF;
        float f;
        List<Lxb> listLxb2;
        int i3;
        Typeface typefaceLxb = Lxb(lkVar);
        if (typefaceLxb == null) {
            return;
        }
        String strLD = ld.Lxb;
        DY dyAH = this.VVE.aH();
        if (dyAH != null) {
            strLD = dyAH.LD(QAg(), strLD);
        }
        this.nBu.setTypeface(typefaceLxb);
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb = this.id;
        if (lxb != null) {
            fFloatValue = lxb.ebl().floatValue();
        } else {
            fFloatValue = ld.lk;
        }
        this.nBu.setTextSize(com.bytedance.adsdk.LD.lc.lc.Lxb() * fFloatValue);
        this.JVA.setTypeface(this.nBu.getTypeface());
        this.JVA.setTextSize(this.nBu.getTextSize());
        float f2 = ld.JXs / 10.0f;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb2 = this.CSn;
        if (lxb2 != null) {
            fFloatValue2 = lxb2.ebl().floatValue();
        } else {
            com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lxb3 = this.aH;
            if (lxb3 != null) {
                fFloatValue2 = lxb3.ebl().floatValue();
            }
            fLxb = ((com.bytedance.adsdk.LD.lc.lc.Lxb() * f2) * fFloatValue) / 100.0f;
            listLxb = Lxb(strLD);
            size = listLxb.size();
            i = 0;
            i2 = -1;
            while (i < size) {
                String str = listLxb.get(i);
                pointF = ld.NXR;
                if (pointF == null) {
                    f = 0.0f;
                } else {
                    f = pointF.x;
                }
                int i4 = i;
                listLxb2 = Lxb(str, f, lkVar, 0.0f, fLxb, false);
                for (i3 = 0; i3 < listLxb2.size(); i3++) {
                    Lxb lxb4 = listLxb2.get(i3);
                    i2++;
                    canvas.save();
                    Lxb(canvas, ld, i2, lxb4.LD);
                    Lxb(lxb4.Lxb, ld, canvas, fLxb);
                    canvas.restore();
                }
                i = i4 + 1;
            }
        }
        f2 += fFloatValue2;
        fLxb = ((com.bytedance.adsdk.LD.lc.lc.Lxb() * f2) * fFloatValue) / 100.0f;
        listLxb = Lxb(strLD);
        size = listLxb.size();
        i = 0;
        i2 = -1;
        while (i < size) {
            String str2 = listLxb.get(i);
            pointF = ld.NXR;
            if (pointF == null) {
                f = 0.0f;
            } else {
                f = pointF.x;
            }
            int i5 = i;
            listLxb2 = Lxb(str2, f, lkVar, 0.0f, fLxb, false);
            while (i3 < listLxb2.size()) {
                Lxb lxb5 = listLxb2.get(i3);
                i2++;
                canvas.save();
                Lxb(canvas, ld, i2, lxb5.LD);
                Lxb(lxb5.Lxb, ld, canvas, fLxb);
                canvas.restore();
            }
            i = i5 + 1;
        }
    }

    private void Lxb(Canvas canvas, com.bytedance.adsdk.LD.lk.LD ld, int i, float f) {
        PointF pointF = ld.sLN;
        PointF pointF2 = ld.NXR;
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
        float fA = DM.A(i, ld.lc, fLxb, pointF == null ? 0.0f : (ld.lc * 0.6f * fLxb) + pointF.y);
        float f2 = pointF == null ? 0.0f : pointF.x;
        float f3 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = AnonymousClass3.Lxb[ld.ZU.ordinal()];
        if (i2 == 1) {
            canvas.translate(f2, fA);
        } else if (i2 == 2) {
            canvas.translate((f2 + f3) - f, fA);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate(((f3 / 2.0f) + f2) - (f / 2.0f), fA);
        }
    }

    private Typeface Lxb(com.bytedance.adsdk.LD.lk.lk lkVar) {
        Typeface typefaceEbl;
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Typeface, Typeface> lxb = this.foI;
        if (lxb != null && (typefaceEbl = lxb.ebl()) != null) {
            return typefaceEbl;
        }
        Typeface typefaceLxb = this.VVE.Lxb(lkVar);
        return typefaceLxb != null ? typefaceLxb : lkVar.ZU();
    }

    private List<String> Lxb(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void Lxb(String str, com.bytedance.adsdk.LD.lk.LD ld, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strLxb = Lxb(str, length);
            length += strLxb.length();
            Lxb(strLxb, ld, canvas);
            canvas.translate(this.nBu.measureText(strLxb) + f, 0.0f);
        }
    }

    private List<Lxb> Lxb(String str, float f, com.bytedance.adsdk.LD.lk.lk lkVar, float f2, float f3, boolean z) {
        float fMeasureText;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                com.bytedance.adsdk.LD.lk.ZU zu = this.kqm.STP().get(com.bytedance.adsdk.LD.lk.ZU.Lxb(cCharAt, lkVar.Lxb(), lkVar.lk()));
                if (zu != null) {
                    fMeasureText = (com.bytedance.adsdk.LD.lc.lc.Lxb() * ((float) zu.LD()) * f2) + f3;
                }
            } else {
                fMeasureText = this.nBu.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                i3 = i4;
                f5 = fMeasureText;
                z2 = false;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                Lxb lxbLD = LD(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    lxbLD.Lxb(strTrim, (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    lxbLD.Lxb(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            LD(i).Lxb(str.substring(i2), f4);
        }
        return this.STP.subList(0, i);
    }

    private void Lxb(com.bytedance.adsdk.LD.lk.ZU zu, float f, com.bytedance.adsdk.LD.lk.LD ld, Canvas canvas) {
        List<com.bytedance.adsdk.LD.Lxb.Lxb.ZU> listLxb = Lxb(zu);
        for (int i = 0; i < listLxb.size(); i++) {
            Path pathZU = listLxb.get(i).ZU();
            pathZU.computeBounds(this.OY, false);
            this.QAg.reset();
            this.QAg.preTranslate(0.0f, com.bytedance.adsdk.LD.lc.lc.Lxb() * (-ld.ebl));
            this.QAg.preScale(f, f);
            pathZU.transform(this.QAg);
            if (ld.JVA) {
                Lxb(pathZU, this.nBu, canvas);
                Lxb(pathZU, this.JVA, canvas);
            } else {
                Lxb(pathZU, this.JVA, canvas);
                Lxb(pathZU, this.nBu, canvas);
            }
        }
    }

    private void Lxb(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void Lxb(String str, com.bytedance.adsdk.LD.lk.LD ld, Canvas canvas) {
        if (ld.JVA) {
            Lxb(str, this.nBu, canvas);
            Lxb(str, this.JVA, canvas);
        } else {
            Lxb(str, this.JVA, canvas);
            Lxb(str, this.nBu, canvas);
        }
    }

    private void Lxb(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.LD.Lxb.Lxb.ZU> Lxb(com.bytedance.adsdk.LD.lk.ZU zu) {
        if (this.sLN.containsKey(zu)) {
            return this.sLN.get(zu);
        }
        List<VVE> listLxb = zu.Lxb();
        int size = listLxb.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.LD.Lxb.Lxb.ZU(this.VVE, this, listLxb.get(i), this.kqm));
        }
        this.sLN.put(zu, arrayList);
        return arrayList;
    }

    private String Lxb(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!lk(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.NXR.indexOfKey(j) >= 0) {
            return this.NXR.get(j);
        }
        this.ebl.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.ebl.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.ebl.toString();
        this.NXR.put(j, string);
        return string;
    }
}
