package com.bytedance.adsdk.ud.lnr.ud;

import android.graphics.Paint;
import com.bytedance.adsdk.ud.qdl.qdl.aaj;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jl implements lnr {
    private final ud jpc;
    private final List<com.bytedance.adsdk.ud.lnr.qdl.ud> lnr;
    private final com.bytedance.adsdk.ud.lnr.qdl.qdl mml;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud mo;
    private final com.bytedance.adsdk.ud.lnr.qdl.mml mzz;
    private final String qdl;
    private final boolean to;
    private final float tvp;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud ud;
    private final qdl wd;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.lnr.ud.jl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;
        static final /* synthetic */ int[] ud;

        static {
            int[] iArr = new int[ud.values().length];
            ud = iArr;
            try {
                iArr[ud.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ud[ud.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ud[ud.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[qdl.values().length];
            qdl = iArr2;
            try {
                iArr2[qdl.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[qdl.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                qdl[qdl.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum qdl {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap qdl() {
            int i2 = AnonymousClass1.qdl[ordinal()];
            if (i2 != 1) {
                return i2 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum ud {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join qdl() {
            int i2 = AnonymousClass1.ud[ordinal()];
            if (i2 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i2 == 2) {
                return Paint.Join.MITER;
            }
            if (i2 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public jl(String str, com.bytedance.adsdk.ud.lnr.qdl.ud udVar, List<com.bytedance.adsdk.ud.lnr.qdl.ud> list, com.bytedance.adsdk.ud.lnr.qdl.qdl qdlVar, com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, qdl qdlVar2, ud udVar3, float f, boolean z2) {
        this.qdl = str;
        this.ud = udVar;
        this.lnr = list;
        this.mml = qdlVar;
        this.mzz = mmlVar;
        this.mo = udVar2;
        this.wd = qdlVar2;
        this.jpc = udVar3;
        this.tvp = f;
        this.to = z2;
    }

    public ud jpc() {
        return this.jpc;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.mml lnr() {
        return this.mzz;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mml() {
        return this.mo;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud mo() {
        return this.ud;
    }

    public List<com.bytedance.adsdk.ud.lnr.qdl.ud> mzz() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new aaj(tvpVar, qdlVar, this);
    }

    public boolean to() {
        return this.to;
    }

    public float tvp() {
        return this.tvp;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.qdl ud() {
        return this.mml;
    }

    public qdl wd() {
        return this.wd;
    }

    public String qdl() {
        return this.qdl;
    }
}
