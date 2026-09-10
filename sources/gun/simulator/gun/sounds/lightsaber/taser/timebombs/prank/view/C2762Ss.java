package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2762Ss implements Ca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3740a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2762Ss(Object obj, int i) {
        this.f3740a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ca0
    public final Object get() {
        int i = this.f3740a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((C2918Ys) obj).y);
            default:
                try {
                    return (InterfaceC5098yO) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
