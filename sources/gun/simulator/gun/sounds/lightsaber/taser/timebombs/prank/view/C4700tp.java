package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4700tp extends AbstractC2746Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5053a;
    public final Object b;

    public C4700tp(Object obj, int i) {
        this.f5053a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2746Sc
    public final void a(Throwable th) {
        int i = this.f5053a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((InterfaceC4612sp) obj).c();
                break;
            default:
                ((InterfaceC2766Sw) obj).invoke(th);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f5053a) {
            case 0:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return c5033xf0;
    }

    public final String toString() {
        int i = this.f5053a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "DisposeOnCancel[" + ((InterfaceC4612sp) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC2766Sw) obj).getClass().getSimpleName() + '@' + AbstractC2340Cl.x(this) + ']';
        }
    }
}
