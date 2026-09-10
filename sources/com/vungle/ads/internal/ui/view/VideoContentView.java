package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.NativeVideoPlaybackError;
import com.vungle.ads.gintrap;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.internal.util.arytenoidectomy;
import com.vungle.ads.internal.util.monoploid;
import com.vungle.ads.stratoscope;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoContentView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006*\u0001Q\b\u0000\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001UB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0011\u0010#\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010\u0014J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u00020\u000eH\u0010¢\u0006\u0004\b1\u0010\u0010R*\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010\u0010\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010F\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010CR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010CR\u0014\u0010P\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010CR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/vungle/ads/internal/ui/view/VideoContentView;", "Lcom/vungle/ads/internal/ui/view/BaseContentView;", "Lmetairie/attabal;", "Lmetairie/saneness;", "Lcom/vungle/ads/internal/util/monoploid;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/NativeAdInternal;", "internal", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/NativeAdInternal;)V", "Landroid/app/Activity;", "getAdActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "", "showImageViewAsFallback", "()V", "", "muted", "onMuteUpdateUI", "(Z)V", "toggleMute", "unRegisterRingerMode", "onAttachedToWindow", "onDetachedFromWindow", "silentModeEnabled", "notifySilentModeChange", "render", "(Landroid/content/Context;)V", "", "getDuration", "()I", "getCurrentTime", "isMuted$vungle_ads_release", "()Ljava/lang/Boolean;", "isMuted", "onVideoPrepared", "onVideoPlay", "onVideoPause", "onVideoCompleted", "percentage", "onVideoProgress", "(I)V", "onVideoMuted", "what", "", "extra", "onVideoError", "(ILjava/lang/String;)V", "destroy$vungle_ads_release", "destroy", "Lcom/vungle/ads/internal/ui/view/AdVideoView;", "videoView", "Lcom/vungle/ads/internal/ui/view/AdVideoView;", "getVideoView", "()Lcom/vungle/ads/internal/ui/view/AdVideoView;", "setVideoView", "(Lcom/vungle/ads/internal/ui/view/AdVideoView;)V", "getVideoView$annotations", "Landroid/widget/ImageView;", "muteView", "Landroid/widget/ImageView;", "Ljava/lang/ref/WeakReference;", "adActivity", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "startFired", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cp25Fired", "cp50Fired", "cp75Fired", "cp100Fired", "videoErrorHandled", "Lcom/vungle/ads/stratoscope;", "preparedDurationMetric", "Lcom/vungle/ads/stratoscope;", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "isReceiverRegistered", "ignoredFirst", "com/vungle/ads/internal/ui/view/VideoContentView$saneness", "activityLifecycle", "Lcom/vungle/ads/internal/ui/view/VideoContentView$saneness;", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VideoContentView extends BaseContentView implements metairie.attabal, metairie.saneness, monoploid {
    private static final String TAG = "NativeAd-VideoContentView";
    private final saneness activityLifecycle;
    private WeakReference<Activity> adActivity;
    private final AtomicBoolean cp100Fired;
    private final AtomicBoolean cp25Fired;
    private final AtomicBoolean cp50Fired;
    private final AtomicBoolean cp75Fired;
    private final AtomicBoolean ignoredFirst;
    private final AtomicBoolean isReceiverRegistered;
    private ImageView muteView;
    private final stratoscope preparedDurationMetric;
    private final RingerModeReceiver ringerModeReceiver;
    private final AtomicBoolean startFired;
    private final AtomicBoolean videoErrorHandled;
    private AdVideoView videoView;

    /* JADX INFO: compiled from: VideoContentView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/vungle/ads/internal/ui/view/VideoContentView$saneness", "Lcom/vungle/ads/internal/util/attabal$saneness;", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class saneness extends com.vungle.ads.internal.util.attabal.saneness {
        public saneness() {
        }

        @Override // com.vungle.ads.internal.util.attabal.saneness
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            WeakReference weakReference = VideoContentView.this.adActivity;
            if (Intrinsics.wireman(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
                arytenoidectomy.INSTANCE.d(VideoContentView.TAG, "onActivityPaused and pause video");
                AdVideoView videoView = VideoContentView.this.getVideoView();
                if (videoView != null) {
                    videoView.pauseOnActivityPaused$vungle_ads_release();
                }
            }
        }

        @Override // com.vungle.ads.internal.util.attabal.saneness
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            WeakReference weakReference = VideoContentView.this.adActivity;
            if (Intrinsics.wireman(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
                arytenoidectomy.INSTANCE.d(VideoContentView.TAG, "onActivityResumed and try to play video");
                AdVideoView videoView = VideoContentView.this.getVideoView();
                if (videoView != null) {
                    videoView.playOnActivityResumed$vungle_ads_release();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentView(Context context, NativeAdInternal internal) {
        super(context, internal);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.startFired = new AtomicBoolean(false);
        this.cp25Fired = new AtomicBoolean(false);
        this.cp50Fired = new AtomicBoolean(false);
        this.cp75Fired = new AtomicBoolean(false);
        this.cp100Fired = new AtomicBoolean(false);
        this.videoErrorHandled = new AtomicBoolean(false);
        this.preparedDurationMetric = new stratoscope(Sdk$SDKMetric.SDKMetricType.NATIVE_VIDEO_PREPARE_DURATION_MS);
        this.ringerModeReceiver = new RingerModeReceiver();
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.ignoredFirst = new AtomicBoolean(false);
        this.activityLifecycle = new saneness();
    }

    private final Activity getAdActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "ctx.baseContext");
        }
        return null;
    }

    private final void onMuteUpdateUI(boolean muted) {
        if (muted) {
            ImageView imageView = this.muteView;
            if (imageView != null) {
                imageView.setImageResource(gintrap.liftoff_icon_mute);
                return;
            }
            return;
        }
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setImageResource(gintrap.liftoff_icon_unmute);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: render$lambda-5, reason: not valid java name */
    public static final void m3273render$lambda5(VideoContentView this$0, float f, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView imageView = this$0.muteView;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
        ImageView imageView2 = this$0.muteView;
        if (imageView2 == null) {
            return;
        }
        imageView2.setTranslationY(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: render$lambda-6, reason: not valid java name */
    public static final void m3274render$lambda6(VideoContentView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toggleMute();
    }

    private final void showImageViewAsFallback() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        super.render(context);
        ImageView imageView = getImageView();
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        AdVideoView adVideoView = this.videoView;
        if (adVideoView == null) {
            return;
        }
        adVideoView.setVisibility(8);
    }

    private final void toggleMute() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            boolean z = !adVideoView.getMuted();
            adVideoView.setMuted(z);
            onMuteUpdateUI(z);
        }
    }

    private final void unRegisterRingerMode() {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.isReceiverRegistered.getAndSet(false)) {
                arytenoidectomy.INSTANCE.d(TAG, "unregisterReceiver()");
                this.ringerModeReceiver.setListener(null);
                getContext().unregisterReceiver(this.ringerModeReceiver);
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "unregisterReceiver", thM3354exceptionOrNullimpl);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.BaseContentView
    public void destroy$vungle_ads_release() {
        arytenoidectomy.INSTANCE.d(TAG, "destroy()");
        unRegisterRingerMode();
        WeakReference<Activity> weakReference = this.adActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.adActivity = null;
        com.vungle.ads.internal.util.attabal.INSTANCE.removeLifecycleListener(this.activityLifecycle);
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            adVideoView.release();
        }
        this.videoView = null;
        super.destroy$vungle_ads_release();
    }

    @Override // metairie.attabal
    public int getCurrentTime() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            return adVideoView.getCurrentPositionMs();
        }
        return 0;
    }

    @Override // metairie.attabal
    public int getDuration() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            return adVideoView.getDurationMs();
        }
        return 0;
    }

    public final AdVideoView getVideoView() {
        return this.videoView;
    }

    public final Boolean isMuted$vungle_ads_release() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            return Boolean.valueOf(adVideoView.getMuted());
        }
        return null;
    }

    @Override // com.vungle.ads.internal.util.monoploid
    public void notifySilentModeChange(boolean silentModeEnabled) {
        Boolean boolIsMuted$vungle_ads_release = isMuted$vungle_ads_release();
        arytenoidectomy.INSTANCE.d(TAG, "silentModeEnabled=" + silentModeEnabled + " currentIsMuted=" + boolIsMuted$vungle_ads_release);
        if (!this.ignoredFirst.getAndSet(true) || boolIsMuted$vungle_ads_release == null || Intrinsics.wireman(Boolean.valueOf(silentModeEnabled), boolIsMuted$vungle_ads_release)) {
            return;
        }
        toggleMute();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object objM3351constructorimpl;
        super.onAttachedToWindow();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!this.isReceiverRegistered.getAndSet(true)) {
                arytenoidectomy.INSTANCE.d(TAG, "registerReceiver()");
                this.ignoredFirst.set(false);
                this.ringerModeReceiver.setListener(this);
                getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "registerReceiver", thM3354exceptionOrNullimpl);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unRegisterRingerMode();
    }

    @Override // metairie.saneness
    public void onVideoCompleted() throws Throwable {
        NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_VIDEO_CLOSE, null, 2, null);
        NativeAdInternal.trackOMEvent$default(getInternal(), 3, null, 2, null);
        metairie.dern nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoEnd();
        }
    }

    @Override // metairie.saneness
    public void onVideoError(int what, String extra) throws InterruptedException {
        Intrinsics.checkNotNullParameter(extra, "extra");
        if (this.videoErrorHandled.getAndSet(true)) {
            return;
        }
        showImageViewAsFallback();
        new NativeVideoPlaybackError("w=" + what + " e=" + extra + " url=" + getInternal().getOriginalVideoUrl$vungle_ads_release()).setLogEntry$vungle_ads_release(getInternal().getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // metairie.saneness
    public void onVideoMuted(boolean muted) throws Throwable {
        if (muted) {
            NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_VIDEO_MUTE, null, 2, null);
            NativeAdInternal.trackOMEvent$default(getInternal(), 9, null, 2, null);
            metairie.dern nativeVideoListener = getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoMute();
                return;
            }
            return;
        }
        NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_VIDEO_UNMUTE, null, 2, null);
        NativeAdInternal.trackOMEvent$default(getInternal(), 10, null, 2, null);
        metairie.dern nativeVideoListener2 = getNativeVideoListener();
        if (nativeVideoListener2 != null) {
            nativeVideoListener2.onVideoUnmute();
        }
    }

    @Override // metairie.saneness
    public void onVideoPause() {
        metairie.dern nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoPause();
        }
    }

    @Override // metairie.saneness
    public void onVideoPlay() {
        metairie.dern nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoPlay();
        }
    }

    @Override // metairie.saneness
    public void onVideoPrepared() throws Throwable {
        this.preparedDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.preparedDurationMetric, getInternal().getLogEntry(), (String) null, 4, (Object) null);
    }

    @Override // metairie.saneness
    public void onVideoProgress(int percentage) throws Throwable {
        if (1 <= percentage && percentage < 25) {
            if (this.startFired.compareAndSet(false, true)) {
                int duration = getDuration();
                Map<String, ? extends Object> mapImpassible = seminary.impassible(patroclinal.formularize.attabal(NativeAdInternal.QUARTILE_START_KEY_DURATION, Integer.valueOf(duration)), patroclinal.formularize.attabal(NativeAdInternal.QUARTILE_START_KEY_VOLUME, Integer.valueOf(!Intrinsics.wireman(isMuted$vungle_ads_release(), Boolean.TRUE) ? 1 : 0)));
                getInternal().trackTpatEvent(com.vungle.ads.internal.saneness.VIDEO_LENGTH_TPAT, String.valueOf(duration));
                getInternal().trackOMEvent(4, mapImpassible);
                return;
            }
            return;
        }
        if (25 <= percentage && percentage < 50) {
            if (this.cp25Fired.compareAndSet(false, true)) {
                NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_CHECKPOINT_25, null, 2, null);
                NativeAdInternal.trackOMEvent$default(getInternal(), 5, null, 2, null);
                return;
            }
            return;
        }
        if (50 <= percentage && percentage < 75) {
            if (this.cp50Fired.compareAndSet(false, true)) {
                NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_CHECKPOINT_50, null, 2, null);
                NativeAdInternal.trackOMEvent$default(getInternal(), 6, null, 2, null);
                return;
            }
            return;
        }
        if (75 > percentage || percentage >= 100) {
            if (percentage < 100 || !this.cp100Fired.compareAndSet(false, true)) {
                return;
            }
            NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_CHECKPOINT_100, null, 2, null);
            return;
        }
        if (this.cp75Fired.compareAndSet(false, true)) {
            NativeAdInternal.trackTpatEvent$default(getInternal(), com.vungle.ads.internal.saneness.TPAT_CHECKPOINT_75, null, 2, null);
            NativeAdInternal.trackOMEvent$default(getInternal(), 7, null, 2, null);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.BaseContentView
    public void render(Context context) throws InterruptedException {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
        companion.d(TAG, "initView");
        ImageView imageView = getImageView();
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.vungle.ads.internal.util.attabal.INSTANCE.addLifecycleListener(this.activityLifecycle);
        boolean zIsStartMuted$vungle_ads_release = getInternal().isStartMuted$vungle_ads_release();
        companion.d(TAG, "startMuted=" + zIsStartMuted$vungle_ads_release);
        Unit unit = null;
        AdVideoView adVideoView = new AdVideoView(context, null, 2, null);
        this.videoView = adVideoView;
        adVideoView.setMuted(zIsStartMuted$vungle_ads_release);
        AdVideoView adVideoView2 = this.videoView;
        if (adVideoView2 != null) {
            adVideoView2.setLooping(false);
        }
        AdVideoView adVideoView3 = this.videoView;
        if (adVideoView3 != null) {
            adVideoView3.setAutoVisibility(true, 0.01f);
        }
        AdVideoView adVideoView4 = this.videoView;
        if (adVideoView4 != null) {
            adVideoView4.setVideoLifecycleCallback(this);
        }
        AdVideoView adVideoView5 = this.videoView;
        if (adVideoView5 != null) {
            adVideoView5.setVideoTransformCallback$vungle_ads_release(new AdVideoView.dern() { // from class: com.vungle.ads.internal.ui.view.cutely
                @Override // com.vungle.ads.internal.ui.view.AdVideoView.dern
                public final void onVideoTransformed(float f, float f2) {
                    VideoContentView.m3273render$lambda5(this.f23791attabal, f, f2);
                }
            });
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        AdVideoView adVideoView6 = this.videoView;
        if (adVideoView6 != null) {
            adVideoView6.setLayoutParams(layoutParams);
        }
        addView(this.videoView);
        this.muteView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(5);
        layoutParams2.addRule(6);
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams2);
        }
        ImageView imageView3 = this.muteView;
        if (imageView3 != null) {
            imageView3.setClickable(true);
        }
        ImageView imageView4 = this.muteView;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.internal.ui.view.apical
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoContentView.m3274render$lambda6(this.f23787kowloon, view);
                }
            });
        }
        onMuteUpdateUI(zIsStartMuted$vungle_ads_release);
        addView(this.muteView);
        ImageView imageView5 = this.muteView;
        if (imageView5 != null) {
            imageView5.bringToFront();
        }
        requestLayout();
        try {
            Result.Companion companion2 = Result.INSTANCE;
            Activity adActivity = getAdActivity(context);
            if (adActivity != null) {
                this.adActivity = new WeakReference<>(adActivity);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("adActivity=");
            WeakReference<Activity> weakReference = this.adActivity;
            sb.append(weakReference != null ? weakReference.get() : null);
            Result.m3351constructorimpl(Integer.valueOf(companion.d(TAG, sb.toString())));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        this.preparedDurationMetric.markStart();
        try {
            Uri uri = Uri.parse(getInternal().getMainVideoPath$vungle_ads_release());
            Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
            AdVideoView adVideoView7 = this.videoView;
            if (adVideoView7 != null) {
                adVideoView7.setSource(uri);
            }
            AdVideoView adVideoView8 = this.videoView;
            if (adVideoView8 != null) {
                adVideoView8.play();
                unit = Unit.f29295attabal;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            onVideoError(-2, String.valueOf(thM3354exceptionOrNullimpl.getLocalizedMessage()));
        }
    }

    public final void setVideoView(AdVideoView adVideoView) {
        this.videoView = adVideoView;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }
}
