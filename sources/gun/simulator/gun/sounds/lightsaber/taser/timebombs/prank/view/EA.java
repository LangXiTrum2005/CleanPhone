package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class EA extends AbstractC3882kb0 {
    public final /* synthetic */ GA e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EA(String str, GA ga, long j) {
        super(str, true);
        this.e = ga;
        this.f = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        GA ga;
        boolean z;
        synchronized (this.e) {
            ga = this.e;
            long j = ga.n;
            long j2 = ga.m;
            if (j < j2) {
                z = true;
            } else {
                ga.m = j2 + 1;
                z = false;
            }
        }
        if (z) {
            ga.b(null);
            return -1L;
        }
        try {
            ga.y.g(1, 0, false);
        } catch (IOException e) {
            ga.b(e);
        }
        return this.f;
    }
}
