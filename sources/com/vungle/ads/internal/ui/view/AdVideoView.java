package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.util.arytenoidectomy;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdVideoView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0006\u0097\u0001\u0098\u0001\u0099\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u000bJ\u000f\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0014¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010(\u001a\u00020\tH\u0014¢\u0006\u0004\b(\u0010\u000bJ\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0019\u00101\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020\tH\u0000¢\u0006\u0004\b6\u0010\u000bJ\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u0010\u000bJ\u000f\u0010:\u001a\u00020\tH\u0000¢\u0006\u0004\b9\u0010\u000bJ\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u000bJ\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bJ\u0015\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0016¢\u0006\u0004\b>\u0010\u001eJ\u0015\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u0012¢\u0006\u0004\b@\u0010\u0015J\u0015\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u0012¢\u0006\u0004\bB\u0010\u0015J\r\u0010C\u001a\u00020\u0012¢\u0006\u0004\bC\u0010&J\u001f\u0010G\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00122\b\b\u0002\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0016¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0016¢\u0006\u0004\bK\u0010JJ\r\u0010L\u001a\u00020\t¢\u0006\u0004\bL\u0010\u000bJ'\u0010Q\u001a\u00020\t2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u0016H\u0016¢\u0006\u0004\bQ\u0010RJ'\u0010S\u001a\u00020\t2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u0016H\u0016¢\u0006\u0004\bS\u0010RJ\u0017\u0010T\u001a\u00020\u00122\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR(\u0010c\u001a\u00020b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bi\u0010\u000b\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010k\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bq\u0010\u000b\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010yR\u0016\u0010{\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010YR\u0016\u0010|\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010YR\u0016\u0010}\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010~R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010YR\u0018\u0010\u0080\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010YR\u0018\u0010\u0081\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010YR\u0018\u0010\u0082\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u0018\u0010\u0083\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010~R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R7\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020r0\u008e\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u0012\u0005\b\u0095\u0001\u0010\u000b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "ensurePlayer", "()V", "pauseInternal", "prepareIfNeeded", "applyMute", "notifyPlay", "notifyPause", "notifyCompleted", "", "muted", "notifyMuted", "(Z)V", "", "what", "", "extra", "notifyError", "(ILjava/lang/String;)V", "percentage", "notifyProgress", "(I)V", "calculateAndNotifyProgress", "beginProgressUpdates", "endProgressUpdates", "detachSurface", "applyTransform", "checkVisibility", "isVisibleEnough", "()Z", "onAttachedToWindow", "onDetachedFromWindow", "Lmetairie/saneness;", "lifecycleCallback", "setVideoLifecycleCallback", "(Lmetairie/saneness;)V", "Lcom/vungle/ads/internal/ui/view/AdVideoView$dern;", "callback", "setVideoTransformCallback$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/AdVideoView$dern;)V", "setVideoTransformCallback", "Landroid/net/Uri;", "uri", "setSource", "(Landroid/net/Uri;)V", "playOnActivityResumed$vungle_ads_release", "playOnActivityResumed", "play", "pauseOnActivityPaused$vungle_ads_release", "pauseOnActivityPaused", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "stop", "ms", "seekTo", "loop", "setLooping", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "setMuted", "isMuted", "enabled", "", "threshold", "setAutoVisibility", "(ZF)V", "getCurrentPositionMs", "()I", "getDurationMs", "release", "Landroid/graphics/SurfaceTexture;", "st", "width", "height", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "autoVisibility", "Z", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "visibilityThreshold", "F", "Landroid/view/TextureView;", "texture", "Landroid/view/TextureView;", "getTexture$vungle_ads_release", "()Landroid/view/TextureView;", "setTexture$vungle_ads_release", "(Landroid/view/TextureView;)V", "getTexture$vungle_ads_release$annotations", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "getSurface$vungle_ads_release", "()Landroid/view/Surface;", "setSurface$vungle_ads_release", "(Landroid/view/Surface;)V", "getSurface$vungle_ads_release$annotations", "Landroid/media/MediaPlayer;", CampaignEx.JSON_KEY_AD_MP, "Landroid/media/MediaPlayer;", "sourceUri", "Landroid/net/Uri;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "prepared", "Ljava/util/concurrent/atomic/AtomicBoolean;", "preparing", "wantPlay", "videoPaused", "lastPosMs", "I", "durationMs", "looping", "videoCompleted", "videoW", "videoH", "Lmetairie/saneness;", "videoTransformCallback", "Lcom/vungle/ads/internal/ui/view/AdVideoView$dern;", "lastProgressSent", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/vungle/ads/internal/ui/view/AdVideoView$saneness;", "progressUpdater", "Lcom/vungle/ads/internal/ui/view/AdVideoView$saneness;", "Lkotlin/Function0;", "mediaPlayerFactory", "Lkotlin/jvm/functions/Function0;", "getMediaPlayerFactory$vungle_ads_release", "()Lkotlin/jvm/functions/Function0;", "setMediaPlayerFactory$vungle_ads_release", "(Lkotlin/jvm/functions/Function0;)V", "getMediaPlayerFactory$vungle_ads_release$annotations", "Companion", "attabal", "saneness", "dern", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdVideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final int ERROR_VIDEO_PLAYBACK_FAILED = -2;
    public static final int ERROR_VIDEO_PREPARE_FAILED = -1;
    private static final long PROGRESS_INTERVAL_MS = 1000;
    private static final String TAG = "NativeAd-Video";
    private boolean autoVisibility;
    private metairie.saneness callback;
    private int durationMs;
    private final Handler handler;
    private int lastPosMs;
    private int lastProgressSent;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private Function0<? extends MediaPlayer> mediaPlayerFactory;
    private MediaPlayer mp;
    private boolean muted;
    private AtomicBoolean prepared;
    private AtomicBoolean preparing;
    private final saneness progressUpdater;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private Uri sourceUri;
    private Surface surface;
    private TextureView texture;
    private boolean videoCompleted;
    private int videoH;
    private boolean videoPaused;
    private dern videoTransformCallback;
    private int videoW;
    private float visibilityThreshold;
    private boolean wantPlay;

    /* JADX INFO: compiled from: AdVideoView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$dern;", "", "", TtmlNode.LEFT, "top", "", "onVideoTransformed", "(FF)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface dern {
        void onVideoTransformed(float left, float top);
    }

    /* JADX INFO: compiled from: AdVideoView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$saneness;", "Ljava/lang/Runnable;", "Lcom/vungle/ads/internal/ui/view/AdVideoView;", "adVideoView", "<init>", "(Lcom/vungle/ads/internal/ui/view/AdVideoView;)V", "", "run", "()V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "weakRef", "Ljava/lang/ref/WeakReference;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class saneness implements Runnable {
        private final WeakReference<AdVideoView> weakRef;

        public saneness(AdVideoView adVideoView) {
            Intrinsics.checkNotNullParameter(adVideoView, "adVideoView");
            this.weakRef = new WeakReference<>(adVideoView);
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlayer mediaPlayer;
            AdVideoView adVideoView = this.weakRef.get();
            if (adVideoView == null) {
                return;
            }
            adVideoView.calculateAndNotifyProgress();
            if (!adVideoView.prepared.get() || (mediaPlayer = adVideoView.mp) == null || !mediaPlayer.isPlaying() || adVideoView.videoCompleted) {
                return;
            }
            adVideoView.handler.postDelayed(this, 1000L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdVideoView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyMute() {
        float f = this.muted ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    private final void applyTransform() {
        if (this.videoW <= 0 || this.videoH <= 0) {
            return;
        }
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        float f4 = this.videoW / this.videoH;
        Matrix matrix = new Matrix();
        float f5 = f3 > f4 ? f2 / this.videoH : f / this.videoW;
        matrix.setScale((this.videoW * f5) / f, (this.videoH * f5) / f2, f / 2.0f, f2 / 2.0f);
        this.texture.setTransform(matrix);
        this.texture.invalidate();
        float f6 = (f - (this.videoW * f5)) / 2.0f;
        float f7 = (f2 - (this.videoH * f5)) / 2.0f;
        dern dernVar = this.videoTransformCallback;
        if (dernVar != null) {
            dernVar.onVideoTransformed(this.texture.getX() + f6, this.texture.getY() + f7);
        }
    }

    private final void beginProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        this.handler.post(this.progressUpdater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateAndNotifyProgress() {
        int iApical;
        int i = this.durationMs;
        if (i <= 0 || !this.prepared.get() || (iApical = p002kotlin.ranges.wireman.apical((int) ((((long) getCurrentPositionMs()) * ((long) 100)) / ((long) i)), 0, 100)) == this.lastProgressSent) {
            return;
        }
        this.lastProgressSent = iApical;
        notifyProgress(iApical);
    }

    private final void checkVisibility() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.autoVisibility) {
            if (!isVisibleEnough() || !this.wantPlay || this.videoPaused) {
                if (this.prepared.get() && (mediaPlayer = this.mp) != null && mediaPlayer.isPlaying()) {
                    arytenoidectomy.INSTANCE.d(TAG, "auto-pause: visibility NOT enough");
                    pauseInternal();
                    return;
                }
                return;
            }
            if (!this.prepared.get() || (surface = this.surface) == null || !surface.isValid()) {
                prepareIfNeeded();
                return;
            }
            MediaPlayer mediaPlayer2 = this.mp;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.videoCompleted) {
                arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.mp;
                sb.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                sb.append(" ms");
                companion.d(TAG, sb.toString());
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        }
    }

    private final void detachSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    private final void endProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        calculateAndNotifyProgress();
    }

    private final void ensurePlayer() {
        if (this.mp != null) {
            return;
        }
        MediaPlayer mediaPlayerInvoke = this.mediaPlayerFactory.invoke();
        mediaPlayerInvoke.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayerInvoke.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.dern
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                AdVideoView.m3264ensurePlayer$lambda14$lambda10(this.f23792kowloon, mediaPlayer);
            }
        });
        mediaPlayerInvoke.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.wireman
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                AdVideoView.m3265ensurePlayer$lambda14$lambda11(this.f23798kowloon, mediaPlayer, i, i2);
            }
        });
        mediaPlayerInvoke.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.marial
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                AdVideoView.m3266ensurePlayer$lambda14$lambda12(this.f23794kowloon, mediaPlayer);
            }
        });
        mediaPlayerInvoke.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.beachfront
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return AdVideoView.m3267ensurePlayer$lambda14$lambda13(this.f23789kowloon, mediaPlayer, i, i2);
            }
        });
        this.mp = mediaPlayerInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-10, reason: not valid java name */
    public static final void m3264ensurePlayer$lambda14$lambda10(AdVideoView this$0, MediaPlayer mediaPlayer) {
        Surface surface;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        metairie.saneness sanenessVar = this$0.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoPrepared();
        }
        this$0.durationMs = mediaPlayer.getDuration();
        this$0.preparing.set(false);
        this$0.prepared.set(true);
        int i = this$0.lastPosMs;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        this$0.applyMute();
        arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
        companion.d(TAG, "onPrepared(): duration=" + this$0.durationMs + " ms lastPos=" + this$0.lastPosMs + " wantPlay=" + this$0.wantPlay);
        if (this$0.wantPlay && (surface = this$0.surface) != null && surface.isValid()) {
            companion.d(TAG, "start video on prepared.");
            mediaPlayer.start();
            this$0.notifyPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-11, reason: not valid java name */
    public static final void m3265ensurePlayer$lambda14$lambda11(AdVideoView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this$0.videoW = i;
        this$0.videoH = i2;
        SurfaceTexture surfaceTexture = this$0.texture.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this$0.applyTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-12, reason: not valid java name */
    public static final void m3266ensurePlayer$lambda14$lambda12(AdVideoView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        arytenoidectomy.INSTANCE.d(TAG, "onCompletion()");
        this$0.lastPosMs = this$0.durationMs;
        this$0.videoCompleted = true;
        this$0.endProgressUpdates();
        this$0.lastProgressSent = 100;
        this$0.notifyProgress(100);
        this$0.notifyCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m3267ensurePlayer$lambda14$lambda13(AdVideoView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        arytenoidectomy.INSTANCE.w(TAG, "onError(): what=" + i + ", extra=" + i2);
        this$0.preparing.set(false);
        this$0.prepared.set(false);
        this$0.notifyError(i, String.valueOf(i2));
        return true;
    }

    private final boolean isVisibleEnough() {
        if (!isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (!getGlobalVisibleRect(rect)) {
            return false;
        }
        long jHeight = ((long) rect.height()) * ((long) rect.width());
        long height = ((long) getHeight()) * ((long) getWidth());
        return height > 0 && ((float) jHeight) / ((float) height) >= this.visibilityThreshold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: layoutListener$lambda-1, reason: not valid java name */
    public static final void m3268layoutListener$lambda1(AdVideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    private final void notifyCompleted() {
        metairie.saneness sanenessVar = this.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoCompleted();
        }
    }

    private final void notifyError(int what, String extra) {
        metairie.saneness sanenessVar = this.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoError(what, extra);
        }
    }

    private final void notifyMuted(boolean muted) {
        metairie.saneness sanenessVar = this.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoMuted(muted);
        }
    }

    private final void notifyPause() {
        endProgressUpdates();
        metairie.saneness sanenessVar = this.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoPause();
        }
    }

    private final void notifyPlay() {
        beginProgressUpdates();
        metairie.saneness sanenessVar = this.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoPlay();
        }
    }

    private final void notifyProgress(int percentage) {
        metairie.saneness sanenessVar = this.callback;
        if (sanenessVar != null) {
            sanenessVar.onVideoProgress(percentage);
        }
    }

    private final void pauseInternal() {
        Object objM3351constructorimpl;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null && this.prepared.get() && mediaPlayer.isPlaying()) {
            arytenoidectomy.INSTANCE.d(TAG, "pauseInternal(): pos=" + mediaPlayer.getCurrentPosition() + " ms");
            mediaPlayer.pause();
            notifyPause();
        } else {
            arytenoidectomy.INSTANCE.d(TAG, "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = numValueOf;
        }
        this.lastPosMs = ((Number) objM3351constructorimpl).intValue();
    }

    private final void prepareIfNeeded() {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uri = this.sourceUri;
            if (uri != null && !this.prepared.get() && !this.preparing.get()) {
                ensurePlayer();
                this.preparing.set(true);
                this.prepared.set(false);
                MediaPlayer mediaPlayer = this.mp;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setLooping(this.looping);
                }
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.setSurface(this.surface);
                }
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setDataSource(getContext(), uri);
                }
                arytenoidectomy.Companion companion2 = arytenoidectomy.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("prepareAsync(): uri=");
                sb.append(uri);
                sb.append(", surfaceValid=");
                Surface surface = this.surface;
                Unit unit = null;
                sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
                companion2.d(TAG, sb.toString());
                MediaPlayer mediaPlayer5 = this.mp;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepareAsync();
                    unit = Unit.f29295attabal;
                }
                objM3351constructorimpl = Result.m3351constructorimpl(unit);
                Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
                if (thM3354exceptionOrNullimpl != null) {
                    notifyError(-1, String.valueOf(thM3354exceptionOrNullimpl.getLocalizedMessage()));
                }
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollListener$lambda-0, reason: not valid java name */
    public static final void m3269scrollListener$lambda0(AdVideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    public static /* synthetic */ void setAutoVisibility$default(AdVideoView adVideoView, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.8f;
        }
        adVideoView.setAutoVisibility(z, f);
    }

    public final int getCurrentPositionMs() {
        Object objM3351constructorimpl;
        if (!this.prepared.get()) {
            return p002kotlin.ranges.wireman.wireman(this.lastPosMs, 0);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.mp;
            objM3351constructorimpl = Result.m3351constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = numValueOf;
        }
        return p002kotlin.ranges.wireman.wireman(((Number) objM3351constructorimpl).intValue(), 0);
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final Function0<MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.mediaPlayerFactory;
    }

    /* JADX INFO: renamed from: getSurface$vungle_ads_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getTexture$vungle_ads_release, reason: from getter */
    public final TextureView getTexture() {
        return this.texture;
    }

    /* JADX INFO: renamed from: isMuted, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        arytenoidectomy.INSTANCE.d(TAG, "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        arytenoidectomy.INSTANCE.d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        pauseInternal();
        detachSurface();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture st, int width, int height) {
        Object objM3351constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(st);
        this.surface = surface2;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to set surface", thM3354exceptionOrNullimpl);
        }
        boolean zM3357isSuccessimpl = Result.m3357isSuccessimpl(objM3351constructorimpl);
        arytenoidectomy.Companion companion3 = arytenoidectomy.INSTANCE;
        companion3.d(TAG, "onSurfaceTextureAvailable(): " + width + " x " + height + ", prepared=" + this.prepared + ", wantPlay=" + this.wantPlay + ", surfaceRet=" + zM3357isSuccessimpl);
        if (zM3357isSuccessimpl && this.prepared.get() && this.wantPlay) {
            companion3.d(TAG, "onSurfaceTextureAvailable and videoCompleted=" + this.videoCompleted);
            if (this.videoCompleted) {
                seekTo(this.durationMs);
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.pause();
                }
            } else {
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        } else {
            prepareIfNeeded();
        }
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(st, "st");
        arytenoidectomy.INSTANCE.d(TAG, "onSurfaceTextureDestroyed()");
        pauseInternal();
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.mp;
            Unit unit = null;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit = Unit.f29295attabal;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to clear surface", thM3354exceptionOrNullimpl);
        }
        detachSurface();
        endProgressUpdates();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture st, int width, int height) {
        Intrinsics.checkNotNullParameter(st, "st");
        arytenoidectomy.INSTANCE.d(TAG, "onSurfaceTextureSizeChanged() width=" + width + " height=" + height);
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    public final void pause() {
        arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("pause() at pos=");
        MediaPlayer mediaPlayer = this.mp;
        sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb.append(" ms");
        companion.d(TAG, sb.toString());
        this.videoPaused = true;
        this.wantPlay = false;
        pauseInternal();
    }

    public final void pauseOnActivityPaused$vungle_ads_release() {
        this.videoPaused = true;
        pauseInternal();
    }

    public final void play() {
        Surface surface;
        this.wantPlay = true;
        this.videoPaused = false;
        this.videoCompleted = false;
        arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("play(): prepared=");
        sb.append(this.prepared);
        sb.append(", surfaceValid=");
        Surface surface2 = this.surface;
        sb.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb.append(", visible=");
        sb.append(isVisibleEnough());
        companion.d(TAG, sb.toString());
        if (!this.prepared.get() || (surface = this.surface) == null || !surface.isValid() || !isVisibleEnough()) {
            prepareIfNeeded();
            return;
        }
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("play(): pos=");
            MediaPlayer mediaPlayer2 = this.mp;
            sb2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            sb2.append(" ms");
            companion.d(TAG, sb2.toString());
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
            }
            notifyPlay();
        }
    }

    public final void playOnActivityResumed$vungle_ads_release() {
        if (this.wantPlay && this.videoPaused && !this.videoCompleted) {
            play();
        }
    }

    public final void release() {
        Object objM3351constructorimpl;
        Object objM3351constructorimpl2;
        Object objM3351constructorimpl3;
        Unit unit;
        Unit unit2;
        Unit unit3;
        arytenoidectomy.INSTANCE.d(TAG, "release()");
        pause();
        this.handler.removeCallbacks(this.progressUpdater);
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                unit3 = Unit.f29295attabal;
            } else {
                unit3 = null;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unit3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to clear Surface", thM3354exceptionOrNullimpl);
        }
        try {
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
                unit2 = Unit.f29295attabal;
            } else {
                unit2 = null;
            }
            objM3351constructorimpl2 = Result.m3351constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM3351constructorimpl2 = Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
        Throwable thM3354exceptionOrNullimpl2 = Result.m3354exceptionOrNullimpl(objM3351constructorimpl2);
        if (thM3354exceptionOrNullimpl2 != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to stop MediaPlayer", thM3354exceptionOrNullimpl2);
        }
        try {
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            objM3351constructorimpl3 = Result.m3351constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM3351constructorimpl3 = Result.m3351constructorimpl(p002kotlin.dern.attabal(th3));
        }
        Throwable thM3354exceptionOrNullimpl3 = Result.m3354exceptionOrNullimpl(objM3351constructorimpl3);
        if (thM3354exceptionOrNullimpl3 != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to release MediaPlayer", thM3354exceptionOrNullimpl3);
        }
        this.mp = null;
        detachSurface();
        this.prepared.set(false);
        this.preparing.set(false);
    }

    public final void seekTo(int ms) {
        this.lastPosMs = p002kotlin.ranges.wireman.wireman(ms, 0);
        arytenoidectomy.INSTANCE.d(TAG, "seekTo " + this.lastPosMs);
        if (this.prepared.get()) {
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(this.lastPosMs);
            }
            calculateAndNotifyProgress();
        }
    }

    public final void setAutoVisibility(boolean enabled, float threshold) {
        arytenoidectomy.INSTANCE.d(TAG, "setAutoVisibility enabled=" + enabled + " threshold=" + threshold);
        this.autoVisibility = enabled;
        this.visibilityThreshold = p002kotlin.ranges.wireman.cutely(threshold, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (enabled) {
            checkVisibility();
        }
    }

    public final void setLooping(boolean loop) {
        arytenoidectomy.INSTANCE.d(TAG, "setLooping to " + this.looping);
        this.looping = loop;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(loop);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(Function0<? extends MediaPlayer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.mediaPlayerFactory = function0;
    }

    public final void setMuted(boolean mute) {
        arytenoidectomy.INSTANCE.d(TAG, "setMuted to " + mute);
        this.muted = mute;
        applyMute();
        notifyMuted(mute);
    }

    public final void setSource(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.sourceUri = uri;
        this.prepared.set(false);
        this.preparing.set(false);
        this.videoW = 0;
        this.videoH = 0;
        prepareIfNeeded();
    }

    public final void setSurface$vungle_ads_release(Surface surface) {
        this.surface = surface;
    }

    public final void setTexture$vungle_ads_release(TextureView textureView) {
        Intrinsics.checkNotNullParameter(textureView, "<set-?>");
        this.texture = textureView;
    }

    public final void setVideoLifecycleCallback(metairie.saneness lifecycleCallback) {
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.callback = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(dern callback) {
        this.videoTransformCallback = callback;
    }

    public final void stop() {
        this.wantPlay = false;
        this.lastPosMs = 0;
        this.videoCompleted = false;
        MediaPlayer mediaPlayer = this.mp;
        arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("stop(): prepared=");
        sb.append(this.prepared);
        sb.append(", surface=");
        Surface surface = this.surface;
        sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        companion.d(TAG, sb.toString());
        if (mediaPlayer != null && this.prepared.get()) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                notifyPause();
            }
            mediaPlayer.seekTo(0);
            Surface surface2 = this.surface;
            if (surface2 != null && surface2.isValid() && !mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                mediaPlayer.pause();
            }
        }
        endProgressUpdates();
        this.lastProgressSent = -1;
    }

    public /* synthetic */ AdVideoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.attabal
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AdVideoView.m3269scrollListener$lambda0(this.f23788kowloon);
            }
        };
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.saneness
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AdVideoView.m3268layoutListener$lambda1(this.f23795kowloon);
            }
        };
        this.visibilityThreshold = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.texture = textureView;
        this.prepared = new AtomicBoolean(false);
        this.preparing = new AtomicBoolean(false);
        this.lastProgressSent = -1;
        this.handler = new Handler(Looper.getMainLooper());
        this.progressUpdater = new saneness(this);
        this.mediaPlayerFactory = new Function0<MediaPlayer>() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$mediaPlayerFactory$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final MediaPlayer invoke() {
                return new MediaPlayer();
            }
        };
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.texture, new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }
}
