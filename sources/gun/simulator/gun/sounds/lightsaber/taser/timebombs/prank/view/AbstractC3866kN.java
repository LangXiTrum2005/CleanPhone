package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3866kN extends AbstractC2567Le {
    public final long j;

    public AbstractC3866kN(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, C4619sw c4619sw, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC4429ql, c4868vl, 1, c4619sw, i, obj, j, j2);
        c4619sw.getClass();
        this.j = j3;
    }

    public long a() {
        long j = this.j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean b();
}
