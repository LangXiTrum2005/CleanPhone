package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W[] f3852a;
    public int b;
    public int c;
    public C4408qa0 d;

    public final W c() {
        W wD;
        C4408qa0 c4408qa0;
        synchronized (this) {
            try {
                W[] wArrE = this.f3852a;
                if (wArrE == null) {
                    wArrE = e();
                    this.f3852a = wArrE;
                } else if (this.b >= wArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(wArrE, wArrE.length * 2);
                    AbstractC2995aW.p(objArrCopyOf, "copyOf(this, newSize)");
                    this.f3852a = (W[]) objArrCopyOf;
                    wArrE = (W[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    wD = wArrE[i];
                    if (wD == null) {
                        wD = d();
                        wArrE[i] = wD;
                    }
                    i++;
                    if (i >= wArrE.length) {
                        i = 0;
                    }
                } while (!wD.a(this));
                this.c = i;
                this.b++;
                c4408qa0 = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4408qa0 != null) {
            c4408qa0.u(1);
        }
        return wD;
    }

    public abstract W d();

    public abstract W[] e();

    public final void f(W w) {
        C4408qa0 c4408qa0;
        int i;
        InterfaceC2857Wj[] interfaceC2857WjArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                c4408qa0 = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                AbstractC2995aW.o(w, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC2857WjArrB = w.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2857Wj interfaceC2857Wj : interfaceC2857WjArrB) {
            if (interfaceC2857Wj != null) {
                interfaceC2857Wj.resumeWith(C5033xf0.f5238a);
            }
        }
        if (c4408qa0 != null) {
            c4408qa0.u(-1);
        }
    }

    public final C4408qa0 g() {
        C4408qa0 c4408qa0;
        synchronized (this) {
            c4408qa0 = this.d;
            if (c4408qa0 == null) {
                int i = this.b;
                c4408qa0 = new C4408qa0(1, Integer.MAX_VALUE, EnumC5024xb.b);
                c4408qa0.a(Integer.valueOf(i));
                this.d = c4408qa0;
            }
        }
        return c4408qa0;
    }
}
