package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdPlayerConfigRequestKt {
    public static final AdPlayerConfigRequestKt INSTANCE = new AdPlayerConfigRequestKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0002Z[B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J5\u0010\u001d\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001f\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001cJ-\u0010\"\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010!J9\u0010'\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170#H\u0007¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R$\u00103\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00108\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010>\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u00100\"\u0004\b@\u00102R$\u0010G\u001a\u00020B2\u0006\u0010\u001a\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R$\u0010M\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u00105\"\u0004\bL\u00107R#\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168G¢\u0006\u0006\u001a\u0004\bN\u0010OR$\u0010V\u001a\u00020Q2\u0006\u0010\u001a\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0017\u0010Y\u001a\u0004\u0018\u00010Q*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006\\"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;)V", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "_build", "()Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "Lwj/r;", "clearConfigurationToken", "()V", "clearPlacementId", "clearWebviewVersion", "", "hasWebviewVersion", "()Z", "clearImpressionOpportunityId", "clearAdFormat", "hasAdFormat", "clearMediationAdUnitId", "hasMediationAdUnitId", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$ExtrasProxy;", X3.i.W, X3.i.X, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearMediationInfo", "hasMediationInfo", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "Lcom/google/protobuf/ByteString;", "getConfigurationToken", "()Lcom/google/protobuf/ByteString;", "setConfigurationToken", "(Lcom/google/protobuf/ByteString;)V", "configurationToken", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "placementId", "", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "webviewVersion", "getImpressionOpportunityId", "setImpressionOpportunityId", "impressionOpportunityId", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "getMediationAdUnitId", "setMediationAdUnitId", "mediationAdUnitId", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "mediationInfo", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequestBuild = this._builder.build();
            kotlin.jvm.internal.n.e(adPlayerConfigRequestBuild, "_builder.build()");
            return adPlayerConfigRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.n.e(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            kotlin.jvm.internal.n.e(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            kotlin.jvm.internal.n.e(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.n.e(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            kotlin.jvm.internal.n.e(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            kotlin.jvm.internal.n.e(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return AdPlayerConfigRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.n.e(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            this._builder.removeExtras(key);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setConfigurationToken(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setConfigurationToken(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setMediationAdUnitId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setWebviewVersion(int i10) {
            this._builder.setWebviewVersion(i10);
        }

        private Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdPlayerConfigRequestKt() {
    }
}
