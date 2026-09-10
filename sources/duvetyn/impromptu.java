package duvetyn;

import com.ironsource.X3;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileHandle.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000267B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0015J/\u0010!\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH$¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH$¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH$¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0007H$¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010'\u001a\u00020\u000fH$¢\u0006\u0004\b'\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0016\u0010.\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010-R\u001b\u00105\u001a\u00060/j\u0002`08\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lduvetyn/impromptu;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lduvetyn/wireman;", "sink", "byteCount", "kattegat", "(JLduvetyn/wireman;J)J", "source", "", "seminary", "(JLduvetyn/wireman;J)V", "size", "()J", "flush", "()V", "Lduvetyn/supplicat;", "polder", "(J)Lduvetyn/supplicat;", "Lduvetyn/sealless;", "restrictive", "(J)Lduvetyn/sealless;", "close", "", "array", "", "arrayOffset", "dovishness", "(J[BII)I", "cuirassed", "(J[BII)V", "monoploid", "rotuma", "arytenoidectomy", "kowloon", "Z", "getReadWrite", "()Z", "closed", "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "polloi", "Ljava/util/concurrent/locks/ReentrantLock;", "formularize", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "attabal", "saneness", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class impromptu implements Closeable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean readWrite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int openStreamCount;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final ReentrantLock lock = seminary.saneness();

    /* JADX INFO: compiled from: FileHandle.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lduvetyn/impromptu$attabal;", "Lduvetyn/sealless;", "Lduvetyn/impromptu;", "fileHandle", "", X3.i.L, "<init>", "(Lduvetyn/impromptu;J)V", "Lduvetyn/wireman;", "source", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "close", "kowloon", "Lduvetyn/impromptu;", "getFileHandle", "()Lduvetyn/impromptu;", "arytenoidectomy", "J", "getPosition", "()J", "setPosition", "(J)V", "", "monoploid", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal implements sealless {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public long position;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final impromptu fileHandle;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public attabal(impromptu fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j;
        }

        @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                this.fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.f29295attabal;
                    lock.unlock();
                    this.fileHandle.arytenoidectomy();
                    return;
                }
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }

        @Override // duvetyn.sealless, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.fileHandle.monoploid();
        }

        @Override // duvetyn.sealless
        public void supplicat(wireman source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.fileHandle.seminary(this.position, source, byteCount);
            this.position += byteCount;
        }

        @Override // duvetyn.sealless
        public restrictive timeout() {
            return restrictive.f25446marial;
        }
    }

    /* JADX INFO: compiled from: FileHandle.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lduvetyn/impromptu$saneness;", "Lduvetyn/supplicat;", "Lduvetyn/impromptu;", "fileHandle", "", X3.i.L, "<init>", "(Lduvetyn/impromptu;J)V", "Lduvetyn/wireman;", "sink", "byteCount", "read", "(Lduvetyn/wireman;J)J", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", "close", "()V", "kowloon", "Lduvetyn/impromptu;", "getFileHandle", "()Lduvetyn/impromptu;", "arytenoidectomy", "J", "getPosition", "()J", "setPosition", "(J)V", "", "monoploid", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness implements supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public long position;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final impromptu fileHandle;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        public saneness(impromptu fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j;
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                this.fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.f29295attabal;
                    lock.unlock();
                    this.fileHandle.arytenoidectomy();
                    return;
                }
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }

        @Override // duvetyn.supplicat
        public long read(wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long jKattegat = this.fileHandle.kattegat(this.position, sink, byteCount);
            if (jKattegat != -1) {
                this.position += jKattegat;
            }
            return jKattegat;
        }

        @Override // duvetyn.supplicat
        public restrictive timeout() {
            return restrictive.f25446marial;
        }
    }

    public impromptu(boolean z) {
        this.readWrite = z;
    }

    public static /* synthetic */ sealless merc(impromptu impromptuVar, long j, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return impromptuVar.restrictive(j);
    }

    public abstract void arytenoidectomy() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                reentrantLock.unlock();
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.f29295attabal;
            reentrantLock.unlock();
            arytenoidectomy();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void cuirassed(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException;

    public abstract int dovishness(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws IOException;

    public final void flush() throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f29295attabal;
            reentrantLock.unlock();
            monoploid();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long kattegat(long fileOffset, wireman sink, long byteCount) throws IOException {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        long j = byteCount + fileOffset;
        long j2 = fileOffset;
        while (j2 < j) {
            oilcan oilcanVarMilliradian = sink.milliradian(1);
            byte[] bArr = oilcanVarMilliradian.data;
            int i = oilcanVarMilliradian.limit;
            int iDovishness = dovishness(j2, bArr, i, (int) Math.min(j - j2, 8192 - i));
            if (iDovishness == -1) {
                if (oilcanVarMilliradian.pos == oilcanVarMilliradian.limit) {
                    sink.head = oilcanVarMilliradian.saneness();
                    yemenite.saneness(oilcanVarMilliradian);
                }
                if (fileOffset != j2) {
                    break;
                }
                return -1L;
            }
            oilcanVarMilliradian.limit += iDovishness;
            long j3 = iDovishness;
            j2 += j3;
            sink.starveling(sink.getSize() + j3);
        }
        return j2 - fileOffset;
    }

    public abstract void monoploid() throws IOException;

    public final supplicat polder(long fileOffset) throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new saneness(this, fileOffset);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final sealless restrictive(long fileOffset) throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new attabal(this, fileOffset);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract long rotuma() throws IOException;

    public final void seminary(long fileOffset, wireman source, long byteCount) throws IOException {
        duvetyn.attabal.saneness(source.getSize(), 0L, byteCount);
        long j = fileOffset + byteCount;
        long j2 = fileOffset;
        while (j2 < j) {
            oilcan oilcanVar = source.head;
            Intrinsics.beachfront(oilcanVar);
            int iMin = (int) Math.min(j - j2, oilcanVar.limit - oilcanVar.pos);
            cuirassed(j2, oilcanVar.data, oilcanVar.pos, iMin);
            oilcanVar.pos += iMin;
            long j3 = iMin;
            j2 += j3;
            source.starveling(source.getSize() - j3);
            if (oilcanVar.pos == oilcanVar.limit) {
                source.head = oilcanVar.saneness();
                yemenite.saneness(oilcanVar);
            }
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f29295attabal;
            reentrantLock.unlock();
            return rotuma();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
