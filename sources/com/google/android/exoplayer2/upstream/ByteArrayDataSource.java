package com.google.android.exoplayer2.upstream;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteArrayDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f18734e;
    public int f;
    public int g;

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        this.f18734e = dataSpec.f18742a;
        e(dataSpec);
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f18734e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f18734e;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.g;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(null, this.f, bArr, i2, iMin);
        this.f += iMin;
        this.g -= iMin;
        c(iMin);
        return iMin;
    }
}
