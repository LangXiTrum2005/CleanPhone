package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Tm0 implements InterfaceC3592hB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppOpenAd f3792a;

    static {
        byte[] bArr = {90, -66, 20, -80, -70, 41, 58, 6, 84, -86, 28, -79, -103, 12};
        byte[] bArr2 = {27, -38, 121, -33, -40, 104, 74, 118};
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

    public Tm0(AppOpenAd appOpenAd) {
        this.f3792a = appOpenAd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final DZ a() {
        return new C3751j3(this, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        AppOpenAd appOpenAd = this.f3792a;
        if (appOpenAd != null) {
            return appOpenAd.getAdUnitId();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
    }
}
