package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class BA extends AbstractC3882kb0 {
    public final /* synthetic */ GA e;
    public final /* synthetic */ int f;
    public final /* synthetic */ C4848vb g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BA(String str, GA ga, int i, C4848vb c4848vb, int i2, boolean z) {
        super(str, true);
        this.e = ga;
        this.f = i;
        this.g = c4848vb;
        this.h = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        try {
            G7 g7 = this.e.l;
            C4848vb c4848vb = this.g;
            int i = this.h;
            g7.getClass();
            AbstractC2995aW.q(c4848vb, "source");
            c4848vb.skip(i);
            this.e.y.h(this.f, EnumC2502Ir.CANCEL);
            synchronized (this.e) {
                this.e.A.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
