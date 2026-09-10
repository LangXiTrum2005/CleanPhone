package com.applovin.impl.sdk;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;
import android.webkit.WebView;
import cc.q2;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.google.android.gms.internal.measurement.nf;
import java.util.Map;
import tj.g0;
import tj.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9712e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f9708a = i10;
        this.f9710c = obj;
        this.f9711d = obj2;
        this.f9712e = obj3;
        this.f9709b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9708a) {
            case 0:
                ((EventServiceImpl) this.f9710c).a((String) this.f9711d, (Map) this.f9712e, this.f9709b);
                return;
            case 1:
                v2.a(this.f9709b, (MaxRewardedAdListener) this.f9710c, (MaxAd) this.f9711d, (MaxReward) this.f9712e);
                return;
            case 2:
                v2.a(this.f9709b, (MaxNativeAdListener) this.f9710c, (MaxNativeAdView) this.f9711d, (MaxAd) this.f9712e);
                return;
            case 3:
                v2.a(this.f9709b, (MaxAdListener) this.f9710c, (String) this.f9711d, (MaxError) this.f9712e);
                return;
            case 4:
                v2.a(this.f9709b, (MaxAdExpirationListener) this.f9710c, (MaxAd) this.f9711d, (MaxAd) this.f9712e);
                return;
            case 5:
                v2.a(this.f9709b, (MaxAdListener) this.f9710c, (MaxAd) this.f9711d, (MaxError) this.f9712e);
                return;
            case 6:
                v2.a(this.f9709b, (MaxNativeAdListener) this.f9710c, (String) this.f9711d, (MaxError) this.f9712e);
                return;
            case 7:
                ((com.ironsource.sdk.controller.v.s) this.f9710c).a(this.f9709b, (String) this.f9711d, (String) this.f9712e);
                return;
            case 8:
                Context context = (Context) this.f9710c;
                boolean z10 = this.f9709b;
                p1.b0 b0Var = (p1.b0) this.f9711d;
                q1.j jVar = (q1.j) this.f9712e;
                q1.i iVarG = q1.i.g(context);
                if (iVarG == null) {
                    l1.a.s("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z10) {
                    q1.f fVar = b0Var.f47953s;
                    fVar.getClass();
                    fVar.f48534f.a(iVarG);
                }
                LogSessionId logSessionIdI = iVarG.i();
                synchronized (jVar) {
                    m0.c cVar = jVar.f48581b;
                    cVar.getClass();
                    cVar.g(logSessionIdI);
                }
                return;
            case 9:
                s0 s0Var = (s0) this.f9710c;
                WebView webViewArg = (WebView) this.f9712e;
                String urlArg = (String) this.f9711d;
                boolean z11 = this.f9709b;
                tj.l lVar = s0Var.f50905a;
                bh.a aVar = new bh.a(26);
                lVar.getClass();
                kotlin.jvm.internal.n.f(webViewArg, "webViewArg");
                kotlin.jvm.internal.n.f(urlArg, "urlArg");
                nf nfVar = lVar.f50859a;
                nfVar.getClass();
                if (!((tj.c) nfVar.f23783c).d(s0Var)) {
                    q4.a.p("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new k5.g((xi.f) nfVar.f23782b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", nfVar.e(), (Object) null).y(xj.o.Q(s0Var, webViewArg, urlArg, Boolean.valueOf(z11)), new g0(aVar, 15));
                    return;
                }
            default:
                fc.f fVar2 = (fc.f) this.f9710c;
                q2 q2Var = (q2) this.f9711d;
                bc.c cVar2 = (bc.c) this.f9712e;
                boolean z12 = this.f9709b;
                fVar2.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((fc.d) fVar2.f40781c).e(q2Var, cVar2.f5540a, z12);
                return;
        }
    }

    public /* synthetic */ v(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f9708a = i10;
        this.f9710c = obj;
        this.f9709b = z10;
        this.f9711d = obj2;
        this.f9712e = obj3;
    }

    public /* synthetic */ v(s0 s0Var, WebView webView, String str, boolean z10) {
        this.f9708a = 9;
        this.f9710c = s0Var;
        this.f9712e = webView;
        this.f9711d = str;
        this.f9709b = z10;
    }

    public /* synthetic */ v(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f9708a = i10;
        this.f9709b = z10;
        this.f9710c = obj;
        this.f9711d = obj2;
        this.f9712e = obj3;
    }
}
