package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2623Nj implements InterfaceC2837Vp, UT, InterfaceC4818v9, InterfaceC4826vG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VG f3471a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List h;
    public final C3160cK i;
    public ArrayList j;
    public final Fd0 k;

    public C2623Nj(C3160cK c3160cK, B9 b9, C3408f60 c3408f60, MJ mj) {
        M4 m4;
        String str = c3408f60.f4351a;
        List list = c3408f60.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC2546Kj interfaceC2546KjA = ((InterfaceC2727Rj) list.get(i2)).a(c3160cK, mj, b9);
            if (interfaceC2546KjA != null) {
                arrayList.add(interfaceC2546KjA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                m4 = null;
                break;
            }
            InterfaceC2727Rj interfaceC2727Rj = (InterfaceC2727Rj) list.get(i);
            if (interfaceC2727Rj instanceof M4) {
                m4 = (M4) interfaceC2727Rj;
                break;
            }
            i++;
        }
        this(c3160cK, b9, str, c3408f60.c, arrayList, m4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list3.get(size2);
            interfaceC2546Kj.b(arrayList, list3.subList(0, size2));
            arrayList.add(interfaceC2546Kj);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void c(C4738uG c4738uG, int i, ArrayList arrayList, C4738uG c4738uG2) {
        String str = this.f;
        if (!c4738uG.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c4738uG2.getClass();
            C4738uG c4738uG3 = new C4738uG(c4738uG2);
            c4738uG3.f5071a.add(str);
            if (c4738uG.a(i, str)) {
                C4738uG c4738uG4 = new C4738uG(c4738uG3);
                c4738uG4.b = this;
                arrayList.add(c4738uG4);
            }
            c4738uG2 = c4738uG3;
        }
        if (!c4738uG.d(i, str)) {
            return;
        }
        int iB = c4738uG.b(i, str) + i;
        int i2 = 0;
        while (true) {
            List list = this.h;
            if (i2 >= list.size()) {
                return;
            }
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list.get(i2);
            if (interfaceC2546Kj instanceof InterfaceC4826vG) {
                ((InterfaceC4826vG) interfaceC2546Kj).c(c4738uG, iB, arrayList, c4738uG2);
            }
            i2++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        Fd0 fd0 = this.k;
        if (fd0 != null) {
            matrix2.preConcat(fd0.e());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.h;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list.get(size);
            if (interfaceC2546Kj instanceof InterfaceC2837Vp) {
                ((InterfaceC2837Vp) interfaceC2546Kj).d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                List list = this.h;
                if (i >= list.size()) {
                    break;
                }
                InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list.get(i);
                if (interfaceC2546Kj instanceof UT) {
                    this.j.add((UT) interfaceC2546Kj);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2837Vp
    public final void f(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        Fd0 fd0 = this.k;
        if (fd0 != null) {
            matrix2.preConcat(fd0.e());
            AbstractC5170z9 abstractC5170z9 = fd0.j;
            i = (int) (((((abstractC5170z9 == null ? 100 : ((Integer) abstractC5170z9.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.s;
        boolean z2 = false;
        List list = this.h;
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if ((list.get(i3) instanceof InterfaceC2837Vp) && (i2 = i2 + 1) >= 2) {
                    if (i == 255) {
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix2, true);
            VG vg = this.f3471a;
            vg.setAlpha(i);
            AbstractC3014ah0.e(canvas, rectF, vg);
        }
        if (z2) {
            i = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = list.get(size);
            if (obj instanceof InterfaceC2837Vp) {
                ((InterfaceC2837Vp) obj).f(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4826vG
    public final void g(C4215oK c4215oK, Object obj) {
        Fd0 fd0 = this.k;
        if (fd0 != null) {
            fd0.c(c4215oK, obj);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        Matrix matrix = this.c;
        matrix.reset();
        Fd0 fd0 = this.k;
        if (fd0 != null) {
            matrix.set(fd0.e());
        }
        Path path = this.d;
        path.reset();
        if (this.g) {
            return path;
        }
        List list = this.h;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) list.get(size);
            if (interfaceC2546Kj instanceof UT) {
                path.addPath(((UT) interfaceC2546Kj).getPath(), matrix);
            }
        }
        return path;
    }

    public C2623Nj(C3160cK c3160cK, B9 b9, String str, boolean z, ArrayList arrayList, M4 m4) {
        this.f3471a = new VG();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = c3160cK;
        this.g = z;
        this.h = arrayList;
        if (m4 != null) {
            Fd0 fd0 = new Fd0(m4);
            this.k = fd0;
            fd0.a(b9);
            fd0.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) arrayList.get(size);
            if (interfaceC2546Kj instanceof InterfaceC4973wy) {
                arrayList2.add((InterfaceC4973wy) interfaceC2546Kj);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC4973wy) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
