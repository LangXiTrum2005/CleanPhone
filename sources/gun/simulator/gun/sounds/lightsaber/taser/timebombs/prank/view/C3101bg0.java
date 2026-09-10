package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3101bg0 implements InterfaceC3069bH, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2714Qw f4182a;
    public Object b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH
    public final Object getValue() {
        if (this.b == G7.j) {
            InterfaceC2714Qw interfaceC2714Qw = this.f4182a;
            AbstractC2995aW.n(interfaceC2714Qw);
            this.b = interfaceC2714Qw.invoke();
            this.f4182a = null;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != G7.j ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
