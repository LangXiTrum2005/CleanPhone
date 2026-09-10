package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    public final ExtractorOutput X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SubtitleParser.Factory f7222Y;
    public final SparseArray Z = new SparseArray();

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.X = extractorOutput;
        this.f7222Y = factory;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void e(SeekMap seekMap) {
        this.X.e(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void endTracks() {
        this.X.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        ExtractorOutput extractorOutput = this.X;
        if (i3 != 3) {
            return extractorOutput.track(i2, i3);
        }
        SparseArray sparseArray = this.Z;
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = (SubtitleTranscodingTrackOutput) sparseArray.get(i2);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(extractorOutput.track(i2, i3), this.f7222Y);
        sparseArray.put(i2, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }
}
