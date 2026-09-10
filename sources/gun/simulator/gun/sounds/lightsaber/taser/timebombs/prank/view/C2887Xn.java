package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2887Xn implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3994a;
    public final boolean b;

    public C2887Xn(C4619sw c4619sw, int i) {
        this.f3994a = (c4619sw.d & 1) != 0;
        this.b = C3557go.f(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2887Xn c2887Xn = (C2887Xn) obj;
        return AbstractC2802Ug.f3832a.d(this.b, c2887Xn.b).d(this.f3994a, c2887Xn.f3994a).f();
    }
}
