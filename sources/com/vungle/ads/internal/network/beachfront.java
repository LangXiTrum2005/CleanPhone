package com.vungle.ads.internal.network;

import com.vungle.ads.internal.util.LogEntry;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TpatRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 ,2\u00020\u0001:\u0002-.Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/vungle/ads/internal/network/beachfront;", "", "", "url", "Lcom/vungle/ads/internal/network/HttpMethod;", "method", "", "headers", "body", "", "priorityRetry", "", "priorityRetryCount", "regularRetry", "regularRetryCount", "tpatKey", "Lcom/vungle/ads/internal/util/kowloon;", "logEntry", "<init>", "(Ljava/lang/String;Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;IZILjava/lang/String;Lcom/vungle/ads/internal/util/kowloon;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lcom/vungle/ads/internal/network/HttpMethod;", "getMethod", "()Lcom/vungle/ads/internal/network/HttpMethod;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "getBody", "Ljava/lang/Boolean;", "getPriorityRetry", "()Ljava/lang/Boolean;", "I", "getPriorityRetryCount", "()I", "Z", "getRegularRetry", "()Z", "getRegularRetryCount", "getTpatKey", "Lcom/vungle/ads/internal/util/kowloon;", "getLogEntry", "()Lcom/vungle/ads/internal/util/kowloon;", "Companion", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class beachfront {
    private static final int PRIORITY_MAX_RETRY_COUNT = 3;
    private static final int REGULAR_MAX_RETRY_COUNT = 5;
    private final String body;
    private final Map<String, String> headers;
    private final LogEntry logEntry;
    private final HttpMethod method;
    private final Boolean priorityRetry;
    private final int priorityRetryCount;
    private final boolean regularRetry;
    private final int regularRetryCount;
    private final String tpatKey;
    private final String url;

    /* JADX INFO: compiled from: TpatRequest.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/network/beachfront$attabal;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "get", "()Lcom/vungle/ads/internal/network/beachfront$attabal;", "post", "Lcom/vungle/ads/internal/network/HttpMethod;", "method", "(Lcom/vungle/ads/internal/network/HttpMethod;)Lcom/vungle/ads/internal/network/beachfront$attabal;", "", "headers", "(Ljava/util/Map;)Lcom/vungle/ads/internal/network/beachfront$attabal;", "body", "(Ljava/lang/String;)Lcom/vungle/ads/internal/network/beachfront$attabal;", "", "priorityRetry", "(Z)Lcom/vungle/ads/internal/network/beachfront$attabal;", "", "priorityRetryCount", "(I)Lcom/vungle/ads/internal/network/beachfront$attabal;", "regularRetry", "regularRetryCount", "Lcom/vungle/ads/internal/util/kowloon;", "logEntry", "withLogEntry", "(Lcom/vungle/ads/internal/util/kowloon;)Lcom/vungle/ads/internal/network/beachfront$attabal;", "tpatKey", "Lcom/vungle/ads/internal/network/beachfront;", "build", "()Lcom/vungle/ads/internal/network/beachfront;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lcom/vungle/ads/internal/network/HttpMethod;", "Ljava/util/Map;", "Ljava/lang/Boolean;", "I", "Z", "Lcom/vungle/ads/internal/util/kowloon;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class attabal {
        private String body;
        private Map<String, String> headers;
        private LogEntry logEntry;
        private HttpMethod method;
        private Boolean priorityRetry;
        private int priorityRetryCount;
        private boolean regularRetry;
        private int regularRetryCount;
        private String tpatKey;
        private final String url;

        public attabal(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.method = HttpMethod.GET;
            this.priorityRetryCount = 3;
            this.regularRetry = true;
            this.regularRetryCount = 5;
        }

        public final attabal body(String body) {
            this.body = body;
            return this;
        }

        public final beachfront build() {
            return new beachfront(this.url, this.method, this.headers, this.body, this.priorityRetry, this.priorityRetryCount, this.regularRetry, this.regularRetryCount, this.tpatKey, this.logEntry, null);
        }

        public final attabal get() {
            this.method = HttpMethod.GET;
            return this;
        }

        public final String getUrl() {
            return this.url;
        }

        public final attabal headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public final attabal method(HttpMethod method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        public final attabal post() {
            this.method = HttpMethod.POST;
            return this;
        }

        public final attabal priorityRetry(boolean priorityRetry) {
            this.priorityRetry = Boolean.valueOf(priorityRetry);
            return this;
        }

        public final attabal priorityRetryCount(int priorityRetryCount) {
            this.priorityRetryCount = priorityRetryCount;
            return this;
        }

        public final attabal regularRetry(boolean regularRetry) {
            this.regularRetry = regularRetry;
            return this;
        }

        public final attabal regularRetryCount(int regularRetryCount) {
            this.regularRetryCount = regularRetryCount;
            return this;
        }

        public final attabal tpatKey(String tpatKey) {
            this.tpatKey = tpatKey;
            return this;
        }

        public final attabal withLogEntry(LogEntry logEntry) {
            this.logEntry = logEntry;
            return this;
        }
    }

    public /* synthetic */ beachfront(String str, HttpMethod httpMethod, Map map, String str2, Boolean bool, int i, boolean z, int i2, String str3, LogEntry logEntry, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, httpMethod, map, str2, bool, i, z, i2, str3, logEntry);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Boolean getPriorityRetry() {
        return this.priorityRetry;
    }

    public final int getPriorityRetryCount() {
        return this.priorityRetryCount;
    }

    public final boolean getRegularRetry() {
        return this.regularRetry;
    }

    public final int getRegularRetryCount() {
        return this.regularRetryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final String getUrl() {
        return this.url;
    }

    private beachfront(String str, HttpMethod httpMethod, Map<String, String> map, String str2, Boolean bool, int i, boolean z, int i2, String str3, LogEntry logEntry) {
        this.url = str;
        this.method = httpMethod;
        this.headers = map;
        this.body = str2;
        this.priorityRetry = bool;
        this.priorityRetryCount = i;
        this.regularRetry = z;
        this.regularRetryCount = i2;
        this.tpatKey = str3;
        this.logEntry = logEntry;
    }
}
