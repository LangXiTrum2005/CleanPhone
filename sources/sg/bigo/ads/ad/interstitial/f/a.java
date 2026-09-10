package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.R;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public class a extends d {
    public a(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage_7_8;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        super.b();
        View viewO = o(R.id.inter_webview_close);
        LandingPageStyleConfig landingPageStyleConfig = ((d) this).f46255a;
        if (landingPageStyleConfig == null || viewO == null || landingPageStyleConfig.f48168a != 8) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewO.getLayoutParams();
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(this.f47011I, 20);
    }
}
