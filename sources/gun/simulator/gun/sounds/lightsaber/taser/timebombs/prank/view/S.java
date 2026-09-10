package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3691a = 0;
    public long b = 0;
    public boolean c = false;

    public final void e() {
        if (this.c) {
            return;
        }
        this.f3691a = System.currentTimeMillis();
        this.c = true;
    }

    public final void f() {
        if (!this.c || this.f3691a <= 0) {
            return;
        }
        this.b = (System.currentTimeMillis() - this.f3691a) + this.b;
        this.c = false;
        this.f3691a = 0L;
    }
}
