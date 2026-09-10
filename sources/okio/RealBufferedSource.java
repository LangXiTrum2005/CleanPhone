package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.a;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSource implements BufferedSource {
    public final Source X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Buffer f45156Y;
    public boolean Z;

    public RealBufferedSource(Source source) {
        Intrinsics.f(source, "source");
        this.X = source;
        this.f45156Y = new Buffer();
    }

    @Override // okio.BufferedSource
    public final int S0(Options options) {
        Buffer buffer;
        Intrinsics.f(options, "options");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        do {
            buffer = this.f45156Y;
            int iC = okio.internal.Buffer.c(buffer, options, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                buffer.skip(options.X[iC].h());
                return iC;
            }
        } while (this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    public final long a(ByteString targetBytes) {
        Intrinsics.f(targetBytes, "targetBytes");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            Buffer buffer = this.f45156Y;
            long jS = buffer.s(jMax, targetBytes);
            if (jS != -1) {
                return jS;
            }
            long j = buffer.f45132Y;
            if (this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.close();
        this.f45156Y.k();
    }

    @Override // okio.BufferedSource
    public final void e(Buffer sink, long j) throws EOFException {
        Buffer buffer = this.f45156Y;
        Intrinsics.f(sink, "sink");
        try {
            require(j);
            buffer.e(sink, j);
        } catch (EOFException e2) {
            sink.g(buffer);
            throw e2;
        }
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f45156Y;
        return buffer.exhausted() && this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // okio.BufferedSource
    public final boolean f(long j, ByteString bytes) {
        Intrinsics.f(bytes, "bytes");
        int iH = bytes.h();
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0 && iH >= 0 && bytes.h() >= iH) {
            for (int i2 = 0; i2 < iH; i2++) {
                long j2 = ((long) i2) + j;
                if (request(1 + j2) && this.f45156Y.r(j2) == bytes.m(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: getBuffer, reason: from getter */
    public final Buffer getF45155Y() {
        return this.f45156Y;
    }

    public final long indexOf(byte b2, long j, long j2) {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(a.i(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            Buffer buffer = this.f45156Y;
            byte b3 = b2;
            long j3 = j2;
            long jIndexOf = buffer.indexOf(b3, jMax, j3);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j4 = buffer.f45132Y;
            if (j4 >= j3 || this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b2 = b3;
            j2 = j3;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new AnonymousClass1();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.Z;
    }

    @Override // okio.BufferedSource
    public final long o0(Buffer buffer) {
        Buffer buffer2;
        long j = 0;
        while (true) {
            buffer2 = this.f45156Y;
            if (this.X.read(buffer2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long jP = buffer2.p();
            if (jP > 0) {
                j += jP;
                buffer.write(buffer2, jP);
            }
        }
        long j2 = buffer2.f45132Y;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        buffer.write(buffer2, j2);
        return j3;
    }

    @Override // okio.BufferedSource
    public final RealBufferedSource peek() {
        return Okio.d(new PeekSource(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.f(sink, "sink");
        Buffer buffer = this.f45156Y;
        if (buffer.f45132Y == 0 && this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return buffer.read(sink);
    }

    @Override // okio.BufferedSource
    public final byte readByte() throws EOFException {
        require(1L);
        return this.f45156Y.readByte();
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        Source source = this.X;
        Buffer buffer = this.f45156Y;
        buffer.g(source);
        return buffer.readByteArray(buffer.f45132Y);
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString() {
        Source source = this.X;
        Buffer buffer = this.f45156Y;
        buffer.g(source);
        return buffer.readByteString(buffer.f45132Y);
    }

    @Override // okio.BufferedSource
    public final long readDecimalLong() throws EOFException {
        Buffer buffer;
        require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            boolean zRequest = request(j2);
            buffer = this.f45156Y;
            if (!zRequest) {
                break;
            }
            byte bR = buffer.r(j);
            if ((bR < 48 || bR > 57) && !(j == 0 && bR == 45)) {
                if (j != 0) {
                    break;
                }
                CharsKt.b(16);
                CharsKt.b(16);
                String string = Integer.toString(bR, 16);
                Intrinsics.e(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j = j2;
        }
        return buffer.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Buffer buffer = this.f45156Y;
        Intrinsics.f(sink, "sink");
        try {
            require(sink.length);
            buffer.readFully(sink);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                long j = buffer.f45132Y;
                if (j <= 0) {
                    throw e2;
                }
                int i3 = buffer.read(sink, i2, (int) j);
                if (i3 == -1) {
                    throw new AssertionError();
                }
                i2 += i3;
            }
        }
    }

    @Override // okio.BufferedSource
    public final long readHexadecimalUnsignedLong() throws EOFException {
        Buffer buffer;
        require(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            boolean zRequest = request(i3);
            buffer = this.f45156Y;
            if (!zRequest) {
                break;
            }
            byte bR = buffer.r(i2);
            if ((bR < 48 || bR > 57) && ((bR < 97 || bR > 102) && (bR < 65 || bR > 70))) {
                if (i2 != 0) {
                    break;
                }
                CharsKt.b(16);
                CharsKt.b(16);
                String string = Integer.toString(bR, 16);
                Intrinsics.e(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i2 = i3;
        }
        return buffer.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        require(4L);
        return this.f45156Y.readInt();
    }

    public final int readIntLe() throws EOFException {
        require(4L);
        return SegmentedByteString.c(this.f45156Y.readInt());
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        require(8L);
        return this.f45156Y.readLong();
    }

    public final long readLongLe() throws EOFException {
        require(8L);
        long j = this.f45156Y.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        require(2L);
        return this.f45156Y.readShort();
    }

    public final short readShortLe() throws EOFException {
        require(2L);
        return this.f45156Y.readShortLe();
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) {
        Intrinsics.f(charset, "charset");
        Source source = this.X;
        Buffer buffer = this.f45156Y;
        buffer.g(source);
        return buffer.readString(charset);
    }

    public final String readUtf8(long j) throws EOFException {
        require(j);
        Buffer buffer = this.f45156Y;
        buffer.getClass();
        return buffer.readString(j, Charsets.f44691a);
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        Buffer buffer;
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
        }
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        do {
            buffer = this.f45156Y;
            if (buffer.f45132Y >= j) {
                return true;
            }
        } while (this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // okio.BufferedSource
    public final void require(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final void skip(long j) throws EOFException {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            Buffer buffer = this.f45156Y;
            if (buffer.f45132Y == 0 && this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, buffer.f45132Y);
            buffer.skip(jMin);
            j -= jMin;
        }
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45149Y() {
        return this.X.getF45149Y();
    }

    public final String toString() {
        return "buffer(" + this.X + ')';
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j2);
        Buffer buffer = this.f45156Y;
        if (jIndexOf != -1) {
            return okio.internal.Buffer.b(buffer, jIndexOf);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && buffer.r(j2 - 1) == 13 && request(j2 + 1) && buffer.r(j2) == 10) {
            return okio.internal.Buffer.b(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.q(0L, buffer2, Math.min(32, buffer.f45132Y));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.f45132Y, j) + " content=" + buffer2.readByteString(buffer2.f45132Y).i() + (char) 8230);
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.f(sink, "sink");
        if (j >= 0) {
            if (!this.Z) {
                Buffer buffer = this.f45156Y;
                if (buffer.f45132Y == 0 && this.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1L;
                }
                return buffer.read(sink, Math.min(j, buffer.f45132Y));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString(long j) throws EOFException {
        require(j);
        return this.f45156Y.readByteString(j);
    }

    /* JADX INFO: renamed from: okio.RealBufferedSource$inputStream$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/RealBufferedSource$inputStream$1", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AnonymousClass1 extends InputStream {
        public AnonymousClass1() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (realBufferedSource.Z) {
                throw new IOException("closed");
            }
            return (int) Math.min(realBufferedSource.f45156Y.f45132Y, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            RealBufferedSource.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (realBufferedSource.Z) {
                throw new IOException("closed");
            }
            Buffer buffer = realBufferedSource.f45156Y;
            if (buffer.f45132Y == 0 && realBufferedSource.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return buffer.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        public final String toString() {
            return RealBufferedSource.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] data, int i2, int i3) throws IOException {
            Intrinsics.f(data, "data");
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (!realBufferedSource.Z) {
                SegmentedByteString.b(data.length, i2, i3);
                Buffer buffer = realBufferedSource.f45156Y;
                if (buffer.f45132Y == 0 && realBufferedSource.X.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return buffer.read(data, i2, i3);
            }
            throw new IOException("closed");
        }
    }
}
