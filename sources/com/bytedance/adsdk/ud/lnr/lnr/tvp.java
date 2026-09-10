package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.ud.aaj;
import com.bytedance.adsdk.ud.lnr.qdl.rq;
import com.bytedance.adsdk.ud.lnr.ud.jtx;
import com.bytedance.adsdk.ud.qdl.ud.bjy;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends com.bytedance.adsdk.ud.lnr.lnr.qdl {
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> aaj;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> bch;
    private final bjy bjy;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Typeface, Typeface> bqt;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> exc;
    private final LongSparseArray<String> exu;
    private final Map<com.bytedance.adsdk.ud.lnr.mml, List<com.bytedance.adsdk.ud.qdl.qdl.mml>> fs;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> jl;
    private final RectF jpc;
    private final com.bytedance.adsdk.ud.tvp jtx;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> jyq;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> ljh;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> oth;
    private final List<qdl> rdp;
    private final Paint rq;
    private final Paint to;
    private final Matrix tvp;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> uw;
    private final StringBuilder wd;
    private com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> xmv;
    private final com.bytedance.adsdk.ud.wd yt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.lnr.lnr.tvp$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ud.lnr.ud.qdl.values().length];
            qdl = iArr;
            try {
                iArr[com.bytedance.adsdk.ud.lnr.ud.qdl.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[com.bytedance.adsdk.ud.lnr.ud.qdl.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[com.bytedance.adsdk.ud.lnr.ud.qdl.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class qdl {
        private String qdl;
        private float ud;

        private qdl() {
            this.qdl = "";
            this.ud = 0.0f;
        }

        public void qdl(String str, float f) {
            this.qdl = str;
            this.ud = f;
        }
    }

    public tvp(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar) {
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar2;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar;
        com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar2;
        super(tvpVar, mzzVar);
        this.wd = new StringBuilder(2);
        this.jpc = new RectF();
        this.tvp = new Matrix();
        int i2 = 1;
        this.to = new Paint(i2) { // from class: com.bytedance.adsdk.ud.lnr.lnr.tvp.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.rq = new Paint(i2) { // from class: com.bytedance.adsdk.ud.lnr.lnr.tvp.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.fs = new HashMap();
        this.exu = new LongSparseArray<>();
        this.rdp = new ArrayList();
        this.jtx = tvpVar;
        this.yt = mzzVar.qdl();
        bjy bjyVarQdl = mzzVar.exc().qdl();
        this.bjy = bjyVarQdl;
        bjyVarQdl.qdl(this);
        qdl(bjyVarQdl);
        rq rqVarAaj = mzzVar.aaj();
        if (rqVarAaj != null && (qdlVar2 = rqVarAaj.qdl) != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl = qdlVar2.qdl();
            this.jl = qdlVarQdl;
            qdlVarQdl.qdl(this);
            qdl(this.jl);
        }
        if (rqVarAaj != null && (qdlVar = rqVarAaj.ud) != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVarQdl2 = qdlVar.qdl();
            this.aaj = qdlVarQdl2;
            qdlVarQdl2.qdl(this);
            qdl(this.aaj);
        }
        if (rqVarAaj != null && (udVar2 = rqVarAaj.lnr) != null) {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = udVar2.qdl();
            this.oth = qdlVarQdl3;
            qdlVarQdl3.qdl(this);
            qdl(this.oth);
        }
        if (rqVarAaj == null || (udVar = rqVarAaj.mml) == null) {
            return;
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl4 = udVar.qdl();
        this.bch = qdlVarQdl4;
        qdlVarQdl4.qdl(this);
        qdl(this.bch);
    }

    private boolean lnr(int i2) {
        return Character.getType(i2) == 16 || Character.getType(i2) == 27 || Character.getType(i2) == 6 || Character.getType(i2) == 28 || Character.getType(i2) == 8 || Character.getType(i2) == 19;
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z2) {
        super.qdl(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, this.yt.mml().width(), this.yt.mml().height());
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i2) {
        super.ud(canvas, matrix, i2);
        com.bytedance.adsdk.ud.lnr.ud udVarWd = this.bjy.wd();
        com.bytedance.adsdk.ud.lnr.lnr lnrVar = this.yt.bjy().get(udVarWd.ud);
        if (lnrVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        qdl(udVarWd, matrix);
        if (this.jtx.uw()) {
            qdl(udVarWd, matrix, lnrVar, canvas);
        } else {
            qdl(udVarWd, lnrVar, canvas);
        }
        canvas.restore();
    }

    private void qdl(com.bytedance.adsdk.ud.lnr.ud udVar, Matrix matrix) {
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar = this.exc;
        if (qdlVar != null) {
            this.to.setColor(qdlVar.wd().intValue());
        } else {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar2 = this.jl;
            if (qdlVar2 != null) {
                this.to.setColor(qdlVar2.wd().intValue());
            } else {
                this.to.setColor(udVar.jpc);
            }
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar3 = this.jyq;
        if (qdlVar3 != null) {
            this.rq.setColor(qdlVar3.wd().intValue());
        } else {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Integer, Integer> qdlVar4 = this.aaj;
            if (qdlVar4 != null) {
                this.rq.setColor(qdlVar4.wd().intValue());
            } else {
                this.rq.setColor(udVar.tvp);
            }
        }
        int iIntValue = ((this.mml.qdl() == null ? 100 : this.mml.qdl().wd().intValue()) * 255) / 100;
        this.to.setAlpha(iIntValue);
        this.rq.setAlpha(iIntValue);
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar5 = this.ljh;
        if (qdlVar5 != null) {
            this.rq.setStrokeWidth(qdlVar5.wd().floatValue());
            return;
        }
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar6 = this.oth;
        if (qdlVar6 != null) {
            this.rq.setStrokeWidth(qdlVar6.wd().floatValue());
        } else {
            this.rq.setStrokeWidth(com.bytedance.adsdk.ud.mo.mo.qdl() * udVar.to);
        }
    }

    private qdl ud(int i2) {
        for (int size = this.rdp.size(); size < i2; size++) {
            this.rdp.add(new qdl());
        }
        return this.rdp.get(i2 - 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[LOOP:1: B:21:0x0069->B:23:0x006f, LOOP_END] */
    private void qdl(com.bytedance.adsdk.ud.lnr.ud udVar, Matrix matrix, com.bytedance.adsdk.ud.lnr.lnr lnrVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float f;
        int i2;
        int i3;
        PointF pointF;
        float f2;
        List<qdl> listQdl;
        int i4;
        tvp tvpVar = this;
        com.bytedance.adsdk.ud.lnr.ud udVar2 = udVar;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar = tvpVar.xmv;
        if (qdlVar != null) {
            fFloatValue = qdlVar.wd().floatValue();
        } else {
            fFloatValue = udVar2.lnr;
        }
        float f3 = fFloatValue / 100.0f;
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl(matrix);
        List<String> listQdl2 = tvpVar.qdl(udVar2.qdl);
        int size = listQdl2.size();
        float f4 = udVar2.mzz / 10.0f;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar2 = tvpVar.uw;
        if (qdlVar2 != null) {
            fFloatValue2 = qdlVar2.wd().floatValue();
        } else {
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar3 = tvpVar.bch;
            if (qdlVar3 != null) {
                fFloatValue2 = qdlVar3.wd().floatValue();
            }
            f = f4;
            i2 = -1;
            i3 = 0;
            while (i3 < size) {
                String str = listQdl2.get(i3);
                pointF = udVar2.exu;
                if (pointF == null) {
                    f2 = 0.0f;
                } else {
                    f2 = pointF.x;
                }
                listQdl = tvpVar.qdl(str, f2, lnrVar, f3, f, true);
                i4 = 0;
                while (i4 < listQdl.size()) {
                    qdl qdlVar4 = listQdl.get(i4);
                    i2++;
                    canvas.save();
                    tvpVar.qdl(canvas, udVar2, i2, qdlVar4.ud);
                    float f5 = f3;
                    com.bytedance.adsdk.ud.lnr.ud udVar3 = udVar2;
                    float f6 = f;
                    tvpVar.qdl(qdlVar4.qdl, udVar3, lnrVar, canvas, fQdl, f5, f6);
                    f3 = f5;
                    canvas.restore();
                    i4++;
                    tvpVar = this;
                    f = f6;
                    udVar2 = udVar;
                }
                i3++;
                tvpVar = this;
                f = f;
                udVar2 = udVar;
            }
        }
        f4 += fFloatValue2;
        f = f4;
        i2 = -1;
        i3 = 0;
        while (i3 < size) {
            String str2 = listQdl2.get(i3);
            pointF = udVar2.exu;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
            }
            listQdl = tvpVar.qdl(str2, f2, lnrVar, f3, f, true);
            i4 = 0;
            while (i4 < listQdl.size()) {
                qdl qdlVar5 = listQdl.get(i4);
                i2++;
                canvas.save();
                tvpVar.qdl(canvas, udVar2, i2, qdlVar5.ud);
                float f7 = f3;
                com.bytedance.adsdk.ud.lnr.ud udVar4 = udVar2;
                float f8 = f;
                tvpVar.qdl(qdlVar5.qdl, udVar4, lnrVar, canvas, fQdl, f7, f8);
                f3 = f7;
                canvas.restore();
                i4++;
                tvpVar = this;
                f = f8;
                udVar2 = udVar;
            }
            i3++;
            tvpVar = this;
            f = f;
            udVar2 = udVar;
        }
    }

    private void qdl(String str, com.bytedance.adsdk.ud.lnr.ud udVar, com.bytedance.adsdk.ud.lnr.lnr lnrVar, Canvas canvas, float f, float f2, float f3) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            com.bytedance.adsdk.ud.lnr.mml mmlVar = this.yt.rdp().get(com.bytedance.adsdk.ud.lnr.mml.qdl(str.charAt(i2), lnrVar.qdl(), lnrVar.lnr()));
            if (mmlVar != null) {
                qdl(mmlVar, f2, udVar, canvas);
                canvas.translate((com.bytedance.adsdk.ud.mo.mo.qdl() * ((float) mmlVar.ud()) * f2) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[LOOP:1: B:27:0x00a7->B:29:0x00ad, LOOP_END] */
    private void qdl(com.bytedance.adsdk.ud.lnr.ud udVar, com.bytedance.adsdk.ud.lnr.lnr lnrVar, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fQdl;
        List<String> listQdl;
        int size;
        int i2;
        int i3;
        PointF pointF;
        float f;
        List<qdl> listQdl2;
        int i4;
        Typeface typefaceQdl = qdl(lnrVar);
        if (typefaceQdl != null) {
            String strUd = udVar.qdl;
            aaj aajVarBch = this.jtx.bch();
            if (aajVarBch != null) {
                strUd = aajVarBch.ud(tvp(), strUd);
            }
            this.to.setTypeface(typefaceQdl);
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar = this.xmv;
            if (qdlVar != null) {
                fFloatValue = qdlVar.wd().floatValue();
            } else {
                fFloatValue = udVar.lnr;
            }
            this.to.setTextSize(com.bytedance.adsdk.ud.mo.mo.qdl() * fFloatValue);
            this.rq.setTypeface(this.to.getTypeface());
            this.rq.setTextSize(this.to.getTextSize());
            float f2 = udVar.mzz / 10.0f;
            com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar2 = this.uw;
            if (qdlVar2 != null) {
                fFloatValue2 = qdlVar2.wd().floatValue();
            } else {
                com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVar3 = this.bch;
                if (qdlVar3 != null) {
                    fFloatValue2 = qdlVar3.wd().floatValue();
                }
                fQdl = ((com.bytedance.adsdk.ud.mo.mo.qdl() * f2) * fFloatValue) / 100.0f;
                listQdl = qdl(strUd);
                size = listQdl.size();
                i2 = -1;
                i3 = 0;
                while (i3 < size) {
                    String str = listQdl.get(i3);
                    pointF = udVar.exu;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    com.bytedance.adsdk.ud.lnr.lnr lnrVar2 = lnrVar;
                    listQdl2 = qdl(str, f, lnrVar2, 0.0f, fQdl, false);
                    for (i4 = 0; i4 < listQdl2.size(); i4++) {
                        qdl qdlVar4 = listQdl2.get(i4);
                        i2++;
                        canvas.save();
                        qdl(canvas, udVar, i2, qdlVar4.ud);
                        qdl(qdlVar4.qdl, udVar, canvas, fQdl);
                        canvas.restore();
                    }
                    i3++;
                    lnrVar = lnrVar2;
                }
            }
            f2 += fFloatValue2;
            fQdl = ((com.bytedance.adsdk.ud.mo.mo.qdl() * f2) * fFloatValue) / 100.0f;
            listQdl = qdl(strUd);
            size = listQdl.size();
            i2 = -1;
            i3 = 0;
            while (i3 < size) {
                String str2 = listQdl.get(i3);
                pointF = udVar.exu;
                if (pointF == null) {
                    f = 0.0f;
                } else {
                    f = pointF.x;
                }
                com.bytedance.adsdk.ud.lnr.lnr lnrVar3 = lnrVar;
                listQdl2 = qdl(str2, f, lnrVar3, 0.0f, fQdl, false);
                while (i4 < listQdl2.size()) {
                    qdl qdlVar5 = listQdl2.get(i4);
                    i2++;
                    canvas.save();
                    qdl(canvas, udVar, i2, qdlVar5.ud);
                    qdl(qdlVar5.qdl, udVar, canvas, fQdl);
                    canvas.restore();
                }
                i3++;
                lnrVar = lnrVar3;
            }
        }
    }

    private void qdl(Canvas canvas, com.bytedance.adsdk.ud.lnr.ud udVar, int i2, float f) {
        PointF pointF = udVar.fs;
        PointF pointF2 = udVar.exu;
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        float f2 = (i2 * udVar.mo * fQdl) + (pointF == null ? 0.0f : (udVar.mo * 0.6f * fQdl) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i3 = AnonymousClass3.qdl[udVar.mml.ordinal()];
        if (i3 == 1) {
            canvas.translate(f3, f2);
        } else if (i3 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i3 != 3) {
                return;
            }
            canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        }
    }

    private Typeface qdl(com.bytedance.adsdk.ud.lnr.lnr lnrVar) {
        Typeface typefaceWd;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Typeface, Typeface> qdlVar = this.bqt;
        if (qdlVar != null && (typefaceWd = qdlVar.wd()) != null) {
            return typefaceWd;
        }
        Typeface typefaceQdl = this.jtx.qdl(lnrVar);
        return typefaceQdl != null ? typefaceQdl : lnrVar.mml();
    }

    private List<String> qdl(String str) {
        return Arrays.asList(str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll("\u0003", "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
    }

    private void qdl(String str, com.bytedance.adsdk.ud.lnr.ud udVar, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strQdl = qdl(str, length);
            length += strQdl.length();
            qdl(strQdl, udVar, canvas);
            canvas.translate(this.to.measureText(strQdl) + f, 0.0f);
        }
    }

    private List<qdl> qdl(String str, float f, com.bytedance.adsdk.ud.lnr.lnr lnrVar, float f2, float f3, boolean z2) {
        float fMeasureText;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (z2) {
                com.bytedance.adsdk.ud.lnr.mml mmlVar = this.yt.rdp().get(com.bytedance.adsdk.ud.lnr.mml.qdl(cCharAt, lnrVar.qdl(), lnrVar.lnr()));
                if (mmlVar != null) {
                    fMeasureText = (com.bytedance.adsdk.ud.mo.mo.qdl() * ((float) mmlVar.ud()) * f2) + f3;
                }
            } else {
                fMeasureText = this.to.measureText(str.substring(i5, i5 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z3 = true;
                f6 = fMeasureText;
            } else if (z3) {
                z3 = false;
                i4 = i5;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i2++;
                qdl qdlVarUd = ud(i2);
                if (i4 == i3) {
                    String strSubstring = str.substring(i3, i5);
                    String strTrim = strSubstring.trim();
                    qdlVarUd.qdl(strTrim, (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6));
                    i3 = i5;
                    i4 = i3;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i3, i4 - 1);
                    String strTrim2 = strSubstring2.trim();
                    qdlVarUd.qdl(strTrim2, ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6);
                    f4 = f5;
                    i3 = i4;
                }
            }
        }
        if (f4 > 0.0f) {
            i2++;
            ud(i2).qdl(str.substring(i3), f4);
        }
        return this.rdp.subList(0, i2);
    }

    private void qdl(com.bytedance.adsdk.ud.lnr.mml mmlVar, float f, com.bytedance.adsdk.ud.lnr.ud udVar, Canvas canvas) {
        List<com.bytedance.adsdk.ud.qdl.qdl.mml> listQdl = qdl(mmlVar);
        for (int i2 = 0; i2 < listQdl.size(); i2++) {
            Path pathMml = listQdl.get(i2).mml();
            pathMml.computeBounds(this.jpc, false);
            this.tvp.reset();
            this.tvp.preTranslate(0.0f, com.bytedance.adsdk.ud.mo.mo.qdl() * (-udVar.wd));
            this.tvp.preScale(f, f);
            pathMml.transform(this.tvp);
            if (udVar.rq) {
                qdl(pathMml, this.to, canvas);
                qdl(pathMml, this.rq, canvas);
            } else {
                qdl(pathMml, this.rq, canvas);
                qdl(pathMml, this.to, canvas);
            }
        }
    }

    private void qdl(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void qdl(String str, com.bytedance.adsdk.ud.lnr.ud udVar, Canvas canvas) {
        if (udVar.rq) {
            qdl(str, this.to, canvas);
            qdl(str, this.rq, canvas);
        } else {
            qdl(str, this.rq, canvas);
            qdl(str, this.to, canvas);
        }
    }

    private void qdl(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.ud.qdl.qdl.mml> qdl(com.bytedance.adsdk.ud.lnr.mml mmlVar) {
        if (this.fs.containsKey(mmlVar)) {
            return this.fs.get(mmlVar);
        }
        List<jtx> listQdl = mmlVar.qdl();
        int size = listQdl.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new com.bytedance.adsdk.ud.qdl.qdl.mml(this.jtx, this, listQdl.get(i2), this.yt));
        }
        this.fs.put(mmlVar, arrayList);
        return arrayList;
    }

    private String qdl(String str, int i2) {
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!lnr(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.exu.indexOfKey(j) >= 0) {
            return this.exu.get(j);
        }
        this.wd.setLength(0);
        while (i2 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i2);
            this.wd.appendCodePoint(iCodePointAt3);
            i2 += Character.charCount(iCodePointAt3);
        }
        String string = this.wd.toString();
        this.exu.put(j, string);
        return string;
    }
}
