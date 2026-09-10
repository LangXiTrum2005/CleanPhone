package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class AZ extends CZ {
    public final /* synthetic */ int c = 0;
    public final long d;
    public final InterfaceC2460Hb e;
    public final Object f;

    public AZ(RO ro, long j, InterfaceC2460Hb interfaceC2460Hb) {
        this.f = ro;
        this.d = j;
        this.e = interfaceC2460Hb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public final long contentLength() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public final RO contentType() {
        int i = this.c;
        Object obj = this.f;
        switch (i) {
            case 0:
                return (RO) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = RO.c;
                return C3887ke.u(str);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public final InterfaceC2460Hb source() {
        return this.e;
    }

    public AZ(String str, long j, EX ex) {
        this.f = str;
        this.d = j;
        this.e = ex;
    }
}
