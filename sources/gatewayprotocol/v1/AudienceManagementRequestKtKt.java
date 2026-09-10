package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AudienceManagementRequestKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "-initializeaudienceManagementRequest", "(Ljk/b;)Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "audienceManagementRequest", "copy", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;Ljk/b;)Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AudienceManagementRequestKtKt {
    /* JADX INFO: renamed from: -initializeaudienceManagementRequest, reason: not valid java name */
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest m3268initializeaudienceManagementRequest(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.INSTANCE;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builderNewBuilder = AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        AudienceManagementRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest copy(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest, jk.b block) {
        kotlin.jvm.internal.n.f(audienceManagementRequest, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.INSTANCE;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder = audienceManagementRequest.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        AudienceManagementRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        kotlin.jvm.internal.n.f(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasDynamicDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        kotlin.jvm.internal.n.f(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasSessionCounters()) {
            return audienceManagementRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        kotlin.jvm.internal.n.f(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasStaticDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
