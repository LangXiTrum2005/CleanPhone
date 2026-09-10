package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p004ironsource.sv;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.util.ImageLoader;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002*\u0001\u0019\u0018\u0000 ]2\u00020\u0001:\u0002\\]B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u00108\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b:J\b\u0010;\u001a\u00020<H\u0002J\u001c\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010\u00052\b\u0010?\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010@\u001a\u00020\u0005J\u0006\u0010A\u001a\u00020\u0005J\u0006\u0010B\u001a\u00020\u0005J\r\u0010C\u001a\u0004\u0018\u00010D¢\u0006\u0002\u0010EJ\u0006\u0010F\u001a\u00020\u0005J\u0006\u0010G\u001a\u00020\u0005J\r\u0010H\u001a\u00020\u0005H\u0000¢\u0006\u0002\bIJ\b\u0010J\u001a\u00020\u0005H\u0002J\u0006\u0010K\u001a\u00020\u001eJ\r\u0010L\u001a\u00020\u0005H\u0000¢\u0006\u0002\bMJ\r\u0010N\u001a\u00020\u0005H\u0000¢\u0006\u0002\bOJ\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020<H\u0002J\u0015\u0010S\u001a\u00020<2\u0006\u0010T\u001a\u00020UH\u0010¢\u0006\u0002\bVJ\u0006\u0010W\u001a\u00020<J0\u0010X\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J\u0006\u0010[\u001a\u00020<R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b/\u00100R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", "placementId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "adContentView", "Lcom/vungle/ads/internal/ui/view/MediaView;", "adIconView", "Landroid/widget/ImageView;", "adOptionsPosition", "", "getAdOptionsPosition$annotations", "()V", "getAdOptionsPosition", "()I", "setAdOptionsPosition", "(I)V", "adOptionsView", "Lcom/vungle/ads/NativeAdOptionsView;", "adPlayCallback", "com/vungle/ads/NativeAd$adPlayCallback$1", "Lcom/vungle/ads/NativeAd$adPlayCallback$1;", "adRootView", "Landroid/widget/FrameLayout;", "aspectRatio", "", "clickableViews", "", "Landroid/view/View;", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "executors$delegate", "Lkotlin/Lazy;", "imageLoader", "Lcom/vungle/ads/internal/util/ImageLoader;", "getImageLoader", "()Lcom/vungle/ads/internal/util/ImageLoader;", "imageLoader$delegate", "impressionTracker", "Lcom/vungle/ads/internal/ImpressionTracker;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "isInvisibleLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "nativeAdAssetMap", "", "presenter", "Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "constructAdInternal", "Lcom/vungle/ads/internal/NativeAdInternal;", "constructAdInternal$vungle_ads_release", "createMediaAspectRatio", "", "displayImage", "path", "imageView", "getAdBodyText", "getAdCallToActionText", "getAdSponsoredText", "getAdStarRating", "", "()Ljava/lang/Double;", "getAdTitle", "getAppIcon", "getCtaUrl", "getCtaUrl$vungle_ads_release", "getMainImagePath", "getMediaAspectRatio", "getPrivacyIconUrl", "getPrivacyIconUrl$vungle_ads_release", "getPrivacyUrl", "getPrivacyUrl$vungle_ads_release", "hasCallToAction", "", "logViewVisibleOnPlay", sv.j, "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "onAdLoaded$vungle_ads_release", "performCTA", "registerViewForInteraction", "rootView", "mediaView", "unregisterView", "AdOptionsPosition", "Companion", "vungle-ads_release", "platform", "Lcom/vungle/ads/internal/platform/Platform;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final NativeAd$adPlayCallback$1 adPlayCallback;
    private FrameLayout adRootView;
    private float aspectRatio;
    private Collection<? extends View> clickableViews;

    /* JADX INFO: renamed from: executors$delegate, reason: from kotlin metadata */
    private final Lazy executors;

    /* JADX INFO: renamed from: imageLoader$delegate, reason: from kotlin metadata */
    private final Lazy imageLoader;

    /* JADX INFO: renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final Lazy impressionTracker;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private NativeAdPresenter presenter;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(final Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.imageLoader = LazyKt.b(new Function0<ImageLoader>() { // from class: com.vungle.ads.NativeAd$imageLoader$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ImageLoader invoke() {
                ImageLoader companion = ImageLoader.INSTANCE.getInstance();
                companion.init(this.this$0.getExecutors().getIO_EXECUTOR());
                return companion;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.executors = LazyKt.a(LazyThreadSafetyMode.X, new Function0<Executors>() { // from class: com.vungle.ads.NativeAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Executors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
            }
        });
        this.impressionTracker = LazyKt.b(new Function0<ImpressionTracker>() { // from class: com.vungle.ads.NativeAd$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ImpressionTracker invoke() {
                return new ImpressionTracker(context);
            }
        });
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.adOptionsPosition = 1;
        this.adOptionsView = new NativeAdOptionsView(context);
        this.adPlayCallback = new AdPlayCallback() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3164invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3164invoke() {
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(nativeAd);
                        }
                    }
                });
                this.this$0.getDisplayToClickMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String id) throws Throwable {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.FINISHED);
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3165invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3165invoke() {
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(nativeAd);
                        }
                    }
                });
                this.this$0.getShowToCloseMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3166invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3166invoke() {
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(nativeAd);
                        }
                    }
                });
                this.this$0.getPresentToDisplayMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String id) throws Throwable {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3167invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3167invoke() {
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(nativeAd);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String id) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String id) throws Throwable {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.PLAYING);
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric().markStart();
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3168invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3168invoke() {
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(nativeAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final VungleError error) throws Throwable {
                Intrinsics.f(error, "error");
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3169invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3169invoke() {
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(nativeAd, error);
                        }
                    }
                });
                this.this$0.getShowToFailMetric().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric(), this.this$0.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        };
    }

    private final void createMediaAspectRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new Function2<Integer, Integer, Unit>() { // from class: com.vungle.ads.NativeAd.createMediaAspectRatio.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
                return Unit.f43263a;
            }

            public final void invoke(int i2, int i3) {
                NativeAd.this.aspectRatio = i2 / i3;
            }
        });
    }

    private final void displayImage(String path, final ImageView imageView) {
        getImageLoader().displayImage(path, new Function1<Bitmap, Unit>() { // from class: com.vungle.ads.NativeAd.displayImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Bitmap) obj);
                return Unit.f43263a;
            }

            public final void invoke(final Bitmap it) {
                Intrinsics.f(it, "it");
                final ImageView imageView2 = imageView;
                if (imageView2 != null) {
                    ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd.displayImage.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3170invoke();
                            return Unit.f43263a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3170invoke() {
                            imageView2.setImageBitmap(it);
                        }
                    });
                }
            }
        });
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Executors getExecutors() {
        return (Executors) this.executors.getX();
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader.getX();
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getX();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry(), (String) null, 4, (Object) null);
        Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j);
    }

    /* JADX INFO: renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    private static final Platform m3161registerViewForInteraction$lambda1(Lazy<? extends Platform> lazy) {
        return (Platform) lazy.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-2, reason: not valid java name */
    public static final void m3162registerViewForInteraction$lambda2(NativeAd this$0, View view) throws Throwable {
        Intrinsics.f(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("openPrivacy", this$0.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-4$lambda-3, reason: not valid java name */
    public static final void m3163registerViewForInteraction$lambda4$lambda3(NativeAd this$0, View view) throws Throwable {
        Intrinsics.f(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, this$0.getCtaUrl$vungle_ads_release());
        }
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: getMediaAspectRatio, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        Intrinsics.f(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        createMediaAspectRatio();
    }

    public final void performCTA() throws Throwable {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout rootView, MediaView mediaView, ImageView adIconView, Collection<? extends View> clickableViews) throws Throwable {
        String str;
        Intrinsics.f(rootView, "rootView");
        Intrinsics.f(mediaView, "mediaView");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (String) null, 4, (Object) null);
        getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markStart();
        getShowToFailMetric().markStart();
        getShowToCloseMetric().markStart();
        final int i2 = 1;
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = adIconView;
        this.clickableViews = clickableViews;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = getContext();
        Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.X, new Function0<Platform>() { // from class: com.vungle.ads.NativeAd$registerViewForInteraction$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Platform invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Platform.class);
            }
        });
        Context context2 = getContext();
        AdLoaderCallback adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new NativeAdPresenter(context2, (NativePresenterDelegate) adInternal$vungle_ads_release, getAdInternal$vungle_ads_release().getAdvertisement(), m3161registerViewForInteraction$lambda1(lazyA));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(NativeAdInternal.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.initOMTracker(str);
        }
        NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.startTracking(rootView);
        }
        NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.setEventListener(new AdEventListener(this.adPlayCallback, getAdInternal$vungle_ads_release().getPlacement()));
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            final int i3 = 0;
            nativeAdOptionsView.setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.b

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ NativeAd f42860Y;

                {
                    this.f42860Y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    switch (i3) {
                        case 0:
                            NativeAd.m3162registerViewForInteraction$lambda2(this.f42860Y, view);
                            break;
                        default:
                            NativeAd.m3163registerViewForInteraction$lambda4$lambda3(this.f42860Y, view);
                            break;
                    }
                }
            });
        }
        if (clickableViews == null) {
            clickableViews = CollectionsKt.H(mediaView);
        }
        Iterator<T> it = clickableViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.b

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ NativeAd f42860Y;

                {
                    this.f42860Y = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    switch (i2) {
                        case 0:
                            NativeAd.m3162registerViewForInteraction$lambda2(this.f42860Y, view);
                            break;
                        default:
                            NativeAd.m3163registerViewForInteraction$lambda4$lambda3(this.f42860Y, view);
                            break;
                    }
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(rootView, this.adOptionsPosition);
        }
        getImpressionTracker().addView(rootView, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.NativeAd.registerViewForInteraction.3
            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onImpression(View view) throws Throwable {
                Logger.INSTANCE.d(NativeAd.TAG, "ImpressionTracker checked the native ad view become visible.");
                NativeAdPresenter nativeAdPresenter4 = NativeAd.this.presenter;
                if (nativeAdPresenter4 != null) {
                    NativeAdPresenter.processCommand$default(nativeAdPresenter4, NativeAdPresenter.VIDEO_VIEWED, null, 2, null);
                }
                NativeAdPresenter nativeAdPresenter5 = NativeAd.this.presenter;
                if (nativeAdPresenter5 != null) {
                    nativeAdPresenter5.processCommand("tpat", Constants.CHECKPOINT_0);
                }
                NativeAdPresenter nativeAdPresenter6 = NativeAd.this.presenter;
                if (nativeAdPresenter6 != null) {
                    nativeAdPresenter6.onImpression();
                }
                NativeAd.this.logViewVisibleOnPlay();
            }

            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onViewInvisible(View view) throws Throwable {
                if (NativeAd.this.isInvisibleLogged.getAndSet(true)) {
                    return;
                }
                Logger.INSTANCE.d(NativeAd.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, singleValueMetric, NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }
        });
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), adIconView);
        String privacyIconUrl$vungle_ads_release = getPrivacyIconUrl$vungle_ads_release();
        NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        displayImage(privacyIconUrl$vungle_ads_release, nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context3 = rootView.getContext();
            Intrinsics.e(context3, "rootView.context");
            WatermarkView watermarkView = new WatermarkView(context3, watermark$vungle_ads_release);
            rootView.addView(watermarkView);
            watermarkView.bringToFront();
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric().markStart();
        NativeAdPresenter nativeAdPresenter4 = this.presenter;
        if (nativeAdPresenter4 != null) {
            nativeAdPresenter4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i2) {
        this.adOptionsPosition = i2;
    }

    public final void unregisterView() {
        if (getAdInternal$vungle_ads_release().getAdState() == AdInternal.AdState.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e2) {
            Logger.INSTANCE.w(TAG, "error msg: " + e2.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }

    @Override // com.vungle.ads.BaseAd
    public NativeAdInternal constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.f(context, "context");
        return new NativeAdInternal(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(Context context, String placementId) {
        this(context, placementId, new AdConfig());
        Intrinsics.f(context, "context");
        Intrinsics.f(placementId, "placementId");
    }
}
