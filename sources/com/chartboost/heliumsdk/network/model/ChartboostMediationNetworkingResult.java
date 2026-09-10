package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.network.NetworkError;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.inmobi.unification.sdk.InitializationStatus;
import com.p004ironsource.qt;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import okhttp3.Headers;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "()V", "Companion", "Failure", "JsonParsingFailure", InitializationStatus.SUCCESS, "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$Failure;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$JsonParsingFailure;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$Success;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ChartboostMediationNetworkingResult<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086\b¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$Companion;", "", "()V", "makeResult", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, qt.f26623n, "Lretrofit2/Response;", "", "error", "Lcom/chartboost/heliumsdk/network/NetworkError;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> ChartboostMediationNetworkingResult<T> makeResult(Response<String> response, NetworkError error) {
            ChartboostMediationError chartboostMediationError;
            Intrinsics.f(response, "response");
            if (!response.isSuccessful()) {
                int iCode = response.code();
                Headers headers = response.headers();
                if (error == null || (chartboostMediationError = error.getChartboostMediationError()) == null) {
                    chartboostMediationError = ChartboostMediationError.CM_INTERNAL_ERROR;
                }
                return new Failure(iCode, headers, chartboostMediationError, null, 8, null);
            }
            try {
                int iCode2 = response.code();
                Headers headers2 = response.headers();
                Intrinsics.e(headers2, "response.headers()");
                if (response.code() != 200) {
                    return new Success(iCode2, headers2, null);
                }
                HeliumJsonKt.getHeliumJson();
                Intrinsics.l();
                throw null;
            } catch (SerializationException e2) {
                Headers headers3 = response.headers();
                Intrinsics.e(headers3, "response.headers()");
                return new JsonParsingFailure(-1, headers3, ChartboostMediationError.CM_INTERNAL_ERROR, e2);
            } catch (Throwable th) {
                return new Failure(-1, response.headers(), ChartboostMediationError.CM_INTERNAL_ERROR, th);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$Failure;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", "", "code", "", "headers", "Lokhttp3/Headers;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "throwable", "", "(ILokhttp3/Headers;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;Ljava/lang/Throwable;)V", "getCode", "()I", "getError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getHeaders", "()Lokhttp3/Headers;", "getThrowable", "()Ljava/lang/Throwable;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failure extends ChartboostMediationNetworkingResult {
        private final int code;
        private final ChartboostMediationError error;
        private final Headers headers;
        private final Throwable throwable;

        public /* synthetic */ Failure(int i2, Headers headers, ChartboostMediationError chartboostMediationError, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, headers, chartboostMediationError, (i3 & 8) != 0 ? null : th);
        }

        public final int getCode() {
            return this.code;
        }

        public final ChartboostMediationError getError() {
            return this.error;
        }

        public final Headers getHeaders() {
            return this.headers;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(int i2, Headers headers, ChartboostMediationError error, Throwable th) {
            super(null);
            Intrinsics.f(error, "error");
            this.code = i2;
            this.headers = headers;
            this.error = error;
            this.throwable = th;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$JsonParsingFailure;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", "", "code", "", "headers", "Lokhttp3/Headers;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", g.f39715A, "Lkotlinx/serialization/SerializationException;", "(ILokhttp3/Headers;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;Lkotlinx/serialization/SerializationException;)V", "getCode", "()I", "getError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getException", "()Lkotlinx/serialization/SerializationException;", "getHeaders", "()Lokhttp3/Headers;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JsonParsingFailure extends ChartboostMediationNetworkingResult {
        private final int code;
        private final ChartboostMediationError error;
        private final SerializationException exception;
        private final Headers headers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JsonParsingFailure(int i2, Headers headers, ChartboostMediationError error, SerializationException exception) {
            super(null);
            Intrinsics.f(headers, "headers");
            Intrinsics.f(error, "error");
            Intrinsics.f(exception, "exception");
            this.code = i2;
            this.headers = headers;
            this.error = error;
            this.exception = exception;
        }

        public final int getCode() {
            return this.code;
        }

        public final ChartboostMediationError getError() {
            return this.error;
        }

        public final SerializationException getException() {
            return this.exception;
        }

        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\bR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult$Success;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", "httpCode", "", "headers", "Lokhttp3/Headers;", "body", "(ILokhttp3/Headers;Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getHeaders", "()Lokhttp3/Headers;", "getHttpCode", "()I", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success<T> extends ChartboostMediationNetworkingResult<T> {
        private final T body;
        private final Headers headers;
        private final int httpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(int i2, Headers headers, T t) {
            super(null);
            Intrinsics.f(headers, "headers");
            this.httpCode = i2;
            this.headers = headers;
            this.body = t;
        }

        public final T getBody() {
            return this.body;
        }

        public final Headers getHeaders() {
            return this.headers;
        }

        public final int getHttpCode() {
            return this.httpCode;
        }
    }

    public /* synthetic */ ChartboostMediationNetworkingResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChartboostMediationNetworkingResult() {
    }
}
