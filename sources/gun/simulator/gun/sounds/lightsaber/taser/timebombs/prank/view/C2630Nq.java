package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2630Nq {
    public static final long[] e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D40 f3480a;
    public final InterfaceC3567gx b;
    public long c;
    public final long[] d;

    public C2630Nq(D40 d40, C4210oF c4210oF) {
        AbstractC2995aW.q(d40, "descriptor");
        this.f3480a = d40;
        this.b = c4210oF;
        int iD = d40.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }
}
