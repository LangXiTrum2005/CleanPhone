package com.startapp.sdk.internal;

import com.inmobi.ads.InMobiAudio;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import io.reactivex.rxjava3.disposables.Disposable;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f40769Y;

    public /* synthetic */ C(Object obj, int i2) {
        this.X = i2;
        this.f40769Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.X) {
            case 0:
                ((c8) this.f40769Y).c();
                break;
            case 1:
                dh.a((hh) this.f40769Y);
                break;
            case 2:
                ((gi) this.f40769Y).a();
                break;
            case 3:
                q7.a((q7) this.f40769Y);
                break;
            case 4:
                ((HttpURLConnection) this.f40769Y).disconnect();
                break;
            case 5:
                q8.a((AtomicReference) this.f40769Y, null);
                break;
            case 6:
                ((xk) this.f40769Y).e();
                break;
            case 7:
                ((y1) this.f40769Y).a();
                break;
            case 8:
                ((IUnityAdsTokenListener) this.f40769Y).onUnityAdsTokenReady(null);
                break;
            case 9:
                ((BiddingBaseManager) this.f40769Y).lambda$fetchSignals$1();
                break;
            case 10:
                ((ShowOperationState) this.f40769Y).lambda$onUnityAdsShowClick$1();
                break;
            case 11:
                ((BannerView) this.f40769Y).lambda$addScarContainer$0();
                break;
            case 12:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) this.f40769Y);
                break;
            case 13:
                VungleInitializer.m3200init$lambda3((VungleInitializer) this.f40769Y);
                break;
            case 14:
                BaseAdLoader.m3216loadAd$lambda0((BaseAdLoader) this.f40769Y);
                break;
            case 15:
                OMInjector.m3227init$lambda2((OMInjector) this.f40769Y);
                break;
            case 16:
                UnclosedAdDetector.m3247retrieveUnclosedAd$lambda3((UnclosedAdDetector) this.f40769Y);
                break;
            case 17:
                ((Disposable) this.f40769Y).dispose();
                break;
            case 18:
                com.chartboost.sdk.impl.d.a((com.chartboost.sdk.impl.d) this.f40769Y);
                break;
            case 19:
                com.chartboost.sdk.impl.fj.a((com.chartboost.sdk.impl.fj) this.f40769Y);
                break;
            case 20:
                com.chartboost.sdk.impl.rb.a((com.chartboost.sdk.impl.rb) this.f40769Y);
                break;
            case 21:
                com.chartboost.sdk.impl.xj.j((com.chartboost.sdk.impl.xj) this.f40769Y);
                break;
            default:
                InMobiAudio.a((InMobiAudio) this.f40769Y);
                break;
        }
    }
}
