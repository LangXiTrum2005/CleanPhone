package A;

import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.view.MotionEvent;
import android.view.Surface;
import android.webkit.WebView;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import androidx.room.TransactionExecutor;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.n2;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import com.chartboost.heliumsdk.controllers.banners.BannerController;
import com.chartboost.heliumsdk.controllers.banners.BannerController$swapAd$1$1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.inmobi.media.AbstractC3294we;
import com.inmobi.media.C2968c9;
import com.inmobi.media.C3107l2;
import com.inmobi.media.C3298x2;
import com.inmobi.media.C3324yc;
import com.inmobi.media.C3334z6;
import com.inmobi.media.InterfaceC3333z5;
import com.inmobi.media.RunnableC3308xc;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.p004ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.store.core.api.Store;
import com.vungle.ads.internal.persistence.FilePreferences;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class I0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3141Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ I0(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f3141Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.X) {
            case 0:
                AbstractC3294we.a((AbstractC3294we) this.f3141Y, (String) this.Z);
                return;
            case 1:
                C3298x2.a((C3107l2) this.f3141Y, (InterfaceC3333z5) this.Z);
                return;
            case 2:
                RunnableC3308xc.a((RunnableC3308xc) this.f3141Y, (C3324yc) this.Z);
                return;
            case 3:
                C3334z6.a((C3334z6) this.f3141Y, (C2968c9) this.Z);
                return;
            case 4:
                InMobiSdk.c((SdkInitializationListener) this.f3141Y, (String) this.Z);
                return;
            case 5:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.f3141Y, (IronSourceError) this.Z);
                return;
            case 6:
                com.mbridge.msdk.config.manager.a.a((String) this.Z, (String) this.f3141Y);
                return;
            case 7:
                Store.lambda$isFeatureSupported$0((Integer) this.f3141Y, (String) this.Z);
                return;
            case 8:
                FilePreferences.m3228apply$lambda0((FilePreferences) this.f3141Y, (HashMap) this.Z);
                return;
            case 9:
                ((ResourcesCompat.FontCallback) this.f3141Y).c((Typeface) this.Z);
                return;
            case 10:
                DispatchQueue this$0 = (DispatchQueue) this.f3141Y;
                Intrinsics.f(this$0, "this$0");
                Runnable runnable = (Runnable) this.Z;
                Intrinsics.f(runnable, "$runnable");
                this$0.getClass();
                throw null;
            case 11:
                ((androidx.media3.exoplayer.upstream.b) this.Z).a(((NetworkTypeObserver) this.f3141Y).c());
                return;
            case 12:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f3141Y;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6081b.b((String) this.Z);
                return;
            case 13:
                ((AudioSink.Listener) this.f3141Y).j((AudioSink.AudioTrackConfig) this.Z);
                return;
            case 14:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f3141Y;
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.k0;
                Surface surface = sphericalGLSurfaceView.l0;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.Z;
                Surface surface2 = new Surface(surfaceTexture2);
                sphericalGLSurfaceView.k0 = surfaceTexture2;
                sphericalGLSurfaceView.l0 = surface2;
                Iterator it = sphericalGLSurfaceView.e0.iterator();
                while (it.hasNext()) {
                    ((SphericalGLSurfaceView.VideoSurfaceListener) it.next()).r(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 15:
                PlayerView.a((PlayerView) this.f3141Y, (Bitmap) this.Z);
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f3141Y;
                TransactionExecutor transactionExecutor = (TransactionExecutor) this.Z;
                try {
                    runnable2.run();
                    return;
                } finally {
                    transactionExecutor.a();
                }
            case 17:
                ((AppLovinFullscreenActivity) this.f3141Y).a((Long) this.Z);
                return;
            case 18:
                ((AppLovinFullscreenActivity) this.f3141Y).a((n2) this.Z);
                return;
            case 19:
                ((com.applovin.impl.adview.a) this.f3141Y).b((MotionEvent) this.Z);
                return;
            case 20:
                ((com.applovin.impl.adview.a) this.f3141Y).b((WebView) this.Z);
                return;
            case 21:
                ((com.applovin.impl.adview.a) this.f3141Y).a((AppLovinAd) this.Z);
                return;
            case 22:
                ((com.applovin.impl.sdk.nativeAd.b) this.f3141Y).b((AppLovinNativeAdImpl) this.Z);
                return;
            case 23:
                ((AppLovinAdapterAdViewListener) this.f3141Y).lambda$adReceived$0((AppLovinAd) this.Z);
                return;
            case 24:
                int i3 = BaseAct.g0;
                ((BaseAct) this.f3141Y).k();
                ((Function0) this.Z).invoke();
                return;
            case 25:
                BannerController$swapAd$1$1.onVisibilityThresholdMet$lambda$0((BannerController) this.f3141Y, (String) this.Z);
                return;
            case 26:
                int i4 = JobInfoSchedulerService.X;
                ((JobInfoSchedulerService) this.f3141Y).jobFinished((JobParameters) this.Z, false);
                return;
            case 27:
                com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) this.f3141Y;
                eventDispatcher2.getClass();
                int i5 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher2.f17292b.b((String) this.Z);
                return;
            case 28:
                AudioTrack audioTrack = (AudioTrack) this.f3141Y;
                ConditionVariable conditionVariable = (ConditionVariable) this.Z;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    conditionVariable.d();
                    synchronized (DefaultAudioSink.f17324d0) {
                        try {
                            int i6 = DefaultAudioSink.f0 - 1;
                            DefaultAudioSink.f0 = i6;
                            if (i6 == 0) {
                                DefaultAudioSink.e0.shutdown();
                                DefaultAudioSink.e0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    conditionVariable.d();
                    synchronized (DefaultAudioSink.f17324d0) {
                        try {
                            int i7 = DefaultAudioSink.f0 - 1;
                            DefaultAudioSink.f0 = i7;
                            if (i7 == 0) {
                                DefaultAudioSink.e0.shutdown();
                                DefaultAudioSink.e0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            default:
                ((com.google.android.exoplayer2.upstream.b) this.Z).a(((com.google.android.exoplayer2.util.NetworkTypeObserver) this.f3141Y).c());
                return;
        }
    }

    public /* synthetic */ I0(String str, String str2) {
        this.X = 6;
        this.Z = str;
        this.f3141Y = str2;
    }
}
