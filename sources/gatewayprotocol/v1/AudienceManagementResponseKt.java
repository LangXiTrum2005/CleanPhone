package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementResponseKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AudienceManagementResponseKt {
    public static final AudienceManagementResponseKt INSTANCE = new AudienceManagementResponseKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u0004\u0018\u00010\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;", "", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;)V", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "_build", "()Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "Lwj/r;", "clearAudienceManagementData", "()V", "clearError", "", "hasError", "()Z", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;", "Lcom/google/protobuf/ByteString;", X3.i.X, "getAudienceManagementData", "()Lcom/google/protobuf/ByteString;", "setAudienceManagementData", "(Lcom/google/protobuf/ByteString;)V", "audienceManagementData", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "error", "getErrorOrNull", "(Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ AudienceManagementResponseOuterClass.AudienceManagementResponse _build() {
            AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponseBuild = this._builder.build();
            kotlin.jvm.internal.n.e(audienceManagementResponseBuild, "_builder.build()");
            return audienceManagementResponseBuild;
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            kotlin.jvm.internal.n.e(audienceManagementData, "_builder.getAudienceManagementData()");
            return audienceManagementData;
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.n.e(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return AudienceManagementResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setAudienceManagementData(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAudienceManagementData(value);
        }

        public final void setError(ErrorOuterClass.Error value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setError(value);
        }

        private Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private AudienceManagementResponseKt() {
    }
}
