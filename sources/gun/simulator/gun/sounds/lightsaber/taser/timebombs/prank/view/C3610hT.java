package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3610hT implements InterfaceC3240dB {
    static {
        byte[] bArr = {-128, 127, 35, 123, -112, -90, -76, -29, -111, 88};
        byte[] bArr2 = {-48, 60, 109, 26, -28, -49, -62, -122};
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final /* synthetic */ DZ a() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
        byte[] bArr = {85, -25, -26, -39, 108, 54, -61, 67, 68, -64, -120, -37, 121, 49, -107, 72, 106, -48, -120, -33, 125, 43, -107, 105, 107, -12, -55, -63, 117, 58, -37, 82, 64, -46, -51, -42, 108, 19, -36, 85, 113, -63, -58, -35, 106};
        byte[] bArr2 = {5, -92, -88, -72, 24, 95, -75, 38};
        int i = 0;
        int i2 = 0;
        while (i < 45) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        byte[] bArr = {-18, -65, 47};
        byte[] bArr2 = {-98, -36, 112, 90, 110, 84, 20, 127};
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
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
