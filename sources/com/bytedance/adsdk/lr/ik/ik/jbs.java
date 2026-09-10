package com.bytedance.adsdk.lr.ik.ik;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lr.ac;
import com.bytedance.adsdk.lr.ik.lr.slm;
import com.bytedance.adsdk.lr.ik.ri.sf;
import com.bytedance.adsdk.lr.ri.lr.vr;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.adsdk.lr.ik.ik.ri {
    private com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> ac;
    private final LongSparseArray<String> aw;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> ay;
    private final List<ri> bgr;
    private final com.bytedance.adsdk.lr.xha bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final Map<com.bytedance.adsdk.lr.ik.ka, List<com.bytedance.adsdk.lr.ri.ri.ka>> f17991co;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> fr;
    private com.bytedance.adsdk.lr.ri.lr.ri<Typeface, Typeface> igq;
    private com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> ihz;
    private final Matrix jbs;
    private final RectF mj;
    private com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> nr;
    private final Paint qt;
    private final Paint sf;
    private final com.bytedance.adsdk.lr.jbs slm;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> su;
    private com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> tan;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> uq;
    private final vr vr;
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> wjv;
    private final StringBuilder xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.jbs$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[com.bytedance.adsdk.lr.ik.lr.ri.values().length];
            ri = iArr;
            try {
                iArr[com.bytedance.adsdk.lr.ik.lr.ri.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.ri.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.ri.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ri {
        private float lr;
        private String ri;

        private ri() {
            this.ri = "";
            this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public void ri(String str, float f) {
            this.ri = str;
            this.lr = f;
        }
    }

    public jbs(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar) {
        com.bytedance.adsdk.lr.ik.ri.lr lrVar;
        com.bytedance.adsdk.lr.ik.ri.lr lrVar2;
        com.bytedance.adsdk.lr.ik.ri.ri riVar;
        com.bytedance.adsdk.lr.ik.ri.ri riVar2;
        super(jbsVar, fiVar);
        this.xha = new StringBuilder(2);
        this.mj = new RectF();
        this.jbs = new Matrix();
        int i = 1;
        this.qt = new Paint(i) { // from class: com.bytedance.adsdk.lr.ik.ik.jbs.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.sf = new Paint(i) { // from class: com.bytedance.adsdk.lr.ik.ik.jbs.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f17991co = new HashMap();
        this.aw = new LongSparseArray<>();
        this.bgr = new ArrayList();
        this.slm = jbsVar;
        this.bu = fiVar.ri();
        vr vrVarRi = fiVar.tan().ri();
        this.vr = vrVarRi;
        vrVarRi.ri(this);
        ri(vrVarRi);
        sf sfVarAc = fiVar.ac();
        if (sfVarAc != null && (riVar2 = sfVarAc.ri) != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVarRi = riVar2.ri();
            this.nr = riVarRi;
            riVarRi.ri(this);
            ri(this.nr);
        }
        if (sfVarAc != null && (riVar = sfVarAc.lr) != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVarRi2 = riVar.ri();
            this.ac = riVarRi2;
            riVarRi2.ri(this);
            ri(this.ac);
        }
        if (sfVarAc != null && (lrVar2 = sfVarAc.ik) != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi3 = lrVar2.ri();
            this.uq = riVarRi3;
            riVarRi3.ri(this);
            ri(this.uq);
        }
        if (sfVarAc == null || (lrVar = sfVarAc.ka) == null) {
            return;
        }
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi4 = lrVar.ri();
        this.ay = riVarRi4;
        riVarRi4.ri(this);
        ri(this.ay);
    }

    private boolean ik(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        super.lr(canvas, matrix, i);
        com.bytedance.adsdk.lr.ik.lr lrVarXha = this.vr.xha();
        com.bytedance.adsdk.lr.ik.ik ikVar = this.bu.vr().get(lrVarXha.lr);
        if (ikVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ri(lrVarXha, matrix);
        if (this.slm.fr()) {
            ri(lrVarXha, matrix, ikVar, canvas);
        } else {
            ri(lrVarXha, ikVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        super.ri(rectF, matrix, z);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bu.ka().width(), this.bu.ka().height());
    }

    private void ri(com.bytedance.adsdk.lr.ik.lr lrVar, Matrix matrix) {
        com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar = this.tan;
        if (riVar != null) {
            this.qt.setColor(riVar.xha().intValue());
        } else {
            com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar2 = this.nr;
            if (riVar2 != null) {
                this.qt.setColor(riVar2.xha().intValue());
            } else {
                this.qt.setColor(lrVar.mj);
            }
        }
        com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar3 = this.ihz;
        if (riVar3 != null) {
            this.sf.setColor(riVar3.xha().intValue());
        } else {
            com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVar4 = this.ac;
            if (riVar4 != null) {
                this.sf.setColor(riVar4.xha().intValue());
            } else {
                this.sf.setColor(lrVar.jbs);
            }
        }
        int iIntValue = ((this.ka.ri() == null ? 100 : this.ka.ri().xha().intValue()) * 255) / 100;
        this.qt.setAlpha(iIntValue);
        this.sf.setAlpha(iIntValue);
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar5 = this.wjv;
        if (riVar5 != null) {
            this.sf.setStrokeWidth(riVar5.xha().floatValue());
            return;
        }
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar6 = this.uq;
        if (riVar6 != null) {
            this.sf.setStrokeWidth(riVar6.xha().floatValue());
        } else {
            this.sf.setStrokeWidth(lrVar.qt * com.bytedance.adsdk.lr.di.di.ri());
        }
    }

    private ri lr(int i) {
        for (int size = this.bgr.size(); size < i; size++) {
            this.bgr.add(new ri());
        }
        return this.bgr.get(i - 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[LOOP:1: B:21:0x0069->B:23:0x006f, LOOP_END] */
    private void ri(com.bytedance.adsdk.lr.ik.lr lrVar, Matrix matrix, com.bytedance.adsdk.lr.ik.ik ikVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float f;
        int i;
        int i2;
        PointF pointF;
        float f2;
        List<ri> listRi;
        int i3;
        jbs jbsVar = this;
        com.bytedance.adsdk.lr.ik.lr lrVar2 = lrVar;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar = jbsVar.su;
        if (riVar != null) {
            fFloatValue = riVar.xha().floatValue();
        } else {
            fFloatValue = lrVar2.ik;
        }
        float f3 = fFloatValue / 100.0f;
        float fRi = com.bytedance.adsdk.lr.di.di.ri(matrix);
        List<String> listRi2 = jbsVar.ri(lrVar2.ri);
        int size = listRi2.size();
        float f4 = lrVar2.fi / 10.0f;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar2 = jbsVar.fr;
        if (riVar2 != null) {
            fFloatValue2 = riVar2.xha().floatValue();
        } else {
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar3 = jbsVar.ay;
            if (riVar3 != null) {
                fFloatValue2 = riVar3.xha().floatValue();
            }
            f = f4;
            i = -1;
            i2 = 0;
            while (i2 < size) {
                String str = listRi2.get(i2);
                pointF = lrVar2.aw;
                if (pointF == null) {
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    f2 = pointF.x;
                }
                listRi = jbsVar.ri(str, f2, ikVar, f3, f, true);
                i3 = 0;
                while (i3 < listRi.size()) {
                    ri riVar4 = listRi.get(i3);
                    i++;
                    canvas.save();
                    jbsVar.ri(canvas, lrVar2, i, riVar4.lr);
                    float f5 = f3;
                    com.bytedance.adsdk.lr.ik.lr lrVar3 = lrVar2;
                    float f6 = f;
                    jbsVar.ri(riVar4.ri, lrVar3, ikVar, canvas, fRi, f5, f6);
                    f3 = f5;
                    canvas.restore();
                    i3++;
                    jbsVar = this;
                    f = f6;
                    lrVar2 = lrVar;
                }
                i2++;
                jbsVar = this;
                f = f;
                lrVar2 = lrVar;
            }
        }
        f4 += fFloatValue2;
        f = f4;
        i = -1;
        i2 = 0;
        while (i2 < size) {
            String str2 = listRi2.get(i2);
            pointF = lrVar2.aw;
            if (pointF == null) {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                f2 = pointF.x;
            }
            listRi = jbsVar.ri(str2, f2, ikVar, f3, f, true);
            i3 = 0;
            while (i3 < listRi.size()) {
                ri riVar5 = listRi.get(i3);
                i++;
                canvas.save();
                jbsVar.ri(canvas, lrVar2, i, riVar5.lr);
                float f7 = f3;
                com.bytedance.adsdk.lr.ik.lr lrVar4 = lrVar2;
                float f8 = f;
                jbsVar.ri(riVar5.ri, lrVar4, ikVar, canvas, fRi, f7, f8);
                f3 = f7;
                canvas.restore();
                i3++;
                jbsVar = this;
                f = f8;
                lrVar2 = lrVar;
            }
            i2++;
            jbsVar = this;
            f = f;
            lrVar2 = lrVar;
        }
    }

    private void ri(String str, com.bytedance.adsdk.lr.ik.lr lrVar, com.bytedance.adsdk.lr.ik.ik ikVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.lr.ik.ka kaVar = this.bu.bgr().get(com.bytedance.adsdk.lr.ik.ka.ri(str.charAt(i), ikVar.ri(), ikVar.ik()));
            if (kaVar != null) {
                ri(kaVar, f2, lrVar, canvas);
                canvas.translate((((float) kaVar.lr()) * f2 * com.bytedance.adsdk.lr.di.di.ri()) + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[LOOP:1: B:27:0x00a8->B:29:0x00ae, LOOP_END] */
    private void ri(com.bytedance.adsdk.lr.ik.lr lrVar, com.bytedance.adsdk.lr.ik.ik ikVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fRi;
        List<String> listRi;
        int size;
        int i;
        int i2;
        PointF pointF;
        float f;
        List<ri> listRi2;
        int i3;
        Typeface typefaceRi = ri(ikVar);
        if (typefaceRi != null) {
            String strLr = lrVar.ri;
            ac acVarAy = this.slm.ay();
            if (acVarAy != null) {
                strLr = acVarAy.lr(jbs(), strLr);
            }
            this.qt.setTypeface(typefaceRi);
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar = this.su;
            if (riVar != null) {
                fFloatValue = riVar.xha().floatValue();
            } else {
                fFloatValue = lrVar.ik;
            }
            this.qt.setTextSize(com.bytedance.adsdk.lr.di.di.ri() * fFloatValue);
            this.sf.setTypeface(this.qt.getTypeface());
            this.sf.setTextSize(this.qt.getTextSize());
            float f2 = lrVar.fi / 10.0f;
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar2 = this.fr;
            if (riVar2 != null) {
                fFloatValue2 = riVar2.xha().floatValue();
            } else {
                com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar3 = this.ay;
                if (riVar3 != null) {
                    fFloatValue2 = riVar3.xha().floatValue();
                }
                fRi = ((f2 * com.bytedance.adsdk.lr.di.di.ri()) * fFloatValue) / 100.0f;
                listRi = ri(strLr);
                size = listRi.size();
                i = 0;
                i2 = -1;
                while (i < size) {
                    String str = listRi.get(i);
                    pointF = lrVar.aw;
                    if (pointF == null) {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        f = pointF.x;
                    }
                    com.bytedance.adsdk.lr.ik.ik ikVar2 = ikVar;
                    listRi2 = ri(str, f, ikVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fRi, false);
                    for (i3 = 0; i3 < listRi2.size(); i3++) {
                        ri riVar4 = listRi2.get(i3);
                        i2++;
                        canvas.save();
                        ri(canvas, lrVar, i2, riVar4.lr);
                        ri(riVar4.ri, lrVar, canvas, fRi);
                        canvas.restore();
                    }
                    i++;
                    ikVar = ikVar2;
                }
            }
            f2 += fFloatValue2;
            fRi = ((f2 * com.bytedance.adsdk.lr.di.di.ri()) * fFloatValue) / 100.0f;
            listRi = ri(strLr);
            size = listRi.size();
            i = 0;
            i2 = -1;
            while (i < size) {
                String str2 = listRi.get(i);
                pointF = lrVar.aw;
                if (pointF == null) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    f = pointF.x;
                }
                com.bytedance.adsdk.lr.ik.ik ikVar3 = ikVar;
                listRi2 = ri(str2, f, ikVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fRi, false);
                while (i3 < listRi2.size()) {
                    ri riVar5 = listRi2.get(i3);
                    i2++;
                    canvas.save();
                    ri(canvas, lrVar, i2, riVar5.lr);
                    ri(riVar5.ri, lrVar, canvas, fRi);
                    canvas.restore();
                }
                i++;
                ikVar = ikVar3;
            }
        }
    }

    private void ri(Canvas canvas, com.bytedance.adsdk.lr.ik.lr lrVar, int i, float f) {
        PointF pointF = lrVar.f17996co;
        PointF pointF2 = lrVar.aw;
        float fRi = com.bytedance.adsdk.lr.di.di.ri();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = (i * lrVar.di * fRi) + (pointF == null ? 0.0f : (lrVar.di * 0.6f * fRi) + pointF.y);
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int i2 = AnonymousClass3.ri[lrVar.ka.ordinal()];
        if (i2 == 1) {
            canvas.translate(f4, f3);
        } else if (i2 == 2) {
            canvas.translate((f4 + f2) - f, f3);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((f4 + (f2 / 2.0f)) - (f / 2.0f), f3);
        }
    }

    private Typeface ri(com.bytedance.adsdk.lr.ik.ik ikVar) {
        Typeface typefaceXha;
        com.bytedance.adsdk.lr.ri.lr.ri<Typeface, Typeface> riVar = this.igq;
        if (riVar != null && (typefaceXha = riVar.xha()) != null) {
            return typefaceXha;
        }
        Typeface typefaceRi = this.slm.ri(ikVar);
        return typefaceRi != null ? typefaceRi : ikVar.ka();
    }

    private List<String> ri(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void ri(String str, com.bytedance.adsdk.lr.ik.lr lrVar, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strRi = ri(str, length);
            length += strRi.length();
            ri(strRi, lrVar, canvas);
            canvas.translate(this.qt.measureText(strRi) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private List<ri> ri(String str, float f, com.bytedance.adsdk.lr.ik.ik ikVar, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                com.bytedance.adsdk.lr.ik.ka kaVar = this.bu.bgr().get(com.bytedance.adsdk.lr.ik.ka.ri(cCharAt, ikVar.ri(), ikVar.ik()));
                if (kaVar != null) {
                    fMeasureText = ((float) kaVar.lr()) * f2 * com.bytedance.adsdk.lr.di.di.ri();
                }
            } else {
                fMeasureText = this.qt.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= f && cCharAt != ' ') {
                i++;
                ri riVarLr = lr(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    riVarLr.ri(strTrim, (f4 - f7) - ((strTrim.length() - strSubstring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    riVarLr.ri(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i++;
            lr(i).ri(str.substring(i2), f4);
        }
        return this.bgr.subList(0, i);
    }

    private void ri(com.bytedance.adsdk.lr.ik.ka kaVar, float f, com.bytedance.adsdk.lr.ik.lr lrVar, Canvas canvas) {
        List<com.bytedance.adsdk.lr.ri.ri.ka> listRi = ri(kaVar);
        for (int i = 0; i < listRi.size(); i++) {
            Path pathKa = listRi.get(i).ka();
            pathKa.computeBounds(this.mj, false);
            this.jbs.reset();
            this.jbs.preTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-lrVar.xha) * com.bytedance.adsdk.lr.di.di.ri());
            this.jbs.preScale(f, f);
            pathKa.transform(this.jbs);
            if (lrVar.sf) {
                ri(pathKa, this.qt, canvas);
                ri(pathKa, this.sf, canvas);
            } else {
                ri(pathKa, this.sf, canvas);
                ri(pathKa, this.qt, canvas);
            }
        }
    }

    private void ri(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void ri(String str, com.bytedance.adsdk.lr.ik.lr lrVar, Canvas canvas) {
        if (lrVar.sf) {
            ri(str, this.qt, canvas);
            ri(str, this.sf, canvas);
        } else {
            ri(str, this.sf, canvas);
            ri(str, this.qt, canvas);
        }
    }

    private void ri(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawText(str, 0, str.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
    }

    private List<com.bytedance.adsdk.lr.ri.ri.ka> ri(com.bytedance.adsdk.lr.ik.ka kaVar) {
        if (this.f17991co.containsKey(kaVar)) {
            return this.f17991co.get(kaVar);
        }
        List<slm> listRi = kaVar.ri();
        int size = listRi.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.lr.ri.ri.ka(this.slm, this, listRi.get(i), this.bu));
        }
        this.f17991co.put(kaVar, arrayList);
        return arrayList;
    }

    private String ri(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!ik(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.aw.indexOfKey(j) >= 0) {
            return this.aw.get(j);
        }
        this.xha.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.xha.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.xha.toString();
        this.aw.put(j, string);
        return string;
    }
}
