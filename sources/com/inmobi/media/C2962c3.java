package com.inmobi.media;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2962c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f23478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23479b;

    public C2962c3(Interceptor[] interceptorArr, Dispatcher dispatcher, C3055he timeoutConfig) {
        Intrinsics.f(dispatcher, "dispatcher");
        Intrinsics.f(timeoutConfig, "timeoutConfig");
        this.f23479b = timeoutConfig.f23672c;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (interceptorArr != null) {
            for (Interceptor interceptor : interceptorArr) {
                builder.addInterceptor(interceptor);
            }
        }
        builder.addInterceptor(new C3340zc());
        builder.addNetworkInterceptor(new C3176p7());
        builder.protocols(CollectionsKt.L(Protocol.HTTP_2, Protocol.HTTP_1_1));
        builder.retryOnConnectionFailure(false);
        builder.dispatcher(dispatcher);
        long j = timeoutConfig.f23670a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j, timeUnit);
        builder.readTimeout(timeoutConfig.f23671b, timeUnit);
        builder.callTimeout(timeoutConfig.f23672c, timeUnit);
        OkHttpClient okHttpClientBuild = builder.build();
        Intrinsics.e(okHttpClientBuild, "build(...)");
        this.f23478a = okHttpClientBuild;
    }

    public final O9 a(OkHttpClient okHttpClient, Request request, String str) throws Throwable {
        ByteString byteStringP;
        O9 c3173p4;
        MediaType mediaType;
        Response response = null;
        mediaType = null;
        String mediaType2 = null;
        response = null;
        response = null;
        response = null;
        response = null;
        response = null;
        Response response2 = null;
        Response response3 = null;
        Response response4 = null;
        Response response5 = null;
        try {
            try {
                ExecutorService executorService = okHttpClient.dispatcher().executorService();
                Intrinsics.e(executorService, "executorService(...)");
                try {
                    Response response6 = (Response) He.a(executorService, this.f23479b, TimeUnit.SECONDS, new A.W(0, okHttpClient, request));
                    try {
                        int iCode = response6.code();
                        ResponseBody responseBodyBody = response6.body();
                        if (responseBodyBody != null) {
                            byte[] bArrBytes = responseBodyBody.bytes();
                            byteStringP = ByteString.p(Arrays.copyOf(bArrBytes, bArrBytes.length));
                        } else {
                            byteStringP = ByteString.e0;
                        }
                        Map<String, List<String>> multimap = response6.headers().toMultimap();
                        ResponseBody responseBodyBody2 = response6.body();
                        long contentLength = responseBodyBody2 != null ? responseBodyBody2.getContentLength() : 0L;
                        ResponseBody responseBodyBody3 = response6.body();
                        if (responseBodyBody3 != null && (mediaType = responseBodyBody3.get$contentType()) != null) {
                            mediaType2 = mediaType.getMediaType();
                        }
                        long jReceivedResponseAtMillis = response6.receivedResponseAtMillis() - response6.sentRequestAtMillis();
                        long j = 0;
                        if (jReceivedResponseAtMillis >= 0) {
                            j = jReceivedResponseAtMillis;
                        }
                        Intrinsics.c(multimap);
                        K9 k9 = new K9(j, multimap, (int) contentLength, mediaType2);
                        if (He.a(response6)) {
                            Intrinsics.c(byteStringP);
                            c3173p4 = new Q9(str, iCode, byteStringP, k9);
                        } else {
                            EnumC3125m4.f23803b.getClass();
                            c3173p4 = new C3173p4(str, C3093k4.a(iCode));
                        }
                        response6.close();
                        return c3173p4;
                    } catch (MalformedURLException unused) {
                        response2 = response6;
                        C3173p4 c3173p5 = new C3173p4(str, EnumC3125m4.f23806h);
                        if (response2 != null) {
                            response2.close();
                        }
                        return c3173p5;
                    } catch (SocketTimeoutException unused2) {
                        response3 = response6;
                        C3173p4 c3173p6 = new C3173p4(str, EnumC3125m4.f23807i);
                        if (response3 != null) {
                            response3.close();
                        }
                        return c3173p6;
                    } catch (IOException unused3) {
                        response4 = response6;
                        C3173p4 c3173p7 = new C3173p4(str, EnumC3125m4.f23805e);
                        if (response4 != null) {
                            response4.close();
                        }
                        return c3173p7;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception unused4) {
                        response5 = response6;
                        C3173p4 c3173p8 = new C3173p4(str, EnumC3125m4.d);
                        if (response5 != null) {
                            response5.close();
                        }
                        return c3173p8;
                    } catch (Throwable th) {
                        th = th;
                        response = response6;
                        if (response != null) {
                            response.close();
                        }
                        throw th;
                    }
                } catch (MalformedURLException unused5) {
                } catch (SocketTimeoutException unused6) {
                } catch (IOException unused7) {
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception unused8) {
                }
            } catch (MalformedURLException unused9) {
            } catch (SocketTimeoutException unused10) {
            } catch (IOException unused11) {
            } catch (CancellationException e4) {
                throw e4;
            } catch (Exception unused12) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final Response a(OkHttpClient client, Request okHttpRequest) {
        Intrinsics.f(client, "$client");
        Intrinsics.f(okHttpRequest, "$okHttpRequest");
        return client.newCall(okHttpRequest).execute();
    }
}
