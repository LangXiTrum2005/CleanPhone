package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4498rc extends CZ {
    public final C3559gp c;
    public final String d;
    public final String e;
    public final EX f;

    public C4498rc(C3559gp c3559gp, String str, String str2) {
        this.c = c3559gp;
        this.d = str;
        this.e = str2;
        this.f = AbstractC4496rb.f(new C4411qc((InterfaceC3588h80) c3559gp.c.get(1), this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public final long contentLength() {
        String str = this.e;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = Vg0.f3884a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public final RO contentType() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        Pattern pattern = RO.c;
        return C3887ke.u(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ
    public final InterfaceC2460Hb source() {
        return this.f;
    }
}
