package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "-initializeadRevenueEventRequest", "(Ljk/b;)Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEventRequest", "copy", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;Ljk/b;)Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "getAdRevenueDataOrNull", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;)Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "adRevenueDataOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdRevenueEventRequestKtKt {
    /* JADX INFO: renamed from: -initializeadRevenueEventRequest, reason: not valid java name */
    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest m3266initializeadRevenueEventRequest(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        AdRevenueEventRequestKt.Dsl.Companion companion = AdRevenueEventRequestKt.Dsl.INSTANCE;
        AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builderNewBuilder = AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        AdRevenueEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest copy(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, jk.b block) {
        kotlin.jvm.internal.n.f(adRevenueEventRequest, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        AdRevenueEventRequestKt.Dsl.Companion companion = AdRevenueEventRequestKt.Dsl.INSTANCE;
        AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder = adRevenueEventRequest.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        AdRevenueEventRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueData getAdRevenueDataOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(adRevenueEventRequestOrBuilder, "<this>");
        if (adRevenueEventRequestOrBuilder.hasAdRevenueData()) {
            return adRevenueEventRequestOrBuilder.getAdRevenueData();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(adRevenueEventRequestOrBuilder, "<this>");
        if (adRevenueEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRevenueEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        kotlin.jvm.internal.n.f(adRevenueEventRequestOrBuilder, "<this>");
        if (adRevenueEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRevenueEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
