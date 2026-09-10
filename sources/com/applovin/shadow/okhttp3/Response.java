package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Source;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.Ve;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wi.d;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001_B}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010&J%\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010+J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b5\u00106J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b7\u00106J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b8\u00106J\u0013\u0010:\u001a\b\u0012\u0004\u0012\u0002090%¢\u0006\u0004\b:\u0010;J\u000f\u0010?\u001a\u00020<H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\bB\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\b\u0003\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\b\u0005\u0010JR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\b\u0007\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\b\t\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\b\u000b\u0010NR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\b\r\u0010PR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\b\u000f\u0010RR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\b\u0010\u0010TR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\b\u0011\u0010TR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\b\u0012\u0010TR\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\b\u0014\u0010AR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\b\u0015\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\b\u0017\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0011\u0010[\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010]\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b]\u0010\\R\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b?\u0010^¨\u0006`"}, d2 = {"Lcom/applovin/shadow/okhttp3/Response;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okhttp3/Request;", "request", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocol", "", "message", "", "code", "Lcom/applovin/shadow/okhttp3/Handshake;", "handshake", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "exchange", "<init>", "(Lxn/s;Lxn/r;Ljava/lang/String;ILxn/k;Lxn/l;Lxn/y;Lxn/w;Lxn/w;Lxn/w;JJLbo/e;)V", "-deprecated_request", "()Lcom/applovin/shadow/okhttp3/Request;", "-deprecated_protocol", "()Lcom/applovin/shadow/okhttp3/Protocol;", "-deprecated_code", "()I", "-deprecated_message", "()Ljava/lang/String;", "-deprecated_handshake", "()Lcom/applovin/shadow/okhttp3/Handshake;", "name", "", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "header", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lcom/applovin/shadow/okhttp3/Headers;", "trailers", "byteCount", "peekBody", "(J)Lcom/applovin/shadow/okhttp3/ResponseBody;", "-deprecated_body", "()Lcom/applovin/shadow/okhttp3/ResponseBody;", "Lcom/applovin/shadow/okhttp3/Response$Builder;", "newBuilder", "()Lcom/applovin/shadow/okhttp3/Response$Builder;", "-deprecated_networkResponse", "()Lcom/applovin/shadow/okhttp3/Response;", "-deprecated_cacheResponse", "-deprecated_priorResponse", "Lcom/applovin/shadow/okhttp3/Challenge;", "challenges", "()Ljava/util/List;", "Lcom/applovin/shadow/okhttp3/CacheControl;", "-deprecated_cacheControl", "()Lcom/applovin/shadow/okhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "-deprecated_receivedResponseAtMillis", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", InAppPurchaseConstants.METHOD_TO_STRING, "Lcom/applovin/shadow/okhttp3/Request;", "()Lxn/s;", "Lcom/applovin/shadow/okhttp3/Protocol;", "()Lxn/r;", "Ljava/lang/String;", "I", "Lcom/applovin/shadow/okhttp3/Handshake;", "()Lxn/k;", "Lcom/applovin/shadow/okhttp3/Headers;", "()Lxn/l;", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "()Lxn/y;", "Lcom/applovin/shadow/okhttp3/Response;", "()Lxn/w;", "J", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "()Lbo/e;", "lazyCacheControl", "Lcom/applovin/shadow/okhttp3/CacheControl;", "", "isSuccessful", "()Z", "isRedirect", "()Lxn/c;", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String message, int i10, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange) {
        n.f(request, "request");
        n.f(protocol, "protocol");
        n.f(message, "message");
        n.f(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m119deprecated_cacheControl() {
        return cacheControl();
    }

    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return v.f53866a;
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    /* JADX INFO: renamed from: exchange, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String name) {
        n.f(name, "name");
        return header$default(this, name, null, 2, null);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i10 = this.code;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long byteCount) throws IOException {
        ResponseBody responseBody = this.body;
        n.c(responseBody);
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(byteCount);
        buffer.write((Source) bufferedSourcePeek, Math.min(byteCount, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.INSTANCE.create(buffer, this.body.contentType(), buffer.size());
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    public final String header(String name, String defaultValue) {
        n.f(name, "name");
        String str = this.headers.get(name);
        return str == null ? defaultValue : str;
    }

    public final List<String> headers(String name) {
        n.f(name, "name");
        return this.headers.values(name);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b \b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010#J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010/\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020,2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b4\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u001d\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u0005R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010Z\u001a\u0004\b^\u0010\\\"\u0004\b_\u0010\u0005R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010Z\u001a\u0004\b`\u0010\\\"\u0004\ba\u0010\u0005R\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010)\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010b\u001a\u0004\bg\u0010d\"\u0004\bh\u0010fR$\u0010i\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006o"}, d2 = {"Lcom/applovin/shadow/okhttp3/Response$Builder;", "", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "<init>", "(Lxn/w;)V", "()V", "Lcom/applovin/shadow/okhttp3/Request;", "request", "(Lcom/applovin/shadow/okhttp3/Request;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocol", "(Lcom/applovin/shadow/okhttp3/Protocol;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "", "code", "(I)Lcom/applovin/shadow/okhttp3/Response$Builder;", "", "message", "(Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/Handshake;", "handshake", "(Lcom/applovin/shadow/okhttp3/Handshake;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "name", X3.i.X, "header", "(Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "addHeader", "removeHeader", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "(Lcom/applovin/shadow/okhttp3/Headers;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "body", "(Lcom/applovin/shadow/okhttp3/ResponseBody;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "networkResponse", "(Lcom/applovin/shadow/okhttp3/Response;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "(J)Lcom/applovin/shadow/okhttp3/Response$Builder;", "receivedResponseAtMillis", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "deferredTrailers", "Lwj/r;", "initExchange$okhttp", "(Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;)V", "initExchange", InAppPurchaseConstants.METHOD_BUILD, "()Lcom/applovin/shadow/okhttp3/Response;", "checkSupportResponse", "(Ljava/lang/String;Lcom/applovin/shadow/okhttp3/Response;)V", "checkPriorResponse", "(Lcom/applovin/shadow/okhttp3/Response;)V", "Lcom/applovin/shadow/okhttp3/Request;", "getRequest$okhttp", "()Lxn/s;", "setRequest$okhttp", "(Lxn/s;)V", "Lcom/applovin/shadow/okhttp3/Protocol;", "getProtocol$okhttp", "()Lxn/r;", "setProtocol$okhttp", "(Lxn/r;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lcom/applovin/shadow/okhttp3/Handshake;", "getHandshake$okhttp", "()Lxn/k;", "setHandshake$okhttp", "(Lxn/k;)V", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lh2/d;", "setHeaders$okhttp", "(Lh2/d;)V", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "getBody$okhttp", "()Lxn/y;", "setBody$okhttp", "(Lxn/y;)V", "Lcom/applovin/shadow/okhttp3/Response;", "getNetworkResponse$okhttp", "()Lxn/w;", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lbo/e;", "setExchange$okhttp", "(Lbo/e;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String name, Response response) {
            if (response != null) {
                if (response.body() != null) {
                    throw new IllegalArgumentException(d.h(name, ".body != null").toString());
                }
                if (response.networkResponse() != null) {
                    throw new IllegalArgumentException(d.h(name, ".networkResponse != null").toString());
                }
                if (response.cacheResponse() != null) {
                    throw new IllegalArgumentException(d.h(name, ".cacheResponse != null").toString());
                }
                if (response.priorResponse() != null) {
                    throw new IllegalArgumentException(d.h(name, ".priorResponse != null").toString());
                }
            }
        }

        public Builder addHeader(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Builder body(ResponseBody body) {
            this.body = body;
            return this;
        }

        public Response build() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public Builder cacheResponse(Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final ResponseBody getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: getCacheResponse$okhttp, reason: from getter */
        public final Response getCacheResponse() {
            return this.cacheResponse;
        }

        /* JADX INFO: renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        /* JADX INFO: renamed from: getHandshake$okhttp, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: getMessage$okhttp, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final Response getNetworkResponse() {
            return this.networkResponse;
        }

        /* JADX INFO: renamed from: getPriorResponse$okhttp, reason: from getter */
        public final Response getPriorResponse() {
            return this.priorResponse;
        }

        /* JADX INFO: renamed from: getProtocol$okhttp, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        /* JADX INFO: renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            n.f(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange deferredTrailers) {
            n.f(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public Builder message(String message) {
            n.f(message, "message");
            this.message = message;
            return this;
        }

        public Builder networkResponse(Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public Builder priorResponse(Response priorResponse) {
            checkPriorResponse(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            n.f(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public Builder removeHeader(String name) {
            n.f(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public Builder request(Request request) {
            n.f(request, "request");
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i10) {
            this.code = i10;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            n.f(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j10) {
            this.receivedResponseAtMillis = j10;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j10) {
            this.sentRequestAtMillis = j10;
        }

        public Builder(Response response) {
            n.f(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
        }
    }
}
