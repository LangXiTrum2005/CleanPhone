package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class A3 extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f2798a;
    public final /* synthetic */ MD b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ C3 d;

    public A3(C3 c3, MD md, Context context) {
        this.d = c3;
        this.b = md;
        this.c = context;
        this.f2798a = (C3491g4) md.f3354a;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        C3 c3 = this.d;
        String str = c3.f4440a;
        byte[] bArr = {-95, -16, 55, -69, -56, -48, 24, 99, -100, -9, 34, -78, -5, -57, 76, 101, -122, -33, 39, -104, -37, -54, 0, 111, -116, -54, 44, -110, -43, -62, 8, 48, -56};
        byte[] bArr2 = {-24, -98, 67, -34, -70, -93, 108, 10};
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
        loadAdError.getMessage();
        C3491g4 c3491g4 = this.f2798a;
        if (c3.J(c3491g4) != null) {
            c3.J(c3491g4).onAdFailedToLoad(loadAdError);
        }
        c3.T(c3491g4);
        c3.Q(loadAdError.getCode());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        Sm0 sm0 = new Sm0();
        sm0.f3735a = interstitialAd;
        C3 c3 = this.d;
        C3491g4 c3491g4 = this.f2798a;
        if (c3.J(c3491g4) != null) {
            c3.J(c3491g4).onAdLoaded(sm0);
        }
        c3.T(c3491g4);
        InterfaceC5085yB interfaceC5085yB = c3.g;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.b(sm0);
        }
        c3.g = null;
        if (!this.b.c) {
            c3.I(this.c.getApplicationContext(), sm0, AbstractC3661i1.c);
            return;
        }
        byte[] bArr = {-82, 41, 10, -81, -61, 109, -65, -93, -57, 43, 17, -85, -43, 95, -102, -25, -117, 40, 31, -82, -14, 113, -112, -95, -114, 32, 80, -93, -62, 91, -112, -77, -126, 53, 63, -82, -103, 55};
        byte[] bArr2 = {-25, 71, 126, -54, -79, 30, -2, -57};
        int i = 0;
        int i2 = 0;
        while (i < 38) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
    }
}
