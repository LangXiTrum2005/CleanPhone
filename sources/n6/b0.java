package n6;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46570b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f46569a = i10;
        this.f46570b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f46569a;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        int iLimit;
        switch (this.f46569a) {
            case 0:
                iLimit = ((ByteBuffer) this.f46570b).limit();
                break;
            default:
                iLimit = ((byte[]) this.f46570b).length;
                break;
        }
        return iLimit;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        switch (this.f46569a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f46570b;
                if (j10 >= byteBuffer.limit()) {
                    return -1;
                }
                byteBuffer.position((int) j10);
                int iMin = Math.min(i11, byteBuffer.remaining());
                byteBuffer.get(bArr, i10, iMin);
                return iMin;
            default:
                byte[] bArr2 = (byte[]) this.f46570b;
                if (j10 >= bArr2.length) {
                    return -1;
                }
                if (((long) i11) + j10 > bArr2.length) {
                    i11 = (int) (((long) bArr2.length) - j10);
                }
                System.arraycopy(bArr2, (int) j10, bArr, i10, i11);
                return i11;
        }
    }

    private final void d() {
    }

    private final void h() {
    }
}
