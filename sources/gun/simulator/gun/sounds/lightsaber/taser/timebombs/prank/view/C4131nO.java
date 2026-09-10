package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4131nO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4741a;
    public final int b;

    public /* synthetic */ C4131nO(int i, int i2) {
        this.f4741a = i;
        this.b = i2;
    }

    public final int a() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
