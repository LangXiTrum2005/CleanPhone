package th;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f50764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f50765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f50766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AdView f50767k;

    @Override // th.a
    public final void b(AdRequest adRequest) {
        AdView adView = this.f50767k;
        RelativeLayout relativeLayout = this.f50764h;
        if (relativeLayout == null || adView == null) {
            return;
        }
        relativeLayout.addView(adView);
        adView.setAdSize(new AdSize(this.f50765i, this.f50766j));
        adView.setAdUnitId(this.f50759d.f48373c);
        adView.setAdListener(((d) ((b) this.f50762g)).f50770d);
        adView.loadAd(adRequest);
    }
}
