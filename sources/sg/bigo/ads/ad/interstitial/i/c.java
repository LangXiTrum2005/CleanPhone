package sg.bigo.ads.ad.interstitial.i;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {
    public c(InterstitialAd interstitialAd, Context context, n nVar) {
        super(interstitialAd, context, nVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a, sg.bigo.ads.ad.banner.g
    public final void a(View view, View view2, i.b bVar) {
        int iA = bVar != null ? bVar.a() : 0;
        int iB = bVar != null ? bVar.b() : 0;
        Context context = this.f46332a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (iA <= 0 || iB <= 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            return;
        }
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        int iC = e.c(context);
        if (iA > iB) {
            layoutParams.width = -1;
            layoutParams.height = (int) (((iB * 1.0f) / iA) * i2);
        } else {
            layoutParams.width = (int) (((iA * 1.0f) / iB) * iC);
            layoutParams.height = -1;
        }
        layoutParams.gravity = 17;
    }
}
