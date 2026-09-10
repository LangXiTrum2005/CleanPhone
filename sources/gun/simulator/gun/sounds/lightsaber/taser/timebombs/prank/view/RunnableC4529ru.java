package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4529ru implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4953a;
    public final /* synthetic */ C4617su b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ RunnableC4529ru(C4617su c4617su, boolean z, int i) {
        this.f4953a = i;
        this.b = c4617su;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3761j8 c3761j8E;
        C3761j8 c3761j8C;
        switch (this.f4953a) {
            case 0:
                C4617su c4617su = this.b;
                boolean z = this.c;
                c4617su.getClass();
                synchronized (C4617su.m) {
                    try {
                        C4266ou c4266ou = c4617su.f5004a;
                        c4266ou.a();
                        C3491g4 c3491g4O = C3491g4.o(c4266ou.f4812a);
                        try {
                            c3761j8E = c4617su.c.E();
                            if (c3491g4O != null) {
                                c3491g4O.F();
                            }
                        } catch (Throwable th) {
                            if (c3491g4O != null) {
                                c3491g4O.F();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    EnumC3699iU enumC3699iU = EnumC3699iU.e;
                    EnumC3699iU enumC3699iU2 = c3761j8E.b;
                    if (enumC3699iU2 == enumC3699iU || enumC3699iU2 == EnumC3699iU.c) {
                        c3761j8C = c4617su.i(c3761j8E);
                    } else if (!z && !c4617su.d.a(c3761j8E)) {
                        return;
                    } else {
                        c3761j8C = c4617su.c(c3761j8E);
                    }
                    c4617su.f(c3761j8C);
                    c4617su.m(c3761j8E, c3761j8C);
                    if (c3761j8C.b == EnumC3699iU.d) {
                        c4617su.l(c3761j8C.f4538a);
                    }
                    EnumC3699iU enumC3699iU3 = c3761j8C.b;
                    if (enumC3699iU3 == enumC3699iU) {
                        c4617su.j(new C4793uu());
                        return;
                    } else if (enumC3699iU3 == EnumC3699iU.b || enumC3699iU3 == EnumC3699iU.f4502a) {
                        c4617su.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c4617su.k(c3761j8C);
                        return;
                    }
                } catch (C4793uu e) {
                    c4617su.j(e);
                    return;
                }
            default:
                this.b.b(this.c);
                return;
        }
    }
}
