package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3547gj extends C2330Cb {
    public final EnumC5024xb l;

    public C3547gj(int i, EnumC5024xb enumC5024xb, InterfaceC2766Sw interfaceC2766Sw) {
        super(i, interfaceC2766Sw);
        this.l = enumC5024xb;
        if (enumC5024xb != EnumC5024xb.f5229a) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC5044xl.g("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC3263dY.a(C2330Cb.class).b() + " instead").toString());
        }
    }

    public final Object L(Object obj, boolean z) throws IllegalAccessException, InvocationTargetException {
        C4151ne c4151ne;
        InterfaceC2766Sw interfaceC2766Sw;
        C3770jF c3770jFJ;
        EnumC5024xb enumC5024xb = EnumC5024xb.c;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (this.l == enumC5024xb) {
            Object objF = super.f(obj);
            if ((!(objF instanceof C3975le)) || (objF instanceof C3799je)) {
                return objF;
            }
            if (!z || (interfaceC2766Sw = this.b) == null || (c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, obj, null)) == null) {
                return c5033xf0;
            }
            throw c3770jFJ;
        }
        Object obj2 = AbstractC2382Eb.d;
        C4151ne c4151ne2 = (C4151ne) C2330Cb.g.get(this);
        while (true) {
            long andIncrement = C2330Cb.c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zX = x(andIncrement, false);
            int i = AbstractC2382Eb.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c4151ne2.c != j3) {
                C4151ne c4151neB = C2330Cb.b(this, j3, c4151ne2);
                if (c4151neB != null) {
                    c4151ne = c4151neB;
                } else if (zX) {
                    return new C3799je(s());
                }
            } else {
                c4151ne = c4151ne2;
            }
            int iD = C2330Cb.d(this, c4151ne, i2, obj, j, obj2, zX);
            if (iD == 0) {
                c4151ne.a();
                return c5033xf0;
            }
            if (iD == 1) {
                return c5033xf0;
            }
            if (iD == 2) {
                if (zX) {
                    c4151ne.h();
                    return new C3799je(s());
                }
                InterfaceC5129yj0 interfaceC5129yj0 = obj2 instanceof InterfaceC5129yj0 ? (InterfaceC5129yj0) obj2 : null;
                if (interfaceC5129yj0 != null) {
                    interfaceC5129yj0.a(c4151ne, i2 + i);
                }
                k((c4151ne.c * j2) + ((long) i2));
                return c5033xf0;
            }
            if (iD == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iD == 4) {
                if (j < C2330Cb.d.get(this)) {
                    c4151ne.a();
                }
                return new C3799je(s());
            }
            if (iD == 5) {
                c4151ne.a();
            }
            c4151ne2 = c4151ne;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2330Cb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final Object f(Object obj) {
        return L(obj, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2330Cb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3842k40
    public final Object g(Object obj, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C3770jF c3770jFJ;
        Object objL = L(obj, true);
        boolean z = objL instanceof C3799je;
        if (!z) {
            return C5033xf0.f5238a;
        }
        if (z) {
        }
        InterfaceC2766Sw interfaceC2766Sw = this.b;
        if (interfaceC2766Sw == null || (c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, obj, null)) == null) {
            throw s();
        }
        AbstractC2995aW.h(c3770jFJ, s());
        throw c3770jFJ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2330Cb
    public final boolean z() {
        return this.l == EnumC5024xb.b;
    }
}
