package a1;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3318b;

    public a(g gVar) {
        this.f3318b = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f3317a;
            g gVar = this.f3318b;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) gVar.f3319a.available())) {
                    return -1;
                }
                gVar.h(j10);
                this.f3317a = j10;
            }
            if (i11 > gVar.f3319a.available()) {
                i11 = gVar.f3319a.available();
            }
            int i12 = gVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f3317a += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f3317a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
