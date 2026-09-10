package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.BufferedReader;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2827Vf implements InterfaceC4545s40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3883a;
    public final Object b;

    public /* synthetic */ C2827Vf(Object obj, int i) {
        this.f3883a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        int i = this.f3883a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return new C4828vI(this);
            case 2:
                return new C3330eD(this);
            case 3:
                InterfaceC3567gx interfaceC3567gx = (InterfaceC3567gx) obj;
                AbstractC2995aW.q(interfaceC3567gx, "block");
                C4721u40 c4721u40 = new C4721u40();
                c4721u40.d = WD.n(interfaceC3567gx, c4721u40, c4721u40);
                return c4721u40;
            default:
                return (Iterator) obj;
        }
    }

    public C2827Vf(BufferedReader bufferedReader) {
        this.f3883a = 1;
        this.b = bufferedReader;
    }

    public C2827Vf(C2827Vf c2827Vf) {
        this.f3883a = 2;
        this.b = c2827Vf;
    }
}
