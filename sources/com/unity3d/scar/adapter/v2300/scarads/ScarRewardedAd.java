package com.unity3d.scar.adapter.v2300.scarads;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd;

/* JADX INFO: loaded from: classes6.dex */
public class ScarRewardedAd extends ScarAdBase<RewardedAd> implements IScarFullScreenAd {
    @Override // com.unity3d.scar.adapter.v2300.scarads.ScarAdBase
    public final void b(AdRequest adRequest) {
        RewardedAd.load(this.f42833b, this.f42834c.f42792c, adRequest, ((ScarRewardedAdListener) this.f42835e).d);
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd
    public final void show(Activity activity) {
        Object obj = this.f42832a;
        if (obj != null) {
            ((RewardedAd) obj).show(activity, ((ScarRewardedAdListener) this.f42835e).f42846e);
        } else {
            this.f.handleError(GMAAdsError.a(this.f42834c));
        }
    }
}
