package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RequestRetryPolicyKt {
    public static final RequestRetryPolicyKt INSTANCE = new RequestRetryPolicyKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010-\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "_build", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "Lwj/r;", "clearMaxDuration", "()V", "clearRetryWaitBase", "clearRetryMaxInterval", "clearRetryJitterPct", "clearRetryScalingFactor", "clearShouldStoreLocally", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "", X3.i.X, "getMaxDuration", "()I", "setMaxDuration", "(I)V", "maxDuration", "getRetryWaitBase", "setRetryWaitBase", "retryWaitBase", "getRetryMaxInterval", "setRetryMaxInterval", "retryMaxInterval", "", "getRetryJitterPct", "()F", "setRetryJitterPct", "(F)V", "retryJitterPct", "getRetryScalingFactor", "setRetryScalingFactor", "retryScalingFactor", "", "getShouldStoreLocally", "()Z", "setShouldStoreLocally", "(Z)V", "shouldStoreLocally", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.RequestRetryPolicy.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestRetryPolicyKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestRetryPolicy _build() {
            NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicyBuild = this._builder.build();
            kotlin.jvm.internal.n.e(requestRetryPolicyBuild, "_builder.build()");
            return requestRetryPolicyBuild;
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }

        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        public final void setMaxDuration(int i10) {
            this._builder.setMaxDuration(i10);
        }

        public final void setRetryJitterPct(float f10) {
            this._builder.setRetryJitterPct(f10);
        }

        public final void setRetryMaxInterval(int i10) {
            this._builder.setRetryMaxInterval(i10);
        }

        public final void setRetryScalingFactor(float f10) {
            this._builder.setRetryScalingFactor(f10);
        }

        public final void setRetryWaitBase(int i10) {
            this._builder.setRetryWaitBase(i10);
        }

        public final void setShouldStoreLocally(boolean z10) {
            this._builder.setShouldStoreLocally(z10);
        }

        private Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestRetryPolicyKt() {
    }
}
