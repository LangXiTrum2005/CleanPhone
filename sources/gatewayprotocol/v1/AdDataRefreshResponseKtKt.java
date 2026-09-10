package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdDataRefreshResponseKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "-initializeadDataRefreshResponse", "(Ljk/b;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponse", "copy", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;Ljk/b;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadataOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdDataRefreshResponseKtKt {
    /* JADX INFO: renamed from: -initializeadDataRefreshResponse, reason: not valid java name */
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse m3259initializeadDataRefreshResponse(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.INSTANCE;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builderNewBuilder = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        AdDataRefreshResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, jk.b block) {
        kotlin.jvm.internal.n.f(adDataRefreshResponse, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.INSTANCE;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder = adDataRefreshResponse.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        AdDataRefreshResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        kotlin.jvm.internal.n.f(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasCampaignMetadata()) {
            return adDataRefreshResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        kotlin.jvm.internal.n.f(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }
}
