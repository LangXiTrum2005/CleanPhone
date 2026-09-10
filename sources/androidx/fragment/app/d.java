package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.impl.e3;
import com.applovin.impl.e5;
import com.applovin.impl.f2;
import com.applovin.impl.f5;
import com.applovin.impl.g2;
import com.applovin.impl.h4;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.p8;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.facebook.appevents.iap.InAppPurchaseAutoLogger;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.Aa;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4285d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f4282a = i10;
        this.f4283b = obj;
        this.f4284c = obj2;
        this.f4285d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4282a;
        Object obj = this.f4285d;
        Object obj2 = this.f4284c;
        Object obj3 = this.f4283b;
        switch (i10) {
            case 0:
                ViewGroup container = (ViewGroup) obj3;
                f this$0 = (f) obj;
                kotlin.jvm.internal.n.f(container, "$container");
                kotlin.jvm.internal.n.f(this$0, "this$0");
                container.endViewTransition((View) obj2);
                this$0.f4316c.f4379a.c(this$0);
                return;
            case 1:
                Fragment inFragment = ((c2) obj3).f4273c;
                Fragment outFragment = ((c2) obj2).f4273c;
                boolean z10 = ((p) obj).f4428o;
                w1 w1Var = r1.f4463a;
                kotlin.jvm.internal.n.f(inFragment, "inFragment");
                kotlin.jvm.internal.n.f(outFragment, "outFragment");
                if (z10) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 2:
                b2.e eVar = (b2.e) obj;
                b2.u uVar = (b2.u) ((b2.f) obj3).f5254c.f3382b;
                b2.x xVar = uVar.f5402d;
                uVar.f5401c = (String) obj2;
                b2.q0 q0VarS = eVar.s();
                if (q0VarS != null) {
                    xVar.f5415d.f5378i.f5281c.put(Integer.valueOf(eVar.f()), q0VarS);
                    xVar.f5432v = true;
                }
                xVar.j();
                return;
            case 3:
                b2.f0 f0Var = (b2.f0) obj3;
                byte[] bArr = (byte[]) obj2;
                f0Var.getClass();
                try {
                    f0Var.f5263a.write(bArr);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                String str = (String) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    FirebaseAnalytics firebaseAnalytics = ((cj.m) obj3).f6466a;
                    if (firebaseAnalytics == null) {
                        kotlin.jvm.internal.n.l("analytics");
                        throw null;
                    }
                    c8 c8Var = firebaseAnalytics.f24659a;
                    c8Var.getClass();
                    c8Var.c(new o7(c8Var, str, 0));
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 5:
                ((com.applovin.impl.a1) obj3).a((com.applovin.impl.w0) obj2, (Activity) obj);
                return;
            case 6:
                ((com.applovin.impl.adview.a) obj3).a((String) obj2, (String) obj);
                return;
            case 7:
                ((com.applovin.impl.g1) obj3).b((com.applovin.impl.h1) obj2, (u.l) obj);
                return;
            case 8:
                ((com.applovin.impl.g1) obj3).a((List) obj2, (u.l) obj);
                return;
            case 9:
                ((g2) obj3).b((f2) obj2, (List) obj);
                return;
            case 10:
                ((h4) obj3).a((String) obj2, (Runnable) obj);
                return;
            case 11:
                ((h4) obj3).a((View) obj2, (List) obj);
                return;
            case 12:
                ((MaxAdViewImpl) obj3).a((com.applovin.impl.mediation.ads.a.InterfaceC0010a) obj2, (com.applovin.impl.i) obj);
                return;
            case 13:
                ((MaxFullscreenAdImpl.b) obj3).a((e3) obj2, (MaxAd) obj);
                return;
            case 14:
                ((MaxFullscreenAdImpl.b) obj3).a((String) obj2, (MaxError) obj);
                return;
            case 15:
                n7.a((com.applovin.impl.sdk.l) obj3, (String) obj2, (com.applovin.impl.sdk.ad.b) obj);
                return;
            case 16:
                ((n8) obj3).b((com.applovin.impl.sdk.network.e) obj2, (AppLovinPostbackListener) obj);
                return;
            case 17:
                p8.a((WebView) obj3, (String) obj2, (u4) obj);
                return;
            case 18:
                ((r5) obj3).b((f5) obj2, (e5.a) obj);
                return;
            case 19:
                ((AppLovinAdServiceImpl) obj3).a((AppLovinAdLoadListener) obj2, (AppLovinAd) obj);
                return;
            case 20:
                ((AppLovinAdServiceImpl) obj3).a((AppLovinError) obj2, (AppLovinAdLoadListener) obj);
                return;
            case 21:
                ((com.applovin.impl.sdk.d) obj3).a((com.applovin.impl.sdk.ad.b) obj2, (com.applovin.impl.sdk.d.b) obj);
                return;
            case 22:
                ((com.applovin.impl.sdk.network.b) obj3).b((com.applovin.impl.sdk.network.d) obj2, (AppLovinPostbackListener) obj);
                return;
            case 23:
                ((com.applovin.impl.sdk.o) obj3).a((Long) obj2, obj);
                return;
            case 24:
                ImageViewUtils.a((com.applovin.impl.sdk.l) obj3, (Bitmap) obj2, (ImageView) obj);
                return;
            case 25:
                ((u4) obj3).b((Executor) obj2, (u4.b) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                v2.a((MaxAdReviewListener) obj3, (String) obj2, (MaxAd) obj);
                return;
            case 27:
                ((com.applovin.impl.y1) obj3).a((com.applovin.impl.b) obj2, (u4) obj);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                InAppPurchaseAutoLogger.startIapLogging$lambda$1((kotlin.jvm.internal.c0) obj3, (InAppPurchaseUtils.BillingClientVersion) obj2, (Context) obj);
                return;
            default:
                Aa.a((LevelPlayAdInfo) obj3, (LevelPlayAdError) obj2, (Aa) obj);
                return;
        }
    }
}
