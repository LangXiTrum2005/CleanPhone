package com.applovin.shadow.okhttp3;

import androidx.core.app.NotificationCompat;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 M2\u00020\u0001:\u0002MNB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\bJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J9\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\bJ\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bC\u0010:J\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bF\u0010<J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bH\u0010AJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010A¨\u0006O"}, d2 = {"Lcom/applovin/shadow/okhttp3/EventListener;", "", "<init>", "()V", "Lcom/applovin/shadow/okhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lwj/r;", "callStart", "(Lcom/applovin/shadow/okhttp3/Call;)V", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "proxySelectStart", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", "dnsStart", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lcom/applovin/shadow/okhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/Handshake;)V", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocol", "connectEnd", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lcom/applovin/shadow/okhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lcom/applovin/shadow/okhttp3/Protocol;Ljava/io/IOException;)V", "Lcom/applovin/shadow/okhttp3/Connection;", "connection", "connectionAcquired", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lcom/applovin/shadow/okhttp3/Request;", "request", "requestHeadersEnd", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/Request;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lcom/applovin/shadow/okhttp3/Call;J)V", "requestFailed", "(Lcom/applovin/shadow/okhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "responseHeadersEnd", "(Lcom/applovin/shadow/okhttp3/Call;Lcom/applovin/shadow/okhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class EventListener {
    public static final EventListener NONE = new EventListener() { // from class: com.applovin.shadow.okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/applovin/shadow/okhttp3/EventListener$Factory;", "", "create", "Lcom/applovin/shadow/okhttp3/EventListener;", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/Call;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        n.f(call, "call");
        n.f(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        n.f(call, "call");
        n.f(response, "response");
    }

    public void cacheMiss(Call call) {
        n.f(call, "call");
    }

    public void callEnd(Call call) {
        n.f(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        n.f(call, "call");
        n.f(ioe, "ioe");
    }

    public void callStart(Call call) {
        n.f(call, "call");
    }

    public void canceled(Call call) {
        n.f(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        n.f(call, "call");
        n.f(inetSocketAddress, "inetSocketAddress");
        n.f(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        n.f(call, "call");
        n.f(inetSocketAddress, "inetSocketAddress");
        n.f(proxy, "proxy");
        n.f(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        n.f(call, "call");
        n.f(inetSocketAddress, "inetSocketAddress");
        n.f(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        n.f(call, "call");
        n.f(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        n.f(call, "call");
        n.f(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        n.f(call, "call");
        n.f(domainName, "domainName");
        n.f(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        n.f(call, "call");
        n.f(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        n.f(call, "call");
        n.f(url, "url");
        n.f(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        n.f(call, "call");
        n.f(url, "url");
    }

    public void requestBodyEnd(Call call, long byteCount) {
        n.f(call, "call");
    }

    public void requestBodyStart(Call call) {
        n.f(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        n.f(call, "call");
        n.f(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        n.f(call, "call");
        n.f(request, "request");
    }

    public void requestHeadersStart(Call call) {
        n.f(call, "call");
    }

    public void responseBodyEnd(Call call, long byteCount) {
        n.f(call, "call");
    }

    public void responseBodyStart(Call call) {
        n.f(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        n.f(call, "call");
        n.f(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        n.f(call, "call");
        n.f(response, "response");
    }

    public void responseHeadersStart(Call call) {
        n.f(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        n.f(call, "call");
        n.f(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        n.f(call, "call");
    }

    public void secureConnectStart(Call call) {
        n.f(call, "call");
    }
}
