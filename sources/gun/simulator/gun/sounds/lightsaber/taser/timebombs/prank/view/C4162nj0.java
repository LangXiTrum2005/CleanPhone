package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4162nj0 implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4755a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C3573h1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ VungleRtbRewardedAd f;

    public C4162nj0(VungleRtbRewardedAd vungleRtbRewardedAd, Context context, String str, C3573h1 c3573h1, String str2, String str3) {
        this.f = vungleRtbRewardedAd;
        this.f4755a = context;
        this.b = str;
        this.c = c3573h1;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.f.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        VungleRtbRewardedAd vungleRtbRewardedAd = this.f;
        vungleRtbRewardedAd.d = vungleRtbRewardedAd.e.createRewardedAd(this.f4755a, this.b, this.c);
        vungleRtbRewardedAd.d.setAdListener(vungleRtbRewardedAd);
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            vungleRtbRewardedAd.d.setUserId(str);
        }
        vungleRtbRewardedAd.d.load(this.e);
    }
}
