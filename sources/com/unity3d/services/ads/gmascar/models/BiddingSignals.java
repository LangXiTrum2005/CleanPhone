package com.unity3d.services.ads.gmascar.models;

import android.text.TextUtils;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BiddingSignals {
    private final String bannerSignal;
    private final String interstitialSignal;
    private final String rvSignal;

    public BiddingSignals(String str, String str2, String str3) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = str3;
    }

    public String getBannerSignal() {
        return this.bannerSignal;
    }

    public String getInterstitialSignal() {
        return this.interstitialSignal;
    }

    public Map<String, String> getMap() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(getRvSignal())) {
            map.put("rv", getRvSignal());
        }
        if (!TextUtils.isEmpty(getInterstitialSignal())) {
            map.put(ScarConstants.IN_SIGNAL_KEY, getInterstitialSignal());
        }
        if (!TextUtils.isEmpty(getBannerSignal())) {
            map.put(ScarConstants.BN_SIGNAL_KEY, getBannerSignal());
        }
        return map;
    }

    public String getRvSignal() {
        return this.rvSignal;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getRvSignal()) && TextUtils.isEmpty(getInterstitialSignal()) && TextUtils.isEmpty(getBannerSignal());
    }

    public BiddingSignals(String str, String str2) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = "";
    }
}
