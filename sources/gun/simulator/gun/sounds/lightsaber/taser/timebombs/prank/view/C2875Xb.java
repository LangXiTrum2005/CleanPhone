package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2875Xb implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3977a;

    public /* synthetic */ C2875Xb(int i) {
        this.f3977a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        switch (this.f3977a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        switch (this.f3977a) {
            case 0:
                File file = (File) obj;
                return new EP(new C3697iS(file), new C2849Wb(file, 0));
            default:
                return null;
        }
    }
}
