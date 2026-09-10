package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3544gh0 implements S30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f4426a;
    public final long[] b;
    public final long c;
    public final long d;

    public C3544gh0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f4426a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long c() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        long[] jArr = this.f4426a;
        int iF = Ug0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        Q30 q30 = new Q30(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new N30(q30, q30);
        }
        int i = iF + 1;
        return new N30(q30, new Q30(jArr[i], jArr2[i]));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S30
    public final long getTimeUs(long j) {
        return this.f4426a[Ug0.f(this.b, j, true)];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }
}
