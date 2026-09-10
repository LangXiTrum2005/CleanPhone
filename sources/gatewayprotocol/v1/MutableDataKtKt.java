package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/MutableDataKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "-initializemutableData", "(Ljk/b;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableData", "copy", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;Ljk/b;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPiiOrNull", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowedPiiOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MutableDataKtKt {
    /* JADX INFO: renamed from: -initializemutableData, reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m3303initializemutableData(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.INSTANCE;
        MutableDataOuterClass.MutableData.Builder builderNewBuilder = MutableDataOuterClass.MutableData.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MutableDataOuterClass.MutableData copy(MutableDataOuterClass.MutableData mutableData, jk.b block) {
        kotlin.jvm.internal.n.f(mutableData, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.INSTANCE;
        MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        kotlin.jvm.internal.n.f(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        kotlin.jvm.internal.n.f(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
