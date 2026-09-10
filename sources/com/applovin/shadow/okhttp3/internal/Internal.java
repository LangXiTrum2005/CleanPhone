package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "currentTimeMillis", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "", "setCookie", "Lcom/applovin/shadow/okhttp3/Cookie;", "parseCookie", "(JLcom/applovin/shadow/okhttp3/HttpUrl;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Cookie;", "cookie", "", "forObsoleteRfc2965", "cookieToString", "(Lcom/applovin/shadow/okhttp3/Cookie;Z)Ljava/lang/String;", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "builder", "line", "addHeaderLenient", "(Lcom/applovin/shadow/okhttp3/Headers$Builder;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Headers$Builder;", "name", X3.i.X, "(Lcom/applovin/shadow/okhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Headers$Builder;", "Lcom/applovin/shadow/okhttp3/Cache;", "cache", "Lcom/applovin/shadow/okhttp3/Request;", "request", "Lcom/applovin/shadow/okhttp3/Response;", "cacheGet", "(Lcom/applovin/shadow/okhttp3/Cache;Lcom/applovin/shadow/okhttp3/Request;)Lcom/applovin/shadow/okhttp3/Response;", "Lcom/applovin/shadow/okhttp3/ConnectionSpec;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lwj/r;", "applyConnectionSpec", "(Lcom/applovin/shadow/okhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        n.f(builder, "builder");
        n.f(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z10) {
        n.f(connectionSpec, "connectionSpec");
        n.f(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z10);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        n.f(cache, "cache");
        n.f(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        n.f(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final Cookie parseCookie(long j10, HttpUrl url, String setCookie) {
        n.f(url, "url");
        n.f(setCookie, "setCookie");
        return Cookie.INSTANCE.parse$okhttp(j10, url, setCookie);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        n.f(builder, "builder");
        n.f(name, "name");
        n.f(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
