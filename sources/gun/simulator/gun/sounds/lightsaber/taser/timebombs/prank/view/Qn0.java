package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Qn0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EB f3626a;
    public final /* synthetic */ C3958lR b;
    public final /* synthetic */ C3293do0 c;

    public Qn0(C3293do0 c3293do0, C4191o3 c4191o3, C3958lR c3958lR) {
        this.c = c3293do0;
        this.f3626a = c4191o3;
        this.b = c3958lR;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        C3293do0 c3293do0 = this.c;
        String str = c3293do0.f4440a;
        byte[] bArr = {-36, 109, -56, -8, -62, -77, 12, -94, -78, 124, -50, -12, -40, -71, 44, -94, -45, 104, -122, -79, -37, -72, 12, -94, -47, 96, -43, -14, -33, -77, 41};
        byte[] bArr2 = {-110, 12, -68, -111, -76, -42, 77, -58};
        int i = 0;
        int i2 = 0;
        while (i < 31) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3958lR c3958lR = this.b;
        if (c3293do0.f0(c3958lR.c) != null) {
            c3293do0.f0(c3958lR.c).onAdClicked();
        }
        AbstractC3570h.x();
        X0.j.k();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        C3293do0 c3293do0 = this.c;
        String str = c3293do0.f4440a;
        byte[] bArr = {-127, -26, 81, -67, -57, 57, -43, -54, -17, -9, 87, -79, -35, 51, -11, -54, -114, -29, 31, -12, -34, 50, -43, -54, -116, -21, 74, -89, -44, 56, -76};
        byte[] bArr2 = {-49, -121, 37, -44, -79, 92, -108, -82};
        int i = 0;
        int i2 = 0;
        while (i < 31) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3958lR c3958lR = this.b;
        if (c3293do0.f0(c3958lR.c) != null) {
            c3293do0.f0(c3958lR.c).onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        C3293do0 c3293do0 = this.c;
        String str = c3293do0.f4440a;
        byte[] bArr = {-22, 68, 35, -109, 105, 123, 93, 37, -124, 85, 37, -97, 115, 113, 125, 37, -27, 65, 109, -38, 112, 112, 93, 37, -30, 68, 62, -106, 122, 122, 72, 46, -24, 74, 54, -98};
        byte[] bArr2 = {-92, 37, 87, -6, 31, 30, 28, 65};
        int i = 0;
        int i2 = 0;
        while (i < 36) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3958lR c3958lR = this.b;
        c3293do0.S(c3958lR.c, "", 2);
        c3958lR.c.M(2);
        EB eb = this.f3626a;
        if (eb != null) {
            eb.a(loadAdError != null ? new C3205co0(loadAdError.getCode(), null, null) : null);
        }
        if (c3293do0.f0(c3958lR.c) != null) {
            c3293do0.f0(c3958lR.c).onAdFailedToLoad(loadAdError);
        }
        c3293do0.B0(c3958lR.c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        C3293do0 c3293do0 = this.c;
        String str = c3293do0.f4440a;
        byte[] bArr = {-66, -72, 94, -124, -53, -114, -1, -115, -48, -87, 88, -120, -47, -124, -33, -115, -79, -67, com.umeng.analytics.pro.cw.n, -51, -46, -123, -1, -115, -71, -76, 90, -97, -40, -104, -51, -128, -97, -73};
        byte[] bArr2 = {-16, -39, 42, -19, -67, -21, -66, -23};
        int i = 0;
        int i2 = 0;
        while (i < 34) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3958lR c3958lR = this.b;
        if (c3293do0.f0(c3958lR.c) != null) {
            c3293do0.f0(c3958lR.c).onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        C3293do0 c3293do0 = this.c;
        String str = c3293do0.f4440a;
        byte[] bArr = {37, 61, -125, -74, -122, 60, -23, 35, 75, 44, -123, -70, -100, 54, -55, 35, 42, 56, -51, -1, -97, 55, -23, 35, 39, 51, -106, -69, -107, 61};
        byte[] bArr2 = {107, 92, -9, -33, -16, 89, -88, 71};
        int i = 0;
        int i2 = 0;
        while (i < 30) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3958lR c3958lR = this.b;
        C3491g4 c3491g4 = c3958lR.c;
        c3491g4.M(1);
        c3491g4.L(3000000L);
        if (c3293do0.f0(c3958lR.c) != null) {
            c3293do0.f0(c3958lR.c).onAdLoaded();
        }
        c3293do0.B0(c3958lR.c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        C3293do0 c3293do0 = this.c;
        String str = c3293do0.f4440a;
        byte[] bArr = {40, -85, -101, -22, -86, 51, 75, -67, 70, -70, -99, -26, -80, 57, 107, -67, 39, -82, -43, -93, -77, 56, 75, -67, 41, -70, -118, -19, -71, 50};
        byte[] bArr2 = {102, -54, -17, -125, -36, 86, 10, -39};
        int i = 0;
        int i2 = 0;
        while (i < 30) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3958lR c3958lR = this.b;
        if (c3293do0.f0(c3958lR.c) != null) {
            c3293do0.f0(c3958lR.c).onAdOpened();
        }
    }
}
