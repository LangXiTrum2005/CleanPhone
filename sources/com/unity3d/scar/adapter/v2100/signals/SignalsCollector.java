package com.unity3d.scar.adapter.v2100.signals;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.scar.adapter.common.signals.ISignalsCollector;
import com.unity3d.scar.adapter.common.signals.SignalCallbackListener;
import com.unity3d.scar.adapter.common.signals.SignalsCollectorBase;
import com.unity3d.scar.adapter.common.signals.SignalsResult;
import com.unity3d.scar.adapter.v2100.requests.AdRequestFactory;

/* JADX INFO: loaded from: classes6.dex */
public class SignalsCollector extends SignalsCollectorBase implements ISignalsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdRequestFactory f42824a;

    /* JADX INFO: renamed from: com.unity3d.scar.adapter.v2100.signals.SignalsCollector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42825a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f42825a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42825a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42825a[2] = 3;
            } catch (NoSuchFieldError unused3) {
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
        AdRequest adRequestBuild = this.f42824a.b().build();
        SignalCallbackListener signalCallbackListener = new SignalCallbackListener(dispatchGroup, signalsResult);
        QueryInfoCallback queryInfoCallback = new QueryInfoCallback();
        queryInfoCallback.f42822a = str;
        queryInfoCallback.f42823b = signalCallbackListener;
        QueryInfo.generate(context, f(unityAdFormat), adRequestBuild, queryInfoCallback);
    }

    public final AdFormat f(UnityAdFormat unityAdFormat) {
        int iOrdinal = unityAdFormat.ordinal();
        if (iOrdinal == 1) {
            return AdFormat.INTERSTITIAL;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? AdFormat.UNKNOWN : AdFormat.BANNER;
        }
        return AdFormat.REWARDED;
    }
}
