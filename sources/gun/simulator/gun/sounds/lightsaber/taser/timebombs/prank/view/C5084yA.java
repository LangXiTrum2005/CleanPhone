package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5084yA extends AbstractC3882kb0 {
    public final /* synthetic */ GA e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5084yA(String str, GA ga, int i, int i2) {
        super(str, true);
        this.e = ga;
        this.f = i;
        this.g = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        int i = this.f;
        int i2 = this.g;
        GA ga = this.e;
        ga.getClass();
        try {
            ga.y.g(i, i2, true);
            return -1L;
        } catch (IOException e) {
            ga.b(e);
            return -1L;
        }
    }
}
