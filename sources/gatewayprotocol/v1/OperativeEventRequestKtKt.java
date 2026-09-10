package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "-initializeoperativeEventRequest", "(Ljk/b;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventRequest", "copy", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;Ljk/b;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignStateOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OperativeEventRequestKtKt {
    /* JADX INFO: renamed from: -initializeoperativeEventRequest, reason: not valid java name */
    public static final OperativeEventRequestOuterClass.OperativeEventRequest m3307initializeoperativeEventRequest(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventRequest.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        OperativeEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final OperativeEventRequestOuterClass.OperativeEventRequest copy(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, jk.b block) {
        kotlin.jvm.internal.n.f(operativeEventRequest, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder = operativeEventRequest.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        OperativeEventRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasCampaignState()) {
            return operativeEventRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return operativeEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasSessionCounters()) {
            return operativeEventRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(operativeEventRequestOrBuilder, "<this>");
        if (operativeEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return operativeEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
