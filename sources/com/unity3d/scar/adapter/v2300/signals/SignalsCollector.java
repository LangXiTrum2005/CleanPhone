package com.unity3d.scar.adapter.v2300.signals;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.scar.adapter.common.signals.ISignalsCollector;
import com.unity3d.scar.adapter.common.signals.SignalCallbackListener;
import com.unity3d.scar.adapter.common.signals.SignalsCollectorBase;
import com.unity3d.scar.adapter.common.signals.SignalsResult;
import com.unity3d.scar.adapter.v2300.requests.AdRequestFactory;

/* JADX INFO: loaded from: classes6.dex */
public class SignalsCollector extends SignalsCollectorBase implements ISignalsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdRequestFactory f42849a;

    /* JADX INFO: renamed from: com.unity3d.scar.adapter.v2300.signals.SignalsCollector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42850a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f42850a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42850a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public final void a(Context context, UnityAdFormat unityAdFormat, DispatchGroup dispatchGroup, SignalsResult signalsResult) {
        String str;
        int iOrdinal = unityAdFormat.ordinal();
        if (iOrdinal == 1) {
            str = "gmaScarBiddingInterstitialSignal";
        } else if (iOrdinal != 2) {
            str = iOrdinal != 3 ? "" : "gmaScarBiddingBannerSignal";
        } else {
            str = "gmaScarBiddingRewardedSignal";
        }
        b(context, str, unityAdFormat, dispatchGroup, signalsResult);
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsCollector
    public final void b(Context context, String str, UnityAdFormat unityAdFormat, DispatchGroup dispatchGroup, SignalsResult signalsResult) {
        AdFormat adFormat;
        AdRequestFactory adRequestFactory = this.f42849a;
        adRequestFactory.getClass();
        AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(adRequestFactory.f42831a.f42789a);
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        AdRequest adRequestBuild = requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        SignalCallbackListener signalCallbackListener = new SignalCallbackListener(dispatchGroup, signalsResult);
        QueryInfoCallback queryInfoCallback = new QueryInfoCallback();
        queryInfoCallback.f42847a = str;
        queryInfoCallback.f42848b = signalCallbackListener;
        int iOrdinal = unityAdFormat.ordinal();
        if (iOrdinal != 2) {
            adFormat = iOrdinal != 3 ? AdFormat.INTERSTITIAL : AdFormat.BANNER;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo.generate(context, adFormat, adRequestBuild, queryInfoCallback);
    }
}
