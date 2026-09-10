package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleTranscodingExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Extractor f7219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultSubtitleParserFactory f7220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SubtitleTranscodingExtractorOutput f7221c;

    public SubtitleTranscodingExtractor(Extractor extractor, DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        this.f7219a = extractor;
        this.f7220b = defaultSubtitleParserFactory;
    }

    @Override // androidx.media3.extractor.Extractor
    public final Extractor b() {
        return this.f7219a;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return this.f7219a.c(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.f7220b);
        this.f7221c = subtitleTranscodingExtractorOutput;
        this.f7219a.d(subtitleTranscodingExtractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f7219a.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        this.f7219a.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = this.f7221c;
        if (subtitleTranscodingExtractorOutput != null) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = subtitleTranscodingExtractorOutput.Z;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                SubtitleParser subtitleParser = ((SubtitleTranscodingTrackOutput) sparseArray.valueAt(i2)).g;
                if (subtitleParser != null) {
                    subtitleParser.reset();
                }
                i2++;
            }
        }
        this.f7219a.seek(j, j2);
    }
}
