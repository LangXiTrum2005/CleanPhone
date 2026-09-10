package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3973ld extends C4935wa0 implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3973ld c3973ld = (C3973ld) obj;
        if (c(4) == c3973ld.c(4)) {
            long j = this.f - c3973ld.f;
            if (j == 0) {
                j = this.k - c3973ld.k;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!c(4)) {
            return -1;
        }
        return 1;
    }
}
