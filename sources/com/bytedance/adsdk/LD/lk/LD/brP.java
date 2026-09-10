package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.Paint;
import com.bytedance.adsdk.LD.Lxb.Lxb.DY;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class brP implements lk {
    private final com.bytedance.adsdk.LD.lk.Lxb.ZU JXs;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD LD;
    private final String Lxb;
    private final LD OY;
    private final float QAg;
    private final com.bytedance.adsdk.LD.lk.Lxb.Lxb ZU;
    private final Lxb ebl;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD lc;
    private final List<com.bytedance.adsdk.LD.lk.Lxb.LD> lk;
    private final boolean nBu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.lk.LD.brP$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] LD;
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[LD.values().length];
            LD = iArr;
            try {
                iArr[LD.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LD[LD.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LD[LD.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Lxb.values().length];
            Lxb = iArr2;
            try {
                iArr2[Lxb.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lxb[Lxb.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lxb[Lxb.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LD {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join Lxb() {
            int i = AnonymousClass1.LD[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public enum Lxb {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap Lxb() {
            int i = AnonymousClass1.Lxb[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public brP(String str, com.bytedance.adsdk.LD.lk.Lxb.LD ld, List<com.bytedance.adsdk.LD.lk.Lxb.LD> list, com.bytedance.adsdk.LD.lk.Lxb.Lxb lxb, com.bytedance.adsdk.LD.lk.Lxb.ZU zu, com.bytedance.adsdk.LD.lk.Lxb.LD ld2, Lxb lxb2, LD ld3, float f, boolean z) {
        this.Lxb = str;
        this.LD = ld;
        this.lk = list;
        this.ZU = lxb;
        this.JXs = zu;
        this.lc = ld2;
        this.ebl = lxb2;
        this.OY = ld3;
        this.QAg = f;
        this.nBu = z;
    }

    public List<com.bytedance.adsdk.LD.lk.Lxb.LD> JXs() {
        return this.lk;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.Lxb LD() {
        return this.ZU;
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new DY(qAg, lxb, this);
    }

    public LD OY() {
        return this.OY;
    }

    public float QAg() {
        return this.QAg;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD ZU() {
        return this.lc;
    }

    public Lxb ebl() {
        return this.ebl;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD lc() {
        return this.LD;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.ZU lk() {
        return this.JXs;
    }

    public boolean nBu() {
        return this.nBu;
    }

    public String Lxb() {
        return this.Lxb;
    }
}
