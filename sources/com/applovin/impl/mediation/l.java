package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.f5;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.ironsource.InterfaceC0616v3;
import com.ironsource.mediationsdk.ISBannerSize;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8760g;

    public /* synthetic */ l(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.o oVar) {
        this.f8754a = 1;
        this.f8756c = maxFullscreenAdImpl;
        this.f8757d = str;
        this.f8758e = str2;
        this.f8755b = activity;
        this.f8759f = viewGroup;
        this.f8760g = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8754a) {
            case 0:
                ((MediationServiceImpl) this.f8756c).a((u4) this.f8757d, (h) this.f8758e, (MaxAdapterParametersImpl) this.f8759f, (f5) this.f8760g, (Activity) this.f8755b);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f8756c).a((String) this.f8757d, (String) this.f8758e, (Activity) this.f8755b, (ViewGroup) this.f8759f, (androidx.lifecycle.o) this.f8760g);
                break;
            case 2:
                com.applovin.impl.mediation.ads.a.a((String) this.f8756c, (String) this.f8757d, (MaxAdFormat) this.f8758e, (String) this.f8759f, (com.applovin.impl.sdk.l) this.f8760g, (String) this.f8755b);
                break;
            case 3:
                ((h) this.f8758e).a((MaxSignalProvider) this.f8756c, (MaxAdapterSignalCollectionParameters) this.f8759f, (Activity) this.f8755b, (f5) this.f8760g, (u4) this.f8757d);
                break;
            default:
                com.ironsource.mediationsdk.j.a((com.ironsource.mediationsdk.o) this.f8756c, (View) this.f8757d, (ISBannerSize) this.f8758e, (Context) this.f8759f, (FrameLayout.LayoutParams) this.f8760g, (InterfaceC0616v3) this.f8755b);
                break;
        }
    }

    public /* synthetic */ l(h hVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, f5 f5Var, u4 u4Var) {
        this.f8754a = 3;
        this.f8758e = hVar;
        this.f8756c = maxSignalProvider;
        this.f8759f = maxAdapterSignalCollectionParameters;
        this.f8755b = activity;
        this.f8760g = f5Var;
        this.f8757d = u4Var;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f8754a = i10;
        this.f8756c = obj;
        this.f8757d = obj2;
        this.f8758e = obj3;
        this.f8759f = obj4;
        this.f8760g = obj5;
        this.f8755b = obj6;
    }
}
