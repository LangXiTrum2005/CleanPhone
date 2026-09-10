package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSink implements BufferedSink {
    public final Sink X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Buffer f45155Y;
    public boolean Z;

    public RealBufferedSink(Sink sink) {
        Intrinsics.f(sink, "sink");
        this.X = sink;
        this.f45155Y = new Buffer();
    }

    @Override // okio.BufferedSink
    public final BufferedSink H0(ByteString byteString) {
        Intrinsics.f(byteString, "byteString");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.K(byteString);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink M0(int i2, int i3, byte[] source) {
        Intrinsics.f(source, "source");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.S(source, i2, i3);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Sink sink = this.X;
        if (this.Z) {
            return;
        }
        Buffer buffer = this.f45155Y;
        long j = buffer.f45132Y;
        if (j > 0) {
            sink.write(buffer, j);
        }
        th = null;
        try {
            sink.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.Z = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink emit() {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f45155Y;
        long j = buffer.f45132Y;
        if (j > 0) {
            this.X.write(buffer, j);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink emitCompleteSegments() {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f45155Y;
        long jP = buffer.p();
        if (jP > 0) {
            this.X.write(buffer, jP);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f45155Y;
        long j = buffer.f45132Y;
        Sink sink = this.X;
        if (j > 0) {
            sink.write(buffer, j);
        }
        sink.flush();
    }

    @Override // okio.BufferedSink
    public final long g(Source source) {
        long j = 0;
        while (true) {
            long j2 = ((InputStreamSource) source).read(this.f45155Y, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: getBuffer, reason: from getter */
    public final Buffer getF45156Y() {
        return this.f45155Y;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.Z;
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45152Y() {
        return this.X.getF45152Y();
    }

    public final String toString() {
        return "buffer(" + this.X + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.f(source, "source");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f45155Y.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i2) {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.T(i2);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeDecimalLong(long j) {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.U(j);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.Y(j);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i2) {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.c0(i2);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i2) {
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.j0(i2);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(String string) {
        Intrinsics.f(string, "string");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        this.f45155Y.s0(string);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) {
        Intrinsics.f(source, "source");
        if (!this.Z) {
            this.f45155Y.write(source, j);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] source) {
        Intrinsics.f(source, "source");
        if (!this.Z) {
            this.f45155Y.P(source);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
