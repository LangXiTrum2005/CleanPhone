package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class DJ extends AJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2966a;
    public final long b;
    public boolean c;
    public long d;

    public DJ(long j, long j2, long j3) {
        this.f2966a = j3;
        this.b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AJ
    public final long nextLong() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.f2966a + j;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return j;
    }
}
