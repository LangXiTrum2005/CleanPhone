package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3704iZ implements InterfaceC3726il, InterfaceC3463fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3639hl f4506a;
    public final C2392El b;
    public int c;
    public int d = -1;
    public InterfaceC4650tG e;
    public List f;
    public int g;
    public volatile EP h;
    public File i;
    public C3790jZ j;

    public C3704iZ(C2392El c2392El, InterfaceC3639hl interfaceC3639hl) {
        this.b = c2392El;
        this.f4506a = interfaceC3639hl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3726il
    public final boolean c() {
        ArrayList arrayListA = this.b.a();
        boolean z = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        List listD = this.b.d();
        if (listD.isEmpty()) {
            if (File.class.equals(this.b.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.b.d.getClass() + " to " + this.b.k);
        }
        while (true) {
            List list = this.f;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    FP fp = (FP) list2.get(i);
                    File file = this.i;
                    C2392El c2392El = this.b;
                    this.h = fp.b(file, c2392El.e, c2392El.f, c2392El.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.c(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= listD.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= arrayListA.size()) {
                    return false;
                }
                this.d = 0;
            }
            InterfaceC4650tG interfaceC4650tG = (InterfaceC4650tG) arrayListA.get(this.c);
            Class cls = (Class) listD.get(this.d);
            Gd0 gd0F = this.b.f(cls);
            C2392El c2392El2 = this.b;
            this.j = new C3790jZ(c2392El2.c.f4048a, interfaceC4650tG, c2392El2.n, c2392El2.e, c2392El2.f, gd0F, cls, c2392El2.i);
            File fileE = c2392El2.h.a().e(this.j);
            this.i = fileE;
            if (fileE != null) {
                this.e = interfaceC4650tG;
                this.f = this.b.c.b().g(fileE);
                this.g = 0;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3726il
    public final void cancel() {
        EP ep = this.h;
        if (ep != null) {
            ep.c.cancel();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    public final void d(Exception exc) {
        this.f4506a.a(this.j, exc, this.h.c, EnumC4516rl.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    public final void k(Object obj) {
        this.f4506a.b(this.e, obj, this.h.c, EnumC4516rl.d, this.j);
    }
}
