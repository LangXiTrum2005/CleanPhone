package com.applovin.shadow.okhttp3.internal.http;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Interceptor;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.RequestBody;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okhttp3.Route;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.connection.RouteException;
import com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.ironsource.C0375hc;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&¨\u0006("}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lcom/applovin/shadow/okhttp3/Interceptor;", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "client", "<init>", "(Lxn/q;)V", "Ljava/io/IOException;", "e", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/Request;", "userRequest", "", "requestSendStarted", "recover", "(Ljava/io/IOException;Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;Lcom/applovin/shadow/okhttp3/Request;Z)Z", "requestIsOneShot", "(Ljava/io/IOException;Lcom/applovin/shadow/okhttp3/Request;)Z", "isRecoverable", "(Ljava/io/IOException;Z)Z", "Lcom/applovin/shadow/okhttp3/Response;", "userResponse", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "exchange", "followUpRequest", "(Lcom/applovin/shadow/okhttp3/Response;Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;)Lcom/applovin/shadow/okhttp3/Request;", "", "method", "buildRedirectRequest", "(Lcom/applovin/shadow/okhttp3/Response;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Request;", "", "defaultDelay", "retryAfter", "(Lcom/applovin/shadow/okhttp3/Response;I)I", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "chain", "intercept", "(Lcom/applovin/shadow/okhttp3/Interceptor$Chain;)Lcom/applovin/shadow/okhttp3/Response;", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        n.f(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String strHeader$default;
        HttpUrl httpUrlResolve;
        if (!this.client.followRedirects() || (strHeader$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (httpUrlResolve = userResponse.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!n.a(httpUrlResolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int iCode = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean z10 = httpMethod.redirectsWithBody(method) || iCode == 308 || iCode == 307;
            if (!httpMethod.redirectsToGet(method) || iCode == 308 || iCode == 307) {
                builderNewBuilder.method(method, z10 ? userResponse.request().body() : null);
            } else {
                builderNewBuilder.method(C0375hc.f28788a, null);
            }
            if (!z10) {
                builderNewBuilder.removeHeader("Transfer-Encoding");
                builderNewBuilder.removeHeader("Content-Length");
                builderNewBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(userResponse.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
        RealConnection connection;
        Route route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int iCode = userResponse.code();
        String strMethod = userResponse.request().method();
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return this.client.authenticator().authenticate(route, userResponse);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody = userResponse.request().body();
                if ((requestBodyBody != null && requestBodyBody.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (iCode == 503) {
                Response responsePriorResponse = userResponse.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (iCode == 407) {
                n.c(route);
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iCode == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody requestBodyBody2 = userResponse.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    return null;
                }
                Response responsePriorResponse2 = userResponse.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, strMethod);
    }

    private final boolean isRecoverable(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        if (e10 instanceof InterruptedIOException) {
            return (e10 instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException e10, RealCall call, Request userRequest, boolean requestSendStarted) {
        if (this.client.retryOnConnectionFailure()) {
            return !(requestSendStarted && requestIsOneShot(e10, userRequest)) && isRecoverable(e10, requestSendStarted) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e10, Request userRequest) {
        RequestBody requestBodyBody = userRequest.body();
        return (requestBodyBody != null && requestBodyBody.isOneShot()) || (e10 instanceof FileNotFoundException);
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String strHeader$default = Response.header$default(userResponse, CommonGatewayClient.HEADER_RETRY_AFTER, null, 2, null);
        if (strHeader$default == null) {
            return defaultDelay;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        n.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strHeader$default).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        n.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response responseProceed;
        n.f(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        List listD0 = v.f53866a;
        int i10 = 0;
        Response response = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z10);
                try {
                    if (call.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        try {
                            responseProceed = realInterceptorChain.proceed(request);
                        } catch (RouteException e10) {
                            if (!recover(e10.getLastConnectException(), call, request, false)) {
                                throw Util.withSuppressed(e10.getFirstConnectException(), listD0);
                            }
                            listD0 = xj.n.D0(listD0, e10.getFirstConnectException());
                            call.exitNetworkInterceptorExchange$okhttp(true);
                            z10 = false;
                        }
                    } catch (IOException e11) {
                        if (!recover(e11, call, request, !(e11 instanceof ConnectionShutdownException))) {
                            throw Util.withSuppressed(e11, listD0);
                        }
                        listD0 = xj.n.D0(listD0, e11);
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        z10 = false;
                    }
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    z10 = false;
                } catch (Throwable th2) {
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    throw th2;
                }
            }
            if (response != null) {
                responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
            }
            response = responseProceed;
            Exchange interceptorScopedExchange = call.getInterceptorScopedExchange();
            Request requestFollowUpRequest = followUpRequest(response, interceptorScopedExchange);
            if (requestFollowUpRequest == null) {
                if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                    call.timeoutEarlyExit();
                }
                call.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            RequestBody requestBodyBody = requestFollowUpRequest.body();
            if (requestBodyBody != null && requestBodyBody.isOneShot()) {
                call.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                Util.closeQuietly(responseBodyBody);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i10);
            }
            call.exitNetworkInterceptorExchange$okhttp(true);
            request = requestFollowUpRequest;
        }
    }
}
