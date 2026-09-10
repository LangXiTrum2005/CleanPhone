package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RequestUrlOverrideKt {
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;)V", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "_build", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "Lwj/r;", "clearRequestType", "()V", "clearUrl", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;", X3.i.X, "getRequestType", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;", "setRequestType", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;)V", "requestType", "", "getRequestTypeValue", "()I", "setRequestTypeValue", "(I)V", "requestTypeValue", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "url", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverrideBuild = this._builder.build();
            kotlin.jvm.internal.n.e(requestUrlOverrideBuild, "_builder.build()");
            return requestUrlOverrideBuild;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            kotlin.jvm.internal.n.e(requestType, "_builder.getRequestType()");
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            kotlin.jvm.internal.n.e(url, "_builder.getUrl()");
            return url;
        }

        public final void setRequestType(InitializationResponseOuterClass.RequestType value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setRequestType(value);
        }

        public final void setRequestTypeValue(int i10) {
            this._builder.setRequestTypeValue(i10);
        }

        public final void setUrl(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setUrl(value);
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestUrlOverrideKt() {
    }
}
