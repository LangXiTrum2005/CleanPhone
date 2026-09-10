package com.unity3d.scar.adapter.v2300.scarads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2300.requests.AdRequestFactory;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdBase<T> implements IScarAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f42833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScarAdMetadata f42834c;
    public final AdRequestFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScarAdListener f42835e;
    public final IAdsErrorHandler f;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, AdRequestFactory adRequestFactory, IAdsErrorHandler iAdsErrorHandler) {
        this.f42833b = context;
        this.f42834c = scarAdMetadata;
        this.d = adRequestFactory;
        this.f = iAdsErrorHandler;
    }

    public final void a(IScarLoadListener iScarLoadListener) {
        AdRequest adRequestBuild;
        String str = this.f42834c.d;
        AdRequestFactory adRequestFactory = this.d;
        adRequestFactory.getClass();
        if (str.isEmpty()) {
            AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(adRequestFactory.f42831a.f42789a);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_5");
            adRequestBuild = requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        } else {
            AdRequest.Builder requestAgent2 = new AdRequest.Builder().setRequestAgent(adRequestFactory.f42831a.f42789a);
            Bundle bundle2 = new Bundle();
            bundle2.putString("query_info_type", "requester_type_5");
            adRequestBuild = requestAgent2.addNetworkExtrasBundle(AdMobAdapter.class, bundle2).setAdString(str).build();
        }
        if (iScarLoadListener != null) {
            this.f42835e.f42836a = iScarLoadListener;
        }
        b(adRequestBuild);
    }

    public abstract void b(AdRequest adRequest);
}
