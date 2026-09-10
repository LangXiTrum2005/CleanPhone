package androidx.media3.datasource;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class StatsDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource f5782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f5784c;
    public Map d;

    public StatsDataSource(DataSource dataSource) {
        dataSource.getClass();
        this.f5782a = dataSource;
        this.f5784c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void a(TransferListener transferListener) {
        transferListener.getClass();
        this.f5782a.a(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        this.f5784c = dataSpec.f5736a;
        this.d = Collections.EMPTY_MAP;
        DataSource dataSource = this.f5782a;
        long jB = dataSource.b(dataSpec);
        Uri uri = dataSource.getUri();
        uri.getClass();
        this.f5784c = uri;
        this.d = dataSource.getResponseHeaders();
        return jB;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f5782a.close();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        return this.f5782a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f5782a.getUri();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = this.f5782a.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f5783b += (long) i4;
        }
        return i4;
    }
}
