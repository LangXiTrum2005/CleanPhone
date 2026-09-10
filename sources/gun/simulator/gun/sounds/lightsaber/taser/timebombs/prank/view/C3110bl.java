package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3110bl implements InterfaceC3726il, InterfaceC3463fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4185a;
    public final C2392El b;
    public final InterfaceC3639hl c;
    public int d = -1;
    public InterfaceC4650tG e;
    public List f;
    public int g;
    public volatile EP h;
    public File i;

    public C3110bl(List list, C2392El c2392El, InterfaceC3639hl interfaceC3639hl) {
        this.f4185a = list;
        this.b = c2392El;
        this.c = interfaceC3639hl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3726il
    public final boolean c() {
        while (true) {
            List list = this.f;
            boolean z = false;
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
            if (i2 >= this.f4185a.size()) {
                return false;
            }
            InterfaceC4650tG interfaceC4650tG = (InterfaceC4650tG) this.f4185a.get(this.d);
            C2392El c2392El2 = this.b;
            File fileE = c2392El2.h.a().e(new C3198cl(interfaceC4650tG, c2392El2.n));
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
        this.c.a(this.e, exc, this.h.c, EnumC4516rl.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3463fl
    public final void k(Object obj) {
        this.c.b(this.e, obj, this.h.c, EnumC4516rl.c, this.e);
    }
}
