package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3986lj0 implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4660a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ VungleRtbNativeAd e;

    public C3986lj0(VungleRtbNativeAd vungleRtbNativeAd, Context context, String str, int i, String str2) {
        this.e = vungleRtbNativeAd;
        this.f4660a = context;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.e.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        VungleRtbNativeAd vungleRtbNativeAd = this.e;
        VungleFactory vungleFactory = vungleRtbNativeAd.g;
        String str = this.b;
        Context context = this.f4660a;
        vungleRtbNativeAd.d = vungleFactory.createNativeAd(context, str);
        vungleRtbNativeAd.d.setAdOptionsPosition(this.c);
        vungleRtbNativeAd.d.setAdListener(vungleRtbNativeAd);
        vungleRtbNativeAd.e = new SO(context);
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            vungleRtbNativeAd.d.getAdConfig().setWatermark(str2);
        }
        vungleRtbNativeAd.d.load(vungleRtbNativeAd.f);
    }
}
