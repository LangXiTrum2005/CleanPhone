package okhttp3.logging;

import android.support.v4.media.a;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.o0.b;
import com.smartdigimkt.q8.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeader", "", i.f37957c, "", "redactHeader", "name", "setLevel", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", PglCryptUtils.KEY_MESSAGE, "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "()V", "log", "", PglCryptUtils.KEY_MESSAGE, "", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    Intrinsics.f(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String message);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase(b.d)) ? false : true;
    }

    private final void logHeader(Headers headers, int i2) {
        String strValue = this.headersToRedact.contains(headers.name(i2)) ? "██" : headers.value(i2);
        this.logger.log(headers.name(i2) + ": " + strValue);
    }

    @Deprecated
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z2;
        long j;
        Long lValueOf;
        Charset UTF_8;
        Intrinsics.f(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z3 = true;
        boolean z4 = level == Level.BODY;
        if (!z4 && level != Level.HEADERS) {
            z3 = false;
        }
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        sb.append(connection != null ? Intrinsics.k(connection.protocol(), " ") : "");
        String string = sb.toString();
        if (!z3 && requestBodyBody != null) {
            StringBuilder sbX = a.x(string, " (");
            sbX.append(requestBodyBody.contentLength());
            sbX.append("-byte body)");
            string = sbX.toString();
        }
        this.logger.log(string);
        if (z3) {
            Headers headers = request.headers();
            j = -1;
            if (requestBodyBody != null) {
                MediaType mediaType = requestBodyBody.getContentType();
                if (mediaType != null && headers.get("Content-Type") == null) {
                    this.logger.log(Intrinsics.k(mediaType, "Content-Type: "));
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(Intrinsics.k(Long.valueOf(requestBodyBody.contentLength()), "Content-Length: "));
                }
            }
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                logHeader(headers, i2);
            }
            if (!z4 || requestBodyBody == null) {
                z2 = z4;
                this.logger.log(Intrinsics.k(request.method(), "--> END "));
            } else {
                if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                } else if (requestBodyBody.isDuplex()) {
                    this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                } else if (requestBodyBody.isOneShot()) {
                    this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                } else {
                    Buffer buffer = new Buffer();
                    requestBodyBody.writeTo(buffer);
                    MediaType mediaType2 = requestBodyBody.getContentType();
                    Charset UTF_9 = mediaType2 == null ? null : mediaType2.charset(StandardCharsets.UTF_8);
                    if (UTF_9 == null) {
                        UTF_9 = StandardCharsets.UTF_8;
                        Intrinsics.e(UTF_9, "UTF_8");
                    }
                    this.logger.log("");
                    if (Utf8Kt.isProbablyUtf8(buffer)) {
                        this.logger.log(buffer.readString(UTF_9));
                        this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                        z2 = z4;
                    } else {
                        boolean z5 = z4;
                        Logger logger = this.logger;
                        StringBuilder sb2 = new StringBuilder("--> END ");
                        sb2.append(request.method());
                        sb2.append(" (binary ");
                        z2 = z5;
                        sb2.append(requestBodyBody.contentLength());
                        sb2.append("-byte body omitted)");
                        logger.log(sb2.toString());
                    }
                }
                z2 = z4;
            }
        } else {
            z2 = z4;
            j = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            Intrinsics.c(responseBodyBody);
            long contentLength = responseBodyBody.getContentLength();
            String str = contentLength != j ? contentLength + "-byte" : "unknown-length";
            Logger logger2 = this.logger;
            StringBuilder sb3 = new StringBuilder("<-- ");
            sb3.append(responseProceed.code());
            sb3.append(responseProceed.message().length() == 0 ? "" : a.C(" ", responseProceed.message()));
            sb3.append(' ');
            sb3.append(responseProceed.request().url());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(z3 == 0 ? a.n(", ", str, " body") : "");
            sb3.append(')');
            logger2.log(sb3.toString());
            if (z3) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    logHeader(headers2, i3);
                }
                if (z2 && HttpHeaders.promisesBody(responseProceed)) {
                    if (bodyHasUnknownEncoding(responseProceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                        return responseProceed;
                    }
                    BufferedSource bodySource = responseBodyBody.getSource();
                    bodySource.request(Long.MAX_VALUE);
                    Buffer f45155y = bodySource.getF45155Y();
                    if (b.d.equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                        lValueOf = Long.valueOf(f45155y.f45132Y);
                        GzipSource gzipSource = new GzipSource(f45155y.clone());
                        try {
                            f45155y = new Buffer();
                            f45155y.g(gzipSource);
                            gzipSource.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.a(gzipSource, th);
                                throw th2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    MediaType mediaType3 = responseBodyBody.get$contentType();
                    Charset charset = mediaType3 != null ? mediaType3.charset(StandardCharsets.UTF_8) : null;
                    if (charset == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.e(UTF_8, "UTF_8");
                    } else {
                        UTF_8 = charset;
                    }
                    if (!Utf8Kt.isProbablyUtf8(f45155y)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + f45155y.f45132Y + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(f45155y.clone().readString(UTF_8));
                    }
                    if (lValueOf == null) {
                        this.logger.log("<-- END HTTP (" + f45155y.f45132Y + "-byte body)");
                        return responseProceed;
                    }
                    this.logger.log("<-- END HTTP (" + f45155y.f45132Y + "-byte, " + lValueOf + "-gzipped-byte body)");
                    return responseProceed;
                }
                this.logger.log("<-- END HTTP");
            }
            return responseProceed;
        } catch (Exception e2) {
            this.logger.log(Intrinsics.k(e2, "<-- HTTP FAILED: "));
            throw e2;
        }
    }

    public final void level(Level level) {
        Intrinsics.f(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String name) {
        Intrinsics.f(name, "name");
        StringsKt.s();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        CollectionsKt.g(this.headersToRedact, treeSet);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        Intrinsics.f(level, "level");
        level(level);
        return this;
    }

    public HttpLoggingInterceptor(Logger logger) {
        Intrinsics.f(logger, "logger");
        this.logger = logger;
        this.headersToRedact = EmptySet.X;
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
