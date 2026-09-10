package com.unity3d.ads.adplayer;

import ak.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.f1;
import cn.q;
import cn.u1;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C0335f8;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.properties.ClientProperties;
import fn.g;
import fn.m0;
import fn.r0;
import fn.s;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wj.d;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u0002:\u0002\u0086\u0001Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0096Aø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b%\u0010&J+\u0010*\u001a\u00020\u001d2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010'H\u0096Aø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u001dH\u0096Aø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.H\u0096Aø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u001d2\u0006\u0010$\u001a\u000202H\u0096Aø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u001d2\u0006\u00105\u001a\u00020.H\u0096Aø\u0001\u0000¢\u0006\u0004\b6\u00101J\u001b\u00108\u001a\u00020\u001d2\u0006\u0010$\u001a\u000207H\u0096Aø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0096Aø\u0001\u0000¢\u0006\u0004\b:\u0010#J\u001b\u0010<\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020;H\u0096Aø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0096Aø\u0001\u0000¢\u0006\u0004\b>\u0010#J\u001b\u0010@\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020.H\u0096Aø\u0001\u0000¢\u0006\u0004\b@\u00101J\u001b\u0010C\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020AH\u0096Aø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0013\u0010I\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\bI\u0010-J'\u0010O\u001a\u00020N2\u0006\u0010J\u001a\u00020\u00192\u0006\u0010F\u001a\u00020K2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u001b\u0010S\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020QH\u0082@ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020UH\u0082@ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u0017\u0010[\u001a\u00020Z2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010]R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010^R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010gR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010hR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010iR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010jR\u001d\u0010p\u001a\u0004\u0018\u00010k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020u0t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020y0t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bz\u0010wR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020|0t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b}\u0010wR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010wR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0087\u0001"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "webViewAdPlayer", "", "opportunityId", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "orientationRepository", "Landroid/content/Context;", "context", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "Lwj/r;", "dispatchShowCompleted", "()V", "", X3.i.X, "onAllowedPiiChange", "([BLak/f;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "onBroadcastEvent", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lak/f;)Ljava/lang/Object;", "sendActivityDestroyed", "(Lak/f;)Ljava/lang/Object;", "", "isFocused", "sendFocusChange", "(ZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/b;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/b;Lak/f;)Ljava/lang/Object;", "isMuted", "sendMuteChange", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lak/f;)Ljava/lang/Object;", "sendPrivacyFsmChange", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lak/f;)Ljava/lang/Object;", "sendUserConsentChange", C0335f8.f28653k, "sendVisibilityChange", "", "volume", "sendVolumeChange", "(DLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "providedContext", "Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "", "intentFlags", "Landroid/content/Intent;", "getIntent", "(Landroid/content/Context;Lcom/unity3d/ads/adplayer/AndroidShowOptions;I)Landroid/content/Intent;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "change", "handleVolumeSettingsChange", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "handleSessionChange", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "displayMessage", "Lcn/f1;", "displayEventsRouter", "(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lcn/f1;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Ljava/lang/String;", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lwj/d;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lfn/e;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lfn/e;", "onLoadEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "onShowEvent", "Lcn/a0;", "getScope", "()Lcn/a0;", "scope", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final m0 displayMessages = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, en.a.f40122a);

    /* JADX INFO: renamed from: adObject$delegate, reason: from kotlin metadata */
    private final d adObject;
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final AtomicBoolean wasDestroyed;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "<init>", "()V", "Lfn/m0;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "displayMessages", "Lfn/m0;", "getDisplayMessages", "()Lfn/m0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final m0 getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {228, 233, 237, 239}, m = "destroy")
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
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {245, 246, 247, 248, 249, 251}, m = "invokeSuspend")
    public static final class C07021 extends i implements jk.c {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07021(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, f fVar) {
            super(2, fVar);
            this.$displayMessage = displayMessage;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new C07021(this.$displayMessage, this.this$0, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07021) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        
            if (r5.requestShow(r0, r4) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (r5.emit(r0, r4) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (r5.sendVisibilityChange(r0, r4) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            if (r5.sendFocusChange(r0, r4) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        
            if (r5.sendActivityDestroyed(r4) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            if (r5.destroy(r4) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
        
            return r1;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C07021.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class C07031 extends i implements jk.c {
        final /* synthetic */ q $listenerStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07031(q qVar, f fVar) {
            super(2, fVar);
            this.$listenerStarted = qVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new C07031(this.$listenerStarted, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((C07031) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            cn.r rVar = (cn.r) this.$listenerStarted;
            r rVar2 = r.f53297a;
            rVar.O(rVar2);
            return rVar2;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lwj/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass10 extends o implements jk.b {

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {128}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements jk.c {
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, f fVar) {
                super(2, fVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new AnonymousClass1(this.this$0, fVar);
            }

            @Override // jk.c
            public final Object invoke(a0 a0Var, f fVar) {
                return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                    this.label = 1;
                    Object objDestroy = androidFullscreenWebViewAdPlayer.destroy(this);
                    bk.a aVar = bk.a.f5708a;
                    if (objDestroy == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            }
        }

        public AnonymousClass10() {
            super(1);
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return r.f53297a;
        }

        public final void invoke(Throwable th2) {
            if (th2 != null) {
                d0.w(d0.b(AndroidFullscreenWebViewAdPlayer.this.getScope().getCoroutineContext().plus(u1.f6774a)), null, new AnonymousClass1(AndroidFullscreenWebViewAdPlayer.this, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {157}, m = "invokeSuspend")
    public static final class AnonymousClass11 extends i implements jk.c {
        final /* synthetic */ int $defaultIntentFlags;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ q $listenerStarted;
        final /* synthetic */ int $selectedIntentFlags;
        final /* synthetic */ ShowOptions $showOptions;
        final /* synthetic */ Context $startContext;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(q qVar, Context context, Intent intent, int i10, int i11, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, f fVar) {
            super(2, fVar);
            this.$listenerStarted = qVar;
            this.$startContext = context;
            this.$intent = intent;
            this.$selectedIntentFlags = i10;
            this.$defaultIntentFlags = i11;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.$listenerStarted, this.$startContext, this.$intent, this.$selectedIntentFlags, this.$defaultIntentFlags, this.this$0, this.$showOptions, fVar);
            anonymousClass11.L$0 = obj;
            return anonymousClass11;
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass11) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            r rVar = r.f53297a;
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                a0 a0Var = (a0) this.L$0;
                q qVar = this.$listenerStarted;
                this.L$0 = a0Var;
                this.label = 1;
                Object objS = ((cn.r) qVar).s(this);
                bk.a aVar = bk.a.f5708a;
                if (objS == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            try {
                this.$startContext.startActivity(this.$intent);
                objC = rVar;
            } catch (Throwable th2) {
                objC = t9.e.c(th2);
            }
            int i11 = this.$selectedIntentFlags;
            int i12 = this.$defaultIntentFlags;
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            Context context = this.$startContext;
            ShowOptions showOptions = this.$showOptions;
            Throwable thA = h.a(objC);
            if (thA != null) {
                if (i11 == i12) {
                    throw thA;
                }
                context.startActivity(androidFullscreenWebViewAdPlayer.getIntent(context, (AndroidShowOptions) showOptions, i12));
            }
            return rVar;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {180, 183, 187}, m = "invokeSuspend")
    public static final class AnonymousClass12 extends i implements jk.c {
        final /* synthetic */ q $listenerStarted;
        final /* synthetic */ r0 $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {182}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements jk.c {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, f fVar) {
                super(2, fVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new AnonymousClass1(this.this$0, this.$showOptions, fVar);
            }

            @Override // jk.c
            public final Object invoke(fn.f fVar, f fVar2) {
                return ((AnonymousClass1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    m0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    Object objEmit = displayMessages.emit(displayReady, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ScarEvent;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends i implements jk.c {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(f fVar) {
                super(2, fVar);
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // jk.c
            public final Object invoke(ScarEvent scarEvent, f fVar) {
                return ((AnonymousClass2) create(scarEvent, fVar)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return Boolean.valueOf(n.a((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public /* synthetic */ class AnonymousClass4 implements fn.f, kotlin.jvm.internal.h {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // fn.f
            public final Object emit(com.unity3d.scar.adapter.common.b bVar, f fVar) {
                Object objSendGmaEvent = this.$tmp0.sendGmaEvent(bVar, fVar);
                return objSendGmaEvent == bk.a.f5708a ? objSendGmaEvent : r.f53297a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof fn.f) && (obj instanceof kotlin.jvm.internal.h)) {
                    return n.a(getFunctionDelegate(), ((kotlin.jvm.internal.h) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.h
            public final wj.a getFunctionDelegate() {
                return new k(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(q qVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, r0 r0Var, ShowOptions showOptions, f fVar) {
            super(2, fVar);
            this.$listenerStarted = qVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$scarEvents = r0Var;
            this.$showOptions = showOptions;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass12(this.$listenerStarted, this.this$0, this.$scarEvents, this.$showOptions, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass12) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            if (r0.collect(r2, r7) == r4) goto L20;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 3
                r2 = 2
                r3 = 1
                bk.a r4 = bk.a.f5708a
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1f
                if (r0 == r2) goto L1b
                if (r0 != r1) goto L13
                t9.e.z(r8)
                goto L71
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1b:
                t9.e.z(r8)
                goto L56
            L1f:
                t9.e.z(r8)
                goto L33
            L23:
                t9.e.z(r8)
                cn.q r8 = r7.$listenerStarted
                r7.label = r3
                cn.r r8 = (cn.r) r8
                java.lang.Object r8 = r8.s(r7)
                if (r8 != r4) goto L33
                goto L70
            L33:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
                fn.e r8 = r8.getOnScarEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r3 = r7.this$0
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r0.<init>(r3, r5, r6)
                fn.k r3 = new fn.k
                r3.<init>(r0, r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2
                r8.<init>(r6)
                r7.label = r2
                java.lang.Object r8 = fn.g.l(r3, r8, r7)
                if (r8 != r4) goto L56
                goto L70
            L56:
                fn.r0 r8 = r7.$scarEvents
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1
                r0.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4 r2 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4
                r2.<init>(r8)
                r7.label = r1
                java.lang.Object r7 = r0.collect(r2, r7)
                if (r7 != r4) goto L71
            L70:
                return r4
            L71:
                wj.r r7 = wj.r.f53297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass12.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {194, 197, InterfaceC0435l1.c.b.f29097c}, m = "invokeSuspend")
    public static final class AnonymousClass13 extends i implements jk.c {
        final /* synthetic */ q $listenerStarted;
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {196}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements jk.c {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, f fVar) {
                super(2, fVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new AnonymousClass1(this.this$0, this.$showOptions, fVar);
            }

            @Override // jk.c
            public final Object invoke(fn.f fVar, f fVar2) {
                return ((AnonymousClass1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    m0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    Object objEmit = displayMessages.emit(displayReady, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return r.f53297a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends i implements jk.c {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(f fVar) {
                super(2, fVar);
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // jk.c
            public final Object invoke(OfferwallShowEvent offerwallShowEvent, f fVar) {
                return ((AnonymousClass2) create(offerwallShowEvent, fVar)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return Boolean.valueOf(n.a((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public /* synthetic */ class AnonymousClass4 implements fn.f, kotlin.jvm.internal.h {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // fn.f
            public final Object emit(OfferwallEvent offerwallEvent, f fVar) {
                Object objSendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, fVar);
                return objSendOfferwallEvent == bk.a.f5708a ? objSendOfferwallEvent : r.f53297a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof fn.f) && (obj instanceof kotlin.jvm.internal.h)) {
                    return n.a(getFunctionDelegate(), ((kotlin.jvm.internal.h) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.h
            public final wj.a getFunctionDelegate() {
                return new k(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(q qVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, f fVar) {
            super(2, fVar);
            this.$listenerStarted = qVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass13(this.$listenerStarted, this.this$0, this.$showOptions, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass13) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        
            if (r0.collect(r2, r7) == r4) goto L23;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 3
                r2 = 2
                r3 = 1
                bk.a r4 = bk.a.f5708a
                if (r0 == 0) goto L24
                if (r0 == r3) goto L20
                if (r0 == r2) goto L1c
                if (r0 != r1) goto L14
                t9.e.z(r8)
                goto L91
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                t9.e.z(r8)
                goto L57
            L20:
                t9.e.z(r8)
                goto L34
            L24:
                t9.e.z(r8)
                cn.q r8 = r7.$listenerStarted
                r7.label = r3
                cn.r r8 = (cn.r) r8
                java.lang.Object r8 = r8.s(r7)
                if (r8 != r4) goto L34
                goto L90
            L34:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
                fn.e r8 = r8.getOnOfferwallEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r3 = r7.this$0
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r0.<init>(r3, r5, r6)
                fn.k r3 = new fn.k
                r3.<init>(r0, r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$2 r8 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$2
                r8.<init>(r6)
                r7.label = r2
                java.lang.Object r8 = fn.g.l(r3, r8, r7)
                if (r8 != r4) goto L57
                goto L90
            L57:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
                com.unity3d.ads.core.data.manager.OfferwallManager r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(r8)
                com.unity3d.ads.adplayer.ShowOptions r0 = r7.$showOptions
                com.unity3d.ads.adplayer.AndroidShowOptions r0 = (com.unity3d.ads.adplayer.AndroidShowOptions) r0
                java.lang.String r0 = r0.getOfferwallPlacementName()
                if (r0 != 0) goto L69
                java.lang.String r0 = ""
            L69:
                fn.e r8 = r8.showAd(r0)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r0 = r7.this$0
                cn.a0 r0 = r0.getScope()
                r2 = 5
                fn.o0 r8 = fn.g.p(r8, r0, r2)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$invokeSuspend$$inlined$mapNotNull$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$invokeSuspend$$inlined$mapNotNull$1
                r0.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = r7.this$0
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$4 r2 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$13$4
                r2.<init>(r8)
                r7.label = r1
                java.lang.Object r7 = r0.collect(r2, r7)
                if (r7 != r4) goto L91
            L90:
                return r4
            L91:
                wj.r r7 = wj.r.f53297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass13.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.a implements jk.c {
        public AnonymousClass3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // jk.c
        public final Object invoke(DisplayMessage displayMessage, f fVar) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, fVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class AnonymousClass4 extends k implements jk.c {
        public AnonymousClass4(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // jk.c
        public final Object invoke(VolumeSettingsChange volumeSettingsChange, f fVar) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, fVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "Lwj/r;", "<anonymous>", "(Lcom/unity3d/ads/core/data/model/ShowEvent;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {InterfaceC0435l1.d.b.f29114k}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends i implements jk.c {
        int label;

        public AnonymousClass6(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass6(fVar);
        }

        @Override // jk.c
        public final Object invoke(ShowEvent showEvent, f fVar) {
            return ((AnonymousClass6) create(showEvent, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                Object objDestroy = androidFullscreenWebViewAdPlayer.destroy(this);
                bk.a aVar = bk.a.f5708a;
                if (objDestroy == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "Lwj/r;", "<anonymous>", "(Lcom/unity3d/ads/core/data/model/ShowEvent;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {118}, m = "invokeSuspend")
    public static final class AnonymousClass8 extends i implements jk.c {
        int label;

        public AnonymousClass8(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass8(fVar);
        }

        @Override // jk.c
        public final Object invoke(ShowEvent showEvent, f fVar) {
            return ((AnonymousClass8) create(showEvent, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                m0 displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                DisplayMessage.DisplayStarted displayStarted = new DisplayMessage.DisplayStarted(AndroidFullscreenWebViewAdPlayer.this.opportunityId);
                this.label = 1;
                Object objEmit = displayMessages.emit(displayStarted, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class AnonymousClass9 extends k implements jk.c {
        public AnonymousClass9(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // jk.c
        public final Object invoke(SessionChange sessionChange, f fVar) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, fVar);
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
        n.f(webViewAdPlayer, "webViewAdPlayer");
        n.f(opportunityId, "opportunityId");
        n.f(webViewContainer, "webViewContainer");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(sessionRepository, "sessionRepository");
        n.f(openMeasurementRepository, "openMeasurementRepository");
        n.f(scarManager, "scarManager");
        n.f(offerwallManager, "offerwallManager");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(adRepository, "adRepository");
        n.f(orientationRepository, "orientationRepository");
        n.f(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject = r9.b.u(new AndroidFullscreenWebViewAdPlayer$adObject$2(this));
        this.wasDestroyed = new AtomicBoolean(false);
    }

    private final f1 displayEventsRouter(DisplayMessage displayMessage) {
        return d0.w(getScope(), null, new C07021(displayMessage, this, null), 3);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent getIntent(Context providedContext, AndroidShowOptions showOptions, int intentFlags) {
        Intent intent = new Intent(providedContext, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = showOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(intentFlags);
        intent.putExtra("orientation", ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, f fVar) {
        boolean z10 = sessionChange instanceof SessionChange.UserConsentChange;
        r rVar = r.f53297a;
        if (z10) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            n.e(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, fVar);
            return objSendUserConsentChange == bk.a.f5708a ? objSendUserConsentChange : rVar;
        }
        if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            n.e(byteArray2, "change.value.toByteArray()");
            Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, fVar);
            if (objSendPrivacyFsmChange == bk.a.f5708a) {
                return objSendPrivacyFsmChange;
            }
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, f fVar) {
        Object objSendVolumeChange;
        boolean z10 = volumeSettingsChange instanceof VolumeSettingsChange.MuteChange;
        r rVar = r.f53297a;
        if (!z10) {
            return ((volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) && (objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), fVar)) == bk.a.f5708a) ? objSendVolumeChange : rVar;
        }
        Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), fVar);
        return objSendMuteChange == bk.a.f5708a ? objSendMuteChange : rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, f fVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return r.f53297a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092 A[PHI: r9
  0x0092: PHI (r9v2 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) = 
  (r9v1 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
  (r9v1 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
  (r9v8 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
 binds: [B:28:0x0083, B:30:0x008f, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[PHI: r9
  0x00a1: PHI (r9v3 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) = 
  (r9v2 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
  (r9v10 'this' com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
 binds: [B:33:0x009e, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(f fVar) {
        AnonymousClass1 anonymousClass1;
        AndroidWebViewContainer webViewContainer;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj);
            if (!this.wasDestroyed.getAndSet(true)) {
                this.webViewAdPlayer.dispatchShowCompleted();
                m0 m0Var = displayMessages;
                DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                if (m0Var.emit(displayFinishRequest, anonymousClass1) != aVar) {
                }
                return aVar;
            }
            return rVar;
        }
        if (i11 == 1) {
            this = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
            t9.e.z(obj);
        } else {
            if (i11 == 2) {
                this = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                t9.e.z(obj);
                webViewContainer = this.getWebViewContainer();
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 3;
                if (webViewContainer.destroy(anonymousClass1) != aVar) {
                }
                return aVar;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return rVar;
            }
            this = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
            t9.e.z(obj);
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 4;
        if (AdPlayer.DefaultImpls.destroy(this, anonymousClass1) == aVar) {
            return aVar;
        }
        return rVar;
        if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 2;
            if (d0.l(1000L, anonymousClass1) != aVar) {
                webViewContainer = this.getWebViewContainer();
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 3;
                if (webViewContainer.destroy(anonymousClass1) != aVar) {
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 4;
                    if (AdPlayer.DefaultImpls.destroy(this, anonymousClass1) == aVar) {
                        return rVar;
                    }
                }
            }
        } else {
            webViewContainer = this.getWebViewContainer();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 3;
            if (webViewContainer.destroy(anonymousClass1) != aVar) {
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (AdPlayer.DefaultImpls.destroy(this, anonymousClass1) == aVar) {
                    return rVar;
                }
            }
        }
        return aVar;
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
    public void show(ShowOptions showOptions) {
        Activity activity;
        Context context;
        Activity activity2;
        n.f(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean zIsScarAd = androidShowOptions.isScarAd();
        boolean zIsOfferwallAd = androidShowOptions.isOfferwallAd();
        cn.r rVarA = d0.a();
        final fn.f1 f1Var = new fn.f1(displayMessages, new C07031(rVarA, null));
        g.o(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        if (n.a(((DisplayMessage) obj).getOpportunityId(), this.this$0.opportunityId)) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = f1Var.collect(new AnonymousClass2(fVar, this), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        }, new AnonymousClass3(this), 2), getScope());
        g.o(new s(this.deviceInfoRepository.getVolumeSettingsChange(), new AnonymousClass4(this), 2), getScope());
        final r0 onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        g.o(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        ShowEvent showEvent = (ShowEvent) obj;
                        if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = onShowEvent.collect(new AnonymousClass2(fVar), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        }, new AnonymousClass6(null), 2), getScope());
        final r0 onShowEvent2 = this.webViewAdPlayer.getOnShowEvent();
        g.o(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$3$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(f fVar) {
                        super(fVar);
                    }

                    @Override // ck.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(fn.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // fn.f
                public final Object emit(Object obj, f fVar) {
                    AnonymousClass1 anonymousClass1;
                    if (fVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) fVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(fVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(fVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t9.e.z(obj2);
                        fn.f fVar2 = this.$this_unsafeFlow;
                        if (((ShowEvent) obj) instanceof ShowEvent.Started) {
                            anonymousClass1.label = 1;
                            Object objEmit = fVar2.emit(obj, anonymousClass1);
                            bk.a aVar = bk.a.f5708a;
                            if (objEmit == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj2);
                    }
                    return r.f53297a;
                }
            }

            @Override // fn.e
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = onShowEvent2.collect(new AnonymousClass2(fVar), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        }, new AnonymousClass8(null), 2), getScope());
        g.o(new s(this.sessionRepository.getOnChange(), new AnonymousClass9(this), 2), getScope());
        d0.r(getScope().getCoroutineContext()).n(new AnonymousClass10());
        AdObject adObject = getAdObject();
        WeakReference<Activity> activity3 = adObject != null ? adObject.getActivity() : null;
        if (activity3 != null) {
            activity2 = activity3.get();
        } else {
            activity = null;
        }
        boolean z10 = activity != null;
        if (z10) {
            activity = activity2;
            activity = activity2;
            ClientProperties.setActivity(activity);
        }
        if (activity3 != null && !z10) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_activity_not_available", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, 46, (Object) null);
        }
        if (zIsScarAd || zIsOfferwallAd) {
            if (!zIsScarAd) {
                d0.w(getScope(), null, new AnonymousClass13(rVarA, this, showOptions, null), 3);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            d0.w(getScope(), null, new AnonymousClass12(rVarA, this, g.p(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), 10), showOptions, null), 3);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", (Double) null, (Map) null, (Map) null, getAdObject(), (Integer) null, 46, (Object) null);
        int overwriteIntentFlagActivity = this.sessionRepository.getNativeConfiguration().getOverwriteIntentFlagActivity();
        Integer numValueOf = Integer.valueOf(overwriteIntentFlagActivity);
        if (overwriteIntentFlagActivity == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 268500992;
        if (z10) {
            n.c(activity);
            context = activity;
        } else {
            context = this.context;
        }
        d0.w(getScope(), null, new AnonymousClass11(rVarA, context, getIntent(context, androidShowOptions, iIntValue), iIntValue, 268500992, this, showOptions, null), 3);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
