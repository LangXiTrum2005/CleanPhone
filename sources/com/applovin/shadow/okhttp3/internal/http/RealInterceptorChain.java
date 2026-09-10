package com.applovin.shadow.okhttp3.internal.http;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.Connection;
import com.applovin.shadow.okhttp3.Interceptor;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u0003\u0010!J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b1\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b2\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b3\u0010\u0018R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*¨\u00065"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "", "Lcom/applovin/shadow/okhttp3/Interceptor;", "interceptors", "", "index", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "exchange", "Lcom/applovin/shadow/okhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lbo/i;Ljava/util/List;ILbo/e;Lxn/s;III)V", "copy$okhttp", "(ILcom/applovin/shadow/okhttp3/internal/connection/Exchange;Lcom/applovin/shadow/okhttp3/Request;III)Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;", "copy", "Lcom/applovin/shadow/okhttp3/Connection;", "connection", "()Lcom/applovin/shadow/okhttp3/Connection;", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "withReadTimeout", "withWriteTimeout", "Lcom/applovin/shadow/okhttp3/Call;", "()Lcom/applovin/shadow/okhttp3/Call;", "()Lcom/applovin/shadow/okhttp3/Request;", "Lcom/applovin/shadow/okhttp3/Response;", "proceed", "(Lcom/applovin/shadow/okhttp3/Request;)Lcom/applovin/shadow/okhttp3/Response;", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lbo/i;", "Ljava/util/List;", "I", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lbo/e;", "Lcom/applovin/shadow/okhttp3/Request;", "getRequest$okhttp", "()Lxn/s;", "getConnectTimeoutMillis$okhttp", "getReadTimeoutMillis$okhttp", "getWriteTimeoutMillis$okhttp", "calls", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RealInterceptorChain implements Interceptor.Chain {
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall call, List<? extends Interceptor> interceptors, int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        n.f(call, "call");
        n.f(interceptors, "interceptors");
        n.f(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i10;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.writeTimeoutMillis = i13;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, Request request, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = realInterceptorChain.index;
        }
        if ((i14 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((i14 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        if ((i14 & 8) != 0) {
            i11 = realInterceptorChain.connectTimeoutMillis;
        }
        if ((i14 & 16) != 0) {
            i12 = realInterceptorChain.readTimeoutMillis;
        }
        if ((i14 & 32) != 0) {
            i13 = realInterceptorChain.writeTimeoutMillis;
        }
        int i15 = i12;
        int i16 = i13;
        return realInterceptorChain.copy$okhttp(i10, exchange, request, i11, i15, i16);
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: connectTimeoutMillis, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection();
        }
        return null;
    }

    public final RealInterceptorChain copy$okhttp(int index, Exchange exchange, Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        n.f(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        n.f(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder().sameHostAndPort(request.url())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChainCopy$okhttp$default.calls != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseIntercept.body() != null) {
            return responseIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int timeout, TimeUnit unit) {
        n.f(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", timeout, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int timeout, TimeUnit unit) {
        n.f(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int timeout, TimeUnit unit) {
        n.f(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", timeout, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // com.applovin.shadow.okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
