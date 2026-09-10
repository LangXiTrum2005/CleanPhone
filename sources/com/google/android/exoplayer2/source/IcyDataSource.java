package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class IcyDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource f18334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Listener f18336c;
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18337e;

    public interface Listener {
    }

    public IcyDataSource(DataSource dataSource, int i2, Listener listener) {
        Assertions.b(i2 > 0);
        this.f18334a = dataSource;
        this.f18335b = i2;
        this.f18336c = listener;
        this.d = new byte[1];
        this.f18337e = i2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void b(TransferListener transferListener) {
        transferListener.getClass();
        this.f18334a.b(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        return this.f18334a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f18334a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        long jMax;
        int i4 = this.f18337e;
        DataSource dataSource = this.f18334a;
        if (i4 == 0) {
            byte[] bArr2 = this.d;
            int i5 = 0;
            if (dataSource.read(bArr2, 0, 1) != -1) {
                int i6 = (bArr2[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr3 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int i8 = dataSource.read(bArr3, i5, i7);
                        if (i8 != -1) {
                            i5 += i8;
                            i7 -= i8;
                        }
                    }
                    while (i6 > 0 && bArr3[i6 - 1] == 0) {
                        i6--;
                    }
                    if (i6 > 0) {
                        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3, i6);
                        ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = (ProgressiveMediaPeriod.ExtractingLoadable) this.f18336c;
                        if (extractingLoadable.m) {
                            Map map = ProgressiveMediaPeriod.N0;
                            jMax = Math.max(ProgressiveMediaPeriod.this.j(true), extractingLoadable.j);
                        } else {
                            jMax = extractingLoadable.j;
                        }
                        long j = jMax;
                        int iA = parsableByteArray.a();
                        SampleQueue sampleQueue = extractingLoadable.f18368l;
                        sampleQueue.getClass();
                        sampleQueue.b(iA, parsableByteArray);
                        sampleQueue.f(j, 1, iA, 0, null);
                        extractingLoadable.m = true;
                    }
                }
                this.f18337e = this.f18335b;
            }
            return -1;
        }
        int i9 = dataSource.read(bArr, i2, Math.min(this.f18337e, i3));
        if (i9 != -1) {
            this.f18337e -= i9;
        }
        return i9;
    }
}
