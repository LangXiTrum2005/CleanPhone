package com.chartboost.sdk.internal.Networking.okhttp;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.bd;
import com.chartboost.sdk.impl.tc;
import com.chartboost.sdk.impl.xc;
import com.chartboost.sdk.impl.za;
import com.p004ironsource.ko;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\tB%\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nJ,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0096@¢\u0006\u0004\b\t\u0010\u000bJ@\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\t\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/okhttp/OkHttpNetworkClient;", "Lcom/chartboost/sdk/impl/tc;", "", "url", "jsonBody", "", "headers", "contentType", "Lcom/chartboost/sdk/impl/xc;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "method", "Lokhttp3/RequestBody;", "requestBody", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "", "connectTimeoutSecs", "writeTimeoutSecs", "readTimeoutSecs", "<init>", "(JJJ)V", "Companion", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class OkHttpNetworkClient implements tc {
    public static volatile Interceptor customInterceptor;
    private final OkHttpClient okHttpClient;

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15782c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15783e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15782c = obj;
            this.f15783e |= Integer.MIN_VALUE;
            return OkHttpNetworkClient.this.a(null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15784b;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Map f15786e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Map map, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.f15786e = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OkHttpNetworkClient.this.new c(this.d, this.f15786e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15784b;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            OkHttpNetworkClient okHttpNetworkClient = OkHttpNetworkClient.this;
            String str = this.d;
            Map map = this.f15786e;
            this.f15784b = 1;
            Object objA = OkHttpNetworkClient.a(okHttpNetworkClient, str, map, ko.f25534a, null, this, 8, null);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15788c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ OkHttpNetworkClient f15789e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Map g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, OkHttpNetworkClient okHttpNetworkClient, String str3, Map map, Continuation continuation) {
            super(2, continuation);
            this.f15788c = str;
            this.d = str2;
            this.f15789e = okHttpNetworkClient;
            this.f = str3;
            this.g = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f15788c, this.d, this.f15789e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15787b;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            MediaType.Companion companion = MediaType.INSTANCE;
            String str = this.f15788c;
            if (str == null) {
                str = "application/json; charset=utf-8";
            }
            RequestBody requestBodyCreate = RequestBody.INSTANCE.create(this.d, companion.get(str));
            OkHttpNetworkClient okHttpNetworkClient = this.f15789e;
            String str2 = this.f;
            Map map = this.g;
            this.f15787b = 1;
            Object objA = okHttpNetworkClient.a(str2, map, ko.f25535b, requestBodyCreate, this);
            return objA == coroutineSingletons ? coroutineSingletons : objA;
        }
    }

    public OkHttpNetworkClient(long j, long j2, long j3) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.connectTimeout(j, timeUnit).writeTimeout(j2, timeUnit).readTimeout(j3, timeUnit);
        Interceptor interceptor = customInterceptor;
        if (interceptor != null) {
            za.a("Adding custom networking interceptor: ".concat(interceptor.getClass().getSimpleName()), (Throwable) null, 2, (Object) null);
            timeout.addInterceptor(interceptor);
        }
        this.okHttpClient = timeout.build();
    }

    @Override // com.chartboost.sdk.impl.tc
    public Object a(String str, String str2, Map map, String str3, Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return BuildersKt.f(DefaultIoScheduler.f45062Y, new d(str3, str2, this, str, map, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.tc
    public Object a(String str, Map map, Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return BuildersKt.f(DefaultIoScheduler.f45062Y, new c(str, map, null), continuation);
    }

    public static /* synthetic */ Object a(OkHttpNetworkClient okHttpNetworkClient, String str, Map map, String str2, RequestBody requestBody, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            requestBody = null;
        }
        return okHttpNetworkClient.a(str, map, str2, requestBody, continuation);
    }

    public final Object a(String str, Map map, String str2, RequestBody requestBody, Continuation continuation) {
        try {
            Request.Builder builderMethod = new Request.Builder().url(str).method(str2, requestBody);
            for (Map.Entry entry : map.entrySet()) {
                builderMethod.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
            return a(builderMethod.build(), continuation);
        } catch (IllegalArgumentException e2) {
            za.a("Invalid URL: " + str, e2);
            String message = e2.getMessage();
            if (message == null) {
                message = "malformed URL";
            }
            return new xc(false, -1, null, new ChartboostError.Connectivity.Unknown("Invalid URL: ".concat(message), e2), null, 20, null);
        }
    }

    public /* synthetic */ OkHttpNetworkClient(long j, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5L : j, (i2 & 2) != 0 ? 5L : j2, (i2 & 4) != 0 ? 5L : j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Request request, Continuation continuation) throws Throwable {
        b bVar;
        String strConcat;
        MediaType contentType;
        Charset charsetCharset$default;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f15783e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f15783e = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objA = bVar.f15782c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = bVar.f15783e;
        try {
            if (i3 == 0) {
                ResultKt.b(objA);
                OkHttpClient okHttpClient = this.okHttpClient;
                bVar.f15781b = request;
                bVar.f15783e = 1;
                objA = bd.a(okHttpClient, request, bVar);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            Closeable closeable = (Closeable) objA;
            try {
                Response response = (Response) closeable;
                boolean zIsSuccessful = response.isSuccessful();
                ResponseBody responseBodyBody = response.body();
                xc xcVar = new xc(zIsSuccessful, response.code(), responseBodyBody != null ? responseBodyBody.bytes() : null, !zIsSuccessful ? a.f15790c.b(response.code()) : null, (responseBodyBody == null || (contentType = responseBodyBody.getContentType()) == null || (charsetCharset$default = MediaType.charset$default(contentType, null, 1, null)) == null) ? null : charsetCharset$default.name());
                CloseableKt.a(closeable, null);
                return xcVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(closeable, th);
                    throw th2;
                }
            }
        } catch (SocketTimeoutException e2) {
            za.a("SocketTimeoutException while making network request to " + request.url(), e2);
            return new xc(false, -1, null, ChartboostError.Connectivity.TimedOut.INSTANCE, null, 20, null);
        } catch (UnknownHostException e3) {
            za.a("UnknownHostException while making network request to " + request.url(), e3);
            String message = e3.getMessage();
            if (message == null || (strConcat = "Unknown host: ".concat(message)) == null) {
                strConcat = "Unknown host";
            }
            return new xc(false, -1, null, new ChartboostError.Connectivity.NetworkError(strConcat, e3), null, 20, null);
        } catch (IOException e4) {
            za.a("IOException while making network request to " + request.url(), e4);
            String message2 = e4.getMessage();
            if (message2 == null) {
                message2 = "Network error";
            }
            return new xc(false, -1, null, new ChartboostError.Connectivity.NetworkError(message2, e4), null, 20, null);
        } catch (Exception e5) {
            za.a("Exception while making network request to " + request.url(), e5);
            String message3 = e5.getMessage();
            if (message3 == null) {
                message3 = "Unknown error";
            }
            return new xc(false, -1, null, new ChartboostError.Connectivity.Unknown(message3, e5), null, 20, null);
        }
    }
}
