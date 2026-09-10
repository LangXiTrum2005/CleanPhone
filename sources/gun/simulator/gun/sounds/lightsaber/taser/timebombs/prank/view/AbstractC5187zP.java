package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5187zP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f5324a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void d(C3055b60 c3055b60, Path path) {
        path.reset();
        PointF pointF = c3055b60.b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f5324a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = c3055b60.f4157a;
            if (i >= arrayList.size()) {
                break;
            }
            C2365Dk c2365Dk = (C2365Dk) arrayList.get(i);
            PointF pointF3 = c2365Dk.f2985a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = c2365Dk.b;
            PointF pointF5 = c2365Dk.c;
            if (zEquals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
        }
        if (c3055b60.c) {
            path.close();
        }
    }

    public static float e(float f, float f2, float f3) {
        return AbstractC5044xl.w(f2, f, f3, f);
    }

    public static void f(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2, InterfaceC4914wG interfaceC4914wG) {
        if (c4738uG.a(i, interfaceC4914wG.getName())) {
            String name = interfaceC4914wG.getName();
            c4738uG2.getClass();
            C4738uG c4738uG3 = new C4738uG(c4738uG2);
            c4738uG3.f5071a.add(name);
            C4738uG c4738uG4 = new C4738uG(c4738uG3);
            c4738uG4.b = interfaceC4914wG;
            arrayList.add(c4738uG4);
        }
    }
}
