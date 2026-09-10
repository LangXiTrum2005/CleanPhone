package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4762uc implements InterfaceC2279Ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3877kY f5088a;
    public final InterfaceC4463r70 b;
    public final C4674tc c;
    public boolean d;
    public final /* synthetic */ C4850vc e;

    public C4762uc(C4850vc c4850vc, C3877kY c3877kY) {
        this.e = c4850vc;
        this.f5088a = c3877kY;
        InterfaceC4463r70 interfaceC4463r70M = c3877kY.m(1);
        this.b = interfaceC4463r70M;
        this.c = new C4674tc(c4850vc, this, interfaceC4463r70M);
    }

    public final void a() {
        synchronized (this.e) {
            if (this.d) {
                return;
            }
            this.d = true;
            Vg0.c(this.b);
            try {
                this.f5088a.c();
            } catch (IOException unused) {
            }
        }
    }
}
