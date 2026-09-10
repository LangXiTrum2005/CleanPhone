package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Kn0 extends S implements CB {
    public final NativeAd d;
    public final String e;
    public final C4258on0 f;
    public HB g;
    public C4258on0 h;

    static {
        byte[] bArr = {-79, -118, 74, -60, 88, -104, 32, 49, -103, -104, 66, -22, 94};
        byte[] bArr2 = {-16, -18, 39, -85, 58, -42, 65, 69};
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

    public Kn0(NativeAd nativeAd, String str) {
        this.d = nativeAd;
        this.e = str;
        if (nativeAd == null || nativeAd.getMediaContent() == null) {
            return;
        }
        this.f = new C4258on0(nativeAd.getMediaContent(), 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final DZ a() {
        return new C4258on0(this, 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        String str = this.e;
        return str != null ? str : "";
    }

    public final void g() {
        NativeAd nativeAd = this.d;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        C4258on0 c4258on0 = this.h;
        if (c4258on0 != null) {
            c4258on0.b = null;
        }
        HB hb = this.g;
        if (hb != null) {
            C3908ko0 c3908ko0 = (C3908ko0) hb;
            NativeAdView nativeAdView = c3908ko0.f4617a;
            if (nativeAdView != null) {
                nativeAdView.destroy();
            }
            NativeAd nativeAd2 = c3908ko0.c;
            if (nativeAd2 != null) {
                nativeAd2.destroy();
            }
            c3908ko0.f4617a = null;
            c3908ko0.d = null;
            c3908ko0.b = null;
            c3908ko0.c = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CB
    public final C4258on0 getMediaContent() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CB
    public final C4258on0 getMediaView() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
    }
}
