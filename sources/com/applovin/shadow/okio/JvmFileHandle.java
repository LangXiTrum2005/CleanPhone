package com.applovin.shadow.okio;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/applovin/shadow/okio/JvmFileHandle;", "Lcom/applovin/shadow/okio/FileHandle;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", "size", "Lwj/r;", "protectedResize", "(J)V", "protectedSize", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedRead", "(J[BII)I", "protectedWrite", "(J[BII)V", "protectedFlush", "()V", "protectedClose", "Ljava/io/RandomAccessFile;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        n.f(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        n.f(array, "array");
        this.randomAccessFile.seek(fileOffset);
        int i10 = 0;
        while (i10 < byteCount) {
            int i11 = this.randomAccessFile.read(array, arrayOffset, byteCount - i10);
            if (i11 == -1) {
                if (i10 != 0) {
                    break;
                }
                return -1;
            }
            i10 += i11;
        }
        return i10;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedResize(long size) throws Throwable {
        JvmFileHandle jvmFileHandle;
        try {
            try {
                long size2 = size();
                long j10 = size - size2;
                if (j10 > 0) {
                    int i10 = (int) j10;
                    jvmFileHandle = this;
                    jvmFileHandle.protectedWrite(size2, new byte[i10], 0, i10);
                } else {
                    jvmFileHandle = this;
                    jvmFileHandle.randomAccessFile.setLength(size);
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
        throw th;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        n.f(array, "array");
        this.randomAccessFile.seek(fileOffset);
        this.randomAccessFile.write(array, arrayOffset, byteCount);
    }
}
