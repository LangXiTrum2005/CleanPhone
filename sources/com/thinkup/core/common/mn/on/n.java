package com.thinkup.core.common.mn.on;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUCustomLoadListenerExt;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.res.oo;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements TUCustomLoadListenerExt {
    private final com.thinkup.core.common.mn.o0.m m;
    private final TUCustomLoadListener o;

    public n(TUCustomLoadListener tUCustomLoadListener, com.thinkup.core.common.mn.o0.m mVar) {
        this.m = mVar;
        this.o = tUCustomLoadListener;
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public final void onAdCacheLoaded(BaseAd... baseAdArr) {
        final BaseAd baseAd;
        com.thinkup.core.common.mn.o0.m mVar = this.m;
        if (mVar == null || !mVar.n0()) {
            TUCustomLoadListener tUCustomLoadListener = this.o;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                return;
            }
            return;
        }
        if (baseAdArr == null || baseAdArr.length <= 0 || (baseAd = baseAdArr[0]) == null) {
            TUCustomLoadListener tUCustomLoadListener2 = this.o;
            if (tUCustomLoadListener2 != null) {
                tUCustomLoadListener2.onAdLoadError("10011", "load fail with no adObject");
                return;
            }
            return;
        }
        this.m.o(baseAd.getNetworkInfoMap());
        boolean zEquals = String.valueOf(this.m.oo()).equals("2") ? ((String) this.m.o("size", "")).equals("300x250") : true;
        if (TextUtils.isEmpty(baseAd.getMainImageUrl()) && baseAd.getAdMediaView(new Object[0]) == null && zEquals) {
            TUCustomLoadListener tUCustomLoadListener3 = this.o;
            if (tUCustomLoadListener3 != null) {
                tUCustomLoadListener3.onAdLoadError("10012", "load fail with no main image.");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            this.o.onAdCacheLoaded(new o0(baseAd, this.m.o()));
        } else if (baseAd.getAdMediaView(new Object[0]) == null) {
            com.thinkup.core.common.res.m.o(o0n.m().on()).o(new oo(2, baseAd.getMainImageUrl()), 0, 0, new com.thinkup.core.common.res.m.o() { // from class: com.thinkup.core.common.mn.on.n.1
                @Override // com.thinkup.core.common.res.m.o
                public final void onFail(String str, String str2) {
                    if (n.this.o != null) {
                        n.this.o.onAdLoadError("10011", "load image fail:".concat(String.valueOf(str2)));
                    }
                }

                @Override // com.thinkup.core.common.res.m.o
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || n.this.o == null) {
                        return;
                    }
                    n.this.o.onAdCacheLoaded(new o0(baseAd, n.this.m.o()));
                }
            });
        } else {
            this.o.onAdCacheLoaded(new o0(baseAd, this.m.o()));
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public final void onAdDataLoaded() {
        TUCustomLoadListener tUCustomLoadListener = this.o;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListenerExt
    public final void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        TUCustomLoadListener tUCustomLoadListener = this.o;
        if (tUCustomLoadListener instanceof TUCustomLoadListenerExt) {
            ((TUCustomLoadListenerExt) tUCustomLoadListener).onAdDataLoadedWithAds(baseAdArr);
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public final void onAdLoadError(String str, String str2) {
        TUCustomLoadListener tUCustomLoadListener = this.o;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
