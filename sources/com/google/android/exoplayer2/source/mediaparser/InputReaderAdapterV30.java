package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataSource f18442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18444c;
    public long d;

    public final long getLength() {
        return this.f18443b;
    }

    public final long getPosition() {
        return this.f18444c;
    }

    public final int read(byte[] bArr, int i2, int i3) {
        DataSource dataSource = this.f18442a;
        int i4 = Util.f18979a;
        int i5 = dataSource.read(bArr, i2, i3);
        this.f18444c += (long) i5;
        return i5;
    }

    public final void seekToPosition(long j) {
        this.d = j;
    }
}
