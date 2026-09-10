package sg.bigo.ads.ad.interstitial.i;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.ad.banner.g;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.i;

/* JADX INFO: loaded from: classes7.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f46332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InterstitialAd f46333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f46334c;

    public a(InterstitialAd interstitialAd, Context context, n nVar) {
        this.f46334c = nVar;
        this.f46332a = context;
        this.f46333b = interstitialAd;
    }

    @Override // sg.bigo.ads.ad.banner.g
    public void a(View view, View view2, i.b bVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
    }
}
