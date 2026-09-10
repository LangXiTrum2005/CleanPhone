package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class DummyTrackOutput implements TrackOutput {
    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i2, int i3) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void b(Format format) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int c(DataReader dataReader, int i2, boolean z2) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int d(DataReader dataReader, int i2, boolean z2) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void e(int i2, ParsableByteArray parsableByteArray) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
        throw null;
    }
}
