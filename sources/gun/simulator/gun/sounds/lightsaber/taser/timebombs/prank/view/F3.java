package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class F3 extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f3050a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ H3 c;

    public F3(H3 h3, VZ vz, Context context) {
        this.c = h3;
        this.b = context;
        this.f3050a = (C3491g4) vz.f3354a;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        H3 h3 = this.c;
        String str = h3.f4440a;
        byte[] bArr = {113, -81, 77, -52, 85, com.umeng.analytics.pro.cw.k, 87, 71, 98, -82, 26, -63, 72, 8, 86, 98, 71, -22, 85, -61, 102, com.umeng.analytics.pro.cw.k, 116, 66, 74, -90, 95, -55, 115, 6, 126, 76, 66, -82, 0, -115};
        byte[] bArr2 = {35, -54, 58, -83, 39, 105, 50, 35};
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
        C3491g4 c3491g4 = this.f3050a;
        if (h3.J(c3491g4) != null) {
            h3.J(c3491g4).onAdFailedToLoad(loadAdError);
        }
        h3.T(c3491g4);
        h3.Q(loadAdError.getCode());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        H3 h3 = this.c;
        String str = h3.f4440a;
        byte[] bArr = {-95, 109, -12, -21, -109, 122, -46, -103, -78, 108, -93, -26, -114, 127, -45, -68, -105, 40, -20, -28, -96, 122, -5, -110, -110, 108, -26, -18, -37, 62, -123};
        byte[] bArr2 = {-13, 8, -125, -118, -31, 30, -73, -3};
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
        Bn0 bn0 = new Bn0(rewardedAd2);
        C3491g4 c3491g4 = this.f3050a;
        if (h3.J(c3491g4) != null) {
            h3.J(c3491g4).onAdLoaded(bn0);
        }
        h3.T(c3491g4);
        InterfaceC5085yB interfaceC5085yB = h3.g;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.b(bn0);
        }
        h3.g = null;
        h3.I(this.b.getApplicationContext(), bn0, AbstractC3661i1.j);
    }
}
