package com.zg.adlib.resource;

import androidx.room.d;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.p004ironsource.qt;
import com.zg.adlib.model.ApiBaseResponse;
import com.zg.adlib.model.ApiError;
import com.zg.adlib.model.ApiResult;
import com.zg.adlib.util.ApiCodeError;
import com.zg.adlib.util.Error;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0080\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2P\b\u0002\u0010\r\u001aJ\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\t0\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u000eH\u0080\bø\u0001\u0000\u001a~\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0000\u0010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000b\u001a\u00020\f2P\b\u0002\u0010\r\u001aJ\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\t0\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u000eH\u0080\bø\u0001\u0000\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0084\u0001\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t0\u0013\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00132\u0006\u0010\u000b\u001a\u00020\f2P\b\u0002\u0010\r\u001aJ\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\t0\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u000eH\u0000\u001a\u0094\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t0\u0013\"\u0004\b\u0000\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00150\u00030\u00132\u0006\u0010\u000b\u001a\u00020\f2\\\b\u0002\u0010\r\u001aV\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0015\u0018\u00010\t0\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0015`\u000e\u001a\u0086\u0001\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t0\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00132\u0006\u0010\u000b\u001a\u00020\f2P\b\u0002\u0010\r\u001aJ\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\t0\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u000e*\u008c\u0001\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\"@\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\t0\u00022@\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\t0\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Interceptor", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lretrofit2/Response;", "Lkotlin/ParameterName;", "name", qt.f26623n, "Lcom/zg/adlib/model/ApiError;", "apiError", "Lcom/zg/adlib/resource/Resource;", "createResource", "gson", "Lcom/google/gson/Gson;", "interceptor", "Lcom/zg/adlib/resource/Interceptor;", "createErrorResource", "throwable", "", "mapOriginalResource", "Lio/reactivex/Observable;", "mapResource", "Lcom/zg/adlib/model/ApiResult;", "mapResponseToResource", "Lcom/zg/adlib/model/ApiBaseResponse;", "app_debug"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ResourceExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.zg.adlib.resource.ResourceExtKt$mapOriginalResource$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3<T> extends FunctionReferenceImpl implements Function1<Throwable, Resource<T>> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1, ResourceExtKt.class, "createResource", "createResource(Ljava/lang/Throwable;)Lcom/zg/adlib/resource/Resource;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Resource<T> invoke(Throwable p0) {
            Intrinsics.f(p0, "p0");
            return ResourceExtKt.createResource(p0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.zg.adlib.resource.ResourceExtKt$mapResponseToResource$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class C35383<T> extends FunctionReferenceImpl implements Function1<Throwable, Resource<T>> {
        public static final C35383 INSTANCE = new C35383();

        public C35383() {
            super(1, ResourceExtKt.class, "createResource", "createResource(Ljava/lang/Throwable;)Lcom/zg/adlib/resource/Resource;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Resource<T> invoke(Throwable p0) {
            Intrinsics.f(p0, "p0");
            return ResourceExtKt.createResource(p0);
        }
    }

    public static final <T> Resource<T> createErrorResource(Response<?> response, Gson gson, Function2<? super Response<?>, ? super ApiError, Resource<T>> interceptor) {
        Intrinsics.f(response, "response");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        ResponseBody responseBodyErrorBody = response.errorBody();
        ApiError apiError = null;
        try {
            apiError = (ApiError) gson.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
        } catch (Exception unused) {
        }
        Resource<T> resource = (Resource) interceptor.invoke(response, apiError);
        if (resource == null) {
            return apiError != null ? Resource.INSTANCE.error(apiError) : Resource.INSTANCE.error(Error.LOCAL_UNKNOWN);
        }
        return resource;
    }

    public static /* synthetic */ Resource createErrorResource$default(Response response, Gson gson, Function2 interceptor, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interceptor = new Function2() { // from class: com.zg.adlib.resource.ResourceExtKt.createErrorResource.1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(Response<?> response2, ApiError apiError) {
                    Intrinsics.f(response2, "<unused var>");
                    return null;
                }
            };
        }
        Intrinsics.f(response, "response");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        ResponseBody responseBodyErrorBody = response.errorBody();
        ApiError apiError = null;
        try {
            apiError = (ApiError) gson.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
        } catch (Exception unused) {
        }
        Resource resource = (Resource) interceptor.invoke(response, apiError);
        if (resource == null) {
            return apiError != null ? Resource.INSTANCE.error(apiError) : Resource.INSTANCE.error(Error.LOCAL_UNKNOWN);
        }
        return resource;
    }

    public static final <T> Resource<T> createResource(Response<T> response, Gson gson, Function2<? super Response<?>, ? super ApiError, Resource<T>> interceptor) {
        Intrinsics.f(response, "response");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        if (response.isSuccessful()) {
            T tBody = response.body();
            Headers headers = response.headers();
            Resource.Companion companion = Resource.INSTANCE;
            Intrinsics.c(headers);
            return Resource.Companion.success$default(companion, tBody, null, headers, 2, null);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        ApiError apiError = null;
        try {
            apiError = (ApiError) gson.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
        } catch (Exception unused) {
        }
        Resource<T> resource = (Resource) interceptor.invoke(response, apiError);
        if (resource == null) {
            return apiError != null ? Resource.INSTANCE.error(apiError) : Resource.INSTANCE.error(Error.LOCAL_UNKNOWN);
        }
        return resource;
    }

    public static /* synthetic */ Resource createResource$default(Response response, Gson gson, Function2 interceptor, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interceptor = new Function2() { // from class: com.zg.adlib.resource.ResourceExtKt.createResource.1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(Response<?> response2, ApiError apiError) {
                    Intrinsics.f(response2, "<unused var>");
                    return null;
                }
            };
        }
        Intrinsics.f(response, "response");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        if (response.isSuccessful()) {
            Object objBody = response.body();
            Headers headers = response.headers();
            Resource.Companion companion = Resource.INSTANCE;
            Intrinsics.c(headers);
            return Resource.Companion.success$default(companion, objBody, null, headers, 2, null);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        ApiError apiError = null;
        try {
            apiError = (ApiError) gson.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
        } catch (Exception unused) {
        }
        Resource resource = (Resource) interceptor.invoke(response, apiError);
        if (resource == null) {
            return apiError != null ? Resource.INSTANCE.error(apiError) : Resource.INSTANCE.error(Error.LOCAL_UNKNOWN);
        }
        return resource;
    }

    public static final <T> Observable<Resource<T>> mapOriginalResource(Observable<Response<T>> observable, final Gson gson, final Function2<? super Response<?>, ? super ApiError, Resource<T>> interceptor) {
        Intrinsics.f(observable, "<this>");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        Observable<Resource<T>> observableOnErrorReturn = observable.map(new Function<Response<T>, Resource<T>>() { // from class: com.zg.adlib.resource.ResourceExtKt.mapOriginalResource.2
            @Override // io.reactivex.functions.Function
            public Resource<T> apply(Response<T> t) {
                Intrinsics.f(t, "t");
                Gson gson2 = gson;
                Function2<Response<?>, ApiError, Resource<T>> function2 = interceptor;
                if (t.isSuccessful()) {
                    T tBody = t.body();
                    Headers headers = t.headers();
                    Resource.Companion companion = Resource.INSTANCE;
                    Intrinsics.c(headers);
                    return Resource.Companion.success$default(companion, tBody, null, headers, 2, null);
                }
                ResponseBody responseBodyErrorBody = t.errorBody();
                ApiError apiError = null;
                try {
                    apiError = (ApiError) gson2.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
                } catch (Exception unused) {
                }
                Resource<T> resource = (Resource) function2.invoke(t, apiError);
                if (resource == null) {
                    return apiError != null ? Resource.INSTANCE.error(apiError) : Resource.INSTANCE.error(Error.LOCAL_UNKNOWN);
                }
                return resource;
            }
        }).onErrorReturn(new a(0, AnonymousClass3.INSTANCE));
        Intrinsics.e(observableOnErrorReturn, "onErrorReturn(...)");
        return observableOnErrorReturn;
    }

    public static /* synthetic */ Observable mapOriginalResource$default(Observable observable, Gson gson, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new Function2() { // from class: com.zg.adlib.resource.ResourceExtKt.mapOriginalResource.1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(Response<?> response, ApiError apiError) {
                    Intrinsics.f(response, "<unused var>");
                    return null;
                }
            };
        }
        return mapOriginalResource(observable, gson, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource mapOriginalResource$lambda$0(Function1 function1, Object p0) {
        Intrinsics.f(p0, "p0");
        return (Resource) function1.invoke(p0);
    }

    public static final <T> Observable<Resource<T>> mapResource(Observable<Response<ApiResult<T>>> observable, Gson gson, Function2<? super Response<?>, ? super ApiError, Resource<ApiResult<T>>> interceptor) {
        Intrinsics.f(observable, "<this>");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        Observable<Resource<T>> map = mapOriginalResource(observable, gson, interceptor).map(new a(2, new d(12)));
        Intrinsics.e(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Observable mapResource$default(Observable observable, Gson gson, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new Function2() { // from class: com.zg.adlib.resource.ResourceExtKt.mapResource.1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(Response<?> response, ApiError apiError) {
                    Intrinsics.f(response, "<unused var>");
                    return null;
                }
            };
        }
        return mapResource(observable, gson, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Resource mapResource$lambda$1(Resource it) {
        Intrinsics.f(it, "it");
        ApiResult apiResult = (ApiResult) it.getData();
        if (apiResult == null) {
            ApiError apiError = it.getApiError();
            return Resource.copy$default(it, false, apiResult, apiError != null ? Integer.valueOf(apiError.getCode()) : null, null, null, null, null, null, null, it.getApiError() != null ? ApiCodeError.INSTANCE.toError(it.getApiError().getCode()) : ApiCodeError.UNKNOWN_ERROR, 504, null);
        }
        boolean z2 = apiResult.getCode() == 0;
        return Resource.copy$default(it, z2, apiResult.getData(), Integer.valueOf(apiResult.getCode()), null, null, null, apiResult.getErrors(), apiResult.getStatus(), apiResult.getError(), z2 ? null : ApiCodeError.INSTANCE.toError(apiResult.getCode()), 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource mapResource$lambda$2(Function1 function1, Object p0) {
        Intrinsics.f(p0, "p0");
        return (Resource) function1.invoke(p0);
    }

    public static final <T extends ApiBaseResponse> Observable<Resource<T>> mapResponseToResource(Observable<Response<T>> observable, final Gson gson, final Function2<? super Response<?>, ? super ApiError, Resource<T>> interceptor) {
        Intrinsics.f(observable, "<this>");
        Intrinsics.f(gson, "gson");
        Intrinsics.f(interceptor, "interceptor");
        Observable<Resource<T>> observableOnErrorReturn = observable.map(new Function<Response<T>, Resource<T>>() { // from class: com.zg.adlib.resource.ResourceExtKt.mapResponseToResource.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // io.reactivex.functions.Function
            public Resource<T> apply(Response<T> t) {
                Intrinsics.f(t, "t");
                ApiError apiError = null;
                if (!t.isSuccessful()) {
                    Gson gson2 = gson;
                    Function2<Response<?>, ApiError, Resource<T>> function2 = interceptor;
                    ResponseBody responseBodyErrorBody = t.errorBody();
                    try {
                        apiError = (ApiError) gson2.c(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null, ApiError.class);
                    } catch (Exception unused) {
                    }
                    Resource<T> resource = (Resource) function2.invoke(t, apiError);
                    if (resource == null) {
                        return apiError != null ? Resource.INSTANCE.error(apiError) : Resource.INSTANCE.error(Error.LOCAL_UNKNOWN);
                    }
                    return resource;
                }
                ApiBaseResponse apiBaseResponse = (ApiBaseResponse) t.body();
                Headers headers = t.headers();
                Resource.Companion companion = Resource.INSTANCE;
                Intrinsics.c(headers);
                Resource resourceSuccess$default = Resource.Companion.success$default(companion, apiBaseResponse, null, headers, 2, null);
                if (apiBaseResponse == null) {
                    return Resource.copy$default(resourceSuccess$default, false, null, -1, null, null, null, null, null, null, ApiCodeError.UNKNOWN_ERROR, 504, null);
                }
                boolean z2 = apiBaseResponse.getCode() == 0;
                int code = apiBaseResponse.getCode();
                return Resource.copy$default(resourceSuccess$default, z2, apiBaseResponse, Integer.valueOf(code), null, null, null, apiBaseResponse.getErrors(), apiBaseResponse.getStatus(), apiBaseResponse.getError(), z2 ? null : ApiCodeError.INSTANCE.toError(apiBaseResponse.getCode()), 56, null);
            }
        }).onErrorReturn(new a(1, C35383.INSTANCE));
        Intrinsics.e(observableOnErrorReturn, "onErrorReturn(...)");
        return observableOnErrorReturn;
    }

    public static /* synthetic */ Observable mapResponseToResource$default(Observable observable, Gson gson, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = new Function2() { // from class: com.zg.adlib.resource.ResourceExtKt.mapResponseToResource.1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(Response<?> response, ApiError apiError) {
                    Intrinsics.f(response, "<unused var>");
                    return null;
                }
            };
        }
        return mapResponseToResource(observable, gson, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resource mapResponseToResource$lambda$3(Function1 function1, Object p0) {
        Intrinsics.f(p0, "p0");
        return (Resource) function1.invoke(p0);
    }

    public static final <T> Resource<T> createResource(Throwable throwable) {
        Intrinsics.f(throwable, "throwable");
        return Resource.INSTANCE.error(Error.INSTANCE.getLocal(throwable));
    }
}
