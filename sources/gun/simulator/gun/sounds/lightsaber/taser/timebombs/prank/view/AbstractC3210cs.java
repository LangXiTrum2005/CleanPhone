package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3210cs extends AbstractC3899kk {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4248a;
    public boolean b;
    public S5 c;

    public final void g(boolean z) {
        long j = this.f4248a - (z ? 4294967296L : 1L);
        this.f4248a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public final void i(AbstractC4349pp abstractC4349pp) {
        S5 s5 = this.c;
        if (s5 == null) {
            s5 = new S5();
            this.c = s5;
        }
        s5.addLast(abstractC4349pp);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final AbstractC3899kk limitedParallelism(int i) {
        WD.j(i);
        return this;
    }

    public abstract Thread n();

    public final void o(boolean z) {
        this.f4248a = (z ? 4294967296L : 1L) + this.f4248a;
        if (z) {
            return;
        }
        this.b = true;
    }

    public final boolean q() {
        return this.f4248a >= 4294967296L;
    }

    public abstract long r();

    public abstract void shutdown();

    public final boolean t() throws IllegalAccessException, InvocationTargetException {
        S5 s5 = this.c;
        if (s5 == null) {
            return false;
        }
        AbstractC4349pp abstractC4349pp = (AbstractC4349pp) (s5.isEmpty() ? null : s5.removeFirst());
        if (abstractC4349pp == null) {
            return false;
        }
        abstractC4349pp.run();
        return true;
    }

    public void u(long j, AbstractRunnableC2943Zr abstractRunnableC2943Zr) {
        RunnableC2886Xm.h.y(j, abstractRunnableC2943Zr);
    }
}
