package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SX implements InterfaceC4818v9, InterfaceC4914wG, UT {
    public final String c;
    public final boolean d;
    public final C3160cK e;
    public final AbstractC5170z9 f;
    public final AbstractC5170z9 g;
    public final C3915kv h;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f3718a = new Path();
    public final RectF b = new RectF();
    public final C5036xh i = new C5036xh(0);
    public AbstractC5170z9 j = null;

    public SX(C3160cK c3160cK, B9 b9, TX tx) {
        int i = tx.f3775a;
        this.c = tx.b;
        this.d = tx.d;
        this.e = c3160cK;
        AbstractC5170z9 abstractC5170z9D = tx.e.d();
        this.f = abstractC5170z9D;
        AbstractC5170z9 abstractC5170z9D2 = ((O4) tx.f).d();
        this.g = abstractC5170z9D2;
        C3915kv c3915kvD = tx.c.d();
        this.h = c3915kvD;
        b9.e(abstractC5170z9D);
        b9.e(abstractC5170z9D2);
        b9.e(c3915kvD);
        abstractC5170z9D.a(this);
        abstractC5170z9D2.a(this);
        c3915kvD.a(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
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
                    this.i.f5240a.add(c3362ee0);
                    c3362ee0.c(this);
                } else if (interfaceC2546Kj instanceof C3660i00) {
                    this.j = ((C3660i00) interfaceC2546Kj).b;
                }
            } else if (interfaceC2546Kj instanceof C3660i00) {
                this.j = ((C3660i00) interfaceC2546Kj).b;
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
        if (obj == InterfaceC3689iK.g) {
            this.g.j(c4215oK);
        } else if (obj == InterfaceC3689iK.i) {
            this.f.j(c4215oK);
        } else if (obj == InterfaceC3689iK.h) {
            this.h.j(c4215oK);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        AbstractC5170z9 abstractC5170z9;
        boolean z = this.k;
        Path path = this.f3718a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        C3915kv c3915kv = this.h;
        float fK = c3915kv == null ? 0.0f : c3915kv.k();
        if (fK == 0.0f && (abstractC5170z9 = this.j) != null) {
            fK = Math.min(((Float) abstractC5170z9.e()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fK > fMin) {
            fK = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + fK);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - fK);
        RectF rectF = this.b;
        if (fK > 0.0f) {
            float f3 = pointF2.x + f;
            float f4 = fK * 2.0f;
            float f5 = pointF2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + fK, pointF2.y + f2);
        if (fK > 0.0f) {
            float f6 = pointF2.x - f;
            float f7 = pointF2.y + f2;
            float f8 = fK * 2.0f;
            rectF.set(f6, f7 - f8, f8 + f6, f7);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + fK);
        if (fK > 0.0f) {
            float f9 = pointF2.x - f;
            float f10 = pointF2.y - f2;
            float f11 = fK * 2.0f;
            rectF.set(f9, f10, f9 + f11, f11 + f10);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - fK, pointF2.y - f2);
        if (fK > 0.0f) {
            float f12 = pointF2.x + f;
            float f13 = fK * 2.0f;
            float f14 = pointF2.y - f2;
            rectF.set(f12 - f13, f14, f12, f13 + f14);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.d(path);
        this.k = true;
        return path;
    }
}
