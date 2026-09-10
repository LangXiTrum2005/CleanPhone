package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "-initializeadPlayerConfigResponse", "(Ljk/b;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponse", "copy", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;Ljk/b;)Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "webviewConfigurationOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponseOrBuilder;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadataOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdPlayerConfigResponseKtKt {
    /* JADX INFO: renamed from: -initializeadPlayerConfigResponse, reason: not valid java name */
    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse m3262initializeadPlayerConfigResponse(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.INSTANCE;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builderNewBuilder = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        AdPlayerConfigResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse copy(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse, jk.b block) {
        kotlin.jvm.internal.n.f(adPlayerConfigResponse, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        AdPlayerConfigResponseKt.Dsl.Companion companion = AdPlayerConfigResponseKt.Dsl.INSTANCE;
        AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder = adPlayerConfigResponse.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        AdPlayerConfigResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        kotlin.jvm.internal.n.f(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasCampaignMetadata()) {
            return adPlayerConfigResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        kotlin.jvm.internal.n.f(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasError()) {
            return adPlayerConfigResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder adPlayerConfigResponseOrBuilder) {
        kotlin.jvm.internal.n.f(adPlayerConfigResponseOrBuilder, "<this>");
        if (adPlayerConfigResponseOrBuilder.hasWebviewConfiguration()) {
            return adPlayerConfigResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
