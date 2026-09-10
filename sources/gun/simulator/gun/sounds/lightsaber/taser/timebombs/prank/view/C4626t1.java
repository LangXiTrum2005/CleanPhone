package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4626t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5010a;
    public long b;
    public long c;
    public long d;
    public String e;
    public int f;

    public final boolean a() {
        return this.f5010a == 1 && this.c > 0 && this.b > 0 && System.currentTimeMillis() - this.c >= this.b;
    }
}
