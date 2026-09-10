package duvetyn;

import java.io.RandomAccessFile;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lduvetyn/polloi;", "Lduvetyn/impromptu;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", "rotuma", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "dovishness", "(J[BII)I", "", "cuirassed", "(J[BII)V", "monoploid", "()V", "arytenoidectomy", "molybdenite", "Ljava/io/RandomAccessFile;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class polloi extends impromptu {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public polloi(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // duvetyn.impromptu
    public synchronized void arytenoidectomy() {
        this.randomAccessFile.close();
    }

    @Override // duvetyn.impromptu
    public synchronized void cuirassed(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.randomAccessFile.seek(fileOffset);
        this.randomAccessFile.write(array, arrayOffset, byteCount);
    }

    @Override // duvetyn.impromptu
    public synchronized int dovishness(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.randomAccessFile.seek(fileOffset);
        int i = 0;
        while (i < byteCount) {
            int i2 = this.randomAccessFile.read(array, arrayOffset, byteCount - i);
            if (i2 == -1) {
                if (i != 0) {
                    break;
                }
                return -1;
            }
            i += i2;
        }
        return i;
    }

    @Override // duvetyn.impromptu
    public synchronized void monoploid() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // duvetyn.impromptu
    public synchronized long rotuma() {
        return this.randomAccessFile.length();
    }
}
