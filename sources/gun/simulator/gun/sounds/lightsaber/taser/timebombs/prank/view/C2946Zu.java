package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2946Zu implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4098a;
    public final long b;
    public final Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2946Zu(long j) {
        this(j, 0L);
        this.f4098a = 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        switch (this.f4098a) {
            case 0:
                return ((C3036av) this.c).b();
            default:
                return this.b;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        int i = this.f4098a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                C3036av c3036av = (C3036av) obj;
                FW.t(c3036av.k);
                C3491g4 c3491g4 = c3036av.k;
                long[] jArr = (long[]) c3491g4.b;
                long[] jArr2 = (long[]) c3491g4.c;
                int iF = Ug0.f(jArr, Ug0.k((((long) c3036av.e) * j) / 1000000, 0L, c3036av.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                long j4 = (j2 * 1000000) / ((long) ((C3036av) obj).e);
                long j5 = this.b;
                Q30 q30 = new Q30(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new N30(q30, q30);
                }
                int i3 = iF + 1;
                return new N30(q30, new Q30((jArr[i3] * 1000000) / ((long) ((C3036av) obj).e), j5 + jArr2[i3]));
            case 1:
                return (N30) obj;
            default:
                C4728u8 c4728u8 = (C4728u8) obj;
                N30 n30B = c4728u8.g[0].b(j);
                while (true) {
                    C2670Pe[] c2670PeArr = c4728u8.g;
                    if (i2 >= c2670PeArr.length) {
                        return n30B;
                    }
                    N30 n30B2 = c2670PeArr[i2].b(j);
                    if (n30B2.f3437a.b < n30B.f3437a.b) {
                        n30B = n30B2;
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        switch (this.f4098a) {
            case 1:
                return false;
            default:
                return true;
        }
    }

    public /* synthetic */ C2946Zu(Object obj, long j, int i) {
        this.f4098a = i;
        this.c = obj;
        this.b = j;
    }

    public C2946Zu(long j, long j2) {
        this.f4098a = 1;
        this.b = j;
        Q30 q30 = j2 == 0 ? Q30.c : new Q30(0L, j2);
        this.c = new N30(q30, q30);
    }
}
