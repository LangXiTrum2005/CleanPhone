package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DA extends AbstractC3882kb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ GA f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DA(String str, GA ga, int i, Object obj, int i2) {
        super(str, true);
        this.e = i2;
        this.f = ga;
        this.g = i;
        this.h = obj;
    }

    private void b() {
        G7 g7 = this.f.l;
        EnumC2502Ir enumC2502Ir = (EnumC2502Ir) this.h;
        g7.getClass();
        AbstractC2995aW.q(enumC2502Ir, "errorCode");
        synchronized (this.f) {
            this.f.A.remove(Integer.valueOf(this.g));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        switch (this.e) {
            case 0:
                b();
                return -1L;
            case 1:
                GA ga = this.f;
                try {
                    int i = this.g;
                    EnumC2502Ir enumC2502Ir = (EnumC2502Ir) this.h;
                    ga.getClass();
                    AbstractC2995aW.q(enumC2502Ir, "statusCode");
                    ga.y.h(i, enumC2502Ir);
                    break;
                } catch (IOException e) {
                    ga.b(e);
                }
                return -1L;
            default:
                G7 g7 = this.f.l;
                List list = (List) this.h;
                g7.getClass();
                AbstractC2995aW.q(list, "requestHeaders");
                try {
                    this.f.y.h(this.g, EnumC2502Ir.CANCEL);
                    synchronized (this.f) {
                        this.f.A.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}
