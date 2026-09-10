package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaceholderDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PlaceholderDataSource f18802a = new PlaceholderDataSource();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException();
    }
}
