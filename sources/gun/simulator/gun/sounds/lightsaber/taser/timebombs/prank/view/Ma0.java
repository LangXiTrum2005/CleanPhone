package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class Ma0 implements InterfaceC3069bH, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2714Qw f3409a;
    public volatile Object b;
    public final Object c;

    public Ma0(InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(interfaceC2714Qw, "initializer");
        this.f3409a = interfaceC2714Qw;
        this.b = G7.j;
        this.c = this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        G7 g7 = G7.j;
        if (obj != g7) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == g7) {
                InterfaceC2714Qw interfaceC2714Qw = this.f3409a;
                AbstractC2995aW.n(interfaceC2714Qw);
                objInvoke = interfaceC2714Qw.invoke();
                this.b = objInvoke;
                this.f3409a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.b != G7.j ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
