package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.en0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3380en0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EB f4339a;
    public final /* synthetic */ C4015m3 b;
    public final /* synthetic */ Pm0[] c;
    public final /* synthetic */ C4082mn0 d;

    public C3380en0(C4082mn0 c4082mn0, C4191o3 c4191o3, C4015m3 c4015m3, Pm0[] pm0Arr) {
        this.d = c4082mn0;
        this.f4339a = c4191o3;
        this.b = c4015m3;
        this.c = pm0Arr;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        C4082mn0 c4082mn0 = this.d;
        String str = c4082mn0.f4440a;
        byte[] bArr = {47, -9, -85, 104, -37, 58, 39, -8, 59, -91, -95, 106, -11, 63, 0, -43, 54, -26, -91, 97, -48};
        byte[] bArr2 = {95, -123, -50, 4, -76, 91, 67, -71};
        int i = 0;
        int i2 = 0;
        while (i < 21) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C4015m3 c4015m3 = this.b;
        if (c4082mn0.f0(c4015m3.c) != null) {
            c4082mn0.f0(c4015m3.c).onAdClicked();
        }
        AbstractC3570h.x();
        X0.j.k();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        C4082mn0 c4082mn0 = this.d;
        String str = c4082mn0.f4440a;
        byte[] bArr = {com.umeng.analytics.pro.cw.l, com.umeng.analytics.pro.cw.k, 111, -82, 55, -48, 23, 67, 26, 95, 101, -84, 25, -43, 48, 110, 17, 12, 111, -90};
        byte[] bArr2 = {126, 127, 10, -62, 88, -79, 115, 2};
        int i = 0;
        int i2 = 0;
        while (i < 20) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C4015m3 c4015m3 = this.b;
        if (c4082mn0.f0(c4015m3.c) != null) {
            c4082mn0.f0(c4015m3.c).onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        C4082mn0 c4082mn0 = this.d;
        String str = c4082mn0.f4440a;
        byte[] bArr = {-40, 78, 53, 31, 119, 125, 41, 103, -52, 28, 63, 29, 89, 120, 11, 71, -63, 80, 53, 23, 76, 115, 1, 73, -55, 88, 112};
        byte[] bArr2 = {-88, 60, 80, 115, 24, 28, 77, 38};
        int i = 0;
        int i2 = 0;
        while (i < 27) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        loadAdError.getCode();
        loadAdError.getMessage();
        C4015m3 c4015m3 = this.b;
        c4082mn0.S(c4015m3.c, "", 2);
        c4015m3.c.M(2);
        EB eb = this.f4339a;
        if (eb != null) {
            eb.a(new C3205co0(loadAdError.getCode(), null, null));
        }
        if (c4082mn0.f0(c4015m3.c) != null) {
            c4082mn0.f0(c4015m3.c).onAdFailedToLoad(loadAdError);
        }
        c4082mn0.B0(c4015m3.c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        C4082mn0 c4082mn0 = this.d;
        String str = c4082mn0.f4440a;
        byte[] bArr = {28, -91, 75, 28, 61, -20, -26, 116, 8, -9, 65, 30, 19, -23, -53, 88, 28, -91, 75, 3, 33, -28, -19, 91};
        byte[] bArr2 = {108, -41, 46, 112, 82, -115, -126, 53};
        int i = 0;
        int i2 = 0;
        while (i < 24) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C4015m3 c4015m3 = this.b;
        if (c4082mn0.f0(c4015m3.c) != null) {
            c4082mn0.f0(c4015m3.c).onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        C4082mn0 c4082mn0 = this.d;
        String str = c4082mn0.f4440a;
        byte[] bArr = {com.umeng.analytics.pro.cw.n, 62, 117, -44, 109, 40, 42, -73, 4, 108, 127, -42, 67, 45, 2, -103, 1, 40, 117, -36};
        byte[] bArr2 = {96, 76, com.umeng.analytics.pro.cw.n, -72, 2, 73, 78, -10};
        int i = 0;
        int i2 = 0;
        while (i < 20) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C4015m3 c4015m3 = this.b;
        c4082mn0.T(c4015m3.c, "", this.c[0]);
        c4082mn0.S(c4015m3.c, "", 1);
        c4015m3.c.K(System.currentTimeMillis());
        Pm0 pm0 = (Pm0) c4082mn0.g0(c4015m3.c, "");
        C3491g4 c3491g4 = c4015m3.c;
        c3491g4.M(1);
        c3491g4.L(3000000L);
        c4082mn0.t = 3;
        if (pm0 != null) {
            System.currentTimeMillis();
        }
        EB eb = this.f4339a;
        if (eb != null) {
            eb.b(pm0);
        }
        if (c4082mn0.f0(c4015m3.c) != null) {
            c4082mn0.f0(c4015m3.c).onAdLoaded();
        }
        c4082mn0.B0(c4015m3.c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        C4082mn0 c4082mn0 = this.d;
        String str = c4082mn0.f4440a;
        byte[] bArr = {38, 60, 74, -8, -66, 7, -107, 62, 50, 110, 64, -6, -112, 2, -66, com.umeng.analytics.pro.cw.m, 51, 32, 74, -16};
        byte[] bArr2 = {86, 78, 47, -108, -47, 102, -15, 127};
        int i = 0;
        int i2 = 0;
        while (i < 20) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C4015m3 c4015m3 = this.b;
        if (c4082mn0.f0(c4015m3.c) != null) {
            c4082mn0.f0(c4015m3.c).onAdOpened();
        }
    }
}
