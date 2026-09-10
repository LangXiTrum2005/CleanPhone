package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "-initializeaudienceManagementResponse", "(Ljk/b;)Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "audienceManagementResponse", "copy", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;Ljk/b;)Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponseOrBuilder;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AudienceManagementResponseKtKt {
    /* JADX INFO: renamed from: -initializeaudienceManagementResponse, reason: not valid java name */
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse m3269initializeaudienceManagementResponse(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.INSTANCE;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builderNewBuilder = AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        AudienceManagementResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse copy(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse, jk.b block) {
        kotlin.jvm.internal.n.f(audienceManagementResponse, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.INSTANCE;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder = audienceManagementResponse.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        AudienceManagementResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder audienceManagementResponseOrBuilder) {
        kotlin.jvm.internal.n.f(audienceManagementResponseOrBuilder, "<this>");
        if (audienceManagementResponseOrBuilder.hasError()) {
            return audienceManagementResponseOrBuilder.getError();
        }
        return null;
    }
}
