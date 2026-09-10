package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3483g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4395a;
    public int b;
    public int c;
    public int d;

    public C3483g0(int i, int i2, int i3, int i4) {
        this.f4395a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public boolean a(int i) {
        if (i == 1) {
            if (this.f4395a - this.b <= 1) {
                return false;
            }
        } else if (this.c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
