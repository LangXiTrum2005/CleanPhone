package com.applovin.shadow.okhttp3;

import an.p;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.HttpMethod;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.f;
import xj.b0;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00019BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0014\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010'\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b\u0003\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b\t\u0010/R*\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0011\u00106\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b'\u00108¨\u0006:"}, d2 = {"Lcom/applovin/shadow/okhttp3/Request;", "", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "", "method", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "Lcom/applovin/shadow/okhttp3/RequestBody;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Lxn/m;Ljava/lang/String;Lxn/l;Lxn/u;Ljava/util/Map;)V", "name", "header", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/util/List;", ViewHierarchyConstants.TAG_KEY, "()Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/applovin/shadow/okhttp3/Request$Builder;", "newBuilder", "()Lcom/applovin/shadow/okhttp3/Request$Builder;", "-deprecated_url", "()Lcom/applovin/shadow/okhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lcom/applovin/shadow/okhttp3/Headers;", "-deprecated_body", "()Lcom/applovin/shadow/okhttp3/RequestBody;", "Lcom/applovin/shadow/okhttp3/CacheControl;", "-deprecated_cacheControl", "()Lcom/applovin/shadow/okhttp3/CacheControl;", "cacheControl", InAppPurchaseConstants.METHOD_TO_STRING, "Lcom/applovin/shadow/okhttp3/HttpUrl;", "()Lxn/m;", "Ljava/lang/String;", "Lcom/applovin/shadow/okhttp3/Headers;", "()Lxn/l;", "Lcom/applovin/shadow/okhttp3/RequestBody;", "()Lxn/u;", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "lazyCacheControl", "Lcom/applovin/shadow/okhttp3/CacheControl;", "", "isHttps", "()Z", "()Lxn/c;", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010 J!\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J/\u0010&\u001a\u00020\u0000\"\u0004\b\u0000\u0010*2\u000e\u0010,\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000+2\b\u0010&\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b&\u0010-R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010$\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0015\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR2\u0010D\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0004\u0012\u00020\u00010C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/applovin/shadow/okhttp3/Request$Builder;", "", "Lcom/applovin/shadow/okhttp3/Request;", "request", "<init>", "(Lxn/s;)V", "()V", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "(Lcom/applovin/shadow/okhttp3/HttpUrl;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "", "(Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "name", X3.i.X, "header", "(Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "addHeader", "removeHeader", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "(Lcom/applovin/shadow/okhttp3/Headers;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "Lcom/applovin/shadow/okhttp3/CacheControl;", "cacheControl", "(Lcom/applovin/shadow/okhttp3/CacheControl;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "get", "()Lcom/applovin/shadow/okhttp3/Request$Builder;", TtmlNode.TAG_HEAD, "Lcom/applovin/shadow/okhttp3/RequestBody;", "body", "post", "(Lcom/applovin/shadow/okhttp3/RequestBody;)Lcom/applovin/shadow/okhttp3/Request$Builder;", "delete", "put", "patch", "method", "(Ljava/lang/String;Lcom/applovin/shadow/okhttp3/RequestBody;)Lcom/applovin/shadow/okhttp3/Request$Builder;", ViewHierarchyConstants.TAG_KEY, "(Ljava/lang/Object;)Lcom/applovin/shadow/okhttp3/Request$Builder;", InAppPurchaseConstants.METHOD_BUILD, "()Lcom/applovin/shadow/okhttp3/Request;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/nf;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "getUrl$okhttp", "()Lxn/m;", "setUrl$okhttp", "(Lxn/m;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lh2/d;", "setHeaders$okhttp", "(Lh2/d;)V", "Lcom/applovin/shadow/okhttp3/RequestBody;", "getBody$okhttp", "()Lxn/u;", "setBody$okhttp", "(Lxn/u;)V", "", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = C0375hc.f28788a;
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            n.f(name, "name");
            n.f(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            n.f(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method(C0375hc.f28788a, null);
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
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

        public Builder method(String method, RequestBody body) {
            n.f(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(e.o("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(e.o("method ", method, " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public Builder patch(RequestBody body) {
            n.f(body, "body");
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            n.f(body, "body");
            return method(C0375hc.f28789b, body);
        }

        public Builder put(RequestBody body) {
            n.f(body, "body");
            return method("PUT", body);
        }

        public Builder removeHeader(String name) {
            n.f(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            n.f(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            n.f(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            n.f(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object tag) {
            return tag(Object.class, tag);
        }

        public Builder url(HttpUrl url) {
            n.f(url, "url");
            this.url = url;
            return this;
        }

        public Builder delete(RequestBody body) {
            return method("DELETE", body);
        }

        public <T> Builder tag(Class<? super T> type, T t10) {
            n.f(type, "type");
            if (t10 == null) {
                this.tags.remove(type);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T tCast = type.cast(t10);
            n.c(tCast);
            map.put(type, tCast);
            return this;
        }

        public Builder url(String url) {
            n.f(url, "url");
            if (p.p0(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = "http:".concat(strSubstring);
            } else if (p.p0(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = "https:".concat(strSubstring2);
            }
            return url(HttpUrl.INSTANCE.get(url));
        }

        public Builder(Request request) {
            LinkedHashMap linkedHashMapY;
            n.f(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                linkedHashMapY = new LinkedHashMap();
            } else {
                linkedHashMapY = b0.Y(request.getTags$okhttp());
            }
            this.tags = linkedHashMapY;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            n.f(url, "url");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = url.toString();
            n.e(string, "url.toString()");
            return url(companion.get(string));
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        n.f(url, "url");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m114deprecated_cacheControl() {
        return cacheControl();
    }

    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public final RequestBody body() {
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

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String name) {
        n.f(name, "name");
        return this.headers.get(name);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.getIsHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (f fVar : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    o.V();
                    throw null;
                }
                f fVar2 = fVar;
                String str = (String) fVar2.f53283a;
                String str2 = (String) fVar2.f53284b;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        String string = sb2.toString();
        n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String name) {
        n.f(name, "name");
        return this.headers.values(name);
    }

    public final <T> T tag(Class<? extends T> type) {
        n.f(type, "type");
        return type.cast(this.tags.get(type));
    }
}
