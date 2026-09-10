package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2674Pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2700Qi f3567a;

    public C2674Pi(C2700Qi c2700Qi) {
        this.f3567a = c2700Qi;
    }

    public final void a() {
        C2700Qi c2700Qi = this.f3567a;
        synchronized (c2700Qi) {
            c2700Qi.d = true;
        }
        this.f3567a.g();
    }
}
