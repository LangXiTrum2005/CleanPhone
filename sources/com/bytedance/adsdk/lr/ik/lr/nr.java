package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.Paint;
import com.bytedance.adsdk.lr.ri.ri.ac;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nr implements ik {
    private final com.bytedance.adsdk.lr.ik.ri.lr di;
    private final com.bytedance.adsdk.lr.ik.ri.ka fi;
    private final List<com.bytedance.adsdk.lr.ik.ri.lr> ik;
    private final float jbs;
    private final com.bytedance.adsdk.lr.ik.ri.ri ka;
    private final com.bytedance.adsdk.lr.ik.ri.lr lr;
    private final lr mj;
    private final boolean qt;
    private final String ri;
    private final ri xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.nr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] lr;
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[lr.values().length];
            lr = iArr;
            try {
                iArr[lr.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lr[lr.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                lr[lr.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ri.values().length];
            ri = iArr2;
            try {
                iArr2[ri.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ri[ri.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ri[ri.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum lr {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join ri() {
            int i = AnonymousClass1.lr[ordinal()];
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

    public enum ri {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap ri() {
            int i = AnonymousClass1.ri[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public nr(String str, com.bytedance.adsdk.lr.ik.ri.lr lrVar, List<com.bytedance.adsdk.lr.ik.ri.lr> list, com.bytedance.adsdk.lr.ik.ri.ri riVar, com.bytedance.adsdk.lr.ik.ri.ka kaVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar2, ri riVar2, lr lrVar3, float f, boolean z) {
        this.ri = str;
        this.lr = lrVar;
        this.ik = list;
        this.ka = riVar;
        this.fi = kaVar;
        this.di = lrVar2;
        this.xha = riVar2;
        this.mj = lrVar3;
        this.jbs = f;
        this.qt = z;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr di() {
        return this.lr;
    }

    public List<com.bytedance.adsdk.lr.ik.ri.lr> fi() {
        return this.ik;
    }

    public com.bytedance.adsdk.lr.ik.ri.ka ik() {
        return this.fi;
    }

    public float jbs() {
        return this.jbs;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr ka() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.ik.ri.ri lr() {
        return this.ka;
    }

    public lr mj() {
        return this.mj;
    }

    public boolean qt() {
        return this.qt;
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new ac(jbsVar, riVar, this);
    }

    public ri xha() {
        return this.xha;
    }

    public String ri() {
        return this.ri;
    }
}
