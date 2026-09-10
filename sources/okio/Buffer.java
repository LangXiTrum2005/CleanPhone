package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "UnsafeCursor", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f45132Y;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnsafeCursor implements Closeable {
        public Buffer X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f45133Y;
        public Segment Z;
        public byte[] f0;
        public long e0 = -1;
        public int g0 = -1;
        public int h0 = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.X == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.X = null;
            this.Z = null;
            this.e0 = -1L;
            this.f0 = null;
            this.g0 = -1;
            this.h0 = -1;
        }

        public final void h(long j) {
            Buffer buffer = this.X;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f45133Y) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = buffer.f45132Y;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(a.i(j, "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    Segment segment = buffer.X;
                    Intrinsics.c(segment);
                    Segment segment2 = segment.g;
                    Intrinsics.c(segment2);
                    int i2 = segment2.f45159c;
                    long j4 = i2 - segment2.f45158b;
                    if (j4 > j3) {
                        segment2.f45159c = i2 - ((int) j3);
                        break;
                    } else {
                        buffer.X = segment2.a();
                        SegmentPool.a(segment2);
                        j3 -= j4;
                    }
                }
                this.Z = null;
                this.e0 = j;
                this.f0 = null;
                this.g0 = -1;
                this.h0 = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i3 = 1;
                boolean z2 = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    Segment segmentJ = buffer.J(i3);
                    int iMin = (int) Math.min(j5, 8192 - segmentJ.f45159c);
                    int i4 = segmentJ.f45159c + iMin;
                    segmentJ.f45159c = i4;
                    j5 -= (long) iMin;
                    if (z2) {
                        this.Z = segmentJ;
                        this.e0 = j2;
                        this.f0 = segmentJ.f45157a;
                        this.g0 = i4 - iMin;
                        this.h0 = i4;
                        z2 = false;
                    }
                    i3 = 1;
                }
            }
            buffer.f45132Y = j;
        }

        public final int i(long j) {
            Buffer buffer = this.X;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = buffer.f45132Y;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.Z = null;
                        this.e0 = j;
                        this.f0 = null;
                        this.g0 = -1;
                        this.h0 = -1;
                        return -1;
                    }
                    Segment segment = buffer.X;
                    Segment segment2 = this.Z;
                    long j3 = 0;
                    if (segment2 != null) {
                        long j4 = this.e0 - ((long) (this.g0 - segment2.f45158b));
                        if (j4 > j) {
                            segment2 = segment;
                            segment = segment2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        segment2 = segment;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            Intrinsics.c(segment2);
                            long j5 = ((long) (segment2.f45159c - segment2.f45158b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            segment2 = segment2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.c(segment);
                            segment = segment.g;
                            Intrinsics.c(segment);
                            j2 -= (long) (segment.f45159c - segment.f45158b);
                        }
                        segment2 = segment;
                        j3 = j2;
                    }
                    if (this.f45133Y) {
                        Intrinsics.c(segment2);
                        if (segment2.d) {
                            byte[] bArr = segment2.f45157a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.e(bArrCopyOf, "copyOf(this, size)");
                            Segment segment3 = new Segment(bArrCopyOf, segment2.f45158b, segment2.f45159c, false, true);
                            if (buffer.X == segment2) {
                                buffer.X = segment3;
                            }
                            segment2.b(segment3);
                            Segment segment4 = segment3.g;
                            Intrinsics.c(segment4);
                            segment4.a();
                            segment2 = segment3;
                        }
                    }
                    this.Z = segment2;
                    this.e0 = j;
                    Intrinsics.c(segment2);
                    this.f0 = segment2.f45157a;
                    int i2 = segment2.f45158b + ((int) (j - j3));
                    this.g0 = i2;
                    int i3 = segment2.f45159c;
                    this.h0 = i3;
                    return i3 - i2;
                }
            }
            StringBuilder sbV = android.support.v4.media.a.v(j, "offset=", " > size=");
            sbV.append(buffer.f45132Y);
            throw new ArrayIndexOutOfBoundsException(sbV.toString());
        }
    }

    public final UnsafeCursor G(UnsafeCursor unsafeCursor) {
        Intrinsics.f(unsafeCursor, "unsafeCursor");
        byte[] bArr = okio.internal.Buffer.f45168a;
        if (unsafeCursor == SegmentedByteString.f45129a) {
            unsafeCursor = new UnsafeCursor();
        }
        if (unsafeCursor.X != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.X = this;
        unsafeCursor.f45133Y = true;
        return unsafeCursor;
    }

    public final ByteString H() {
        long j = this.f45132Y;
        if (j <= 2147483647L) {
            return I((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f45132Y).toString());
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink H0(ByteString byteString) {
        K(byteString);
        return this;
    }

    public final ByteString I(int i2) {
        if (i2 == 0) {
            return ByteString.e0;
        }
        SegmentedByteString.b(this.f45132Y, 0L, i2);
        Segment segment = this.X;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Intrinsics.c(segment);
            int i6 = segment.f45159c;
            int i7 = segment.f45158b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            segment = segment.f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = this.X;
        int i8 = 0;
        while (i3 < i2) {
            Intrinsics.c(segment2);
            bArr[i8] = segment2.f45157a;
            i3 += segment2.f45159c - segment2.f45158b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = segment2.f45158b;
            segment2.d = true;
            i8++;
            segment2 = segment2.f;
        }
        return new C3561SegmentedByteString(bArr, iArr);
    }

    public final Segment J(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.X;
        if (segment == null) {
            Segment segmentB = SegmentPool.b();
            this.X = segmentB;
            segmentB.g = segmentB;
            segmentB.f = segmentB;
            return segmentB;
        }
        Segment segment2 = segment.g;
        Intrinsics.c(segment2);
        if (segment2.f45159c + i2 <= 8192 && segment2.f45160e) {
            return segment2;
        }
        Segment segmentB2 = SegmentPool.b();
        segment2.b(segmentB2);
        return segmentB2;
    }

    public final void K(ByteString byteString) {
        Intrinsics.f(byteString, "byteString");
        byteString.w(byteString.h(), this);
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink M0(int i2, int i3, byte[] bArr) {
        S(bArr, i2, i3);
        return this;
    }

    public final void P(byte[] source) {
        Intrinsics.f(source, "source");
        S(source, 0, source.length);
    }

    public final void S(byte[] source, int i2, int i3) {
        Intrinsics.f(source, "source");
        long j = i3;
        SegmentedByteString.b(source.length, i2, j);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment segmentJ = J(1);
            int iMin = Math.min(i4 - i2, 8192 - segmentJ.f45159c);
            int i5 = i2 + iMin;
            ArraysKt.m(segmentJ.f45159c, i2, i5, source, segmentJ.f45157a);
            segmentJ.f45159c += iMin;
            i2 = i5;
        }
        this.f45132Y += j;
    }

    @Override // okio.BufferedSource
    public final int S0(Options options) throws EOFException {
        Intrinsics.f(options, "options");
        int iC = okio.internal.Buffer.c(this, options, false);
        if (iC == -1) {
            return -1;
        }
        skip(options.X[iC].h());
        return iC;
    }

    public final void T(int i2) {
        Segment segmentJ = J(1);
        int i3 = segmentJ.f45159c;
        segmentJ.f45159c = i3 + 1;
        segmentJ.f45157a[i3] = (byte) i2;
        this.f45132Y++;
    }

    public final void U(long j) {
        boolean z2;
        byte[] bArr;
        if (j == 0) {
            T(48);
            return;
        }
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                s0("-9223372036854775808");
                return;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i2 = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i2 = 2;
                }
            } else if (j < 1000000) {
                i2 = j < 100000 ? 5 : 6;
            } else {
                i2 = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i2 = j < 1000000000 ? 9 : 10;
            } else {
                i2 = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else {
                i2 = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i2 = j < 10000000000000000L ? 16 : 17;
        } else {
            i2 = j < 1000000000000000000L ? 18 : 19;
        }
        if (z2) {
            i2++;
        }
        Segment segmentJ = J(i2);
        int i3 = segmentJ.f45159c + i2;
        while (true) {
            bArr = segmentJ.f45157a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i3--;
            bArr[i3] = okio.internal.Buffer.f45168a[(int) (j % j2)];
            j /= j2;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        segmentJ.f45159c += i2;
        this.f45132Y += (long) i2;
    }

    public final void Y(long j) {
        if (j == 0) {
            T(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i2 = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentJ = J(i2);
        int i3 = segmentJ.f45159c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            segmentJ.f45157a[i4] = okio.internal.Buffer.f45168a[(int) (15 & j)];
            j >>>= 4;
        }
        segmentJ.f45159c += i2;
        this.f45132Y += (long) i2;
    }

    public final void c0(int i2) {
        Segment segmentJ = J(4);
        int i3 = segmentJ.f45159c;
        byte[] bArr = segmentJ.f45157a;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        segmentJ.f45159c = i3 + 4;
        this.f45132Y += 4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.Sink
    public final void close() {
    }

    @Override // okio.BufferedSource
    public final void e(Buffer sink, long j) throws EOFException {
        Intrinsics.f(sink, "sink");
        long j2 = this.f45132Y;
        if (j2 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j2);
            throw new EOFException();
        }
    }

    public final void e0(long j) {
        Segment segmentJ = J(8);
        int i2 = segmentJ.f45159c;
        byte[] bArr = segmentJ.f45157a;
        bArr[i2] = (byte) ((j >>> 56) & 255);
        bArr[i2 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i2 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i2 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i2 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i2 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i2 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i2 + 7] = (byte) (j & 255);
        segmentJ.f45159c = i2 + 8;
        this.f45132Y += 8;
    }

    @Override // okio.BufferedSink
    public final BufferedSink emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink emitCompleteSegments() {
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z3 = false;
        if (!(obj instanceof Buffer)) {
            return false;
        }
        long j = this.f45132Y;
        Buffer buffer = (Buffer) obj;
        if (j != buffer.f45132Y) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        Segment segment2 = buffer.X;
        Intrinsics.c(segment2);
        int i2 = segment.f45158b;
        int i3 = segment2.f45158b;
        long j2 = 0;
        while (j2 < this.f45132Y) {
            long jMin = Math.min(segment.f45159c - i2, segment2.f45159c - i3);
            long j3 = 0;
            while (j3 < jMin) {
                int i4 = i2 + 1;
                boolean z4 = z2;
                byte b2 = segment.f45157a[i2];
                int i5 = i3 + 1;
                boolean z5 = z3;
                if (b2 != segment2.f45157a[i3]) {
                    return z5;
                }
                j3++;
                i3 = i5;
                i2 = i4;
                z2 = z4;
                z3 = z5;
            }
            boolean z6 = z2;
            boolean z7 = z3;
            if (i2 == segment.f45159c) {
                Segment segment3 = segment.f;
                Intrinsics.c(segment3);
                i2 = segment3.f45158b;
                segment = segment3;
            }
            if (i3 == segment2.f45159c) {
                segment2 = segment2.f;
                Intrinsics.c(segment2);
                i3 = segment2.f45158b;
            }
            j2 += jMin;
            z2 = z6;
            z3 = z7;
        }
        return z2;
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        return this.f45132Y == 0;
    }

    @Override // okio.BufferedSource
    public final boolean f(long j, ByteString bytes) {
        Intrinsics.f(bytes, "bytes");
        int iH = bytes.h();
        if (j >= 0 && iH >= 0 && this.f45132Y - j >= iH && bytes.h() >= iH) {
            for (int i2 = 0; i2 < iH; i2++) {
                if (r(((long) i2) + j) == bytes.m(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.BufferedSink
    public final long g(Source source) {
        Intrinsics.f(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: getBuffer */
    public final Buffer getF45155Y() {
        return this;
    }

    public final int hashCode() {
        Segment segment = this.X;
        if (segment == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = segment.f45159c;
            for (int i4 = segment.f45158b; i4 < i3; i4++) {
                i2 = (i2 * 31) + segment.f45157a[i4];
            }
            segment = segment.f;
            Intrinsics.c(segment);
        } while (segment != this.X);
        return i2;
    }

    public final long indexOf(byte b2, long j, long j2) {
        Segment segment;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.f45132Y);
            a.A(sb, " fromIndex=", j, " toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.f45132Y;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (segment = this.X) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                segment = segment.g;
                Intrinsics.c(segment);
                j4 -= (long) (segment.f45159c - segment.f45158b);
            }
            while (j4 < j2) {
                int iMin = (int) Math.min(segment.f45159c, (((long) segment.f45158b) + j2) - j4);
                for (int i2 = (int) ((((long) segment.f45158b) + j) - j4); i2 < iMin; i2++) {
                    if (segment.f45157a[i2] == b2) {
                        return ((long) (i2 - segment.f45158b)) + j4;
                    }
                }
                j4 += (long) (segment.f45159c - segment.f45158b);
                segment = segment.f;
                Intrinsics.c(segment);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (segment.f45159c - segment.f45158b)) + j3;
            if (j5 > j) {
                break;
            }
            segment = segment.f;
            Intrinsics.c(segment);
            j3 = j5;
        }
        while (j3 < j2) {
            int iMin2 = (int) Math.min(segment.f45159c, (((long) segment.f45158b) + j2) - j3);
            for (int i3 = (int) ((((long) segment.f45158b) + j) - j3); i3 < iMin2; i3++) {
                if (segment.f45157a[i3] == b2) {
                    return ((long) (i3 - segment.f45158b)) + j3;
                }
            }
            j3 += (long) (segment.f45159c - segment.f45158b);
            segment = segment.f;
            Intrinsics.c(segment);
            j = j3;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new AnonymousClass1();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i2) {
        Segment segmentJ = J(2);
        int i3 = segmentJ.f45159c;
        byte[] bArr = segmentJ.f45157a;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        segmentJ.f45159c = i3 + 2;
        this.f45132Y += 2;
    }

    public final void k() throws EOFException {
        skip(this.f45132Y);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.f45132Y == 0) {
            return buffer;
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        Segment segmentC = segment.c();
        buffer.X = segmentC;
        segmentC.g = segmentC;
        segmentC.f = segmentC;
        for (Segment segment2 = segment.f; segment2 != segment; segment2 = segment2.f) {
            Segment segment3 = segmentC.g;
            Intrinsics.c(segment3);
            Intrinsics.c(segment2);
            segment3.b(segment2.c());
        }
        buffer.f45132Y = this.f45132Y;
        return buffer;
    }

    public final void n0(String str, int i2, int i3, Charset charset) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "beginIndex < 0: ").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i3 > str.length()) {
            StringBuilder sbU = android.support.v4.media.a.u(i3, "endIndex > string.length: ", " > ");
            sbU.append(str.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        if (charset.equals(Charsets.f44691a)) {
            q0(i2, i3, str);
            return;
        }
        String strSubstring = str.substring(i2, i3);
        Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        S(bytes, 0, bytes.length);
    }

    @Override // okio.BufferedSource
    public final long o0(Buffer buffer) {
        long j = this.f45132Y;
        if (j > 0) {
            buffer.write(this, j);
        }
        return j;
    }

    public final long p() {
        long j = this.f45132Y;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        Segment segment2 = segment.g;
        Intrinsics.c(segment2);
        int i2 = segment2.f45159c;
        return (i2 >= 8192 || !segment2.f45160e) ? j : j - ((long) (i2 - segment2.f45158b));
    }

    @Override // okio.BufferedSource
    public final RealBufferedSource peek() {
        return Okio.d(new PeekSource(this));
    }

    public final void q(long j, Buffer out, long j2) {
        Intrinsics.f(out, "out");
        long j3 = j;
        SegmentedByteString.b(this.f45132Y, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.f45132Y += j2;
        Segment segment = this.X;
        while (true) {
            Intrinsics.c(segment);
            long j4 = segment.f45159c - segment.f45158b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            segment = segment.f;
        }
        Segment segment2 = segment;
        long j5 = j2;
        while (j5 > 0) {
            Intrinsics.c(segment2);
            Segment segmentC = segment2.c();
            int i2 = segmentC.f45158b + ((int) j3);
            segmentC.f45158b = i2;
            segmentC.f45159c = Math.min(i2 + ((int) j5), segmentC.f45159c);
            Segment segment3 = out.X;
            if (segment3 == null) {
                segmentC.g = segmentC;
                segmentC.f = segmentC;
                out.X = segmentC;
            } else {
                Segment segment4 = segment3.g;
                Intrinsics.c(segment4);
                segment4.b(segmentC);
            }
            j5 -= (long) (segmentC.f45159c - segmentC.f45158b);
            segment2 = segment2.f;
            j3 = 0;
        }
    }

    public final void q0(int i2, int i3, String string) {
        char cCharAt;
        Intrinsics.f(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "beginIndex < 0: ").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i3 > string.length()) {
            StringBuilder sbU = android.support.v4.media.a.u(i3, "endIndex > string.length: ", " > ");
            sbU.append(string.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        while (i2 < i3) {
            char cCharAt2 = string.charAt(i2);
            if (cCharAt2 < 128) {
                Segment segmentJ = J(1);
                int i4 = segmentJ.f45159c - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = segmentJ.f45157a;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = segmentJ.f45159c;
                int i7 = (i4 + i2) - i6;
                segmentJ.f45159c = i6 + i7;
                this.f45132Y += (long) i7;
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentJ2 = J(2);
                    int i8 = segmentJ2.f45159c;
                    byte b2 = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    byte[] bArr2 = segmentJ2.f45157a;
                    bArr2[i8] = b2;
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentJ2.f45159c = i8 + 2;
                    this.f45132Y += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentJ3 = J(3);
                    int i9 = segmentJ3.f45159c;
                    byte[] bArr3 = segmentJ3.f45157a;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentJ3.f45159c = i9 + 3;
                    this.f45132Y += 3;
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? string.charAt(i10) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        T(63);
                        i2 = i10;
                    } else {
                        int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentJ4 = J(4);
                        int i12 = segmentJ4.f45159c;
                        byte b3 = (byte) ((i11 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        byte[] bArr4 = segmentJ4.f45157a;
                        bArr4[i12] = b3;
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        segmentJ4.f45159c = i12 + 4;
                        this.f45132Y += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final byte r(long j) {
        SegmentedByteString.b(this.f45132Y, j, 1L);
        Segment segment = this.X;
        if (segment == null) {
            Intrinsics.c(null);
            throw null;
        }
        long j2 = this.f45132Y;
        if (j2 - j < j) {
            while (j2 > j) {
                segment = segment.g;
                Intrinsics.c(segment);
                j2 -= (long) (segment.f45159c - segment.f45158b);
            }
            return segment.f45157a[(int) ((((long) segment.f45158b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i2 = segment.f45159c;
            int i3 = segment.f45158b;
            long j4 = ((long) (i2 - i3)) + j3;
            if (j4 > j) {
                return segment.f45157a[(int) ((((long) i3) + j) - j3)];
            }
            segment = segment.f;
            Intrinsics.c(segment);
            j3 = j4;
        }
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.f(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f45132Y;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.write(this, j);
        return j;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        if (this.f45132Y == 0) {
            throw new EOFException();
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        int i2 = segment.f45158b;
        int i3 = segment.f45159c;
        int i4 = i2 + 1;
        byte b2 = segment.f45157a[i2];
        this.f45132Y--;
        if (i4 != i3) {
            segment.f45158b = i4;
            return b2;
        }
        this.X = segment.a();
        SegmentPool.a(segment);
        return b2;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        return readByteArray(this.f45132Y);
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString() {
        return readByteString(this.f45132Y);
    }

    @Override // okio.BufferedSource
    public final long readDecimalLong() throws EOFException {
        byte b2;
        long j = 0;
        if (this.f45132Y == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z2 = false;
        long j2 = 0;
        long j3 = -7;
        boolean z3 = false;
        loop0: while (true) {
            Segment segment = this.X;
            Intrinsics.c(segment);
            int i3 = segment.f45158b;
            int i4 = segment.f45159c;
            while (true) {
                if (i3 >= i4) {
                    j = j;
                    break;
                }
                b2 = segment.f45157a[i3];
                if (b2 < 48 || b2 > 57) {
                    j = j;
                    if (b2 != 45 || i2 != 0) {
                        z3 = true;
                        break;
                    }
                    j3--;
                    z2 = true;
                } else {
                    int i5 = 48 - b2;
                    if (j2 < com.applovin.shadow.okio.internal.Buffer.OVERFLOW_ZONE || (j2 == com.applovin.shadow.okio.internal.Buffer.OVERFLOW_ZONE && i5 < j3)) {
                        break loop0;
                    }
                    j2 = (j2 * 10) + ((long) i5);
                }
                i3++;
                i2++;
                j = j;
            }
            if (i3 == i4) {
                this.X = segment.a();
                SegmentPool.a(segment);
            } else {
                segment.f45158b = i3;
            }
            if (z3 || this.X == null) {
                long j4 = this.f45132Y - ((long) i2);
                this.f45132Y = j4;
                if (i2 >= (z2 ? 2 : 1)) {
                    return z2 ? j2 : -j2;
                }
                if (j4 == j) {
                    throw new EOFException();
                }
                StringBuilder sbX = android.support.v4.media.a.x(z2 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbX.append(SegmentedByteString.d(r(j)));
                throw new NumberFormatException(sbX.toString());
            }
            j = j;
        }
        Buffer buffer = new Buffer();
        buffer.U(j2);
        buffer.T(b2);
        if (!z2) {
            buffer.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(buffer.readUtf8()));
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Intrinsics.f(sink, "sink");
        int i2 = 0;
        while (i2 < sink.length) {
            int i3 = read(sink, i2, sink.length - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
    }

    @Override // okio.BufferedSource
    public final long readHexadecimalUnsignedLong() throws EOFException {
        int i2;
        if (this.f45132Y == 0) {
            throw new EOFException();
        }
        int i3 = 0;
        boolean z2 = false;
        long j = 0;
        do {
            Segment segment = this.X;
            Intrinsics.c(segment);
            int i4 = segment.f45158b;
            int i5 = segment.f45159c;
            while (i4 < i5) {
                byte b2 = segment.f45157a[i4];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i3 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(SegmentedByteString.d(b2)));
                        }
                        z2 = true;
                        break;
                    }
                    i2 = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    Buffer buffer = new Buffer();
                    buffer.Y(j);
                    buffer.T(b2);
                    throw new NumberFormatException("Number too large: ".concat(buffer.readUtf8()));
                }
                j = (j << 4) | ((long) i2);
                i4++;
                i3++;
            }
            if (i4 == i5) {
                this.X = segment.a();
                SegmentPool.a(segment);
            } else {
                segment.f45158b = i4;
            }
            if (z2) {
                break;
            }
        } while (this.X != null);
        this.f45132Y -= (long) i3;
        return j;
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        if (this.f45132Y < 4) {
            throw new EOFException();
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        int i2 = segment.f45158b;
        int i3 = segment.f45159c;
        if (i3 - i2 < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = segment.f45157a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f45132Y -= 4;
        if (i6 != i3) {
            segment.f45158b = i6;
            return i7;
        }
        this.X = segment.a();
        SegmentPool.a(segment);
        return i7;
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        if (this.f45132Y < 8) {
            throw new EOFException();
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        int i2 = segment.f45158b;
        int i3 = segment.f45159c;
        if (i3 - i2 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.f45157a;
        int i4 = i2 + 7;
        long j = ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8);
        int i5 = i2 + 8;
        long j2 = j | (((long) bArr[i4]) & 255);
        this.f45132Y -= 8;
        if (i5 != i3) {
            segment.f45158b = i5;
            return j2;
        }
        this.X = segment.a();
        SegmentPool.a(segment);
        return j2;
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        if (this.f45132Y < 2) {
            throw new EOFException();
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        int i2 = segment.f45158b;
        int i3 = segment.f45159c;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        int i4 = i2 + 1;
        byte[] bArr = segment.f45157a;
        int i5 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
        this.f45132Y -= 2;
        if (i6 == i3) {
            this.X = segment.a();
            SegmentPool.a(segment);
        } else {
            segment.f45158b = i6;
        }
        return (short) i7;
    }

    public final short readShortLe() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) {
        Intrinsics.f(charset, "charset");
        return readString(this.f45132Y, charset);
    }

    public final String readUtf8() {
        return readString(this.f45132Y, Charsets.f44691a);
    }

    public final int readUtf8CodePoint() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (this.f45132Y == 0) {
            throw new EOFException();
        }
        byte bR = r(0L);
        if ((bR & 128) == 0) {
            i2 = bR & AbstractJsonLexerKt.TC_INVALID;
            i4 = 0;
            i3 = 1;
        } else if ((bR & 224) == 192) {
            i2 = bR & 31;
            i3 = 2;
            i4 = 128;
        } else if ((bR & 240) == 224) {
            i2 = bR & 15;
            i3 = 3;
            i4 = com.p004ironsource.mediationsdk.metadata.a.f25965n;
        } else {
            if ((bR & 248) != 240) {
                skip(1L);
                return com.applovin.shadow.okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = bR & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j = i3;
        if (this.f45132Y < j) {
            StringBuilder sbU = android.support.v4.media.a.u(i3, "size < ", ": ");
            sbU.append(this.f45132Y);
            sbU.append(" (to read code point prefixed 0x");
            sbU.append(SegmentedByteString.d(bR));
            sbU.append(')');
            throw new EOFException(sbU.toString());
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j2 = i5;
            byte bR2 = r(j2);
            if ((bR2 & 192) != 128) {
                skip(j2);
                return com.applovin.shadow.okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (i2 << 6) | (bR2 & 63);
        }
        skip(j);
        if (i2 > 1114111) {
            return com.applovin.shadow.okio.Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i2 || i2 >= 57344) && i2 >= i4) ? i2 : com.applovin.shadow.okio.Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        return this.f45132Y >= j;
    }

    @Override // okio.BufferedSource
    public final void require(long j) throws EOFException {
        if (this.f45132Y < j) {
            throw new EOFException();
        }
    }

    public final long s(long j, ByteString targetBytes) {
        Intrinsics.f(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "fromIndex < 0: ").toString());
        }
        Segment segment = this.X;
        if (segment == null) {
            return -1L;
        }
        long j3 = this.f45132Y;
        if (j3 - j < j) {
            while (j3 > j) {
                segment = segment.g;
                Intrinsics.c(segment);
                j3 -= (long) (segment.f45159c - segment.f45158b);
            }
            if (targetBytes.h() == 2) {
                byte bM = targetBytes.m(0);
                byte bM2 = targetBytes.m(1);
                while (j3 < this.f45132Y) {
                    int i2 = segment.f45159c;
                    for (int i3 = (int) ((((long) segment.f45158b) + j) - j3); i3 < i2; i3++) {
                        byte b2 = segment.f45157a[i3];
                        if (b2 == bM || b2 == bM2) {
                            return ((long) (i3 - segment.f45158b)) + j3;
                        }
                    }
                    j3 += (long) (segment.f45159c - segment.f45158b);
                    segment = segment.f;
                    Intrinsics.c(segment);
                    j = j3;
                }
            } else {
                byte[] bArrL = targetBytes.getData();
                while (j3 < this.f45132Y) {
                    int i4 = segment.f45159c;
                    for (int i5 = (int) ((((long) segment.f45158b) + j) - j3); i5 < i4; i5++) {
                        byte b3 = segment.f45157a[i5];
                        for (byte b4 : bArrL) {
                            if (b3 == b4) {
                                return ((long) (i5 - segment.f45158b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (segment.f45159c - segment.f45158b);
                    segment = segment.f;
                    Intrinsics.c(segment);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.f45159c - segment.f45158b)) + j2;
            if (j4 > j) {
                break;
            }
            segment = segment.f;
            Intrinsics.c(segment);
            j2 = j4;
        }
        if (targetBytes.h() == 2) {
            byte bM3 = targetBytes.m(0);
            byte bM4 = targetBytes.m(1);
            while (j2 < this.f45132Y) {
                int i6 = segment.f45159c;
                for (int i7 = (int) ((((long) segment.f45158b) + j) - j2); i7 < i6; i7++) {
                    byte b5 = segment.f45157a[i7];
                    if (b5 == bM3 || b5 == bM4) {
                        return ((long) (i7 - segment.f45158b)) + j2;
                    }
                }
                j2 += (long) (segment.f45159c - segment.f45158b);
                segment = segment.f;
                Intrinsics.c(segment);
                j = j2;
            }
        } else {
            byte[] bArrL2 = targetBytes.getData();
            while (j2 < this.f45132Y) {
                int i8 = segment.f45159c;
                for (int i9 = (int) ((((long) segment.f45158b) + j) - j2); i9 < i8; i9++) {
                    byte b6 = segment.f45157a[i9];
                    for (byte b7 : bArrL2) {
                        if (b6 == b7) {
                            return ((long) (i9 - segment.f45158b)) + j2;
                        }
                    }
                }
                j2 += (long) (segment.f45159c - segment.f45158b);
                segment = segment.f;
                Intrinsics.c(segment);
                j = j2;
            }
        }
        return -1L;
    }

    public final void s0(String string) {
        Intrinsics.f(string, "string");
        q0(0, string.length(), string);
    }

    @Override // okio.BufferedSource
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.X;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.f45159c - segment.f45158b);
            long j2 = iMin;
            this.f45132Y -= j2;
            j -= j2;
            int i2 = segment.f45158b + iMin;
            segment.f45158b = i2;
            if (i2 == segment.f45159c) {
                this.X = segment.a();
                SegmentPool.a(segment);
            }
        }
    }

    public final long t(ByteString targetBytes) {
        Intrinsics.f(targetBytes, "targetBytes");
        return s(0L, targetBytes);
    }

    public final void t0(int i2) {
        String strK;
        int i3 = 0;
        if (i2 < 128) {
            T(i2);
            return;
        }
        if (i2 < 2048) {
            Segment segmentJ = J(2);
            int i4 = segmentJ.f45159c;
            byte b2 = (byte) ((i2 >> 6) | PsExtractor.AUDIO_STREAM);
            byte[] bArr = segmentJ.f45157a;
            bArr[i4] = b2;
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            segmentJ.f45159c = i4 + 2;
            this.f45132Y += 2;
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            T(63);
            return;
        }
        if (i2 < 65536) {
            Segment segmentJ2 = J(3);
            int i5 = segmentJ2.f45159c;
            byte[] bArr2 = segmentJ2.f45157a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            segmentJ2.f45159c = i5 + 3;
            this.f45132Y += 3;
            return;
        }
        if (i2 <= 1114111) {
            Segment segmentJ3 = J(4);
            int i6 = segmentJ3.f45159c;
            byte b3 = (byte) ((i2 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            byte[] bArr3 = segmentJ3.f45157a;
            bArr3[i6] = b3;
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            segmentJ3.f45159c = i6 + 4;
            this.f45132Y += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i2 != 0) {
            char[] cArr = okio.internal.ByteString.f45169a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            strK = StringsKt.k(cArr2, i3, 8);
        } else {
            strK = "0";
        }
        sb.append(strK);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return Timeout.NONE;
    }

    public final String toString() {
        return H().toString();
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        P(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i2) {
        T(i2);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeDecimalLong(long j) {
        U(j);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeHexadecimalUnsignedLong(long j) {
        Y(j);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i2) {
        c0(i2);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i2) {
        j0(i2);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(String str) {
        s0(str);
        return this;
    }

    /* JADX INFO: renamed from: okio.Buffer$inputStream$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/Buffer$inputStream$1", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AnonymousClass1 extends InputStream {
        public AnonymousClass1() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(Buffer.this.f45132Y, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            Buffer buffer = Buffer.this;
            if (buffer.f45132Y > 0) {
                return buffer.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public final String toString() {
            return Buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] sink, int i2, int i3) {
            Intrinsics.f(sink, "sink");
            return Buffer.this.read(sink, i2, i3);
        }
    }

    public final String readString(long j, Charset charset) throws EOFException {
        Intrinsics.f(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.i(j, "byteCount: ").toString());
        }
        if (this.f45132Y < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.X;
        Intrinsics.c(segment);
        int i2 = segment.f45158b;
        if (((long) i2) + j > segment.f45159c) {
            return new String(readByteArray(j), charset);
        }
        int i3 = (int) j;
        String str = new String(segment.f45157a, i2, i3, charset);
        int i4 = segment.f45158b + i3;
        segment.f45158b = i4;
        this.f45132Y -= j;
        if (i4 == segment.f45159c) {
            this.X = segment.a();
            SegmentPool.a(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j2);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.b(this, jIndexOf);
        }
        if (j2 < this.f45132Y && r(j2 - 1) == 13 && r(j2) == 10) {
            return okio.internal.Buffer.b(this, j2);
        }
        Buffer buffer = new Buffer();
        q(0L, buffer, Math.min(32, this.f45132Y));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f45132Y, j) + " content=" + buffer.readByteString(buffer.f45132Y).i() + (char) 8230);
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) {
        Segment segmentB;
        Intrinsics.f(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        SegmentedByteString.b(source.f45132Y, 0L, j);
        while (j > 0) {
            Segment segment = source.X;
            Intrinsics.c(segment);
            int i2 = segment.f45159c;
            Segment segment2 = source.X;
            Intrinsics.c(segment2);
            long j2 = i2 - segment2.f45158b;
            int i3 = 0;
            if (j < j2) {
                Segment segment3 = this.X;
                Segment segment4 = segment3 != null ? segment3.g : null;
                if (segment4 != null && segment4.f45160e) {
                    if ((((long) segment4.f45159c) + j) - ((long) (segment4.d ? 0 : segment4.f45158b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        Segment segment5 = source.X;
                        Intrinsics.c(segment5);
                        segment5.d(segment4, (int) j);
                        source.f45132Y -= j;
                        this.f45132Y += j;
                        return;
                    }
                }
                Segment segment6 = source.X;
                Intrinsics.c(segment6);
                int i4 = (int) j;
                if (i4 <= 0 || i4 > segment6.f45159c - segment6.f45158b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    segmentB = segment6.c();
                } else {
                    segmentB = SegmentPool.b();
                    int i5 = segment6.f45158b;
                    ArraysKt.m(0, i5, i5 + i4, segment6.f45157a, segmentB.f45157a);
                }
                segmentB.f45159c = segmentB.f45158b + i4;
                segment6.f45158b += i4;
                Segment segment7 = segment6.g;
                Intrinsics.c(segment7);
                segment7.b(segmentB);
                source.X = segmentB;
            }
            Segment segment8 = source.X;
            Intrinsics.c(segment8);
            long j3 = segment8.f45159c - segment8.f45158b;
            source.X = segment8.a();
            Segment segment9 = this.X;
            if (segment9 == null) {
                this.X = segment8;
                segment8.g = segment8;
                segment8.f = segment8;
            } else {
                Segment segment10 = segment9.g;
                Intrinsics.c(segment10);
                segment10.b(segment8);
                Segment segment11 = segment8.g;
                if (segment11 == segment8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.c(segment11);
                if (segment11.f45160e) {
                    int i6 = segment8.f45159c - segment8.f45158b;
                    Segment segment12 = segment8.g;
                    Intrinsics.c(segment12);
                    int i7 = 8192 - segment12.f45159c;
                    Segment segment13 = segment8.g;
                    Intrinsics.c(segment13);
                    if (!segment13.d) {
                        Segment segment14 = segment8.g;
                        Intrinsics.c(segment14);
                        i3 = segment14.f45158b;
                    }
                    if (i6 <= i7 + i3) {
                        Segment segment15 = segment8.g;
                        Intrinsics.c(segment15);
                        segment8.d(segment15, i6);
                        segment8.a();
                        SegmentPool.a(segment8);
                    }
                }
            }
            source.f45132Y -= j3;
            this.f45132Y += j3;
            j -= j3;
        }
    }

    public final byte[] readByteArray(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.i(j, "byteCount: ").toString());
        }
        if (this.f45132Y >= j) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.i(j, "byteCount: ").toString());
        }
        if (this.f45132Y < j) {
            throw new EOFException();
        }
        if (j >= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            ByteString byteStringI = I((int) j);
            skip(j);
            return byteStringI;
        }
        return new ByteString(readByteArray(j));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.f(sink, "sink");
        Segment segment = this.X;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.f45159c - segment.f45158b);
        sink.put(segment.f45157a, segment.f45158b, iMin);
        int i2 = segment.f45158b + iMin;
        segment.f45158b = i2;
        this.f45132Y -= (long) iMin;
        if (i2 == segment.f45159c) {
            this.X = segment.a();
            SegmentPool.a(segment);
        }
        return iMin;
    }

    public final int read(byte[] sink, int i2, int i3) {
        Intrinsics.f(sink, "sink");
        SegmentedByteString.b(sink.length, i2, i3);
        Segment segment = this.X;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i3, segment.f45159c - segment.f45158b);
        int i4 = segment.f45158b;
        ArraysKt.m(i2, i4, i4 + iMin, segment.f45157a, sink);
        int i5 = segment.f45158b + iMin;
        segment.f45158b = i5;
        this.f45132Y -= (long) iMin;
        if (i5 == segment.f45159c) {
            this.X = segment.a();
            SegmentPool.a(segment);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.f(source, "source");
        int iRemaining = source.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            Segment segmentJ = J(1);
            int iMin = Math.min(i2, 8192 - segmentJ.f45159c);
            source.get(segmentJ.f45157a, segmentJ.f45159c, iMin);
            i2 -= iMin;
            segmentJ.f45159c += iMin;
        }
        this.f45132Y += (long) iRemaining;
        return iRemaining;
    }
}
