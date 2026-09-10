package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2644Oe implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3511a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public C2644Oe(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f3511a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        long[] jArr = this.e;
        int iF = Ug0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        Q30 q30 = new Q30(j2, jArr2[iF]);
        if (j2 >= j || iF == this.f3511a - 1) {
            return new N30(q30, q30);
        }
        int i = iF + 1;
        return new N30(q30, new Q30(jArr[i], jArr2[i]));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f3511a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
