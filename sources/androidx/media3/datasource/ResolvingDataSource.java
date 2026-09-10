package androidx.media3.datasource;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ResolvingDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5781a;

    public static final class Factory implements DataSource.Factory {
    }

    public interface Resolver {
    }

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
        if (this.f5781a) {
            this.f5781a = false;
            throw null;
        }
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
        throw null;
    }
}
