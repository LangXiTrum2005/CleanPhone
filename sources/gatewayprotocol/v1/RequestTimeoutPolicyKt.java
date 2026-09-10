package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/RequestTimeoutPolicyKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RequestTimeoutPolicyKt {
    public static final RequestTimeoutPolicyKt INSTANCE = new RequestTimeoutPolicyKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006!"}, d2 = {"Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "Lwj/r;", "clearConnectTimeoutMs", "()V", "clearReadTimeoutMs", "clearWriteTimeoutMs", "clearOverallTimeoutMs", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "", X3.i.X, "getConnectTimeoutMs", "()I", "setConnectTimeoutMs", "(I)V", "connectTimeoutMs", "getReadTimeoutMs", "setReadTimeoutMs", "readTimeoutMs", "getWriteTimeoutMs", "setWriteTimeoutMs", "writeTimeoutMs", "getOverallTimeoutMs", "setOverallTimeoutMs", "overallTimeoutMs", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestTimeoutPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestTimeoutPolicy _build() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicyBuild = this._builder.build();
            kotlin.jvm.internal.n.e(requestTimeoutPolicyBuild, "_builder.build()");
            return requestTimeoutPolicyBuild;
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        public final void setConnectTimeoutMs(int i10) {
            this._builder.setConnectTimeoutMs(i10);
        }

        public final void setOverallTimeoutMs(int i10) {
            this._builder.setOverallTimeoutMs(i10);
        }

        public final void setReadTimeoutMs(int i10) {
            this._builder.setReadTimeoutMs(i10);
        }

        public final void setWriteTimeoutMs(int i10) {
            this._builder.setWriteTimeoutMs(i10);
        }

        private Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestTimeoutPolicyKt() {
    }
}
