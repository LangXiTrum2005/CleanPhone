package com.google.android.exoplayer2.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.util.Consumer;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.ads.InMobiBanner;
import com.mbridge.msdk.config.component.wei.WeiCpt;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.sdk.controller.v;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.internal.al;
import com.startapp.sdk.internal.b8;
import com.startapp.sdk.internal.c8;
import com.startapp.sdk.internal.jh;
import com.startapp.sdk.internal.xk;
import com.thinkup.rewardvideo.o.o0;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.ImageLoader;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f19027Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ a(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f19027Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ?? r0 = this.Z;
        Object obj = this.f19027Y;
        switch (this.X) {
            case 0:
                VideoRendererEventListener.EventDispatcher eventDispatcher = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i2 = Util.f18979a;
                eventDispatcher.f19025b.onVideoSizeChanged((VideoSize) r0);
                break;
            case 1:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i3 = Util.f18979a;
                eventDispatcher2.f19025b.a((String) r0);
                break;
            case 2:
                VideoRendererEventListener.EventDispatcher eventDispatcher3 = (VideoRendererEventListener.EventDispatcher) obj;
                eventDispatcher3.getClass();
                int i4 = Util.f18979a;
                eventDispatcher3.f19025b.e((Exception) r0);
                break;
            case 3:
                IronSourceThreadManager.a((Runnable) obj, (CountDownLatch) r0);
                break;
            case 4:
                ((v) obj).j((String) r0);
                break;
            case 5:
                ((v.r) obj).b((String) r0);
                break;
            case 6:
                ((WeiCpt) obj).a((com.mbridge.msdk.config.component.wei.model.a) r0);
                break;
            case 7:
                com.mbridge.msdk.config.dynamic.utils.image.b.a((Bitmap[]) obj, (ImageView) r0);
                break;
            case 8:
                ((ImageView) obj).setImageDrawable((com.mbridge.msdk.video.dynview.shape.a) r0);
                break;
            case 9:
                ((StartAppAd) obj).a((Activity) r0);
                break;
            case 10:
                com.startapp.sdk.adsbase.periodic.a.a((com.startapp.sdk.adsbase.periodic.a) obj, (b8) r0);
                break;
            case 11:
                al.a((WebView) obj, (al) r0);
                break;
            case 12:
                ((c8) obj).b((Boolean) r0);
                break;
            case 13:
                jh.a((Context) obj, (Runnable) r0);
                break;
            case 14:
                ((xk) obj).a((String) r0);
                break;
            case 15:
                ((WebView) obj).loadUrl((String) r0);
                break;
            case 16:
                o0.o((Context) obj, (String) r0);
                break;
            case 17:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) obj, (String) r0);
                break;
            case 18:
                ((BiddingBaseManager) obj).lambda$uploadSignals$2((BiddingSignals) r0);
                break;
            case 19:
                ((BiddingBaseManager) obj).lambda$onUnityAdsTokenReady$0((String) r0);
                break;
            case 20:
                ((ShowOperationState) obj).lambda$onUnityAdsShowStart$2((String) r0);
                break;
            case 21:
                ((ShowOperationState) obj).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) r0);
                break;
            case 22:
                VungleInternal.m3206getAvailableBidTokensAsync$lambda2((BidTokenCallback) obj, r0);
                break;
            case 23:
                BaseAdLoader$assetDownloadListener$1.m3219onProgress$lambda0((BaseAdLoader) obj, (AdAsset) r0);
                break;
            case 24:
                DefaultAdLoader.AnonymousClass1.m3221onFailure$lambda1((DefaultAdLoader) obj, (Throwable) r0);
                break;
            case 25:
                AndroidPlatform.m3230getUserAgentLazy$lambda0((AndroidPlatform) obj, (Consumer) r0);
                break;
            case 26:
                UnclosedAdDetector.m3248writeUnclosedAdToFile$lambda5((UnclosedAdDetector) obj, (String) r0);
                break;
            case 27:
                VungleWebClient.m3260notifyPropertiesChange$lambda25$lambda24((VungleWebClient) obj, (String) r0);
                break;
            case 28:
                ImageLoader.m3274displayImage$lambda0((String) obj, (Function1) r0);
                break;
            default:
                InMobiBanner.a((InMobiBanner) obj, (Function0) r0);
                break;
        }
    }
}
