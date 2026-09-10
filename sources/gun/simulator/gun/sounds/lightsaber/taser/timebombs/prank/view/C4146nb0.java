package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4146nb0 extends AbstractC3882kb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4146nb0(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((InterfaceC2714Qw) obj).invoke();
                break;
            default:
                GA ga = (GA) obj;
                ga.getClass();
                try {
                    ga.y.g(2, 0, false);
                } catch (IOException e) {
                    ga.b(e);
                }
                break;
        }
        return -1L;
    }
}
