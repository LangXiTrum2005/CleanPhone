package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3810jj0 implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4566a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdSize c;
    public final /* synthetic */ C3105bi0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ VungleRtbBannerAd g;

    public C3810jj0(VungleRtbBannerAd vungleRtbBannerAd, Context context, String str, AdSize adSize, C3105bi0 c3105bi0, String str2, String str3) {
        this.g = vungleRtbBannerAd;
        this.f4566a = context;
        this.b = str;
        this.c = adSize;
        this.d = c3105bi0;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.g.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        VungleRtbBannerAd vungleRtbBannerAd = this.g;
        vungleRtbBannerAd.getClass();
        Context context = this.f4566a;
        vungleRtbBannerAd.e = new RelativeLayout(context);
        AdSize adSize = this.c;
        int heightInPixels = adSize.getHeightInPixels(context);
        C3105bi0 c3105bi0 = this.d;
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(c3105bi0.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        vungleRtbBannerAd.e.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        Di0 di0CreateBannerAd = vungleRtbBannerAd.f.createBannerAd(context, this.b, c3105bi0);
        vungleRtbBannerAd.d = di0CreateBannerAd;
        di0CreateBannerAd.setAdListener(vungleRtbBannerAd);
        String str = this.f;
        if (!TextUtils.isEmpty(str)) {
            vungleRtbBannerAd.d.getAdConfig().setWatermark(str);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14, -1);
        layoutParams.addRule(15, -1);
        vungleRtbBannerAd.e.addView(vungleRtbBannerAd.d, layoutParams);
        vungleRtbBannerAd.d.load(this.e);
    }
}
