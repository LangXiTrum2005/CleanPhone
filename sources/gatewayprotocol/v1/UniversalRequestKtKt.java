package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a+\u0010\b\u001a\u00020\r*\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0017\u0010$\u001a\u0004\u0018\u00010!*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010&\u001a\u0004\u0018\u00010!*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010#\"\u0017\u0010*\u001a\u0004\u0018\u00010'*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0017\u0010/\u001a\u0004\u0018\u00010,*\u00020+8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0017\u00103\u001a\u0004\u0018\u000100*\u00020+8F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00107\u001a\u0004\u0018\u000104*\u00020+8F¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0017\u0010;\u001a\u0004\u0018\u000108*\u00020+8F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0017\u0010?\u001a\u0004\u0018\u00010<*\u00020+8F¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0017\u0010C\u001a\u0004\u0018\u00010@*\u00020+8F¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0017\u0010G\u001a\u0004\u0018\u00010D*\u00020+8F¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u0017\u0010K\u001a\u0004\u0018\u00010H*\u00020+8F¢\u0006\u0006\u001a\u0004\bI\u0010J\"\u0017\u0010O\u001a\u0004\u0018\u00010L*\u00020+8F¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0017\u0010S\u001a\u0004\u0018\u00010P*\u00020+8F¢\u0006\u0006\u001a\u0004\bQ\u0010R\"\u0017\u0010W\u001a\u0004\u0018\u00010T*\u00020+8F¢\u0006\u0006\u001a\u0004\bU\u0010V\"\u0017\u0010[\u001a\u0004\u0018\u00010X*\u00020+8F¢\u0006\u0006\u001a\u0004\bY\u0010Z\"\u0017\u0010_\u001a\u0004\u0018\u00010\\*\u00020+8F¢\u0006\u0006\u001a\u0004\b]\u0010^\"\u0017\u0010c\u001a\u0004\u0018\u00010`*\u00020+8F¢\u0006\u0006\u001a\u0004\ba\u0010b\"\u0017\u0010g\u001a\u0004\u0018\u00010\n*\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010f\"\u0017\u0010j\u001a\u0004\u0018\u00010\r*\u00020d8F¢\u0006\u0006\u001a\u0004\bh\u0010i\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006k"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "-initializeuniversalRequest", "(Ljk/b;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "universalRequest", "copy", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Ljk/b;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;Ljk/b;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;Ljk/b;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestampsOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestampsOrNull", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiOrNull", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsentOrNull", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testDataOrNull", "Lcom/google/protobuf/Timestamp;", "getAppStartTimeOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lcom/google/protobuf/Timestamp;", "appStartTimeOrNull", "getSdkStartTimeOrNull", "sdkStartTimeOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedDataOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "getInitializationRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequestOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "getAdRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "adRequestOrNull", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "getOperativeEventOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventOrNull", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "getDiagnosticEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEventRequestOrNull", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "getAdPlayerConfigRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequestOrNull", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getGetTokenEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getTokenEventRequestOrNull", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "getPrivacyUpdateRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequestOrNull", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "getAdDataRefreshRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adDataRefreshRequestOrNull", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "getInitializationCompletedEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequestOrNull", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequestOrNull", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "getAudienceManagementRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "audienceManagementRequestOrNull", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "getAdRevenueEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEventRequestOrNull", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "getMonitoringEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "monitoringEventRequestOrNull", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "getLifecycleEventRequestOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$PayloadOrBuilder;)Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "lifecycleEventRequestOrNull", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;", "getSharedDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedDataOrNull", "getPayloadOrNull", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequestOrBuilder;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payloadOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UniversalRequestKtKt {
    /* JADX INFO: renamed from: -initializeuniversalRequest, reason: not valid java name */
    public static final UniversalRequestOuterClass.UniversalRequest m3327initializeuniversalRequest(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.UniversalRequest copy(UniversalRequestOuterClass.UniversalRequest universalRequest, jk.b block) {
        kotlin.jvm.internal.n.f(universalRequest, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdDataRefreshRequest()) {
            return payloadOrBuilder.getAdDataRefreshRequest();
        }
        return null;
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdPlayerConfigRequest()) {
            return payloadOrBuilder.getAdPlayerConfigRequest();
        }
        return null;
    }

    public static final AdRequestOuterClass.AdRequest getAdRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRequest()) {
            return payloadOrBuilder.getAdRequest();
        }
        return null;
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest getAdRevenueEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAdRevenueEventRequest()) {
            return payloadOrBuilder.getAdRevenueEventRequest();
        }
        return null;
    }

    public static final Timestamp getAppStartTimeOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasAppStartTime()) {
            return sharedDataOrBuilder.getAppStartTime();
        }
        return null;
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasAudienceManagementRequest()) {
            return payloadOrBuilder.getAudienceManagementRequest();
        }
        return null;
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasDeveloperConsent()) {
            return sharedDataOrBuilder.getDeveloperConsent();
        }
        return null;
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasDiagnosticEventRequest()) {
            return payloadOrBuilder.getDiagnosticEventRequest();
        }
        return null;
    }

    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasGetTokenEventRequest()) {
            return payloadOrBuilder.getGetTokenEventRequest();
        }
        return null;
    }

    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationCompletedEventRequest()) {
            return payloadOrBuilder.getInitializationCompletedEventRequest();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasInitializationRequest()) {
            return payloadOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest getLifecycleEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasLifecycleEventRequest()) {
            return payloadOrBuilder.getLifecycleEventRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasLimitedSessionToken()) {
            return sharedDataOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final MonitoringEventRequestOuterClass.MonitoringEventRequest getMonitoringEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasMonitoringEventRequest()) {
            return payloadOrBuilder.getMonitoringEventRequest();
        }
        return null;
    }

    public static final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEventOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasOperativeEvent()) {
            return payloadOrBuilder.getOperativeEvent();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.Payload getPayloadOrNull(UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        kotlin.jvm.internal.n.f(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasPayload()) {
            return universalRequestOrBuilder.getPayload();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasPii()) {
            return sharedDataOrBuilder.getPii();
        }
        return null;
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasPrivacyUpdateRequest()) {
            return payloadOrBuilder.getPrivacyUpdateRequest();
        }
        return null;
    }

    public static final Timestamp getSdkStartTimeOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasSdkStartTime()) {
            return sharedDataOrBuilder.getSdkStartTime();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(UniversalRequestOuterClass.UniversalRequestOrBuilder universalRequestOrBuilder) {
        kotlin.jvm.internal.n.f(universalRequestOrBuilder, "<this>");
        if (universalRequestOrBuilder.hasSharedData()) {
            return universalRequestOrBuilder.getSharedData();
        }
        return null;
    }

    public static final TestDataOuterClass.TestData getTestDataOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTestData()) {
            return sharedDataOrBuilder.getTestData();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(UniversalRequestOuterClass.UniversalRequest.SharedDataOrBuilder sharedDataOrBuilder) {
        kotlin.jvm.internal.n.f(sharedDataOrBuilder, "<this>");
        if (sharedDataOrBuilder.hasTimestamps()) {
            return sharedDataOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequestOrNull(UniversalRequestOuterClass.UniversalRequest.PayloadOrBuilder payloadOrBuilder) {
        kotlin.jvm.internal.n.f(payloadOrBuilder, "<this>");
        if (payloadOrBuilder.hasTransactionEventRequest()) {
            return payloadOrBuilder.getTransactionEventRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData copy(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData, jk.b block) {
        kotlin.jvm.internal.n.f(sharedData, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder = sharedData.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        UniversalRequestKt.SharedDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.UniversalRequest.Payload copy(UniversalRequestOuterClass.UniversalRequest.Payload payload, jk.b block) {
        kotlin.jvm.internal.n.f(payload, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder = payload.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
