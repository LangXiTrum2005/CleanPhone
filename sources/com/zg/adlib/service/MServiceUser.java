package com.zg.adlib.service;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import b0.a;
import b0.b;
import b0.c;
import b0.d;
import com.google.gson.Gson;
import com.zg.adlib.BuildConfig;
import com.zg.adlib.ZGAd;
import com.zg.adlib.api.MApiUser;
import com.zg.adlib.interceptor.MLoggerInterceptor;
import com.zg.adlib.interceptor.MNetworkStateInterceptor;
import com.zg.adlib.model.ApiBaseResponse;
import com.zg.adlib.model.MLogRequestM;
import com.zg.adlib.resource.Resource;
import com.zg.adlib.resource.ResourceExtKt;
import com.zg.adlib.util.MApiConstants;
import io.reactivex.Observable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/zg/adlib/service/MServiceUser;", "", "context", "Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Landroid/content/Context;Lcom/google/gson/Gson;)V", "api", "Lcom/zg/adlib/api/MApiUser;", "getApi", "okHttpClient", "Lokhttp3/OkHttpClient;", "createHttpLoggingInterceptor", "Lcom/zg/adlib/interceptor/MLoggerInterceptor;", "createAuthorizationInterceptor", "Lokhttp3/Interceptor;", "updateMLog", "Lio/reactivex/Observable;", "Lcom/zg/adlib/resource/Resource;", "Lcom/zg/adlib/model/ApiBaseResponse;", "request", "Lcom/zg/adlib/model/MLogRequestM;", "Companion", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MServiceUser {
    public static final String TAG = "Api-Service-User";
    private MApiUser api;
    private final Context context;
    private final Gson gson;

    /* JADX INFO: renamed from: com.zg.adlib.service.MServiceUser$getApi$1, reason: invalid class name */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"com/zg/adlib/service/MServiceUser$getApi$1", "Lretrofit2/Converter$Factory;", "responseBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends Converter.Factory {
        /* JADX INFO: Access modifiers changed from: private */
        public static final Object responseBodyConverter$lambda$0(Converter converter, ResponseBody responseBody) {
            if (responseBody.getContentLength() == 0) {
                return null;
            }
            return converter.convert(responseBody);
        }

        @Override // retrofit2.Converter.Factory
        public Converter<ResponseBody, Object> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
            Intrinsics.f(type, "type");
            Intrinsics.f(annotations, "annotations");
            Intrinsics.f(retrofit, "retrofit");
            return new d(retrofit.nextResponseBodyConverter(this, type, annotations), 0);
        }
    }

    public MServiceUser(Context context, Gson gson) {
        Intrinsics.f(context, "context");
        Intrinsics.f(gson, "gson");
        this.context = context;
        this.gson = gson;
    }

    private final Interceptor createAuthorizationInterceptor() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response createAuthorizationInterceptor$lambda$4(Interceptor.Chain it) {
        Intrinsics.f(it, "it");
        return it.proceed(it.request().newBuilder().build());
    }

    private final MLoggerInterceptor createHttpLoggingInterceptor() {
        MLoggerInterceptor mLoggerInterceptor = new MLoggerInterceptor(Process.myPid(), new androidx.room.d(3));
        mLoggerInterceptor.setPrintPacket(false);
        return mLoggerInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createHttpLoggingInterceptor$lambda$2(String it) {
        Intrinsics.f(it, "it");
        if (BuildConfig.DEBUG) {
            Log.v(TAG, it);
        }
        return Unit.f43263a;
    }

    private final MApiUser getApi() {
        if (this.api == null) {
            this.api = (MApiUser) new Retrofit.Builder().baseUrl(MApiConstants.INSTANCE.getBASE_API_URL()).client(okHttpClient()).addConverterFactory(new AnonymousClass1()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create(new Gson())).build().create(MApiUser.class);
        }
        MApiUser mApiUser = this.api;
        Intrinsics.c(mApiUser);
        return mApiUser;
    }

    private final OkHttpClient okHttpClient() {
        new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0).setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).cache(null).writeTimeout(10L, timeUnit);
        if (BuildConfig.DEBUG) {
            Context context = ZGAd.getInstance().getContext();
            Intrinsics.e(context, "getContext(...)");
            builderWriteTimeout.addInterceptor(new MNetworkStateInterceptor(context));
            builderWriteTimeout.addInterceptor(createHttpLoggingInterceptor());
        }
        return builderWriteTimeout.hostnameVerifier(new b(0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean okHttpClient$lambda$1(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateMLog$lambda$6(Resource resource) {
        if (resource.getSuccess()) {
        }
        return Unit.f43263a;
    }

    public final Observable<Resource<ApiBaseResponse>> updateMLog(MLogRequestM request) {
        Intrinsics.f(request, "request");
        Observable<Resource<ApiBaseResponse>> observableDoOnNext = ResourceExtKt.mapResponseToResource$default(getApi().uploadMLog(request), this.gson, null, 2, null).doOnNext(new c(0, new androidx.room.d(4)));
        Intrinsics.e(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    public /* synthetic */ MServiceUser(Context context, Gson gson, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? new Gson() : gson);
    }
}
