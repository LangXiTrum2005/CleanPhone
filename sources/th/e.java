package th;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends a implements ph.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f50771h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, ph.c cVar, sh.a aVar, com.unity3d.scar.adapter.common.c cVar2, int i10) {
        super(context, cVar, aVar, cVar2, 0);
        this.f50771h = i10;
    }

    @Override // th.a
    public final void b(AdRequest adRequest) {
        switch (this.f50771h) {
            case 0:
                InterstitialAd.load(this.f50758c, this.f50759d.f48373c, adRequest, ((h) ((b) this.f50762g)).f50778d);
                break;
            default:
                RewardedAd.load(this.f50758c, this.f50759d.f48373c, adRequest, ((j) ((b) this.f50762g)).f50784d);
                break;
        }
    }

    @Override // ph.a
    public final void show(Activity activity) {
        switch (this.f50771h) {
            case 0:
                Object obj = this.f50757b;
                if (obj == null) {
                    this.f50760e.handleError(com.unity3d.scar.adapter.common.a.a(this.f50759d));
                } else {
                    ((InterstitialAd) obj).show(activity);
                }
                break;
            default:
                Object obj2 = this.f50757b;
                if (obj2 == null) {
                    this.f50760e.handleError(com.unity3d.scar.adapter.common.a.a(this.f50759d));
                } else {
                    ((RewardedAd) obj2).show(activity, ((j) ((b) this.f50762g)).f50785e);
                }
                break;
        }
    }
}
