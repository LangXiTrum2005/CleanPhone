package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2682Pq implements UT, InterfaceC4818v9, InterfaceC4914wG {
    public final String b;
    public final C3160cK c;
    public final AbstractC5170z9 d;
    public final AbstractC5170z9 e;
    public final C2826Ve f;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f3575a = new Path();
    public final C5036xh g = new C5036xh(0);

    public C2682Pq(C3160cK c3160cK, B9 b9, C2826Ve c2826Ve) {
        this.b = c2826Ve.f3881a;
        this.c = c3160cK;
        AbstractC5170z9 abstractC5170z9D = c2826Ve.c.d();
        this.d = abstractC5170z9D;
        AbstractC5170z9 abstractC5170z9D2 = c2826Ve.b.d();
        this.e = abstractC5170z9D2;
        this.f = c2826Ve;
        b9.e(abstractC5170z9D);
        b9.e(abstractC5170z9D2);
        abstractC5170z9D.a(this);
        abstractC5170z9D2.a(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) arrayList.get(i);
            if (interfaceC2546Kj instanceof C3362ee0) {
                C3362ee0 c3362ee0 = (C3362ee0) interfaceC2546Kj;
                if (c3362ee0.c == 1) {
                    this.g.f5240a.add(c3362ee0);
                    c3362ee0.c(this);
                }
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        if (obj == InterfaceC3689iK.f) {
            this.d.j(c4215oK);
        } else if (obj == InterfaceC3689iK.i) {
            this.e.j(c4215oK);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        boolean z = this.h;
        Path path = this.f3575a;
        if (z) {
            return path;
        }
        path.reset();
        C2826Ve c2826Ve = this.f;
        if (c2826Ve.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (c2826Ve.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.d(path);
        this.h = true;
        return path;
    }
}
