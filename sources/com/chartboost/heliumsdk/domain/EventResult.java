package com.chartboost.heliumsdk.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult;", "", "getMetricsError", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "AdLoadResult", "SdkInitializationResult", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface EventResult {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult;", "Lcom/chartboost/heliumsdk/domain/EventResult;", "()V", "AdLoadJsonFailure", "AdLoadPartnerFailure", "AdLoadSuccess", "AdLoadUnspecifiedFailure", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadJsonFailure;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadPartnerFailure;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadSuccess;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadUnspecifiedFailure;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AdLoadResult implements EventResult {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadJsonFailure;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult;", "jsonParseError", "Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "(Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;)V", "getJsonParseError", "()Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "getMetricsError", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AdLoadJsonFailure extends AdLoadResult {
            private final MetricsError.JsonParseError jsonParseError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdLoadJsonFailure(MetricsError.JsonParseError jsonParseError) {
                super(null);
                Intrinsics.f(jsonParseError, "jsonParseError");
                this.jsonParseError = jsonParseError;
            }

            public final MetricsError.JsonParseError getJsonParseError() {
                return this.jsonParseError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public MetricsError getMetricsError() {
                return this.jsonParseError;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadPartnerFailure;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult;", "metricsError", "Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "(Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;)V", "getMetricsError", "()Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AdLoadPartnerFailure extends AdLoadResult {
            private final MetricsError.SimpleError metricsError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdLoadPartnerFailure(MetricsError.SimpleError metricsError) {
                super(null);
                Intrinsics.f(metricsError, "metricsError");
                this.metricsError = metricsError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public final MetricsError.SimpleError getMetricsError() {
                return this.metricsError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public MetricsError getMetricsError() {
                return this.metricsError;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadSuccess;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult;", "()V", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AdLoadSuccess extends AdLoadResult {
            public static final AdLoadSuccess INSTANCE = new AdLoadSuccess();

            private AdLoadSuccess() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult$AdLoadUnspecifiedFailure;", "Lcom/chartboost/heliumsdk/domain/EventResult$AdLoadResult;", "metricsError", "Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "(Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;)V", "getMetricsError", "()Lcom/chartboost/heliumsdk/domain/MetricsError$SimpleError;", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AdLoadUnspecifiedFailure extends AdLoadResult {
            private final MetricsError.SimpleError metricsError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdLoadUnspecifiedFailure(MetricsError.SimpleError metricsError) {
                super(null);
                Intrinsics.f(metricsError, "metricsError");
                this.metricsError = metricsError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public final MetricsError.SimpleError getMetricsError() {
                return this.metricsError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public MetricsError getMetricsError() {
                return this.metricsError;
            }
        }

        public /* synthetic */ AdLoadResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AdLoadResult() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult;", "Lcom/chartboost/heliumsdk/domain/EventResult;", "success", "", "initResultCode", "", "(ZLjava/lang/String;)V", "getInitResultCode", "()Ljava/lang/String;", "getSuccess", "()Z", "InitResult1A", "InitResult1B", "InitResult2A", "InitResult2B", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult1A;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult1B;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult2A;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult2B;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class SdkInitializationResult implements EventResult {
        private final String initResultCode;
        private final boolean success;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult1A;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult;", "()V", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitResult1A extends SdkInitializationResult {
            public static final InitResult1A INSTANCE = new InitResult1A();

            private InitResult1A() {
                super(true, "success_with_fetched_config", null);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult1B;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult;", "jsonParseError", "Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "(Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;)V", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "getError", "()Ljava/lang/Error;", "getJsonParseError", "()Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "getMetricsError", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitResult1B extends SdkInitializationResult {
            private final Error error;
            private final MetricsError.JsonParseError jsonParseError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitResult1B(MetricsError.JsonParseError jsonParseError) {
                super(false, "failure", null);
                Intrinsics.f(jsonParseError, "jsonParseError");
                this.jsonParseError = jsonParseError;
                this.error = new Error("No valid app config JSON available");
            }

            public final Error getError() {
                return this.error;
            }

            public final MetricsError.JsonParseError getJsonParseError() {
                return this.jsonParseError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public MetricsError getMetricsError() {
                return this.jsonParseError;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult2A;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult;", "()V", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitResult2A extends SdkInitializationResult {
            public static final InitResult2A INSTANCE = new InitResult2A();

            private InitResult2A() {
                super(true, "success_with_cached_config", null);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult$InitResult2B;", "Lcom/chartboost/heliumsdk/domain/EventResult$SdkInitializationResult;", "jsonParseError", "Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "(Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;)V", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "getError", "()Ljava/lang/Error;", "getJsonParseError", "()Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "getMetricsError", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitResult2B extends SdkInitializationResult {
            private final Error error;
            private final MetricsError.JsonParseError jsonParseError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitResult2B(MetricsError.JsonParseError jsonParseError) {
                super(true, "success_with_cached_config_and_error", null);
                Intrinsics.f(jsonParseError, "jsonParseError");
                this.jsonParseError = jsonParseError;
                this.error = new Error("Invalid app config JSON");
            }

            public final Error getError() {
                return this.error;
            }

            public final MetricsError.JsonParseError getJsonParseError() {
                return this.jsonParseError;
            }

            @Override // com.chartboost.heliumsdk.domain.EventResult
            public MetricsError getMetricsError() {
                return this.jsonParseError;
            }
        }

        public /* synthetic */ SdkInitializationResult(boolean z2, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(z2, str);
        }

        public final String getInitResultCode() {
            return this.initResultCode;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        private SdkInitializationResult(boolean z2, String str) {
            this.success = z2;
            this.initResultCode = str;
        }
    }

    default MetricsError getMetricsError() {
        return null;
    }
}
