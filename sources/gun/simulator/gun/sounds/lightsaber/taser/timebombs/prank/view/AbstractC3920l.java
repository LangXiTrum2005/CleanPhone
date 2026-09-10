package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3920l extends PE implements InterfaceC2857Wj, InterfaceC4514rk {
    public final InterfaceC3549gk c;

    public AbstractC3920l(InterfaceC3549gk interfaceC3549gk, boolean z) {
        super(z);
        Q((InterfaceC5000xE) interfaceC3549gk.get(G7.e));
        this.c = interfaceC3549gk.plus(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final String D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void P(C3770jF c3770jF) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.Q(this.c, c3770jF);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public String U() {
        return super.U();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void X(Object obj) {
        if (!(obj instanceof C3013ah)) {
            e0(obj);
            return;
        }
        C3013ah c3013ah = (C3013ah) obj;
        Throwable th = c3013ah.f4134a;
        c3013ah.getClass();
        d0(C3013ah.b.get(c3013ah) != 0, th);
    }

    public final void f0(int i, AbstractC3920l abstractC3920l, InterfaceC3567gx interfaceC3567gx) {
        int iD = DM.D(i);
        if (iD == 0) {
            WD.T(interfaceC3567gx, abstractC3920l, this);
            return;
        }
        if (iD != 1) {
            if (iD == 2) {
                WD.w(WD.n(interfaceC3567gx, abstractC3920l, this)).resumeWith(C5033xf0.f5238a);
                return;
            }
            if (iD != 3) {
                throw new C3770jF(7, 0);
            }
            try {
                InterfaceC3549gk interfaceC3549gk = this.c;
                Object objC = AbstractC3181cc0.c(interfaceC3549gk, null);
                try {
                    WD.h(2, interfaceC3567gx);
                    Object objInvoke = interfaceC3567gx.invoke(abstractC3920l, this);
                    AbstractC3181cc0.a(interfaceC3549gk, objC);
                    if (objInvoke != EnumC4602sk.f4993a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    AbstractC3181cc0.a(interfaceC3549gk, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(AbstractC3375el.v(th2));
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final InterfaceC3549gk getContext() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk
    public final InterfaceC3549gk getCoroutineContext() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE
    public boolean isActive() {
        return super.isActive();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj
    public final void resumeWith(Object obj) {
        Throwable thA = IZ.a(obj);
        if (thA != null) {
            obj = new C3013ah(false, thA);
        }
        Object objT = T(obj);
        if (objT == QE.b) {
            return;
        }
        y(objT);
    }

    public void e0(Object obj) {
    }

    public void d0(boolean z, Throwable th) {
    }
}
