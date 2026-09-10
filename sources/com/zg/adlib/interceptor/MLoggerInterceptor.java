package com.zg.adlib.interceptor;

import android.support.v4.media.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.dc;
import com.p004ironsource.qt;
import com.smartdigimkt.o1.b;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.Buffer.AnonymousClass1;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B4\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\f\u0010!\u001a\u00020\u0006*\u00020\"H\u0002J*\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000eH\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020%H\u0002J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010.\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/zg/adlib/interceptor/MLoggerInterceptor;", "Lokhttp3/Interceptor;", b.B0, "", "logger", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "utf8", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "Ljava/nio/charset/Charset;", "isPrint", "", "()Z", "setPrint", "(Z)V", "isPrintPacket", "setPrintPacket", "mTag", "Ljava/util/concurrent/atomic/AtomicLong;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "request", "id", qt.f26623n, "get", "Lokhttp3/HttpUrl;", "getBody", "source", "Lokio/Buffer;", "type", "Lokhttp3/MediaType;", "headers", "Lokhttp3/Headers;", dc.M, "isPlaintext", "buffer", "bodyEncoded", "isText", "contentType", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MLoggerInterceptor implements Interceptor {
    private boolean isPrint;
    private boolean isPrintPacket;
    private final Function1<String, Unit> logger;
    private final AtomicLong mTag;
    private final int pid;
    private final Charset utf8;

    /* JADX WARN: Multi-variable type inference failed */
    public MLoggerInterceptor(int i2, Function1<? super String, Unit> logger) {
        Intrinsics.f(logger, "logger");
        this.pid = i2;
        this.logger = logger;
        this.utf8 = Charset.forName("UTF-8");
        this.isPrint = true;
        this.isPrintPacket = true;
        this.mTag = new AtomicLong();
    }

    private final boolean bodyEncoded(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str != null) {
            return str.equalsIgnoreCase("identity");
        }
        return false;
    }

    private final String get(HttpUrl httpUrl) {
        return this.isPrintPacket ? httpUrl.getUrl() : httpUrl.encodedPath();
    }

    private final String getBody(Buffer source, MediaType type, Headers headers, Charset charset) throws IOException {
        int i2;
        if (!isText(type)) {
            return a.j(source.f45132Y, "-byte body omitted", new StringBuilder("body:"));
        }
        if (!Intrinsics.a(headers.get("content-encoding"), com.smartdigimkt.o0.b.d)) {
            if (isPlaintext(source)) {
                return source.clone().readString(charset);
            }
            return a.j(source.f45132Y, "-byte body omitted", new StringBuilder());
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(source.clone().new AnonymousClass1());
        Buffer buffer = new Buffer();
        byte[] bArr = new byte[1024];
        do {
            i2 = gZIPInputStream.read(bArr);
            if (i2 != -1) {
                buffer.S(bArr, 0, i2);
            }
        } while (i2 != -1);
        return new String(buffer.readByteArray(buffer.f45132Y), charset);
    }

    private final boolean isPlaintext(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            long j = buffer.f45132Y;
            buffer.q(0L, buffer2, j < 64 ? j : 64L);
            for (int i2 = 0; i2 < 16 && !buffer2.exhausted(); i2++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
        }
    }

    private final boolean isText(MediaType contentType) {
        if (contentType == null) {
            return false;
        }
        String str = contentType.type() + IOUtils.DIR_SEPARATOR_UNIX + contentType.subtype();
        return Intrinsics.a(str, "text/plain") || Intrinsics.a(str, "application/json");
    }

    private final void request(Interceptor.Chain chain, String id) throws IOException {
        Protocol protocol;
        Charset charsetCharset$default;
        Request request = chain.request();
        Connection connection = chain.connection();
        if (connection == null || (protocol = connection.protocol()) == null) {
            protocol = Protocol.HTTP_1_1;
        }
        StringBuilder sb = new StringBuilder();
        RequestBody requestBodyBody = request.body();
        StringBuilder sbY = a.y("Request[", id, ", ");
        sbY.append(request.method());
        sbY.append("] ");
        sbY.append(get(request.url()));
        sbY.append(' ');
        sbY.append(protocol);
        sb.append(sbY.toString());
        sb.append('\n');
        Headers headers = request.headers();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = headers.name(i2);
            if (this.isPrintPacket || (!Intrinsics.a(strName, "Authorization") && !Intrinsics.a(strName, "device-identifier"))) {
                StringBuilder sbX = a.x(strName, ": ");
                sbX.append(headers.value(i2));
                sb.append(sbX.toString());
                sb.append('\n');
            }
        }
        if (this.isPrintPacket && requestBodyBody != null) {
            Buffer buffer = new Buffer();
            requestBodyBody.writeTo(buffer);
            MediaType mediaType = requestBodyBody.getContentType();
            if (mediaType == null || (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) {
                charsetCharset$default = this.utf8;
            }
            MediaType mediaType2 = requestBodyBody.getContentType();
            Intrinsics.c(charsetCharset$default);
            sb.append(getBody(buffer, mediaType2, headers, charsetCharset$default));
            sb.append('\n');
        }
        sb.append("Request[" + id + "] END");
        sb.append('\n');
        Function1<String, Unit> function1 = this.logger;
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        function1.invoke(string);
    }

    private final Response response(Interceptor.Chain chain, String id) throws Exception {
        Charset charset;
        long jNanoTime = System.nanoTime();
        Request request = chain.request();
        try {
            Response responseProceed = chain.proceed(request);
            ResponseBody responseBodyBody = responseProceed.body();
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder sbY = a.y("Response[", id, ", ");
            sbY.append(responseProceed.code());
            sbY.append("] ");
            sbY.append(get(request.url()));
            sbY.append(" (");
            sbY.append(millis);
            sbY.append(" ms)");
            stringBuffer.append((CharSequence) sbY.toString()).append('\n');
            Headers headers = responseProceed.headers();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                stringBuffer.append((CharSequence) (headers.name(i2) + ": " + headers.value(i2))).append('\n');
            }
            if (this.isPrintPacket) {
                if (bodyEncoded(headers)) {
                    stringBuffer.append((CharSequence) "encoded body omitted").append('\n');
                } else if (responseBodyBody != null && HttpHeaders.promisesBody(responseProceed)) {
                    BufferedSource source = responseBodyBody.getDelegateSource();
                    source.request(Long.MAX_VALUE);
                    Buffer f45155y = source.getF45155Y();
                    MediaType mediaType = responseBodyBody.getContentType();
                    if (mediaType == null || (charset = mediaType.charset(this.utf8)) == null) {
                        charset = this.utf8;
                    }
                    MediaType mediaType2 = responseBodyBody.getContentType();
                    Intrinsics.c(charset);
                    stringBuffer.append((CharSequence) getBody(f45155y, mediaType2, headers, charset)).append('\n');
                }
            }
            stringBuffer.append((CharSequence) ("Response[" + id + "] END")).append('\n');
            Function1<String, Unit> function1 = this.logger;
            String string = stringBuffer.toString();
            Intrinsics.e(string, "toString(...)");
            function1.invoke(string);
            return responseProceed;
        } catch (Exception e2) {
            Function1<String, Unit> function2 = this.logger;
            StringBuilder sbY2 = a.y("Response[", id, ", Exception] ");
            sbY2.append(get(request.url()));
            sbY2.append('\n');
            sbY2.append(e2);
            function2.invoke(sbY2.toString());
            throw e2;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.f(chain, "chain");
        if (!this.isPrint) {
            return chain.proceed(chain.request());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.pid);
        sb.append('-');
        sb.append(this.mTag.getAndIncrement());
        String string = sb.toString();
        request(chain, string);
        return response(chain, string);
    }

    /* JADX INFO: renamed from: isPrint, reason: from getter */
    public final boolean getIsPrint() {
        return this.isPrint;
    }

    /* JADX INFO: renamed from: isPrintPacket, reason: from getter */
    public final boolean getIsPrintPacket() {
        return this.isPrintPacket;
    }

    public final void setPrint(boolean z2) {
        this.isPrint = z2;
    }

    public final void setPrintPacket(boolean z2) {
        this.isPrintPacket = z2;
    }

    public /* synthetic */ MLoggerInterceptor(int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2, function1);
    }
}
