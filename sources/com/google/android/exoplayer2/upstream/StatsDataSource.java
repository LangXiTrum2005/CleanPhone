package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class StatsDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource f18816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f18818c;
    public Map d;

    public StatsDataSource(DataSource dataSource) {
        dataSource.getClass();
        this.f18816a = dataSource;
        this.f18818c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        this.f18818c = dataSpec.f18742a;
        this.d = Collections.EMPTY_MAP;
        DataSource dataSource = this.f18816a;
        long jA = dataSource.a(dataSpec);
        Uri uri = dataSource.getUri();
        uri.getClass();
        this.f18818c = uri;
        this.d = dataSource.getResponseHeaders();
        return jA;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        this.f18816a.b(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f18816a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        return this.f18816a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f18816a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = this.f18816a.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f18817b += (long) i4;
        }
        return i4;
    }
}
