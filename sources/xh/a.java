package xh;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends th.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f53795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AdView f53798k;

    @Override // th.a
    public final void b(AdRequest adRequest) {
        AdView adView = this.f53798k;
        RelativeLayout relativeLayout = this.f53795h;
        if (relativeLayout == null || adView == null) {
            return;
        }
        relativeLayout.addView(adView);
        adView.setAdSize(new AdSize(this.f53796i, this.f53797j));
        adView.setAdUnitId(this.f50759d.f48373c);
        adView.setAdListener(((b) ((th.b) this.f50762g)).f53801d);
        adView.loadAd(adRequest);
    }
}
