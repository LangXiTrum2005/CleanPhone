package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/core/network/core/RefactoredOkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "client", "Lokhttp3/OkHttpClient;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RefactoredOkHttp3Client implements HttpClient {
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final OkHttpClient client;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client", f = "RefactoredOkHttp3Client.kt", l = {119}, m = "execute")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RefactoredOkHttp3Client.this.execute(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1", f = "RefactoredOkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    public static final class C35201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35201(HttpRequest httpRequest, Continuation<? super C35201> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RefactoredOkHttp3Client.this.new C35201(this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            RefactoredOkHttp3Client refactoredOkHttp3Client = RefactoredOkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = refactoredOkHttp3Client.execute(httpRequest, this);
            return objExecute == coroutineSingletons ? coroutineSingletons : objExecute;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
            return ((C35201) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    public RefactoredOkHttp3Client(ISDKDispatchers dispatchers, OkHttpClient client) {
        Intrinsics.f(dispatchers, "dispatchers");
        Intrinsics.f(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.label;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            Request okHttpProtoRequest = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
            OkHttpClient.Builder builderNewBuilder = this.client.newBuilder();
            long connectTimeout = httpRequest.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient okHttpClientBuild = builderNewBuilder.connectTimeout(connectTimeout, timeUnit).readTimeout(httpRequest.getReadTimeout(), timeUnit).writeTimeout(httpRequest.getWriteTimeout(), timeUnit).build();
            anonymousClass1.L$0 = httpRequest;
            anonymousClass1.L$1 = okHttpProtoRequest;
            anonymousClass1.L$2 = okHttpClientBuild;
            anonymousClass1.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(anonymousClass1));
            cancellableContinuationImpl.q();
            final Call callNewCall = okHttpClientBuild.newCall(okHttpProtoRequest);
            cancellableContinuationImpl.s(new Function1<Throwable, Unit>() { // from class: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return Unit.f43263a;
                }

                public final void invoke(Throwable th) {
                    callNewCall.cancel();
                }
            });
            callNewCall.enqueue(new Callback() { // from class: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e2) {
                    Intrinsics.f(call, "call");
                    Intrinsics.f(e2, "e");
                    cancellableContinuationImpl.resumeWith(ResultKt.a(e2));
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    Intrinsics.f(call, "call");
                    Intrinsics.f(response, "response");
                    if (!response.isSuccessful()) {
                        cancellableContinuationImpl.resumeWith(ResultKt.a(new UnityAdsNetworkException("Network request failed with code " + response.code(), null, Integer.valueOf(response.code()), null, null, null, RefactoredOkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                        return;
                    }
                    try {
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody == null) {
                            cancellableContinuationImpl.resumeWith(ResultKt.a(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(response.code()), null, null, null, RefactoredOkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null)));
                            return;
                        }
                        CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl;
                        int iCode = response.code();
                        Map<String, List<String>> multimap = response.headers().toMultimap();
                        String url = response.request().url().getUrl();
                        byte[] byteArray = responseBodyBody.getDelegateSource().readByteArray();
                        String protocol = response.protocol().getProtocol();
                        Intrinsics.e(multimap, "toMultimap()");
                        Intrinsics.e(url, "toString()");
                        Intrinsics.e(protocol, "toString()");
                        cancellableContinuation.resumeWith(new HttpResponse(byteArray, iCode, multimap, url, protocol, RefactoredOkHttp3Client.NETWORK_CLIENT_OKHTTP, 0L, 64, null));
                    } catch (Exception e2) {
                        cancellableContinuationImpl.resumeWith(ResultKt.a(e2));
                    }
                }
            });
            Object objP = cancellableContinuationImpl.p();
            return objP == coroutineSingletons ? coroutineSingletons : objP;
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException("Network request timeout", null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException("Network request failed", null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        Intrinsics.f(request, "request");
        return (HttpResponse) BuildersKt.d(this.dispatchers.getIo(), new C35201(request, null));
    }
}
