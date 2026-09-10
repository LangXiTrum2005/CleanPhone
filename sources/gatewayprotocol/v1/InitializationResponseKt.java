package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 o2\u00020\u0001:\u0004opqrB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ5\u0010\u001d\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00152\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001f\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00152\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0017H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001cJ-\u0010\"\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00152\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b \u0010!J9\u0010'\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00152\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170#H\u0007¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0015H\u0007¢\u0006\u0004\b(\u0010)J'\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010\u001a\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J(\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010\u001a\u001a\u00020,H\u0087\n¢\u0006\u0004\b1\u0010/J-\u00107\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\f\u00104\u001a\b\u0012\u0004\u0012\u00020,03H\u0007¢\u0006\u0004\b5\u00106J.\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\f\u00104\u001a\b\u0012\u0004\u0012\u00020,03H\u0087\n¢\u0006\u0004\b8\u00106J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010:\u001a\u0002092\u0006\u0010\u001a\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0007¢\u0006\u0004\b=\u0010>J'\u00100\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+2\u0006\u0010\u001a\u001a\u00020?H\u0007¢\u0006\u0004\bA\u0010BJ(\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+2\u0006\u0010\u001a\u001a\u00020?H\u0087\n¢\u0006\u0004\bC\u0010BJ-\u00107\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+2\f\u00104\u001a\b\u0012\u0004\u0012\u00020?03H\u0007¢\u0006\u0004\bD\u00106J.\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+2\f\u00104\u001a\b\u0012\u0004\u0012\u00020?03H\u0087\n¢\u0006\u0004\bE\u00106J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+2\u0006\u0010:\u001a\u0002092\u0006\u0010\u001a\u001a\u00020?H\u0087\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010*\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+H\u0007¢\u0006\u0004\bH\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR$\u0010O\u001a\u00020J2\u0006\u0010\u001a\u001a\u00020J8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010T\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010Z\u001a\u00020U2\u0006\u0010\u001a\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0017\u0010]\u001a\u0004\u0018\u00010U*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b[\u0010\\R$\u0010a\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010\u000e\"\u0004\b_\u0010`R$\u0010f\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR#\u0010i\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00158G¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001d\u0010l\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+8F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u001d\u0010n\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0+8F¢\u0006\u0006\u001a\u0004\bm\u0010k¨\u0006s"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;)V", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "_build", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "Lwj/r;", "clearNativeConfiguration", "()V", "", "hasNativeConfiguration", "()Z", "clearUniversalRequestUrl", "hasUniversalRequestUrl", "clearError", "hasError", "clearTriggerInitializationCompletedRequest", "clearCountOfLastShownCampaigns", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarPlacementsProxy;", X3.i.W, X3.i.X, "putScarPlacements", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;)V", "put", "setScarPlacements", "set", "removeScarPlacements", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllScarPlacements", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearScarPlacements", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarEligibleFormatsProxy;", "addScarEligibleFormats", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "add", "plusAssignScarEligibleFormats", "plusAssign", "", "values", "addAllScarEligibleFormats", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllScarEligibleFormats", "", "index", "setScarEligibleFormats", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "clearScarEligibleFormats", "(Lcom/google/protobuf/kotlin/DslList;)V", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl$RequestUrlOverridesProxy;", "addRequestUrlOverrides", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;)V", "plusAssignRequestUrlOverrides", "addAllRequestUrlOverrides", "plusAssignAllRequestUrlOverrides", "setRequestUrlOverrides", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;)V", "clearRequestUrlOverrides", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "nativeConfiguration", "getUniversalRequestUrl", "()Ljava/lang/String;", "setUniversalRequestUrl", "(Ljava/lang/String;)V", "universalRequestUrl", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "error", "getErrorOrNull", "(Lgatewayprotocol/v1/InitializationResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "getTriggerInitializationCompletedRequest", "setTriggerInitializationCompletedRequest", "(Z)V", "triggerInitializationCompletedRequest", "getCountOfLastShownCampaigns", "()I", "setCountOfLastShownCampaigns", "(I)V", "countOfLastShownCampaigns", "getScarPlacementsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "scarPlacements", "getScarEligibleFormats", "()Lcom/google/protobuf/kotlin/DslList;", "scarEligibleFormats", "getRequestUrlOverrides", "requestUrlOverrides", "Companion", "RequestUrlOverridesProxy", "ScarEligibleFormatsProxy", "ScarPlacementsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$RequestUrlOverridesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class RequestUrlOverridesProxy extends DslProxy {
            private RequestUrlOverridesProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarEligibleFormatsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationResponseKt$Dsl$ScarPlacementsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            InitializationResponseOuterClass.InitializationResponse initializationResponseBuild = this._builder.build();
            kotlin.jvm.internal.n.e(initializationResponseBuild, "_builder.build()");
            return initializationResponseBuild;
        }

        public final /* synthetic */ void addAllRequestUrlOverrides(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllRequestUrlOverrides(values);
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllScarEligibleFormats(values);
        }

        public final /* synthetic */ void addRequestUrlOverrides(DslList dslList, InitializationResponseOuterClass.RequestUrlOverride value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addRequestUrlOverrides(value);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addScarEligibleFormats(value);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearRequestUrlOverrides(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearRequestUrlOverrides();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.n.e(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            kotlin.jvm.internal.n.e(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getRequestUrlOverrides() {
            List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = this._builder.getRequestUrlOverridesList();
            kotlin.jvm.internal.n.e(requestUrlOverridesList, "_builder.getRequestUrlOverridesList()");
            return new DslList(requestUrlOverridesList);
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            kotlin.jvm.internal.n.e(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map<String, InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            kotlin.jvm.internal.n.e(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            kotlin.jvm.internal.n.e(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllRequestUrlOverrides(DslList<InitializationResponseOuterClass.RequestUrlOverride, RequestUrlOverridesProxy> dslList, Iterable<InitializationResponseOuterClass.RequestUrlOverride> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllRequestUrlOverrides(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, Iterable<? extends AdFormatOuterClass.AdFormat> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllScarEligibleFormats(dslList, values);
        }

        public final /* synthetic */ void plusAssignRequestUrlOverrides(DslList<InitializationResponseOuterClass.RequestUrlOverride, RequestUrlOverridesProxy> dslList, InitializationResponseOuterClass.RequestUrlOverride value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addRequestUrlOverrides(dslList, value);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addScarEligibleFormats(dslList, value);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String key, InitializationResponseOuterClass.Placement value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.putScarPlacements(key, value);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String key) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            this._builder.removeScarPlacements(key);
        }

        public final void setCountOfLastShownCampaigns(int i10) {
            this._builder.setCountOfLastShownCampaigns(i10);
        }

        public final void setError(ErrorOuterClass.Error value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setError(value);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setNativeConfiguration(value);
        }

        public final /* synthetic */ void setRequestUrlOverrides(DslList dslList, int i10, InitializationResponseOuterClass.RequestUrlOverride value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setRequestUrlOverrides(i10, value);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i10, AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setScarEligibleFormats(i10, value);
        }

        public final /* synthetic */ void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String key, InitializationResponseOuterClass.Placement value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            putScarPlacements(dslMap, key, value);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z10) {
            this._builder.setTriggerInitializationCompletedRequest(z10);
        }

        public final void setUniversalRequestUrl(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setUniversalRequestUrl(value);
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationResponseKt() {
    }
}
