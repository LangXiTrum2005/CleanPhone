package com.unity3d.ads.network.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.mediationsdk.metadata.a;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wi.d;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\u009d\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u001b\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\nHÆ\u0003J\u0015\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00103\u001a\u00020\u000fHÆ\u0003J¦\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u000fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001a¨\u0006<"}, d2 = {"Lcom/unity3d/ads/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/ads/network/model/RequestType;", "body", "Lcom/unity3d/ads/network/model/HttpBody;", "headers", "", "", "parameters", "scheme", "port", "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/network/model/RequestType;Lcom/unity3d/ads/network/model/HttpBody;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;IIII)V", "getBaseURL", "()Ljava/lang/String;", "getBody", "()Lcom/unity3d/ads/network/model/HttpBody;", "getCallTimeout", "()I", "getConnectTimeout", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Lcom/unity3d/ads/network/model/RequestType;", "getParameters", "getPath", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReadTimeout", "getScheme", "getWriteTimeout", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/network/model/RequestType;Lcom/unity3d/ads/network/model/HttpBody;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;IIII)Lcom/unity3d/ads/network/model/HttpRequest;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class HttpRequest {
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        n.f(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i14 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i14 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i14 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i14 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i14 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i14 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i14 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i10 = httpRequest.connectTimeout;
        }
        if ((i14 & 512) != 0) {
            i11 = httpRequest.readTimeout;
        }
        if ((i14 & 1024) != 0) {
            i12 = httpRequest.writeTimeout;
        }
        if ((i14 & a.f29616n) != 0) {
            i13 = httpRequest.callTimeout;
        }
        int i15 = i12;
        int i16 = i13;
        int i17 = i10;
        int i18 = i11;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i17, i18, i15, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RequestType getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HttpBody getBody() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return n.a(this.baseURL, httpRequest.baseURL) && n.a(this.path, httpRequest.path) && this.method == httpRequest.method && n.a(this.body, httpRequest.body) && n.a(this.headers, httpRequest.headers) && n.a(this.parameters, httpRequest.parameters) && n.a(this.scheme, httpRequest.scheme) && n.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iE = u.e((this.parameters.hashCode() + ((this.headers.hashCode() + ((this.body.hashCode() + ((this.method.hashCode() + u.e(this.baseURL.hashCode() * 31, 31, this.path)) * 31)) * 31)) * 31)) * 31, 31, this.scheme);
        Integer num = this.port;
        return Integer.hashCode(this.callTimeout) + d.f(this.writeTimeout, d.f(this.readTimeout, d.f(this.connectTimeout, (iE + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest(baseURL=");
        sb2.append(this.baseURL);
        sb2.append(", path=");
        sb2.append(this.path);
        sb2.append(", method=");
        sb2.append(this.method);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", scheme=");
        sb2.append(this.scheme);
        sb2.append(", port=");
        sb2.append(this.port);
        sb2.append(", connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", writeTimeout=");
        sb2.append(this.writeTimeout);
        sb2.append(", callTimeout=");
        return u.g(sb2, this.callTimeout, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, Utf8.MASK_2BYTES, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, 0, 0, 0, 3584, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, 0, 0, 3072, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, 0, a.f29616n, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, g gVar) {
        String str4 = (i14 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i14 & 4) != 0 ? RequestType.GET : requestType;
        HttpBody httpBody2 = (i14 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody;
        int i15 = i14 & 16;
        Map map3 = w.f53867a;
        this(str, str4, requestType2, httpBody2, i15 != 0 ? map3 : map, (i14 & 32) == 0 ? map2 : map3, (i14 & 64) != 0 ? "https" : str3, (i14 & 128) != 0 ? null : num, (i14 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 30000 : i10, (i14 & 512) != 0 ? 30000 : i11, (i14 & 1024) != 0 ? 30000 : i12, (i14 & a.f29616n) != 0 ? 30000 : i13);
    }
}
