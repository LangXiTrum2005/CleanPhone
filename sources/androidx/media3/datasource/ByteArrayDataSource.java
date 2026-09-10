package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.Assertions;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f5726e;
    public int f;
    public int g;

    public interface UriResolver {
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        e(dataSpec);
        this.f5726e = dataSpec.f5736a;
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f5726e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f5726e;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.g;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        Assertions.f(null);
        System.arraycopy(null, this.f, bArr, i2, iMin);
        this.f += iMin;
        this.g -= iMin;
        c(iMin);
        return iMin;
    }
}
