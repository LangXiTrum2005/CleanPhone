package com.unity3d.ads.core.domain.adquality;

import aa.b;
import android.content.Context;
import bn.d;
import bn.f;
import com.ironsource.O6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/AndroidInitializeAdQuality;", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "", "appKey", "Lwj/r;", "initializeAdQuality", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "logLevelInternal", "Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "mapLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;", "invoke", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidInitializeAdQuality implements InitializeAdQuality {
    private final Context context;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevelInternal.values().length];
            try {
                iArr[LogLevelInternal.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevelInternal.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevelInternal.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevelInternal.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevelInternal.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends o implements a {
        final /* synthetic */ NoClassDefFoundError $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoClassDefFoundError noClassDefFoundError) {
            super(0);
            this.$e = noClassDefFoundError;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad Quality SDK not available: " + this.$e.getMessage();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass2 extends o implements a {
        final /* synthetic */ ClassNotFoundException $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClassNotFoundException classNotFoundException) {
            super(0);
            this.$e = classNotFoundException;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad Quality SDK not available: " + this.$e.getMessage();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass3 extends o implements a {
        final /* synthetic */ NoSuchMethodError $e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NoSuchMethodError noSuchMethodError) {
            super(0);
            this.$e = noSuchMethodError;
        }

        @Override // jk.a
        public final String invoke() {
            return "Ad Quality SDK not available: " + this.$e.getMessage();
        }
    }

    public AndroidInitializeAdQuality(Context context, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        n.f(context, "context");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(logger, "logger");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    private final void initializeAdQuality(String appKey) {
        final long jB = d.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
        ISAdQualityConfig.Builder builderAddAdQualityInitListener = new ISAdQualityConfig.Builder().setInitializationSource(O6.H1).setLogLevel(mapLogLevel(this.logger.getLogLevel())).addAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$initializeAdQuality$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) {
                n.f(isAdQualityInitError, "isAdQualityInitError");
                n.f(message, "message");
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME, Double.valueOf(bn.a.d(f.a(jB))), b0.Q(new wj.f("reason", isAdQualityInitError.name()), new wj.f("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                Logger.DefaultImpls.error$default(this.logger, "Ad Quality failed to initialize: ".concat(message), null, 2, null);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() {
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME, Double.valueOf(bn.a.d(f.a(jB))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
            }
        });
        String userIdentifier = UnityAds.getUserIdentifier();
        if (userIdentifier != null) {
            builderAddAdQualityInitListener.setUserId(userIdentifier);
        }
        IronSourceAdQuality.getInstance().initialize(this.context, appKey, builderAddAdQualityInitListener.build());
    }

    private final ISAdQualityLogLevel mapLogLevel(LogLevelInternal logLevelInternal) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[logLevelInternal.ordinal()];
        if (i10 == 1) {
            return ISAdQualityLogLevel.NONE;
        }
        if (i10 == 2) {
            return ISAdQualityLogLevel.ERROR;
        }
        if (i10 == 3) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i10 == 4) {
            return ISAdQualityLogLevel.DEBUG;
        }
        if (i10 == 5) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        throw new b((byte) 0, 20);
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invoke(String appKey) {
        Double dValueOf = Double.valueOf(0.0d);
        n.f(appKey, "appKey");
        try {
            initializeAdQuality(appKey);
        } catch (ClassNotFoundException e10) {
            this.logger.debug(new AnonymousClass2(e10));
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            String message = e10.getMessage();
            if (message == null) {
                message = "ClassNotFoundException";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, dValueOf, b0.P(new wj.f("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } catch (NoClassDefFoundError e11) {
            this.logger.debug(new AnonymousClass1(e11));
            SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            String message2 = e11.getMessage();
            if (message2 == null) {
                message2 = "NoClassDefFoundError";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, dValueOf, b0.P(new wj.f("reason_debug", message2)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } catch (NoSuchMethodError e12) {
            this.logger.debug(new AnonymousClass3(e12));
            SendDiagnosticEvent sendDiagnosticEvent3 = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType3 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            String message3 = e12.getMessage();
            if (message3 == null) {
                message3 = "NoSuchMethodError";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, diagnosticEventType3, dValueOf, b0.P(new wj.f("reason_debug", message3)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } catch (Throwable th2) {
            this.logger.error("Ad Quality SDK initialization failed", th2);
            SendDiagnosticEvent sendDiagnosticEvent4 = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType4 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            String message4 = th2.getMessage();
            if (message4 == null) {
                message4 = "Unknown error";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, diagnosticEventType4, dValueOf, b0.P(new wj.f("reason_debug", message4)), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        }
    }
}
