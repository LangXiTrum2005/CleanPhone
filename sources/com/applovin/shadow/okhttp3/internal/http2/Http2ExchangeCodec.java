package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http.RequestLine;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2ExchangeCodec;", "Lcom/applovin/shadow/okhttp3/internal/http/ExchangeCodec;", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "client", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", Http2ExchangeCodec.CONNECTION, "Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;", "chain", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection;", "http2Connection", "<init>", "(Lxn/q;Lbo/k;Lco/g;Lfo/n;)V", "Lcom/applovin/shadow/okhttp3/Request;", "request", "", "contentLength", "Lcom/applovin/shadow/okio/Sink;", "createRequestBody", "(Lcom/applovin/shadow/okhttp3/Request;J)Lcom/applovin/shadow/okio/Sink;", "Lwj/r;", "writeRequestHeaders", "(Lcom/applovin/shadow/okhttp3/Request;)V", "flushRequest", "()V", "finishRequest", "", "expectContinue", "Lcom/applovin/shadow/okhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/Response;", Ve.f27442n, "reportedContentLength", "(Lcom/applovin/shadow/okhttp3/Response;)J", "Lcom/applovin/shadow/okio/Source;", "openResponseBodySource", "(Lcom/applovin/shadow/okhttp3/Response;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okhttp3/Headers;", "trailers", "()Lcom/applovin/shadow/okhttp3/Headers;", "cancel", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "getConnection", "()Lbo/k;", "Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", "stream", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocol", "Lcom/applovin/shadow/okhttp3/Protocol;", "canceled", "Z", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Http2ExchangeCodec implements ExchangeCodec {
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "()V", "CONNECTION", "", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "http2HeadersList", "Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "request", "Lcom/applovin/shadow/okhttp3/Request;", "readHttp2HeadersList", "Lcom/applovin/shadow/okhttp3/Response$Builder;", "headerBlock", "Lcom/applovin/shadow/okhttp3/Headers;", "protocol", "Lcom/applovin/shadow/okhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final List<Header> http2HeadersList(Request request) {
            n.f(request, "request");
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String strHeader = request.header("Host");
            if (strHeader != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headers.name(i10);
                Locale US = Locale.US;
                n.e(US, "US");
                String lowerCase = strName.toLowerCase(US);
                n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (lowerCase.equals(Http2ExchangeCodec.TE) && n.a(headers.value(i10), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.value(i10)));
                }
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headerBlock, Protocol protocol) throws IOException {
            n.f(headerBlock, "headerBlock");
            n.f(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headerBlock.name(i10);
                String strValue = headerBlock.value(i10);
                if (n.a(strName, Header.RESPONSE_STATUS_UTF8)) {
                    statusLine = StatusLine.INSTANCE.parse("HTTP/1.1 " + strValue);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        n.f(client, "client");
        n.f(connection, "connection");
        n.f(chain, "chain");
        n.f(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<Protocol> listProtocols = client.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = listProtocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Sink createRequestBody(Request request, long contentLength) {
        n.f(request, "request");
        Http2Stream http2Stream = this.stream;
        n.c(http2Stream);
        return http2Stream.getSink();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        Http2Stream http2Stream = this.stream;
        n.c(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.http2Connection.flush();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Source openResponseBodySource(Response response) {
        n.f(response, "response");
        Http2Stream http2Stream = this.stream;
        n.c(http2Stream);
        return http2Stream.getSource();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder http2HeadersList = INSTANCE.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (expectContinue && http2HeadersList.getCode() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        n.f(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        n.c(http2Stream);
        return http2Stream.trailers();
    }

    @Override // com.applovin.shadow.okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        n.f(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(INSTANCE.http2HeadersList(request), request.body() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            n.c(http2Stream);
            http2Stream.closeLater(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        n.c(http2Stream2);
        Timeout timeout = http2Stream2.readTimeout();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis, timeUnit);
        Http2Stream http2Stream3 = this.stream;
        n.c(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis(), timeUnit);
    }
}
