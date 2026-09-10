package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5112yb implements InterfaceC5129yj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5282a = AbstractC2382Eb.p;
    public C2798Uc b;
    public final /* synthetic */ C2330Cb c;

    public C5112yb(C2330Cb c2330Cb) {
        this.c = c2330Cb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5129yj0
    public final void a(W30 w30, int i) {
        C2798Uc c2798Uc = this.b;
        if (c2798Uc != null) {
            c2798Uc.a(w30, i);
        }
    }

    public final Object b(C4794uv c4794uv) throws Throwable {
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2330Cb.h;
        C2330Cb c2330Cb = this.c;
        C4151ne c4151ne = (C4151ne) atomicReferenceFieldUpdater.get(c2330Cb);
        while (!c2330Cb.y()) {
            long andIncrement = C2330Cb.d.getAndIncrement(c2330Cb);
            long j = AbstractC2382Eb.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c4151ne.c != j2) {
                C4151ne c4151neN = c2330Cb.n(j2, c4151ne);
                if (c4151neN == null) {
                    continue;
                } else {
                    c4151ne = c4151neN;
                }
            }
            Object objI = c2330Cb.I(c4151ne, i, andIncrement, null);
            SE se = AbstractC2382Eb.m;
            if (objI == se) {
                throw new IllegalStateException("unreachable".toString());
            }
            SE se2 = AbstractC2382Eb.o;
            if (objI != se2) {
                if (objI != AbstractC2382Eb.n) {
                    c4151ne.a();
                    this.f5282a = objI;
                    return Boolean.TRUE;
                }
                C2330Cb c2330Cb2 = this.c;
                C2798Uc c2798UcV = WD.v(WD.w(c4794uv));
                try {
                    this.b = c2798UcV;
                    Object objI2 = c2330Cb2.I(c4151ne, i, andIncrement, this);
                    if (objI2 != se) {
                        C5200zb c5200zb = null;
                        InterfaceC3549gk interfaceC3549gk = c2798UcV.e;
                        InterfaceC2766Sw interfaceC2766Sw = c2330Cb2.b;
                        if (objI2 == se2) {
                            if (andIncrement < c2330Cb2.v()) {
                                c4151ne.a();
                            }
                            C4151ne c4151ne2 = (C4151ne) C2330Cb.h.get(c2330Cb2);
                            while (true) {
                                if (c2330Cb2.y()) {
                                    C2798Uc c2798Uc = this.b;
                                    AbstractC2995aW.n(c2798Uc);
                                    this.b = null;
                                    this.f5282a = AbstractC2382Eb.l;
                                    Throwable thP = c2330Cb.p();
                                    if (thP != null) {
                                        c2798Uc.resumeWith(AbstractC3375el.v(thP));
                                        break;
                                    }
                                    c2798Uc.resumeWith(Boolean.FALSE);
                                    break;
                                }
                                long andIncrement2 = C2330Cb.d.getAndIncrement(c2330Cb2);
                                long j3 = AbstractC2382Eb.b;
                                long j4 = andIncrement2 / j3;
                                int i2 = (int) (andIncrement2 % j3);
                                if (c4151ne2.c != j4) {
                                    C4151ne c4151neN2 = c2330Cb2.n(j4, c4151ne2);
                                    if (c4151neN2 != null) {
                                        c4151ne2 = c4151neN2;
                                    }
                                }
                                InterfaceC2766Sw interfaceC2766Sw2 = interfaceC2766Sw;
                                Object objI3 = c2330Cb2.I(c4151ne2, i2, andIncrement2, this);
                                if (objI3 == AbstractC2382Eb.m) {
                                    a(c4151ne2, i2);
                                    break;
                                }
                                if (objI3 == AbstractC2382Eb.o) {
                                    if (andIncrement2 < c2330Cb2.v()) {
                                        c4151ne2.a();
                                    }
                                    interfaceC2766Sw = interfaceC2766Sw2;
                                } else {
                                    if (objI3 == AbstractC2382Eb.n) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    c4151ne2.a();
                                    this.f5282a = objI3;
                                    this.b = null;
                                    bool = Boolean.TRUE;
                                    if (interfaceC2766Sw2 != null) {
                                        c5200zb = new C5200zb(interfaceC2766Sw2, objI3, interfaceC3549gk);
                                    }
                                }
                            }
                        } else {
                            c4151ne.a();
                            this.f5282a = objI2;
                            this.b = null;
                            bool = Boolean.TRUE;
                            if (interfaceC2766Sw != null) {
                                c5200zb = new C5200zb(interfaceC2766Sw, objI2, interfaceC3549gk);
                            }
                        }
                        c2798UcV.B(c5200zb, bool);
                        break;
                    }
                    a(c4151ne, i);
                    return c2798UcV.s();
                } catch (Throwable th) {
                    c2798UcV.A();
                    throw th;
                }
            }
            if (andIncrement < c2330Cb.v()) {
                c4151ne.a();
            }
        }
        this.f5282a = AbstractC2382Eb.l;
        Throwable thP2 = c2330Cb.p();
        if (thP2 == null) {
            return Boolean.FALSE;
        }
        int i3 = AbstractC3502g90.f4407a;
        throw thP2;
    }
}
