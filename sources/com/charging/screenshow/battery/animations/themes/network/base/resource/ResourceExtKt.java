package com.charging.screenshow.battery.animations.themes.network.base.resource;

import com.charging.screenshow.battery.animations.themes.network.base.interceptor.NetworkStateInterceptor;
import com.charging.screenshow.battery.animations.themes.network.base.model.ApiBaseResponse;
import com.charging.screenshow.battery.animations.themes.network.base.model.ApiError;
import com.charging.screenshow.battery.animations.themes.network.base.util.ApiCodeError;
import com.charging.screenshow.battery.animations.themes.network.base.util.Error;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.p004ironsource.qt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.text.ParseException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.json.JSONException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u008c\u0001\u0010\t\u001a\u0004\b\u0000\u0010\u0000\"@\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00012@\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0001¨\u0006\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lretrofit2/Response;", "Lkotlin/ParameterName;", "name", qt.f26623n, "Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiError;", "apiError", "Lcom/charging/screenshow/battery/animations/themes/network/base/resource/Resource;", "Interceptor", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ResourceExtKt {
    public static final Resource a(Throwable throwable) {
        Error error;
        Intrinsics.f(throwable, "throwable");
        Headers headers = Resource.f13284i;
        Error.X.getClass();
        throwable.printStackTrace();
        if (throwable instanceof SocketTimeoutException) {
            error = Error.Z;
        } else if ((throwable instanceof UnknownServiceException) || (throwable instanceof UnknownHostException) || (throwable instanceof SSLHandshakeException) || (throwable instanceof SSLPeerUnverifiedException)) {
            error = Error.e0;
        } else if ((throwable instanceof JsonParseException) || (throwable instanceof JsonSyntaxException) || (throwable instanceof JsonIOException) || (throwable instanceof JSONException) || (throwable instanceof ParseException)) {
            error = Error.g0;
        } else {
            error = throwable instanceof NetworkStateInterceptor.UnknownNetworkException ? Error.f0 : Error.i0;
        }
        return new Resource(false, null, null, error, null, 1006);
    }

    public static Observable b(Observable observable, final Gson gson) {
        final ResourceExtKt$mapResponseToResource$1 resourceExtKt$mapResponseToResource$1 = ResourceExtKt$mapResponseToResource$1.X;
        Intrinsics.f(observable, "<this>");
        Intrinsics.f(gson, "gson");
        Observable map = observable.map(new Function<Response<ApiBaseResponse>, Resource<ApiBaseResponse>>() { // from class: com.charging.screenshow.battery.animations.themes.network.base.resource.ResourceExtKt$mapResponseToResource$2
            @Override // io.reactivex.functions.Function
            public final Resource<ApiBaseResponse> apply(Response<ApiBaseResponse> response) {
                ApiError apiError;
                ApiCodeError apiCodeError;
                Response<ApiBaseResponse> t = response;
                Intrinsics.f(t, "t");
                ApiCodeError apiCodeError2 = null;
                if (!t.isSuccessful()) {
                    Gson gson2 = gson;
                    ResponseBody responseBodyErrorBody = t.errorBody();
                    try {
                        apiError = (ApiError) gson2.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
                    } catch (Exception unused) {
                        apiError = null;
                    }
                    Resource<ApiBaseResponse> resource = (Resource) resourceExtKt$mapResponseToResource$1.invoke(t, apiError);
                    if (resource != null) {
                        return resource;
                    }
                    if (apiError != null) {
                        Headers headers = Resource.f13284i;
                        return new Resource<>(false, null, null, Error.f13292Y, apiError, 974);
                    }
                    Headers headers2 = Resource.f13284i;
                    return new Resource<>(false, null, null, Error.i0, null, 1006);
                }
                ApiBaseResponse apiBaseResponseBody = t.body();
                Headers headers3 = t.headers();
                Headers headers4 = Resource.f13284i;
                Intrinsics.c(headers3);
                Resource resourceA = Resource.Companion.a(apiBaseResponseBody, headers3);
                if (apiBaseResponseBody == null) {
                    return Resource.a(resourceA, false, null, -1, null, null, null, ApiCodeError.g0, 504);
                }
                boolean z2 = apiBaseResponseBody.getCode() == 0;
                int code = apiBaseResponseBody.getCode();
                String error = apiBaseResponseBody.getError();
                List errors = apiBaseResponseBody.getErrors();
                String status = apiBaseResponseBody.getStatus();
                if (!z2) {
                    ApiCodeError.Companion companion = ApiCodeError.X;
                    int code2 = apiBaseResponseBody.getCode();
                    companion.getClass();
                    if (code2 == -4) {
                        apiCodeError = ApiCodeError.f0;
                    } else if (code2 == -3) {
                        apiCodeError = ApiCodeError.e0;
                    } else if (code2 == -2) {
                        apiCodeError = ApiCodeError.Z;
                    } else if (code2 == -1) {
                        apiCodeError = ApiCodeError.f13291Y;
                    } else if (code2 != 40017) {
                        switch (code2) {
                            case 20000:
                                apiCodeError = ApiCodeError.g0;
                                break;
                            case AD_SERVER_ERROR_VALUE:
                                apiCodeError = ApiCodeError.h0;
                                break;
                            case 20002:
                                apiCodeError = ApiCodeError.i0;
                                break;
                            case 20003:
                                apiCodeError = ApiCodeError.j0;
                                break;
                            case 20004:
                                apiCodeError = ApiCodeError.k0;
                                break;
                            case 20005:
                                apiCodeError = ApiCodeError.l0;
                                break;
                            case 20006:
                                apiCodeError = ApiCodeError.m0;
                                break;
                            case 20007:
                                apiCodeError = ApiCodeError.n0;
                                break;
                            case 20008:
                                apiCodeError = ApiCodeError.o0;
                                break;
                            case 20009:
                                apiCodeError = ApiCodeError.p0;
                                break;
                            case 20010:
                                apiCodeError = ApiCodeError.q0;
                                break;
                            case 20011:
                                apiCodeError = ApiCodeError.r0;
                                break;
                            case 20012:
                                apiCodeError = ApiCodeError.s0;
                                break;
                            case 20013:
                                apiCodeError = ApiCodeError.t0;
                                break;
                            case 20014:
                                apiCodeError = ApiCodeError.u0;
                                break;
                            default:
                                switch (code2) {
                                    case 40001:
                                        apiCodeError = ApiCodeError.v0;
                                        break;
                                    case 40002:
                                        apiCodeError = ApiCodeError.w0;
                                        break;
                                    case 40003:
                                        apiCodeError = ApiCodeError.x0;
                                        break;
                                    case 40004:
                                        apiCodeError = ApiCodeError.y0;
                                        break;
                                    case 40005:
                                        apiCodeError = ApiCodeError.z0;
                                        break;
                                    case 40006:
                                        apiCodeError = ApiCodeError.A0;
                                        break;
                                    case 40007:
                                        apiCodeError = ApiCodeError.B0;
                                        break;
                                    case 40008:
                                        apiCodeError = ApiCodeError.C0;
                                        break;
                                    case 40009:
                                        apiCodeError = ApiCodeError.D0;
                                        break;
                                    case 40010:
                                        apiCodeError = ApiCodeError.E0;
                                        break;
                                    case 40011:
                                        apiCodeError = ApiCodeError.F0;
                                        break;
                                    case 40012:
                                        apiCodeError = ApiCodeError.G0;
                                        break;
                                    default:
                                        switch (code2) {
                                            case 40014:
                                                apiCodeError = ApiCodeError.H0;
                                                break;
                                            case 40015:
                                                apiCodeError = ApiCodeError.I0;
                                                break;
                                            default:
                                                switch (code2) {
                                                    case 40019:
                                                        apiCodeError = ApiCodeError.K0;
                                                        break;
                                                    case 40020:
                                                        apiCodeError = ApiCodeError.L0;
                                                        break;
                                                    case 40021:
                                                        apiCodeError = ApiCodeError.M0;
                                                        break;
                                                    case 40022:
                                                        apiCodeError = ApiCodeError.N0;
                                                        break;
                                                    case 40023:
                                                        apiCodeError = ApiCodeError.O0;
                                                        break;
                                                    case 40024:
                                                        apiCodeError = ApiCodeError.P0;
                                                        break;
                                                    default:
                                                        switch (code2) {
                                                            case 40030:
                                                                apiCodeError = ApiCodeError.Q0;
                                                                break;
                                                            case 40031:
                                                                apiCodeError = ApiCodeError.R0;
                                                                break;
                                                            case 40032:
                                                                apiCodeError = ApiCodeError.S0;
                                                                break;
                                                            default:
                                                                switch (code2) {
                                                                    case 40050:
                                                                        apiCodeError = ApiCodeError.T0;
                                                                        break;
                                                                    case 40051:
                                                                        apiCodeError = ApiCodeError.U0;
                                                                        break;
                                                                    case 40052:
                                                                        apiCodeError = ApiCodeError.V0;
                                                                        break;
                                                                    default:
                                                                        apiCodeError = ApiCodeError.g0;
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        apiCodeError = ApiCodeError.J0;
                    }
                    apiCodeError2 = apiCodeError;
                }
                return Resource.a(resourceA, z2, apiBaseResponseBody, Integer.valueOf(code), errors, status, error, apiCodeError2, 56);
            }
        });
        ResourceExtKt$mapResponseToResource$3 resourceExtKt$mapResponseToResource$3 = ResourceExtKt$mapResponseToResource$3.X;
        Observable observableOnErrorReturn = map.onErrorReturn(new Function() { // from class: com.charging.screenshow.battery.animations.themes.network.base.resource.a
            public final /* synthetic */ Function1 X = ResourceExtKt$mapResponseToResource$3.X;

            @Override // io.reactivex.functions.Function
            public final Object apply(Object p0) {
                ResourceExtKt$mapResponseToResource$3 resourceExtKt$mapResponseToResource$4 = ResourceExtKt$mapResponseToResource$3.X;
                Intrinsics.f(p0, "p0");
                return (Resource) resourceExtKt$mapResponseToResource$4.invoke(p0);
            }
        });
        Intrinsics.e(observableOnErrorReturn, "onErrorReturn(...)");
        return observableOnErrorReturn;
    }
}
