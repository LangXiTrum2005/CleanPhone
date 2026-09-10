package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PriorityDataSource implements DataSource {

    public static final class Factory implements DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        throw null;
    }
}
