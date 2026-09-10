package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.work.WorkRequest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2316Bn implements O30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2342Cn f2891a;

    public C2316Bn(C2342Cn c2342Cn) {
        this.f2891a = c2342Cn;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final long getDurationUs() {
        C2342Cn c2342Cn = this.f2891a;
        return (c2342Cn.f * 1000000) / ((long) c2342Cn.d.i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final N30 getSeekPoints(long j) {
        C2342Cn c2342Cn = this.f2891a;
        long j2 = (((long) c2342Cn.d.i) * j) / 1000000;
        long j3 = c2342Cn.c;
        long j4 = c2342Cn.b;
        Q30 q30 = new Q30(j, Ug0.k(((((j3 - j4) * j2) / c2342Cn.f) + j4) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, j4, j3 - 1));
        return new N30(q30, q30);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O30
    public final boolean isSeekable() {
        return true;
    }
}
