package com.unity3d.scar.adapter.v2300.scarads;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd;

/* JADX INFO: loaded from: classes6.dex */
public class ScarInterstitialAd extends ScarAdBase<InterstitialAd> implements IScarFullScreenAd {
    @Override // com.unity3d.scar.adapter.v2300.scarads.ScarAdBase
    public final void b(AdRequest adRequest) {
        InterstitialAd.load(this.f42833b, this.f42834c.f42792c, adRequest, ((ScarInterstitialAdListener) this.f42835e).d);
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd
    public final void show(Activity activity) {
        Object obj = this.f42832a;
        if (obj != null) {
            ((InterstitialAd) obj).show(activity);
        } else {
            this.f.handleError(GMAAdsError.a(this.f42834c));
        }
    }
}
