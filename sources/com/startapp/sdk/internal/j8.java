package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestMode;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestType;
import com.startapp.sdk.common.utils.Pair;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class j8 extends com.startapp.sdk.adsbase.model.a {
    public GetAdRequest$VideoRequestType V0;
    public GetAdRequest$VideoRequestMode W0 = GetAdRequest$VideoRequestMode.INTERSTITIAL;

    @Override // com.startapp.sdk.adsbase.model.a
    public final void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        super.a(context, adPreferences, placement, pair);
        Ad.AdType adType = this.U0;
        if (adType != null) {
            if (adType == Ad.AdType.NON_VIDEO) {
                this.V0 = GetAdRequest$VideoRequestType.DISABLED;
            } else if (adType == Ad.AdType.VIDEO_NO_VAST) {
                this.V0 = GetAdRequest$VideoRequestType.FORCED_NONVAST;
            } else if (adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO) {
                this.V0 = GetAdRequest$VideoRequestType.FORCED;
            }
        } else if (gk.a(context) == VideoUtil$VideoEligibility.ELIGIBLE) {
            WeakHashMap weakHashMap = vi.f41589a;
            this.V0 = GetAdRequest$VideoRequestType.ENABLED;
        } else {
            this.V0 = GetAdRequest$VideoRequestType.DISABLED;
        }
        Ad.AdType adType2 = this.U0;
        if (adType2 == Ad.AdType.REWARDED_VIDEO) {
            this.W0 = GetAdRequest$VideoRequestMode.REWARDED;
        }
        if (adType2 == Ad.AdType.VIDEO) {
            this.W0 = GetAdRequest$VideoRequestMode.INTERSTITIAL;
        }
    }

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a("video", this.V0, false, true);
        veVar.a("videoMode", this.W0, false, true);
    }
}
