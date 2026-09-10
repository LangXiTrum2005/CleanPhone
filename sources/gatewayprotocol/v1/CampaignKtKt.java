package gatewayprotocol.v1;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "-initializecampaign", "(Ljk/b;)Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", MBInterstitialActivity.INTENT_CAMAPIGN, "copy", "(Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;Ljk/b;)Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getLoadTimestampOrNull", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "loadTimestampOrNull", "getShowTimestampOrNull", "showTimestampOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CampaignKtKt {
    /* JADX INFO: renamed from: -initializecampaign, reason: not valid java name */
    public static final CampaignStateOuterClass.Campaign m3273initializecampaign(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
        CampaignStateOuterClass.Campaign.Builder builderNewBuilder = CampaignStateOuterClass.Campaign.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        CampaignKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignStateOuterClass.Campaign copy(CampaignStateOuterClass.Campaign campaign, jk.b block) {
        kotlin.jvm.internal.n.f(campaign, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
        CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        CampaignKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        kotlin.jvm.internal.n.f(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        kotlin.jvm.internal.n.f(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
