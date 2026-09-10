package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class VT extends C5090yG {
    public Path q;
    public final C5090yG r;

    public VT(MJ mj, C5090yG c5090yG) {
        super(mj, (PointF) c5090yG.b, (PointF) c5090yG.c, c5090yG.d, c5090yG.e, c5090yG.f, c5090yG.g, c5090yG.h);
        this.r = c5090yG;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        C5090yG c5090yG = this.r;
        PointF pointF3 = c5090yG.o;
        PointF pointF4 = c5090yG.p;
        Xg0 xg0 = AbstractC3014ah0.f4135a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}
