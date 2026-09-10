package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataSource f6484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6486c;
    public long d;

    public final long getLength() {
        return this.f6485b;
    }

    public final long getPosition() {
        return this.f6486c;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        DataSource dataSource = this.f6484a;
        int i4 = Util.f5683a;
        int i5 = dataSource.read(bArr, i2, i3);
        this.f6486c += (long) i5;
        return i5;
    }

    public final void seekToPosition(long j) {
        this.d = j;
    }
}
