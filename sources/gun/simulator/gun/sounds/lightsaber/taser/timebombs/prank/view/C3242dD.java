package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3242dD implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4263a = 0;
    public final Object b;

    public C3242dD(C4874vo c4874vo) {
        this.b = c4874vo;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f4263a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new C3330eD((Iterator) ((InterfaceC2714Qw) obj).invoke());
            default:
                return ((InterfaceC4545s40) obj).iterator();
        }
    }

    public C3242dD(X9 x9) {
        this.b = x9;
    }
}
