package com.thinkup.core.common.mn.on;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingListenerExt;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.res.oo;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements TUBiddingListenerExt {
    private final com.thinkup.core.common.mn.o0.m m;
    private final TUBiddingListener o;

    public m(TUBiddingListener tUBiddingListener, com.thinkup.core.common.mn.o0.m mVar) {
        this.o = tUBiddingListener;
        this.m = mVar;
    }

    @Override // com.thinkup.core.api.TUBiddingListener
    public final void onC2SBidResult(TUBiddingResult tUBiddingResult) {
        TUBiddingListener tUBiddingListener = this.o;
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBidResult(tUBiddingResult);
        }
    }

    @Override // com.thinkup.core.api.TUBiddingListener
    public final void onC2SBiddingResultWithCache(final TUBiddingResult tUBiddingResult, final BaseAd baseAd) {
        com.thinkup.core.common.mn.o0.m mVar;
        if (!tUBiddingResult.isSuccessWithUseType() || (mVar = this.m) == null || !mVar.n0()) {
            TUBiddingListener tUBiddingListener = this.o;
            if (tUBiddingListener != null) {
                tUBiddingListener.onC2SBiddingResultWithCache(tUBiddingResult, baseAd);
                return;
            }
            return;
        }
        if (baseAd == null) {
            TUBiddingListener tUBiddingListener2 = this.o;
            if (tUBiddingListener2 != null) {
                tUBiddingListener2.onC2SBiddingResultWithCache(TUBiddingResult.fail("load fail with no adObject"), null);
                return;
            }
            return;
        }
        boolean zEquals = String.valueOf(this.m.oo()).equals("2") ? ((String) this.m.o("size", "")).equals("300x250") : true;
        this.m.o(baseAd.getNetworkInfoMap());
        if (TextUtils.isEmpty(baseAd.getMainImageUrl()) && baseAd.getAdMediaView(new Object[0]) == null && zEquals) {
            TUBiddingListener tUBiddingListener3 = this.o;
            if (tUBiddingListener3 != null) {
                tUBiddingListener3.onC2SBiddingResultWithCache(TUBiddingResult.fail("load fail with no main image."), null);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            com.thinkup.core.common.res.m.o(o0n.m().on()).o(new oo(2, baseAd.getMainImageUrl()), 0, 0, new com.thinkup.core.common.res.m.o() { // from class: com.thinkup.core.common.mn.on.m.1
                @Override // com.thinkup.core.common.res.m.o
                public final void onFail(String str, String str2) {
                    if (m.this.o != null) {
                        m.this.o.onC2SBiddingResultWithCache(TUBiddingResult.fail("load image failed: ".concat(String.valueOf(str2))), null);
                    }
                }

                @Override // com.thinkup.core.common.res.m.o
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || m.this.o == null) {
                        return;
                    }
                    m.this.o.onC2SBiddingResultWithCache(tUBiddingResult, new o0(baseAd, m.this.m.o()));
                }
            });
            return;
        }
        TUBiddingListener tUBiddingListener4 = this.o;
        if (tUBiddingListener4 != null) {
            tUBiddingListener4.onC2SBiddingResultWithCache(tUBiddingResult, new o0(baseAd, this.m.o()));
        }
    }

    @Override // com.thinkup.core.api.TUBiddingListenerExt
    public final void onC2SBiddingResultWithData(TUBiddingResult tUBiddingResult, BaseAd baseAd) {
        TUBiddingListener tUBiddingListener = this.o;
        if (tUBiddingListener instanceof TUBiddingListenerExt) {
            ((TUBiddingListenerExt) tUBiddingListener).onC2SBiddingResultWithData(tUBiddingResult, baseAd);
        }
    }
}
