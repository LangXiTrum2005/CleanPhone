package com.unity3d.services.core.network.model;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wi.d;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0001OBÓ\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010¢\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0016HÆ\u0003J\t\u0010>\u001a\u00020\u0018HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001b\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\tHÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102JÜ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00162\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$¨\u0006P"}, d2 = {"Lcom/unity3d/services/core/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/services/core/network/model/RequestType;", "body", "headers", "", "", "parameters", "bodyType", "Lcom/unity3d/services/core/network/model/BodyType;", "scheme", "port", "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "isProtobuf", "", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "downloadDestination", "Ljava/io/File;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)V", "getBaseURL", "()Ljava/lang/String;", "getBody", "()Ljava/lang/Object;", "getBodyType", "()Lcom/unity3d/services/core/network/model/BodyType;", "getCallTimeout", "()I", "getConnectTimeout", "getDownloadDestination", "()Ljava/io/File;", "getHeaders", "()Ljava/util/Map;", "()Z", "getMethod", "()Lcom/unity3d/services/core/network/model/RequestType;", "getOperationType", "()Lcom/unity3d/ads/core/data/model/OperationType;", "getParameters", "getPath", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPriority", "getReadTimeout", "getScheme", "getWriteTimeout", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)Lcom/unity3d/services/core/network/model/HttpRequest;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class HttpRequest {
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        n.f(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, Object obj2) {
        int i16;
        File file2;
        String str4 = (i15 & 1) != 0 ? httpRequest.baseURL : str;
        String str5 = (i15 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType2 = (i15 & 4) != 0 ? httpRequest.method : requestType;
        Object obj3 = (i15 & 8) != 0 ? httpRequest.body : obj;
        Map map3 = (i15 & 16) != 0 ? httpRequest.headers : map;
        Map map4 = (i15 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType2 = (i15 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str6 = (i15 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num2 = (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? httpRequest.port : num;
        int i17 = (i15 & 512) != 0 ? httpRequest.connectTimeout : i10;
        int i18 = (i15 & 1024) != 0 ? httpRequest.readTimeout : i11;
        int i19 = (i15 & a.f29616n) != 0 ? httpRequest.writeTimeout : i12;
        int i20 = (i15 & 4096) != 0 ? httpRequest.callTimeout : i13;
        boolean z11 = (i15 & Segment.SIZE) != 0 ? httpRequest.isProtobuf : z10;
        String str7 = str4;
        OperationType operationType2 = (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i15 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            file2 = file3;
            i16 = httpRequest.priority;
        } else {
            i16 = i14;
            file2 = file3;
        }
        return httpRequest.copy(str7, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i17, i18, i19, i20, z11, operationType2, file2, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsProtobuf() {
        return this.isProtobuf;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final OperationType getOperationType() {
        return this.operationType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getPriority() {
        return this.priority;
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
    public final Object getBody() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout, boolean isProtobuf, OperationType operationType, File downloadDestination, int priority) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, bodyType, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout, isProtobuf, operationType, downloadDestination, priority);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return n.a(this.baseURL, httpRequest.baseURL) && n.a(this.path, httpRequest.path) && this.method == httpRequest.method && n.a(this.body, httpRequest.body) && n.a(this.headers, httpRequest.headers) && n.a(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && n.a(this.scheme, httpRequest.scheme) && n.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && n.a(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    public int hashCode() {
        int iHashCode = (this.method.hashCode() + u.e(this.baseURL.hashCode() * 31, 31, this.path)) * 31;
        Object obj = this.body;
        int iE = u.e((this.bodyType.hashCode() + ((this.parameters.hashCode() + ((this.headers.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.scheme);
        Integer num = this.port;
        int iF = d.f(this.callTimeout, d.f(this.writeTimeout, d.f(this.readTimeout, d.f(this.connectTimeout, (iE + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        boolean z10 = this.isProtobuf;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int iHashCode2 = (this.operationType.hashCode() + ((iF + r2) * 31)) * 31;
        File file = this.downloadDestination;
        return Integer.hashCode(this.priority) + ((iHashCode2 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
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
        sb2.append(", bodyType=");
        sb2.append(this.bodyType);
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
        sb2.append(this.callTimeout);
        sb2.append(", isProtobuf=");
        sb2.append(this.isProtobuf);
        sb2.append(", operationType=");
        sb2.append(this.operationType);
        sb2.append(", downloadDestination=");
        sb2.append(this.downloadDestination);
        sb2.append(", priority=");
        return u.g(sb2, this.priority, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, 0, 0, 0, false, null, null, 0, 130048, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, 0, 0, false, null, null, 0, 129024, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, 0, false, null, null, 0, 126976, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, false, null, null, 0, 122880, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, null, null, 0, 114688, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, null, 0, 98304, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, 0, C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z10;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, g gVar) {
        String str4 = (i15 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i15 & 4) != 0 ? RequestType.GET : requestType;
        Object obj2 = (i15 & 8) != 0 ? null : obj;
        int i16 = i15 & 16;
        Map map3 = w.f53867a;
        this(str, str4, requestType2, obj2, i16 != 0 ? map3 : map, (i15 & 32) == 0 ? map2 : map3, (i15 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i15 & 128) != 0 ? "https" : str3, (i15 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num, (i15 & 512) != 0 ? 30000 : i10, (i15 & 1024) != 0 ? 30000 : i11, (i15 & a.f29616n) != 0 ? 30000 : i12, (i15 & 4096) == 0 ? i13 : 30000, (i15 & Segment.SIZE) != 0 ? false : z10, (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? OperationType.UNKNOWN : operationType, (i15 & 32768) != 0 ? null : file, (i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : i14);
    }
}
