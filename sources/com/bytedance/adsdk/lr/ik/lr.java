package com.bytedance.adsdk.lr.ik;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public PointF aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public PointF f17996co;
    public float di;
    public int fi;
    public float ik;
    public int jbs;
    public ri ka;
    public String lr;
    public int mj;
    public float qt;
    public String ri;
    public boolean sf;
    public float xha;

    public enum ri {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public lr(String str, String str2, float f, ri riVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        ri(str, str2, f, riVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.ri.hashCode() * 31) + this.lr.hashCode()) * 31) + this.ik)) * 31) + this.ka.ordinal()) * 31) + this.fi;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.di);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.mj;
    }

    public void ri(String str, String str2, float f, ri riVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.ri = str;
        this.lr = str2;
        this.ik = f;
        this.ka = riVar;
        this.fi = i;
        this.di = f2;
        this.xha = f3;
        this.mj = i2;
        this.jbs = i3;
        this.qt = f4;
        this.sf = z;
        this.f17996co = pointF;
        this.aw = pointF2;
    }

    public lr() {
    }
}
