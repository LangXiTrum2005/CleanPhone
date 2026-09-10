package androidx.media3.datasource;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AesCipherDataSource implements DataSource {
    @Override // androidx.media3.datasource.DataSource
    public final void a(TransferListener transferListener) {
        transferListener.getClass();
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        throw null;
    }
}
