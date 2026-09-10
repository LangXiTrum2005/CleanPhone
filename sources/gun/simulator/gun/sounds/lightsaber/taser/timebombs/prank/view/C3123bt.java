package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3123bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3974ld0 f4193a;
    public final int[] b;
    public final int c;

    public C3123bt(int i, C3974ld0 c3974ld0, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC4038mJ.d("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f4193a = c3974ld0;
        this.b = iArr;
        this.c = i;
    }
}
