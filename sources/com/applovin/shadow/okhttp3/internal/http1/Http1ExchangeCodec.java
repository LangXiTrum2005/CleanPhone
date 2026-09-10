package com.applovin.shadow.okhttp3.internal.http1;

import an.h;
import an.p;
import com.applovin.shadow.okhttp3.CookieJar;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okhttp3.internal.http.RequestLine;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ForwardingTimeout;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.ironsource.Ve;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 R2\u00020\u0001:\u0007STURVWXB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0015J\u001d\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u001c2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010LR\u0011\u0010M\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020)*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010O\u001a\u00020)*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Q¨\u0006Y"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec;", "Lcom/applovin/shadow/okhttp3/internal/http/ExchangeCodec;", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "client", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "connection", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "<init>", "(Lxn/q;Lbo/k;Llo/g;Llo/f;)V", "Lcom/applovin/shadow/okhttp3/Request;", "request", "", "contentLength", "Lcom/applovin/shadow/okio/Sink;", "createRequestBody", "(Lcom/applovin/shadow/okhttp3/Request;J)Lcom/applovin/shadow/okio/Sink;", "Lwj/r;", "cancel", "()V", "writeRequestHeaders", "(Lcom/applovin/shadow/okhttp3/Request;)V", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "reportedContentLength", "(Lcom/applovin/shadow/okhttp3/Response;)J", "Lcom/applovin/shadow/okio/Source;", "openResponseBodySource", "(Lcom/applovin/shadow/okhttp3/Response;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okhttp3/Headers;", "trailers", "()Lcom/applovin/shadow/okhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lcom/applovin/shadow/okhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lcom/applovin/shadow/okhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lcom/applovin/shadow/okhttp3/Response$Builder;", "skipConnectBody", "(Lcom/applovin/shadow/okhttp3/Response;)V", "newChunkedSink", "()Lcom/applovin/shadow/okio/Sink;", "newKnownLengthSink", "length", "newFixedLengthSource", "(J)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "newChunkedSource", "(Lcom/applovin/shadow/okhttp3/HttpUrl;)Lcom/applovin/shadow/okio/Source;", "newUnknownLengthSource", "()Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/ForwardingTimeout;", "timeout", "detachTimeout", "(Lcom/applovin/shadow/okio/ForwardingTimeout;)V", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "getConnection", "()Lbo/k;", "Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/BufferedSink;", "", "state", "I", "Lcom/applovin/shadow/okhttp3/internal/http1/HeadersReader;", "headersReader", "Lcom/applovin/shadow/okhttp3/internal/http1/HeadersReader;", "Lcom/applovin/shadow/okhttp3/Headers;", "isClosed", "()Z", "isChunked", "(Lxn/s;)Z", "(Lxn/w;)Z", "Companion", "AbstractSource", "ChunkedSink", "ChunkedSource", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final BufferedSink sink;
    private final BufferedSource source;
    private int state;
    private Headers trailers;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lcom/applovin/shadow/okio/Source;", "<init>", "(Leo/g;)V", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lwj/r;", "responseBodyComplete", "()V", "Lcom/applovin/shadow/okio/ForwardingTimeout;", "Lcom/applovin/shadow/okio/ForwardingTimeout;", "getTimeout", "()Llo/i;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public abstract class AbstractSource implements Source {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public AbstractSource() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.source.getTimeout());
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final ForwardingTimeout getTimeout() {
            return this.timeout;
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            n.f(sink, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(sink, byteCount);
            } catch (IOException e10) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e10;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        public final void setClosed(boolean z10) {
            this.closed = z10;
        }

        @Override // com.applovin.shadow.okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lcom/applovin/shadow/okio/Sink;", "<init>", "(Leo/g;)V", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "Lwj/r;", "write", "(Lcom/applovin/shadow/okio/Buffer;J)V", "flush", "()V", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lcom/applovin/shadow/okio/ForwardingTimeout;", "Lcom/applovin/shadow/okio/ForwardingTimeout;", "", "closed", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public final class ChunkedSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public ChunkedSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.getTimeout());
        }

        @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.writeUtf8("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // com.applovin.shadow.okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.timeout;
        }

        @Override // com.applovin.shadow.okio.Sink
        public void write(Buffer source, long byteCount) throws IOException {
            n.f(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.writeHexadecimalUnsignedLong(byteCount);
            Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
            Http1ExchangeCodec.this.sink.write(source, byteCount);
            Http1ExchangeCodec.this.sink.writeUtf8("\r\n");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "<init>", "(Leo/g;Lxn/m;)V", "Lwj/r;", "readChunkSize", "()V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lcom/applovin/shadow/okhttp3/HttpUrl;", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            n.f(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
                String string = h.T0(this.this$0.source.readUtf8LineStrict()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !p.p0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    OkHttpClient okHttpClient = this.this$0.client;
                    n.c(okHttpClient);
                    CookieJar cookieJar = okHttpClient.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.this$0.trailers;
                    n.c(headers);
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, com.applovin.shadow.okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            n.f(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j10 = this.bytesRemainingInChunk;
            if (j10 == 0 || j10 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j11 = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (j11 != -1) {
                this.bytesRemainingInChunk -= j11;
                return j11;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec;", "", "bytesRemaining", "<init>", "(Leo/g;J)V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j10) {
            super();
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, com.applovin.shadow.okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            n.f(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.bytesRemaining;
            if (j10 == 0) {
                return -1L;
            }
            long j11 = super.read(sink, Math.min(j10, byteCount));
            if (j11 == -1) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j12 = this.bytesRemaining - j11;
            this.bytesRemaining = j12;
            if (j12 == 0) {
                responseBodyComplete();
            }
            return j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lcom/applovin/shadow/okio/Sink;", "<init>", "(Leo/g;)V", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "Lwj/r;", "write", "(Lcom/applovin/shadow/okio/Buffer;J)V", "flush", "()V", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "Lcom/applovin/shadow/okio/ForwardingTimeout;", "Lcom/applovin/shadow/okio/ForwardingTimeout;", "", "closed", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public final class KnownLengthSink implements Sink {
        private boolean closed;
        private final ForwardingTimeout timeout;

        public KnownLengthSink() {
            this.timeout = new ForwardingTimeout(Http1ExchangeCodec.this.sink.getTimeout());
        }

        @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // com.applovin.shadow.okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.timeout;
        }

        @Override // com.applovin.shadow.okio.Sink
        public void write(Buffer source, long byteCount) throws IOException {
            n.f(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(source.size(), 0L, byteCount);
            Http1ExchangeCodec.this.sink.write(source, byteCount);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lcom/applovin/shadow/okhttp3/internal/http1/Http1ExchangeCodec;", "<init>", "(Leo/g;)V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "", "inputExhausted", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, com.applovin.shadow.okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            n.f(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(e.i(byteCount, "byteCount < 0: ").toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j10 = super.read(sink, byteCount);
            if (j10 != -1) {
                return j10;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, BufferedSource source, BufferedSink sink) {
        n.f(connection, "connection");
        n.f(source, "source");
        n.f(sink, "sink");
        this.client = okHttpClient;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(ForwardingTimeout timeout) {
        Timeout delegate = timeout.getDelegate();
        timeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final Sink newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final Source newChunkedSource(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final Source newFixedLengthSource(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final Sink newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final Source newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long contentLength) throws ProtocolException {
        n.f(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (contentLength != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        n.f(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long jHeadersContentLength = Util.headersContentLength(response);
        return jHeadersContentLength != -1 ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) {
        int i10 = this.state;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLine = StatusLine.INSTANCE.parse(this.headersReader.readLine());
            Response.Builder builderHeaders = new Response.Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
            if (expectContinue && statusLine.code == 100) {
                return null;
            }
            int i11 = statusLine.code;
            if (i11 == 100) {
                this.state = 3;
                return builderHeaders;
            }
            if (102 > i11 || i11 >= 200) {
                this.state = 4;
                return builderHeaders;
            }
            this.state = 3;
            return builderHeaders;
        } catch (EOFException e10) {
            throw new IOException(e.n("unexpected end of stream on ", getConnection().getRoute().address().url().redact()), e10);
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        n.f(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        n.f(response, "response");
        long jHeadersContentLength = Util.headersContentLength(response);
        if (jHeadersContentLength == -1) {
            return;
        }
        Source sourceNewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        Util.skipAll(sourceNewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        sourceNewFixedLengthSource.close();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String requestLine) {
        n.f(headers, "headers");
        n.f(requestLine, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.sink.writeUtf8(headers.name(i10)).writeUtf8(": ").writeUtf8(headers.value(i10)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = 1;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        n.f(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().getRoute().proxy().type();
        n.e(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
