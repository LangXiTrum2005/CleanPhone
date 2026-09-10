package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.extractor.TrackOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class IcyDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSource f6367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Listener f6369c;
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6370e;

    public interface Listener {
    }

    public IcyDataSource(DataSource dataSource, int i2, Listener listener) {
        Assertions.b(i2 > 0);
        this.f6367a = dataSource;
        this.f6368b = i2;
        this.f6369c = listener;
        this.d = new byte[1];
        this.f6370e = i2;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void a(TransferListener transferListener) {
        transferListener.getClass();
        this.f6367a.a(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        return this.f6367a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f6367a.getUri();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        long jMax;
        int i4 = this.f6370e;
        DataSource dataSource = this.f6367a;
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
                        ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = (ProgressiveMediaPeriod.ExtractingLoadable) this.f6369c;
                        if (extractingLoadable.m) {
                            Map map = ProgressiveMediaPeriod.P0;
                            jMax = Math.max(ProgressiveMediaPeriod.this.k(true), extractingLoadable.j);
                        } else {
                            jMax = extractingLoadable.j;
                        }
                        long j = jMax;
                        int iA = parsableByteArray.a();
                        TrackOutput trackOutput = extractingLoadable.f6405l;
                        trackOutput.getClass();
                        trackOutput.e(iA, parsableByteArray);
                        trackOutput.f(j, 1, iA, 0, null);
                        extractingLoadable.m = true;
                    }
                }
                this.f6370e = this.f6368b;
            }
            return -1;
        }
        int i9 = dataSource.read(bArr, i2, Math.min(this.f6370e, i3));
        if (i9 != -1) {
            this.f6370e -= i9;
        }
        return i9;
    }
}
