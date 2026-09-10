package com.unity3d.scar.adapter.v2100.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2100.requests.AdRequestFactory;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdBase<T> implements IScarAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f42807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f42808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScarAdMetadata f42809c;
    public final AdRequestFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScarAdListener f42810e;
    public final IAdsErrorHandler f;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, AdRequestFactory adRequestFactory, IAdsErrorHandler iAdsErrorHandler) {
        this.f42808b = context;
        this.f42809c = scarAdMetadata;
        this.d = adRequestFactory;
        this.f = iAdsErrorHandler;
    }

    public final void a(IScarLoadListener iScarLoadListener) {
        AdRequest adRequestA = this.d.a(this.f42809c.d);
        if (iScarLoadListener != null) {
            this.f42810e.f42811a = iScarLoadListener;
        }
        b(adRequestA);
    }

    public abstract void b(AdRequest adRequest);
}
