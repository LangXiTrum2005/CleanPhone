package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3173cX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3085bX f4226a = new C3085bX();
    public static final T b;

    static {
        Integer num = AbstractC4297pE.f4827a;
        b = (num == null || num.intValue() >= 34) ? new BU() : new C2400Et();
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract long c();

    public long d(long j, long j2) {
        long jC;
        long j3;
        long jA;
        int iB;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jC = c() >>> 1;
                    j3 = jC % j4;
                } while ((j4 - 1) + (jC - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jC2 = c();
            if (j <= jC2 && jC2 < j2) {
                return jC2;
            }
        }
    }
}
