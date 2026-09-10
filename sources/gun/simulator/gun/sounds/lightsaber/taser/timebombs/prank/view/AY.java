package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class AY implements InterfaceC2837Vp, UT, InterfaceC4973wy, InterfaceC4818v9, InterfaceC4914wG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f2818a = new Matrix();
    public final Path b = new Path();
    public final C3160cK c;
    public final B9 d;
    public final String e;
    public final boolean f;
    public final C3915kv g;
    public final C3915kv h;
    public final Fd0 i;
    public C2623Nj j;

    public AY(C3160cK c3160cK, B9 b9, TX tx) {
        this.c = c3160cK;
        this.d = b9;
        int i = tx.f3775a;
        this.e = tx.b;
        this.f = tx.d;
        C3915kv c3915kvD = tx.c.d();
        this.g = c3915kvD;
        b9.e(c3915kvD);
        c3915kvD.a(this);
        C3915kv c3915kvD2 = ((G4) tx.e).d();
        this.h = c3915kvD2;
        b9.e(c3915kvD2);
        c3915kvD2.a(this);
        M4 m4 = (M4) tx.f;
        m4.getClass();
        Fd0 fd0 = new Fd0(m4);
        this.i = fd0;
        fd0.a(b9);
        fd0.b(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, this);
        for (int i2 = 0; i2 < this.j.h.size(); i2++) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) this.j.h.get(i2);
            if (interfaceC2546Kj instanceof InterfaceC4914wG) {
                AbstractC5187zP.f(c4738uG, i, arrayList, c4738uG2, (InterfaceC4914wG) interfaceC2546Kj);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4973wy
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC2546Kj) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new C2623Nj(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void f(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        Fd0 fd0 = this.i;
        float fFloatValue3 = ((Float) fd0.m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) fd0.n.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f2818a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(fd0.f(f + fFloatValue2));
            this.j.f(canvas, matrix2, (int) (AbstractC5187zP.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        if (this.i.c(c4215oK, obj)) {
            return;
        }
        if (obj == InterfaceC3689iK.p) {
            this.g.j(c4215oK);
        } else if (obj == InterfaceC3689iK.q) {
            this.h.j(c4215oK);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f2818a;
            matrix.set(this.i.f(i + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
