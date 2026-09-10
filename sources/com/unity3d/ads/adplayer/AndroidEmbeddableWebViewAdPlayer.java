package com.unity3d.ads.adplayer;

import ak.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.ironsource.C0335f8;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.ViewUtilities;
import fn.g;
import fn.o0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import m0.s0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u00132\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001dH\u0096Aø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0013H\u0096Aø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020(H\u0096Aø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0004\b,\u0010'J\u001b\u0010.\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020-H\u0096Aø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b4\u0010\u0019J\u001b\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0004\b6\u0010'J\u001b\u00109\u001a\u00020\u00132\u0006\u00108\u001a\u000207H\u0096Aø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b?\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010FR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020N0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010LR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010LR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010LR\u0014\u0010Z\u001a\u00020W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "webViewAdPlayer", "", "opportunityId", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarManager", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Landroid/content/Context;", "context", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Landroid/content/Context;)V", "Lwj/r;", "dispatchShowCompleted", "()V", "", X3.i.X, "onAllowedPiiChange", "([BLak/f;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "onBroadcastEvent", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lak/f;)Ljava/lang/Object;", "sendActivityDestroyed", "(Lak/f;)Ljava/lang/Object;", "", "isFocused", "sendFocusChange", "(ZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/b;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/b;Lak/f;)Ljava/lang/Object;", "isMuted", "sendMuteChange", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lak/f;)Ljava/lang/Object;", "sendPrivacyFsmChange", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lak/f;)Ljava/lang/Object;", "sendUserConsentChange", C0335f8.f28653k, "sendVisibilityChange", "", "volume", "sendVolumeChange", "(DLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Ljava/lang/String;", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroid/content/Context;", "Lfn/e;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lfn/e;", "onLoadEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "onShowEvent", "Lcn/a0;", "getScope", "()Lcn/a0;", "scope", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {125, 128, TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "destroy")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ BannerView $bannerView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BannerView bannerView, f fVar) {
            super(2, fVar);
            this.$bannerView = bannerView;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidEmbeddableWebViewAdPlayer.this.new AnonymousClass2(this.$bannerView, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.this.context, this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.this.context, this.$bannerView.getSize().getHeight())));
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements jk.c {
        final /* synthetic */ BannerView $bannerView;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, f fVar) {
            super(2, fVar);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass4(this.$bannerView, this.this$0, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass4) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return r.f53297a;
        }
    }

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, LifecycleDataSource lifecycleDataSource, Context context) {
        n.f(webViewAdPlayer, "webViewAdPlayer");
        n.f(opportunityId, "opportunityId");
        n.f(webViewContainer, "webViewContainer");
        n.f(openMeasurementRepository, "openMeasurementRepository");
        n.f(scarManager, "scarManager");
        n.f(lifecycleDataSource, "lifecycleDataSource");
        n.f(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r8, r0) == r5) goto L28;
     */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(ak.f r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            bk.a r5 = bk.a.f5708a
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            t9.e.z(r9)
            goto L83
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r8
            t9.e.z(r9)
            goto L77
        L3d:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r8
            t9.e.z(r9)
            goto L68
        L45:
            t9.e.z(r9)
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = r8.webViewAdPlayer
            r9.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r8.openMeasurementRepository
            java.lang.String r1 = r8.opportunityId
            com.google.protobuf.ByteString r1 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r1)
            boolean r9 = r9.hasSessionFinished(r1)
            if (r9 == 0) goto L68
            r0.L$0 = r8
            r0.label = r4
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = cn.d0.l(r6, r0)
            if (r9 != r5) goto L68
            goto L82
        L68:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r8.getWebViewContainer()
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r5) goto L77
            goto L82
        L77:
            r9 = 0
            r0.L$0 = r9
            r0.label = r2
            java.lang.Object r8 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r8, r0)
            if (r8 != r5) goto L83
        L82:
            return r5
        L83:
            wj.r r8 = wj.r.f53297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(ak.f):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public fn.e getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public fn.e getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public fn.e getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public fn.e getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public a0 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, f fVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, f fVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, f fVar) {
        return this.webViewAdPlayer.requestShow(map, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(f fVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, f fVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(com.unity3d.scar.adapter.common.b bVar, f fVar) {
        return this.webViewAdPlayer.sendGmaEvent(bVar, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, f fVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, f fVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, f fVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, f fVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, f fVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, f fVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, f fVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, fVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final ShowOptions showOptions) {
        n.f(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        final BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException((bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        if (!androidShowOptions.isScarAd()) {
            d0.w(d0.d(), null, new AnonymousClass2(bannerView, null), 3);
            final WebView webView = getWebViewContainer().getWebView();
            WeakHashMap weakHashMap = s0.f45746a;
            if (webView.isAttachedToWindow()) {
                d0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                if (webView.isAttachedToWindow()) {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                } else {
                    d0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        n.f(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        d0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                        WeakHashMap weakHashMap2 = s0.f45746a;
                        if (view.isAttachedToWindow()) {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this));
                        } else {
                            d0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        n.f(view, "view");
                    }
                });
            }
            d0.w(d0.d(), null, new AnonymousClass4(bannerView, this, null), 3);
            return;
        }
        String placementId = androidShowOptions.getPlacementId();
        if (placementId == null) {
            placementId = "";
        }
        String scarQueryId = androidShowOptions.getScarQueryId();
        if (scarQueryId == null) {
            scarQueryId = "";
        }
        String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        if (scarAdUnitId == null) {
            scarAdUnitId = "";
        }
        String scarAdString = androidShowOptions.getScarAdString();
        ph.c cVar = new ph.c(placementId, scarQueryId, scarAdUnitId, scarAdString == null ? "" : scarAdString, 0);
        ScarManager scarManager = this.scarManager;
        Context context = this.context;
        UnityBannerSize size = bannerView.getSize();
        n.e(size, "bannerView.size");
        final o0 o0VarP = g.p(scarManager.loadBannerAd(context, bannerView, cVar, size, this.opportunityId), getScope(), 10);
        WeakHashMap weakHashMap2 = s0.f45746a;
        if (!bannerView.isAttachedToWindow()) {
            bannerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    n.f(view, "view");
                    bannerView.removeOnAttachStateChangeListener(this);
                    d0.w(this.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, o0VarP, showOptions, null), 3);
                    BannerView bannerView2 = bannerView;
                    WeakHashMap weakHashMap3 = s0.f45746a;
                    if (bannerView2.isAttachedToWindow()) {
                        bannerView2.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView2, this));
                    } else {
                        d0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    n.f(view, "view");
                }
            });
            return;
        }
        d0.w(getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, o0VarP, showOptions, null), 3);
        if (bannerView.isAttachedToWindow()) {
            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this));
        } else {
            d0.w(this.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
