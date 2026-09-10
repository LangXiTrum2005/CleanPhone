package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CA extends AbstractC3882kb0 {
    public final /* synthetic */ GA e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CA(String str, GA ga, int i, List list, boolean z) {
        super(str, true);
        this.e = ga;
        this.f = i;
        this.g = list;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        G7 g7 = this.e.l;
        List list = this.g;
        g7.getClass();
        AbstractC2995aW.q(list, "responseHeaders");
        try {
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
