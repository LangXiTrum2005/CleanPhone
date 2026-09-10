package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Rm0 implements InterfaceC3240dB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sm0 f3679a;
    public final InterfaceC3592hB b;
    public final int c;

    static {
        byte[] bArr = {-116, -10, 27, -53, -113, 28, -75, -111, -88, -32, 55, -64};
        byte[] bArr2 = {-51, -110, 118, -92, -19, 89, -37, -27};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    public Rm0(Sm0 sm0) {
        this.b = null;
        this.c = 1;
        this.f3679a = sm0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final DZ a() {
        return new Dn0(this, 4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
        InterfaceC3240dB interfaceC3240dBE = e();
        if (interfaceC3240dBE != null) {
            interfaceC3240dBE.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        return e() != null ? e().d() : "";
    }

    public final InterfaceC3240dB e() {
        InterfaceC3592hB interfaceC3592hB;
        Sm0 sm0;
        int i = this.c;
        if (i == 1 && (sm0 = this.f3679a) != null) {
            return sm0;
        }
        if (i != 2 || (interfaceC3592hB = this.b) == null) {
            return null;
        }
        return interfaceC3592hB;
    }

    public Rm0(InterfaceC3592hB interfaceC3592hB) {
        this.f3679a = null;
        this.c = 2;
        this.b = interfaceC3592hB;
    }
}
