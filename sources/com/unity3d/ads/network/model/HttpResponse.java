package com.unity3d.ads.network.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wi.d;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/network/model/HttpResponse;", "", "body", "statusCode", "", "headers", "", "", "urlString", "(Ljava/lang/Object;ILjava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/lang/Object;", "getHeaders", "()Ljava/util/Map;", "getStatusCode", "()I", "getUrlString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, 14, null);
        n.f(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i10, map, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrlString() {
        return this.urlString;
    }

    public final HttpResponse copy(Object body, int statusCode, Map<String, ? extends Object> headers, String urlString) {
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        return new HttpResponse(body, statusCode, headers, urlString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return n.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && n.a(this.headers, httpResponse.headers) && n.a(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + ((this.headers.hashCode() + d.f(this.statusCode, this.body.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse(body=");
        sb2.append(this.body);
        sb2.append(", statusCode=");
        sb2.append(this.statusCode);
        sb2.append(", headers=");
        sb2.append(this.headers);
        sb2.append(", urlString=");
        return d.k(sb2, this.urlString, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10) {
        this(body, i10, null, null, 12, null);
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends Object> headers) {
        this(body, i10, headers, null, 8, null);
        n.f(body, "body");
        n.f(headers, "headers");
    }

    public HttpResponse(Object body, int i10, Map<String, ? extends Object> headers, String urlString) {
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, g gVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? w.f53867a : map, (i11 & 8) != 0 ? "" : str);
    }
}
