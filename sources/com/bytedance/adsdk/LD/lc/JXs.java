package com.bytedance.adsdk.LD.lc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.LD.lk.LD.STP;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.google.android.material.color.utilities.Contrast;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class JXs {
    private static final PointF Lxb = new PointF();

    private static int LD(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int Lxb(int i, int i2, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        return (int) ((f * (i2 - i)) + i);
    }

    public static boolean lk(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF Lxb(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float LD(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void Lxb(STP stp, Path path) {
        path.reset();
        PointF pointFLxb = stp.Lxb();
        path.moveTo(pointFLxb.x, pointFLxb.y);
        Lxb.set(pointFLxb.x, pointFLxb.y);
        for (int i = 0; i < stp.lk().size(); i++) {
            com.bytedance.adsdk.LD.lk.Lxb lxb = stp.lk().get(i);
            PointF pointFLxb2 = lxb.Lxb();
            PointF pointFLD = lxb.LD();
            PointF pointFLk = lxb.lk();
            PointF pointF = Lxb;
            if (pointFLxb2.equals(pointF) && pointFLD.equals(pointFLk)) {
                path.lineTo(pointFLk.x, pointFLk.y);
            } else {
                path.cubicTo(pointFLxb2.x, pointFLxb2.y, pointFLD.x, pointFLD.y, pointFLk.x, pointFLk.y);
            }
            pointF.set(pointFLk.x, pointFLk.y);
        }
        if (stp.LD()) {
            path.close();
        }
    }

    public static float Lxb(float f, float f2, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f3) {
        return AbstractC5044xl.w(f2, f, f3, f);
    }

    public static int Lxb(float f, float f2) {
        return Lxb((int) f, (int) f2);
    }

    private static int Lxb(int i, int i2) {
        return i - (i2 * LD(i, i2));
    }

    public static int Lxb(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
