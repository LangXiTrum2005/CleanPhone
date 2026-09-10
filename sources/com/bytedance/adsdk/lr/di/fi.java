package com.bytedance.adsdk.lr.di;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lr.ik.lr.bgr;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static final PointF ri = new PointF();

    public static boolean ik(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    private static int lr(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static float ri(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int ri(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static float lr(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static PointF ri(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void ri(bgr bgrVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFRi = bgrVar.ri();
        path.moveTo(pointFRi.x, pointFRi.y);
        ri.set(pointFRi.x, pointFRi.y);
        int i = 0;
        while (i < bgrVar.ik().size()) {
            com.bytedance.adsdk.lr.ik.ri riVar = bgrVar.ik().get(i);
            PointF pointFRi2 = riVar.ri();
            PointF pointFLr = riVar.lr();
            PointF pointFIk = riVar.ik();
            PointF pointF = ri;
            if (pointFRi2.equals(pointF) && pointFLr.equals(pointFIk)) {
                path.lineTo(pointFIk.x, pointFIk.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFRi2.x, pointFRi2.y, pointFLr.x, pointFLr.y, pointFIk.x, pointFIk.y);
            }
            pointF.set(pointFIk.x, pointFIk.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (bgrVar.lr()) {
            path3.close();
        }
    }

    public static int ri(float f, float f2) {
        return ri((int) f, (int) f2);
    }

    private static int ri(int i, int i2) {
        return i - (i2 * lr(i, i2));
    }

    public static int ri(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
