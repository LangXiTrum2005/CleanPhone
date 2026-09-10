package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2976aD implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f4114a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public C2976aD(long[] jArr, long[] jArr2, long j) {
        FW.h(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.f4114a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f4114a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        if (!this.d) {
            Q30 q30 = Q30.c;
            return new N30(q30, q30);
        }
        long[] jArr = this.b;
        int iF = Ug0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.f4114a;
        Q30 q31 = new Q30(j2, jArr2[iF]);
        if (j2 == j || iF == jArr.length - 1) {
            return new N30(q31, q31);
        }
        int i = iF + 1;
        return new N30(q31, new Q30(jArr[i], jArr2[i]));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return this.d;
    }
}
