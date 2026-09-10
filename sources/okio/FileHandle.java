package okio;

import androidx.datastore.preferences.protobuf.a;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "FileHandleSink", "FileHandleSource", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileHandle implements Closeable {
    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f45136Y;
    public int Z;
    public final ReentrantLock e0 = new ReentrantLock();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileHandleSink implements Sink {
        public long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f45137Y;

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f45137Y) {
                return;
            }
            this.f45137Y = true;
            throw null;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            if (!this.f45137Y) {
                throw null;
            }
            throw new IllegalStateException("closed");
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return Timeout.NONE;
        }

        @Override // okio.Sink
        public final void write(Buffer source, long j) {
            Intrinsics.f(source, "source");
            if (!this.f45137Y) {
                throw null;
            }
            throw new IllegalStateException("closed");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileHandleSource implements Source {
        public final FileHandle X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public long f45138Y;
        public boolean Z;

        public FileHandleSource(FileHandle fileHandle, long j) {
            Intrinsics.f(fileHandle, "fileHandle");
            this.X = fileHandle;
            this.f45138Y = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.Z) {
                return;
            }
            this.Z = true;
            FileHandle fileHandle = this.X;
            ReentrantLock reentrantLock = fileHandle.e0;
            reentrantLock.lock();
            try {
                int i2 = fileHandle.Z - 1;
                fileHandle.Z = i2;
                if (i2 == 0 && fileHandle.f45136Y) {
                    reentrantLock.unlock();
                    fileHandle.d();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.Source
        public final long read(Buffer sink, long j) {
            long j2;
            long j3;
            Intrinsics.f(sink, "sink");
            if (this.Z) {
                throw new IllegalStateException("closed");
            }
            long j4 = this.f45138Y;
            FileHandle fileHandle = this.X;
            fileHandle.getClass();
            if (j < 0) {
                throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 < j5) {
                    Segment segmentJ = sink.J(1);
                    int i2 = segmentJ.f45159c;
                    j2 = -1;
                    long j7 = j5;
                    int i3 = fileHandle.i(j6, segmentJ.f45157a, i2, (int) Math.min(j5 - j6, 8192 - i2));
                    if (i3 == -1) {
                        if (segmentJ.f45158b == segmentJ.f45159c) {
                            sink.X = segmentJ.a();
                            SegmentPool.a(segmentJ);
                        }
                        if (j4 == j6) {
                            j3 = -1;
                            break;
                        }
                    } else {
                        segmentJ.f45159c += i3;
                        long j8 = i3;
                        j6 += j8;
                        sink.f45132Y += j8;
                        j5 = j7;
                    }
                } else {
                    j2 = -1;
                }
                j3 = j6 - j4;
                break;
            }
            if (j3 != j2) {
                this.f45138Y += j3;
            }
            return j3;
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return Timeout.NONE;
        }
    }

    public FileHandle(boolean z2) {
        this.X = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.e0;
        reentrantLock.lock();
        try {
            if (this.f45136Y) {
                reentrantLock.unlock();
                return;
            }
            this.f45136Y = true;
            if (this.Z != 0) {
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                d();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void d();

    public final void flush() {
        if (!this.X) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.e0;
        reentrantLock.lock();
        try {
            if (this.f45136Y) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            h();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void h();

    public abstract int i(long j, byte[] bArr, int i2, int i3);

    public abstract long k();

    public abstract void l(long j, byte[] bArr, int i2, int i3);

    public final long m() {
        ReentrantLock reentrantLock = this.e0;
        reentrantLock.lock();
        try {
            if (this.f45136Y) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return k();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Source n(long j) {
        ReentrantLock reentrantLock = this.e0;
        reentrantLock.lock();
        try {
            if (this.f45136Y) {
                throw new IllegalStateException("closed");
            }
            this.Z++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
