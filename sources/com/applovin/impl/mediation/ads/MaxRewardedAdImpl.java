package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.e3;
import com.applovin.impl.f2;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.a((e3) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.a((e3) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            p pVar = MaxRewardedAdImpl.this.logger;
            if (p.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                p pVar2 = maxRewardedAdImpl.logger;
                String str = maxRewardedAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb2.append(maxAd);
                sb2.append(", reward=");
                sb2.append(maxReward);
                sb2.append("), listener=");
                defpackage.e.B(sb2, MaxRewardedAdImpl.this.adListener, pVar2, str);
            }
            v2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, l lVar, Context context) {
        super(str, maxAdFormat, aVar, str2, lVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    public MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e3 e3Var, MaxError maxError) {
        if (e3Var.w0().get() || !e3Var.y0().compareAndSet(false, true)) {
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "User not rewarded for ad: " + e3Var + " with error: " + maxError);
        }
        this.sdk.R().a(f2.f7888x0, e3Var, maxError);
    }
}
