package com.thinkup.core.n.m;

import android.os.SystemClock;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingListenerExt;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.common.on.n0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o implements TUBiddingListenerExt {
    private static final String o = "o";
    private final n0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42402n;
    private final Map<String, Object> o0;
    private volatile boolean om = false;
    private final TUBiddingListener oo;

    public o(n0 n0Var, String str, Map<String, Object> map, TUBiddingListener tUBiddingListener) {
        this.m = n0Var;
        this.f42402n = str;
        this.o0 = map;
        this.oo = tUBiddingListener;
    }

    private boolean o() {
        Map<String, Object> map = this.o0;
        if (map == null) {
            return false;
        }
        try {
            Object obj = map.get("ad_s_reqf_mode");
            if (obj != null) {
                return obj.toString().equals("2");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return false;
    }

    @Override // com.thinkup.core.api.TUBiddingListener
    public void onC2SBidResult(TUBiddingResult tUBiddingResult) {
        TUBiddingListener tUBiddingListener = this.oo;
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBidResult(tUBiddingResult);
        }
    }

    @Override // com.thinkup.core.api.TUBiddingListener
    public void onC2SBiddingResultWithCache(TUBiddingResult tUBiddingResult, BaseAd baseAd) {
        if (this.om) {
            return;
        }
        this.om = true;
        TUBiddingListener tUBiddingListener = this.oo;
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBiddingResultWithCache(tUBiddingResult, baseAd);
        }
    }

    @Override // com.thinkup.core.api.TUBiddingListenerExt
    public void onC2SBiddingResultWithData(TUBiddingResult tUBiddingResult, BaseAd baseAd) {
        n0 n0Var = this.m;
        if (n0Var != null) {
            n0Var.omo(System.currentTimeMillis());
            this.m.n0(SystemClock.elapsedRealtime());
        }
        if (o()) {
            n0 n0Var2 = this.m;
            if (n0Var2 != null) {
                n0Var2.o0();
            }
            onC2SBiddingResultWithCache(tUBiddingResult, baseAd);
        }
    }
}
