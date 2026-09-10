package com.bytedance.adsdk.ud.mo;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.v4.media.a;
import com.bytedance.adsdk.ud.lnr.ud.rdp;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private static final PointF qdl = new PointF();

    public static boolean lnr(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static int qdl(int i2, int i3, float f) {
        return (int) ((f * (i3 - i2)) + i2);
    }

    private static int ud(int i2, int i3) {
        int i4 = i2 / i3;
        return (((i2 ^ i3) >= 0) || i2 % i3 == 0) ? i4 : i4 - 1;
    }

    public static PointF qdl(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void qdl(rdp rdpVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFQdl = rdpVar.qdl();
        path.moveTo(pointFQdl.x, pointFQdl.y);
        qdl.set(pointFQdl.x, pointFQdl.y);
        int i2 = 0;
        while (i2 < rdpVar.lnr().size()) {
            com.bytedance.adsdk.ud.lnr.qdl qdlVar = rdpVar.lnr().get(i2);
            PointF pointFQdl2 = qdlVar.qdl();
            PointF pointFUd = qdlVar.ud();
            PointF pointFLnr = qdlVar.lnr();
            PointF pointF = qdl;
            if (pointFQdl2.equals(pointF) && pointFUd.equals(pointFLnr)) {
                path.lineTo(pointFLnr.x, pointFLnr.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFQdl2.x, pointFQdl2.y, pointFUd.x, pointFUd.y, pointFLnr.x, pointFLnr.y);
            }
            pointF.set(pointFLnr.x, pointFLnr.y);
            i2++;
            path = path2;
        }
        Path path3 = path;
        if (rdpVar.ud()) {
            path3.close();
        }
    }

    public static float ud(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static float qdl(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }

    public static int qdl(float f, float f2) {
        return qdl((int) f, (int) f2);
    }

    private static int qdl(int i2, int i3) {
        return i2 - (i3 * ud(i2, i3));
    }

    public static int qdl(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }
}
