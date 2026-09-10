package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class FA extends AbstractC3882kb0 {
    public final /* synthetic */ GA e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FA(String str, GA ga, int i, long j) {
        super(str, true);
        this.e = ga;
        this.f = i;
        this.g = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        GA ga = this.e;
        try {
            ga.y.k(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            ga.b(e);
            return -1L;
        }
    }
}
