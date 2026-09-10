package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4414qd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3712id0 f4891a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public C4414qd0(C3712id0 c3712id0, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        FW.h(iArr.length == jArr2.length);
        FW.h(jArr.length == jArr2.length);
        FW.h(iArr2.length == jArr2.length);
        this.f4891a = c3712id0;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iB = Ug0.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
