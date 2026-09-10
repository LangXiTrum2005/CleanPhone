package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.qt;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.Segment;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", qt.f26623n, "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)V", "source", "Lokio/BufferedSource;", "boundary", "", "(Lokio/BufferedSource;Ljava/lang/String;)V", "()Ljava/lang/String;", "closed", "", "crlfDashDashBoundary", "Lokio/ByteString;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "dashDashBoundary", "noMoreParts", "partCount", "", "close", "", "currentPartBytesRemaining", "", "maxResult", "nextPart", "Lokhttp3/MultipartReader$Part;", "Companion", "Part", "PartSource", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Options afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final BufferedSource source;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "()V", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Options getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "headers", "Lokhttp3/Headers;", "body", "Lokio/BufferedSource;", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "()Lokio/BufferedSource;", "()Lokhttp3/Headers;", "close", "", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable {
        private final BufferedSource body;
        private final Headers headers;

        public Part(Headers headers, BufferedSource body) {
            Intrinsics.f(headers, "headers");
            Intrinsics.f(body, "body");
            this.headers = headers;
            this.body = body;
        }

        /* JADX INFO: renamed from: body, reason: from getter */
        public final BufferedSource getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "(Lokhttp3/MultipartReader;)V", "timeout", "Lokio/Timeout;", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PartSource implements Source {
        private final Timeout timeout = new Timeout();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(Buffer sink, long byteCount) {
            Intrinsics.f(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(a.i(byteCount, "byteCount < 0: ").toString());
            }
            if (!Intrinsics.a(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            Timeout timeout = MultipartReader.this.source.getTimeout();
            Timeout timeout2 = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.getTimeoutNanos();
            Timeout.Companion companion = Timeout.INSTANCE;
            long timeoutNanos2 = timeout2.getTimeoutNanos();
            long timeoutNanos3 = timeout.getTimeoutNanos();
            companion.getClass();
            if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                timeoutNanos2 = timeoutNanos3;
            }
            timeout.timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
            if (!timeout.getHasDeadline()) {
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                } finally {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
            } finally {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    static {
        ByteString byteString = ByteString.e0;
        afterBoundaryOptions = Options.Companion.b(ByteString.Companion.c(IOUtils.LINE_SEPARATOR_WINDOWS), ByteString.Companion.c("--"), ByteString.Companion.c(" "), ByteString.Companion.c("\t"));
    }

    public MultipartReader(BufferedSource source, String boundary) throws IOException {
        Intrinsics.f(source, "source");
        Intrinsics.f(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        Buffer buffer = new Buffer();
        buffer.s0("--");
        buffer.s0(boundary);
        this.dashDashBoundary = buffer.readByteString(buffer.f45132Y);
        Buffer buffer2 = new Buffer();
        buffer2.s0("\r\n--");
        buffer2.s0(boundary);
        this.crlfDashDashBoundary = buffer2.readByteString(buffer2.f45132Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) {
        long j;
        this.source.require(this.crlfDashDashBoundary.h());
        Buffer f45155y = this.source.getF45155Y();
        ByteString bytes = this.crlfDashDashBoundary;
        f45155y.getClass();
        Intrinsics.f(bytes, "bytes");
        f45155y.getClass();
        Intrinsics.f(bytes, "bytes");
        if (bytes.h() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (0 < 0) {
            throw new IllegalArgumentException(a.i(0L, "fromIndex < 0: ").toString());
        }
        Segment segment = f45155y.X;
        if (segment == null) {
            j = -1;
            break;
        }
        long j3 = f45155y.f45132Y;
        if (j3 - 0 >= 0) {
            long j4 = 0;
            while (true) {
                long j5 = ((long) (segment.f45159c - segment.f45158b)) + j2;
                if (j5 > 0) {
                    break;
                }
                segment = segment.f;
                Intrinsics.c(segment);
                j2 = j5;
            }
            byte[] data = bytes.getData();
            byte b2 = data[0];
            int iH = bytes.h();
            long j6 = (f45155y.f45132Y - ((long) iH)) + 1;
            loop4: while (true) {
                if (j2 >= j6) {
                    j = -1;
                    break;
                }
                int iMin = (int) Math.min(segment.f45159c, (((long) segment.f45158b) + j6) - j2);
                for (int i2 = (int) ((((long) segment.f45158b) + j4) - j2); i2 < iMin; i2++) {
                    if (segment.f45157a[i2] == b2 && okio.internal.Buffer.a(segment, i2 + 1, data, iH)) {
                        j = ((long) (i2 - segment.f45158b)) + j2;
                        break loop4;
                    }
                }
                j2 += (long) (segment.f45159c - segment.f45158b);
                segment = segment.f;
                Intrinsics.c(segment);
                j4 = j2;
            }
        } else {
            while (j3 > 0) {
                segment = segment.g;
                Intrinsics.c(segment);
                j3 -= (long) (segment.f45159c - segment.f45158b);
            }
            byte[] data2 = bytes.getData();
            byte b3 = data2[0];
            int iH2 = bytes.h();
            long j7 = (f45155y.f45132Y - ((long) iH2)) + 1;
            long j8 = 0;
            loop1: while (true) {
                if (j3 >= j7) {
                    j = -1;
                    break;
                }
                long j9 = j3;
                int iMin2 = (int) Math.min(segment.f45159c, (((long) segment.f45158b) + j7) - j3);
                for (int i3 = (int) ((((long) segment.f45158b) + j8) - j9); i3 < iMin2; i3++) {
                    if (segment.f45157a[i3] == b3 && okio.internal.Buffer.a(segment, i3 + 1, data2, iH2)) {
                        j = ((long) (i3 - segment.f45158b)) + j9;
                        break loop1;
                    }
                }
                j3 = j9 + ((long) (segment.f45159c - segment.f45158b));
                segment = segment.f;
                Intrinsics.c(segment);
                j8 = j3;
            }
        }
        return j == -1 ? Math.min(maxResult, (this.source.getF45155Y().f45132Y - ((long) this.crlfDashDashBoundary.h())) + 1) : Math.min(maxResult, j);
    }

    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.f(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.h());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.h());
        }
        boolean z2 = false;
        while (true) {
            int iS0 = this.source.S0(afterBoundaryOptions);
            if (iS0 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iS0 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, Okio.d(partSource));
            }
            if (iS0 == 1) {
                if (z2) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iS0 == 2 || iS0 == 3) {
                z2 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody response) throws IOException {
        String strParameter;
        Intrinsics.f(response, "response");
        BufferedSource delegateSource = response.getDelegateSource();
        MediaType contentType = response.getContentType();
        if (contentType != null && (strParameter = contentType.parameter("boundary")) != null) {
            this(delegateSource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
