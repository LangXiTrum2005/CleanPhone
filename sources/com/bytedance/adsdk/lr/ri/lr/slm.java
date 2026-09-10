package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class slm {
    private ri<?, Float> aw;
    private ri<?, Float> bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ka f17999co;
    private ri<PointF, PointF> di;
    private final float[] fi;
    private final Matrix ik;
    private ri<Float, Float> jbs;
    private final Matrix ka;
    private final Matrix lr;
    private ri<com.bytedance.adsdk.lr.xha.ik, com.bytedance.adsdk.lr.xha.ik> mj;
    private ri<Integer, Integer> qt;
    private final Matrix ri = new Matrix();
    private ka sf;
    private ri<?, PointF> xha;

    public slm(com.bytedance.adsdk.lr.ik.ri.co coVar) {
        this.di = coVar.ri() == null ? null : coVar.ri().ri();
        this.xha = coVar.lr() == null ? null : coVar.lr().ri();
        this.mj = coVar.ik() == null ? null : coVar.ik().ri();
        this.jbs = coVar.ka() == null ? null : coVar.ka().ri();
        ka kaVar = coVar.mj() == null ? null : (ka) coVar.mj().ri();
        this.sf = kaVar;
        if (kaVar != null) {
            this.lr = new Matrix();
            this.ik = new Matrix();
            this.ka = new Matrix();
            this.fi = new float[9];
        } else {
            this.lr = null;
            this.ik = null;
            this.ka = null;
            this.fi = null;
        }
        this.f17999co = coVar.jbs() == null ? null : (ka) coVar.jbs().ri();
        if (coVar.fi() != null) {
            this.qt = coVar.fi().ri();
        }
        if (coVar.di() != null) {
            this.aw = coVar.di().ri();
        } else {
            this.aw = null;
        }
        if (coVar.xha() != null) {
            this.bgr = coVar.xha().ri();
        } else {
            this.bgr = null;
        }
    }

    private void fi() {
        for (int i = 0; i < 9; i++) {
            this.fi[i] = 0.0f;
        }
    }

    public ri<?, Float> ik() {
        return this.bgr;
    }

    public Matrix ka() {
        PointF pointFXha;
        PointF pointFXha2;
        this.ri.reset();
        ri<?, PointF> riVar = this.xha;
        if (riVar != null && (pointFXha2 = riVar.xha()) != null) {
            float f = pointFXha2.x;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFXha2.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.ri.preTranslate(f, pointFXha2.y);
            }
        }
        ri<Float, Float> riVar2 = this.jbs;
        if (riVar2 != null) {
            float fFloatValue = riVar2 instanceof bu ? riVar2.xha().floatValue() : ((ka) riVar2).jbs();
            if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.ri.preRotate(fFloatValue);
            }
        }
        ka kaVar = this.sf;
        if (kaVar != null) {
            ka kaVar2 = this.f17999co;
            float fCos = kaVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-kaVar2.jbs()) + 90.0f));
            ka kaVar3 = this.f17999co;
            float fSin = kaVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-kaVar3.jbs()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(kaVar.jbs()));
            fi();
            float[] fArr = this.fi;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.lr.setValues(fArr);
            fi();
            float[] fArr2 = this.fi;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.ik.setValues(fArr2);
            fi();
            float[] fArr3 = this.fi;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.ka.setValues(fArr3);
            this.ik.preConcat(this.lr);
            this.ka.preConcat(this.ik);
            this.ri.preConcat(this.ka);
        }
        ri<com.bytedance.adsdk.lr.xha.ik, com.bytedance.adsdk.lr.xha.ik> riVar3 = this.mj;
        if (riVar3 != null) {
            com.bytedance.adsdk.lr.xha.ik ikVarXha = riVar3.xha();
            if (ikVarXha.ri() != 1.0f || ikVarXha.lr() != 1.0f) {
                this.ri.preScale(ikVarXha.ri(), ikVarXha.lr());
            }
        }
        ri<PointF, PointF> riVar4 = this.di;
        if (riVar4 != null && (((pointFXha = riVar4.xha()) != null && pointFXha.x != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || pointFXha.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.ri.preTranslate(-pointFXha.x, -pointFXha.y);
        }
        return this.ri;
    }

    public ri<?, Float> lr() {
        return this.aw;
    }

    public void ri(com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        riVar.ri(this.qt);
        riVar.ri(this.aw);
        riVar.ri(this.bgr);
        riVar.ri(this.di);
        riVar.ri(this.xha);
        riVar.ri(this.mj);
        riVar.ri(this.jbs);
        riVar.ri(this.sf);
        riVar.ri(this.f17999co);
    }

    public Matrix lr(float f) {
        ri<?, PointF> riVar = this.xha;
        PointF pointFXha = riVar == null ? null : riVar.xha();
        ri<com.bytedance.adsdk.lr.xha.ik, com.bytedance.adsdk.lr.xha.ik> riVar2 = this.mj;
        com.bytedance.adsdk.lr.xha.ik ikVarXha = riVar2 == null ? null : riVar2.xha();
        this.ri.reset();
        if (pointFXha != null) {
            this.ri.preTranslate(pointFXha.x * f, pointFXha.y * f);
        }
        if (ikVarXha != null) {
            double d = f;
            this.ri.preScale((float) Math.pow(ikVarXha.ri(), d), (float) Math.pow(ikVarXha.lr(), d));
        }
        ri<Float, Float> riVar3 = this.jbs;
        if (riVar3 != null) {
            float fFloatValue = riVar3.xha().floatValue();
            ri<PointF, PointF> riVar4 = this.di;
            PointF pointFXha2 = riVar4 != null ? riVar4.xha() : null;
            Matrix matrix = this.ri;
            float f2 = fFloatValue * f;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f4 = pointFXha2 == null ? 0.0f : pointFXha2.x;
            if (pointFXha2 != null) {
                f3 = pointFXha2.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.ri;
    }

    public void ri(ri.InterfaceC0185ri interfaceC0185ri) {
        ri<Integer, Integer> riVar = this.qt;
        if (riVar != null) {
            riVar.ri(interfaceC0185ri);
        }
        ri<?, Float> riVar2 = this.aw;
        if (riVar2 != null) {
            riVar2.ri(interfaceC0185ri);
        }
        ri<?, Float> riVar3 = this.bgr;
        if (riVar3 != null) {
            riVar3.ri(interfaceC0185ri);
        }
        ri<PointF, PointF> riVar4 = this.di;
        if (riVar4 != null) {
            riVar4.ri(interfaceC0185ri);
        }
        ri<?, PointF> riVar5 = this.xha;
        if (riVar5 != null) {
            riVar5.ri(interfaceC0185ri);
        }
        ri<com.bytedance.adsdk.lr.xha.ik, com.bytedance.adsdk.lr.xha.ik> riVar6 = this.mj;
        if (riVar6 != null) {
            riVar6.ri(interfaceC0185ri);
        }
        ri<Float, Float> riVar7 = this.jbs;
        if (riVar7 != null) {
            riVar7.ri(interfaceC0185ri);
        }
        ka kaVar = this.sf;
        if (kaVar != null) {
            kaVar.ri(interfaceC0185ri);
        }
        ka kaVar2 = this.f17999co;
        if (kaVar2 != null) {
            kaVar2.ri(interfaceC0185ri);
        }
    }

    public void ri(float f) {
        ri<Integer, Integer> riVar = this.qt;
        if (riVar != null) {
            riVar.ri(f);
        }
        ri<?, Float> riVar2 = this.aw;
        if (riVar2 != null) {
            riVar2.ri(f);
        }
        ri<?, Float> riVar3 = this.bgr;
        if (riVar3 != null) {
            riVar3.ri(f);
        }
        ri<PointF, PointF> riVar4 = this.di;
        if (riVar4 != null) {
            riVar4.ri(f);
        }
        ri<?, PointF> riVar5 = this.xha;
        if (riVar5 != null) {
            riVar5.ri(f);
        }
        ri<com.bytedance.adsdk.lr.xha.ik, com.bytedance.adsdk.lr.xha.ik> riVar6 = this.mj;
        if (riVar6 != null) {
            riVar6.ri(f);
        }
        ri<Float, Float> riVar7 = this.jbs;
        if (riVar7 != null) {
            riVar7.ri(f);
        }
        ka kaVar = this.sf;
        if (kaVar != null) {
            kaVar.ri(f);
        }
        ka kaVar2 = this.f17999co;
        if (kaVar2 != null) {
            kaVar2.ri(f);
        }
    }

    public ri<?, Integer> ri() {
        return this.qt;
    }
}
