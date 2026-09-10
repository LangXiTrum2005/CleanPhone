package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3217cz extends RL implements InterfaceC4083mo {
    private volatile C3217cz _immediate;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4251a;
    public final String b;
    public final boolean c;
    public final C3217cz d;

    public C3217cz(Handler handler) {
        this(handler, null, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        if (this.f4251a.post(runnable)) {
            return;
        }
        g(interfaceC3549gk, runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4083mo
    public final void e(long j, C2798Uc c2798Uc) {
        RunnableC3252dN runnableC3252dN = new RunnableC3252dN(c2798Uc, this, 16);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f4251a.postDelayed(runnableC3252dN, j)) {
            c2798Uc.n(new D10(2, this, runnableC3252dN));
        } else {
            g(c2798Uc.e, runnableC3252dN);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3217cz) && ((C3217cz) obj).f4251a == this.f4251a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4083mo
    public final InterfaceC4612sp f(long j, final Runnable runnable, InterfaceC3549gk interfaceC3549gk) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f4251a.postDelayed(runnable, j)) {
            return new InterfaceC4612sp() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bz
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4612sp
                public final void c() {
                    this.f4196a.f4251a.removeCallbacks(runnable);
                }
            };
        }
        g(interfaceC3549gk, runnable);
        return NR.f3457a;
    }

    public final void g(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC3549gk.get(G7.e);
        if (interfaceC5000xE != null) {
            interfaceC5000xE.a(cancellationException);
        }
        AbstractC4437qp.b.dispatch(interfaceC3549gk, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4251a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final boolean isDispatchNeeded(InterfaceC3549gk interfaceC3549gk) {
        return (this.c && AbstractC2995aW.i(Looper.myLooper(), this.f4251a.getLooper())) ? false : true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final String toString() {
        C3217cz c3217cz;
        String str;
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        RL rl = TL.f3768a;
        if (this == rl) {
            str = "Dispatchers.Main";
        } else {
            try {
                c3217cz = ((C3217cz) rl).d;
            } catch (UnsupportedOperationException unused) {
                c3217cz = null;
            }
            str = this == c3217cz ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.b;
        if (string == null) {
            string = this.f4251a.toString();
        }
        return this.c ? DM.h(string, ".immediate") : string;
    }

    public C3217cz(Handler handler, String str, boolean z) {
        this.f4251a = handler;
        this.b = str;
        this.c = z;
        this._immediate = z ? this : null;
        C3217cz c3217cz = this._immediate;
        if (c3217cz == null) {
            c3217cz = new C3217cz(handler, str, true);
            this._immediate = c3217cz;
        }
        this.d = c3217cz;
    }
}
