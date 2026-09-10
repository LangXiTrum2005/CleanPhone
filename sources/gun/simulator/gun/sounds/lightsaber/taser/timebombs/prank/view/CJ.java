package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CJ implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2916a;
    public final long b;
    public final long c;

    public CJ(long j, long j2) {
        this.f2916a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new DJ(this.f2916a, this.b, this.c);
    }
}
