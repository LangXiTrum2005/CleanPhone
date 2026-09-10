package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BO implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2869a;
    public final /* synthetic */ DO b;
    public final /* synthetic */ EO c;
    public final /* synthetic */ FI d;
    public final /* synthetic */ C3779jO e;

    public /* synthetic */ BO(DO r1, EO eo, FI fi, C3779jO c3779jO, int i) {
        this.f2869a = i;
        this.b = r1;
        this.c = eo;
        this.d = fi;
        this.e = c3779jO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2869a;
        C3779jO c3779jO = this.e;
        FI fi = this.d;
        EO eo = this.c;
        DO r4 = this.b;
        switch (i) {
            case 0:
                eo.z(r4.f2968a, r4.b, fi, c3779jO);
                break;
            case 1:
                eo.r(r4.f2968a, r4.b, fi, c3779jO);
                break;
            default:
                eo.u(r4.f2968a, r4.b, fi, c3779jO);
                break;
        }
    }
}
