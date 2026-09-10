package com.bytedance.adsdk.LD.lk;

import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.component.sdk.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LD {
    public boolean JVA;
    public int JXs;
    public String LD;
    public String Lxb;
    public PointF NXR;

    @ColorInt
    public int OY;

    @ColorInt
    public int QAg;
    public Lxb ZU;
    public float ebl;
    public float lc;
    public float lk;
    public float nBu;
    public PointF sLN;

    public enum Lxb {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public LD(String str, String str2, float f, Lxb lxb, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        Lxb(str, str2, f, lxb, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public void Lxb(String str, String str2, float f, Lxb lxb, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.Lxb = str;
        this.LD = str2;
        this.lk = f;
        this.ZU = lxb;
        this.JXs = i;
        this.lc = f2;
        this.ebl = f3;
        this.OY = i2;
        this.QAg = i3;
        this.nBu = f4;
        this.JVA = z;
        this.sLN = pointF;
        this.NXR = pointF2;
    }

    public int hashCode() {
        int iOrdinal = ((this.ZU.ordinal() + (((int) (DM.d(this.LD, this.Lxb.hashCode() * 31, 31) + this.lk)) * 31)) * 31) + this.JXs;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lc);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.OY;
    }

    public LD() {
    }
}
