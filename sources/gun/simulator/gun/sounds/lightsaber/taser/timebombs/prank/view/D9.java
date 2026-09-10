package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D9 extends AbstractC3866kN {
    public final long k;
    public final long l;
    public F9 m;
    public int[] n;

    public D9(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, C4619sw c4619sw, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(interfaceC4429ql, c4868vl, c4619sw, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int c(int i) {
        int[] iArr = this.n;
        FW.t(iArr);
        return iArr[i];
    }
}
