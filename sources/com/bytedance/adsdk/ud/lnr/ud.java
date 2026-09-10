package com.bytedance.adsdk.ud.lnr;

import android.graphics.PointF;
import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public PointF exu;
    public PointF fs;
    public int jpc;
    public float lnr;
    public qdl mml;
    public float mo;
    public int mzz;
    public String qdl;
    public boolean rq;
    public float to;
    public int tvp;
    public String ud;
    public float wd;

    public enum qdl {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public ud(String str, String str2, float f, qdl qdlVar, int i2, float f2, float f3, int i3, int i4, float f4, boolean z2, PointF pointF, PointF pointF2) {
        qdl(str, str2, f, qdlVar, i2, f2, f3, i3, i4, f4, z2, pointF, pointF2);
    }

    public int hashCode() {
        int iOrdinal = ((this.mml.ordinal() + (((int) (a.b(this.ud, this.qdl.hashCode() * 31, 31) + this.lnr)) * 31)) * 31) + this.mzz;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.mo);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.jpc;
    }

    public void qdl(String str, String str2, float f, qdl qdlVar, int i2, float f2, float f3, int i3, int i4, float f4, boolean z2, PointF pointF, PointF pointF2) {
        this.qdl = str;
        this.ud = str2;
        this.lnr = f;
        this.mml = qdlVar;
        this.mzz = i2;
        this.mo = f2;
        this.wd = f3;
        this.jpc = i3;
        this.tvp = i4;
        this.to = f4;
        this.rq = z2;
        this.fs = pointF;
        this.exu = pointF2;
    }

    public ud() {
    }
}
