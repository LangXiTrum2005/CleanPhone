package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.a;
import com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.scar.adapter.common.signals.SignalsCollectorBase;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdapterBase implements IScarAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SignalsCollectorBase f42785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f42786b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IScarFullScreenAd f42787c;
    public final IAdsErrorHandler d;

    public ScarAdapterBase(IAdsErrorHandler iAdsErrorHandler) {
        this.d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void a(final Activity activity, String str, String str2) {
        IScarFullScreenAd iScarFullScreenAd = (IScarFullScreenAd) this.f42786b.get(str2);
        if (iScarFullScreenAd != null) {
            this.f42787c = iScarFullScreenAd;
            Utils.a(new Runnable() { // from class: com.unity3d.scar.adapter.common.ScarAdapterBase.1
                @Override // java.lang.Runnable
                public final void run() {
                    ScarAdapterBase.this.f42787c.show(activity);
                }
            });
        } else {
            String strN = a.n("Could not find ad for placement '", str2, "'.");
            this.d.handleError(new GMAAdsError(GMAEvent.q0, strN, str2, str, strN));
        }
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void b(Context context, boolean z2, BiddingSignalsHandler biddingSignalsHandler) {
        this.f42785a.d(context, z2, biddingSignalsHandler);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void c(Context context, String str, UnityAdFormat unityAdFormat, SignalsHandler signalsHandler) {
        this.f42785a.e(context, str, unityAdFormat, signalsHandler);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void e(Context context, List list, BiddingSignalsHandler biddingSignalsHandler) {
        this.f42785a.c(context, list, biddingSignalsHandler);
    }
}
