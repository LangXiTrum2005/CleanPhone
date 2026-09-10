package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TeeDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSink f18820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18821c;
    public long d;

    public TeeDataSource(DataSource dataSource, DataSink dataSink) {
        this.f18819a = dataSource;
        dataSink.getClass();
        this.f18820b = dataSink;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        long jA = this.f18819a.a(dataSpec);
        this.d = jA;
        if (jA == 0) {
            return 0L;
        }
        long j = dataSpec.g;
        if (j == -1 && jA != -1 && j != jA) {
            dataSpec = new DataSpec(dataSpec.f18742a, dataSpec.f18743b, dataSpec.f18744c, dataSpec.d, dataSpec.f18745e, dataSpec.f, jA, dataSpec.f18746h, dataSpec.f18747i);
        }
        this.f18821c = true;
        this.f18820b.a(dataSpec);
        return this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        this.f18819a.b(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        DataSink dataSink = this.f18820b;
        try {
            this.f18819a.close();
        } finally {
            if (this.f18821c) {
                this.f18821c = false;
                dataSink.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        return this.f18819a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f18819a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        if (this.d == 0) {
            return -1;
        }
        int i4 = this.f18819a.read(bArr, i2, i3);
        if (i4 > 0) {
            this.f18820b.write(bArr, i2, i4);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) i4);
            }
        }
        return i4;
    }
}
