package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WT extends AbstractC5178zG {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public VT m;

    public WT(List list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        VT vt = (VT) c5090yG;
        Path path = vt.q;
        C4215oK c4215oK = this.e;
        if (c4215oK != null && c5090yG.h != null) {
            PointF pointF = (PointF) c4215oK.b(vt.g, vt.h.floatValue(), (PointF) vt.b, (PointF) vt.c, d(), f, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) c5090yG.b;
        }
        VT vt2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (vt2 != vt) {
            pathMeasure.setPath(path, false);
            this.m = vt;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < 0.0f) {
            pointF2.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF2;
        }
        if (f2 <= length) {
            return pointF2;
        }
        float f3 = f2 - length;
        pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
        return pointF2;
    }
}
