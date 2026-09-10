package com.thinkup.core.common.oom;

import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUCustomLoadListenerExt;
import com.thinkup.core.common.on.n0;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o implements TUCustomLoadListenerExt {
    private static final String o = "o";
    private final n0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42300n;
    private final Map<String, Object> o0;
    private volatile boolean om = false;
    private final TUCustomLoadListener oo;

    public o(n0 n0Var, String str, Map<String, Object> map, TUCustomLoadListener tUCustomLoadListener) {
        this.m = n0Var;
        this.f42300n = str;
        this.oo = tUCustomLoadListener;
        this.o0 = map;
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

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public void onAdCacheLoaded(BaseAd... baseAdArr) {
        if (this.om) {
            return;
        }
        this.om = true;
        TUCustomLoadListener tUCustomLoadListener = this.oo;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public void onAdDataLoaded() {
        TUCustomLoadListener tUCustomLoadListener = this.oo;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListenerExt
    public void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        TUCustomLoadListener tUCustomLoadListener = this.oo;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdDataLoaded();
        }
        if (o()) {
            n0 n0Var = this.m;
            if (n0Var != null) {
                n0Var.o0();
            }
            onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public void onAdLoadError(String str, String str2) {
        TUCustomLoadListener tUCustomLoadListener = this.oo;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
