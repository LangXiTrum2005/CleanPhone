package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.nativead.NativeAd;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Sn0 implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3958lR f3737a;
    public final /* synthetic */ EB b;
    public final /* synthetic */ C3293do0 c;

    public Sn0(C3293do0 c3293do0, C4191o3 c4191o3, C3958lR c3958lR) {
        this.c = c3293do0;
        this.f3737a = c3958lR;
        this.b = c4191o3;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        C3958lR c3958lR = this.f3737a;
        c3958lR.c.K(System.currentTimeMillis());
        C3491g4 c3491g4 = c3958lR.c;
        C3293do0 c3293do0 = this.c;
        c3293do0.S(c3491g4, "", 1);
        Kn0 kn0 = new Kn0(nativeAd, c3958lR.c.w(1));
        X0 x0 = X0.j;
        C3908ko0 c3908ko0 = new C3908ko0(x0.j());
        C4258on0 c4258on0 = new C4258on0(x0.j());
        kn0.g = c3908ko0;
        kn0.h = c4258on0;
        System.currentTimeMillis();
        c3293do0.T(c3958lR.c, "", kn0);
        byte[] bArr = {-113, 36, 106, -58, -94, com.umeng.analytics.pro.cw.l, -1, 44, -31, 53, 108, -54, -72, 4, -33, 44, -128, 33, 62, -64, -70, 42, -38, 4, -82, 36, 122, -54, -80};
        byte[] bArr2 = {-63, 69, 30, -81, -44, 107, -66, 72};
        int i = 0;
        int i2 = 0;
        while (i < 29) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        EB eb = this.b;
        if (eb != null) {
            eb.b(kn0);
        }
        if (c3293do0.t.get(c3958lR.c) != null) {
            ((NativeAd.OnNativeAdLoadedListener) c3293do0.t.get(c3958lR.c)).onNativeAdLoaded(nativeAd);
        }
        c3293do0.t.remove(c3958lR.c);
        c3293do0.I(x0.j(), kn0, AbstractC3661i1.i);
    }
}
