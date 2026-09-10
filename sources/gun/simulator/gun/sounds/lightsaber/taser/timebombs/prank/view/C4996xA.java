package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4996xA extends AbstractC3882kb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ GA f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4996xA(String str, GA ga, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = ga;
        this.g = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        switch (this.e) {
            case 0:
                GA ga = this.f;
                ga.b.a(ga, (R50) ((C3086bY) this.g).f4172a);
                break;
            default:
                try {
                    this.f.b.b((MA) this.g);
                } catch (IOException e) {
                    C5104yU c5104yU = C5104yU.f5278a;
                    C5104yU c5104yU2 = C5104yU.f5278a;
                    String strV0 = AbstractC2995aW.v0(this.f.d, "Http2Connection.Listener failure for ");
                    c5104yU2.getClass();
                    C5104yU.i(4, strV0, e);
                    try {
                        ((MA) this.g).c(EnumC2502Ir.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                break;
        }
        return -1L;
    }
}
