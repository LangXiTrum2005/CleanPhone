package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigResponseKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdPlayerConfigResponseKt {
    public static final AdPlayerConfigResponseKt INSTANCE = new AdPlayerConfigResponseKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010)\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00102\u001a\u0004\u0018\u00010**\u00020\u00008F¢\u0006\u0006\u001a\u0004\b0\u00101R$\u00105\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001fR$\u0010;\u001a\u0002062\u0006\u0010\u001b\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010>\u001a\u0004\u0018\u000106*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010A\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR$\u0010D\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010&\"\u0004\bC\u0010(R$\u0010J\u001a\u00020E2\u0006\u0010\u001b\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0017\u0010M\u001a\u0004\u0018\u00010E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;)V", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "_build", "()Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "Lwj/r;", "clearTrackingToken", "()V", "clearImpressionConfiguration", "clearImpressionConfigurationVersion", "clearWebviewConfiguration", "", "hasWebviewConfiguration", "()Z", "clearAdDataRefreshToken", "clearError", "hasError", "clearAdData", "clearAdDataVersion", "clearCampaignMetadata", "hasCampaignMetadata", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;", "Lcom/google/protobuf/ByteString;", X3.i.X, "getTrackingToken", "()Lcom/google/protobuf/ByteString;", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "getImpressionConfiguration", "setImpressionConfiguration", "impressionConfiguration", "", "getImpressionConfigurationVersion", "()I", "setImpressionConfigurationVersion", "(I)V", "impressionConfigurationVersion", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "getWebviewConfiguration", "()Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "setWebviewConfiguration", "(Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;)V", "webviewConfiguration", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "webviewConfigurationOrNull", "getAdDataRefreshToken", "setAdDataRefreshToken", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "error", "getErrorOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "getAdData", "setAdData", "adData", "getAdDataVersion", "setAdDataVersion", "adDataVersion", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadata", "()Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "setCampaignMetadata", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;)V", "campaignMetadata", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadataOrNull", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse _build() {
            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponseBuild = this._builder.build();
            kotlin.jvm.internal.n.e(adPlayerConfigResponseBuild, "_builder.build()");
            return adPlayerConfigResponseBuild;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearCampaignMetadata() {
            this._builder.clearCampaignMetadata();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearImpressionConfiguration() {
            this._builder.clearImpressionConfiguration();
        }

        public final void clearImpressionConfigurationVersion() {
            this._builder.clearImpressionConfigurationVersion();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final void clearWebviewConfiguration() {
            this._builder.clearWebviewConfiguration();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            kotlin.jvm.internal.n.e(adData, "_builder.getAdData()");
            return adData;
        }

        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            kotlin.jvm.internal.n.e(adDataRefreshToken, "_builder.getAdDataRefreshToken()");
            return adDataRefreshToken;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = this._builder.getCampaignMetadata();
            kotlin.jvm.internal.n.e(campaignMetadata, "_builder.getCampaignMetadata()");
            return campaignMetadata;
        }

        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return AdPlayerConfigResponseKtKt.getCampaignMetadataOrNull(dsl._builder);
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.n.e(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return AdPlayerConfigResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getImpressionConfiguration() {
            ByteString impressionConfiguration = this._builder.getImpressionConfiguration();
            kotlin.jvm.internal.n.e(impressionConfiguration, "_builder.getImpressionConfiguration()");
            return impressionConfiguration;
        }

        public final int getImpressionConfigurationVersion() {
            return this._builder.getImpressionConfigurationVersion();
        }

        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            kotlin.jvm.internal.n.e(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
        }

        public final WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webviewConfiguration = this._builder.getWebviewConfiguration();
            kotlin.jvm.internal.n.e(webviewConfiguration, "_builder.getWebviewConfiguration()");
            return webviewConfiguration;
        }

        public final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return AdPlayerConfigResponseKtKt.getWebviewConfigurationOrNull(dsl._builder);
        }

        public final boolean hasCampaignMetadata() {
            return this._builder.hasCampaignMetadata();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasWebviewConfiguration() {
            return this._builder.hasWebviewConfiguration();
        }

        public final void setAdData(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdData(value);
        }

        public final void setAdDataRefreshToken(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdDataRefreshToken(value);
        }

        public final void setAdDataVersion(int i10) {
            this._builder.setAdDataVersion(i10);
        }

        public final void setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCampaignMetadata(value);
        }

        public final void setError(ErrorOuterClass.Error value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setError(value);
        }

        public final void setImpressionConfiguration(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setImpressionConfiguration(value);
        }

        public final void setImpressionConfigurationVersion(int i10) {
            this._builder.setImpressionConfigurationVersion(i10);
        }

        public final void setTrackingToken(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTrackingToken(value);
        }

        public final void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setWebviewConfiguration(value);
        }

        private Dsl(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AdPlayerConfigResponseKt() {
    }
}
