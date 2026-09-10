package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.datasource.DataSource;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtractorsFactory f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Extractor f6341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DefaultExtractorInput f6342c;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.f6340a = extractorsFactory;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void a() {
        Extractor extractor = this.f6341b;
        if (extractor == null) {
            return;
        }
        Extractor extractorB = extractor.b();
        if (extractorB instanceof Mp3Extractor) {
            ((Mp3Extractor) extractorB).f7042p = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final long b() {
        DefaultExtractorInput defaultExtractorInput = this.f6342c;
        if (defaultExtractorInput != null) {
            return defaultExtractorInput.d;
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final int c(PositionHolder positionHolder) {
        Extractor extractor = this.f6341b;
        extractor.getClass();
        DefaultExtractorInput defaultExtractorInput = this.f6342c;
        defaultExtractorInput.getClass();
        return extractor.f(defaultExtractorInput, positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void d(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) throws UnrecognizedInputFormatException {
        boolean z2;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, j, j2);
        this.f6342c = defaultExtractorInput;
        if (this.f6341b != null) {
            return;
        }
        Extractor[] extractorArrB = this.f6340a.b(uri, map);
        ImmutableList.Builder builderT = ImmutableList.t(extractorArrB.length);
        boolean z3 = true;
        if (extractorArrB.length == 1) {
            this.f6341b = extractorArrB[0];
        } else {
            for (Extractor extractor : extractorArrB) {
                try {
                    if (extractor.c(defaultExtractorInput)) {
                        this.f6341b = extractor;
                        defaultExtractorInput.f = 0;
                        break;
                    } else {
                        builderT.f(extractor.e());
                        z2 = this.f6341b != null || defaultExtractorInput.d == j;
                    }
                } catch (EOFException unused) {
                    z2 = this.f6341b != null || defaultExtractorInput.d == j;
                } catch (Throwable th) {
                    if (this.f6341b == null && defaultExtractorInput.d != j) {
                        z3 = false;
                    }
                    Assertions.e(z3);
                    defaultExtractorInput.f = 0;
                    throw th;
                }
                Assertions.e(z2);
                defaultExtractorInput.f = 0;
            }
            if (this.f6341b == null) {
                String str = "None of the available extractors (" + new Joiner(", ").c(Lists.c(ImmutableList.v(extractorArrB), new k(1))) + ") could read the stream.";
                uri.getClass();
                ImmutableList immutableListJ = builderT.j();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(str, null, false, 1);
                ImmutableList.u(immutableListJ);
                throw unrecognizedInputFormatException;
            }
        }
        this.f6341b.d(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void release() {
        Extractor extractor = this.f6341b;
        if (extractor != null) {
            extractor.release();
            this.f6341b = null;
        }
        this.f6342c = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void seek(long j, long j2) {
        Extractor extractor = this.f6341b;
        extractor.getClass();
        extractor.seek(j, j2);
    }
}
