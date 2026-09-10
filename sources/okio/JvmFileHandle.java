package okio;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JvmFileHandle extends FileHandle {
    public final RandomAccessFile f0;

    public JvmFileHandle(boolean z2, RandomAccessFile randomAccessFile) {
        super(z2);
        this.f0 = randomAccessFile;
    }

    @Override // okio.FileHandle
    public final synchronized void d() {
        this.f0.close();
    }

    @Override // okio.FileHandle
    public final synchronized void h() {
        this.f0.getFD().sync();
    }

    @Override // okio.FileHandle
    public final synchronized int i(long j, byte[] array, int i2, int i3) {
        Intrinsics.f(array, "array");
        this.f0.seek(j);
        int i4 = 0;
        while (i4 < i3) {
            int i5 = this.f0.read(array, i2, i3 - i4);
            if (i5 == -1) {
                if (i4 != 0) {
                    break;
                }
                return -1;
            }
            i4 += i5;
        }
        return i4;
    }

    @Override // okio.FileHandle
    public final synchronized long k() {
        return this.f0.length();
    }

    @Override // okio.FileHandle
    public final synchronized void l(long j, byte[] array, int i2, int i3) {
        Intrinsics.f(array, "array");
        this.f0.seek(j);
        this.f0.write(array, i2, i3);
    }
}
