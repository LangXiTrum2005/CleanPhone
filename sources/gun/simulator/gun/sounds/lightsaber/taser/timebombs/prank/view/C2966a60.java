package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2966a60 implements UT, InterfaceC4818v9, InterfaceC4914wG {
    public final String b;
    public final boolean c;
    public final C3160cK d;
    public final C3584h60 e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f4108a = new Path();
    public final C5036xh g = new C5036xh(0);

    public C2966a60(C3160cK c3160cK, B9 b9, C3758j60 c3758j60) {
        this.b = c3758j60.f4536a;
        this.c = c3758j60.d;
        this.d = c3160cK;
        C3584h60 c3584h60 = new C3584h60((List) c3758j60.c.b);
        this.e = c3584h60;
        b9.e(c3584h60);
        c3584h60.a(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4818v9
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) arrayList2.get(i);
            if (interfaceC2546Kj instanceof C3362ee0) {
                C3362ee0 c3362ee0 = (C3362ee0) interfaceC2546Kj;
                if (c3362ee0.c == 1) {
                    this.g.f5240a.add(c3362ee0);
                    c3362ee0.c(this);
                } else if (!(interfaceC2546Kj instanceof C3660i00)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C3660i00) interfaceC2546Kj);
                }
            } else if (!(interfaceC2546Kj instanceof C3660i00)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C3660i00) interfaceC2546Kj);
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
        if (obj == InterfaceC3689iK.K) {
            this.e.j(c4215oK);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final String getName() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        boolean z = this.f;
        C3584h60 c3584h60 = this.e;
        Path path = this.f4108a;
        if (z && c3584h60.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) c3584h60.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.d(path);
        this.f = true;
        return path;
    }
}
