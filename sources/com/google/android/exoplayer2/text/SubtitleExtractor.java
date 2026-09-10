package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.IndexSeekMap;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.primitives.Ints;

/* JADX INFO: loaded from: classes3.dex */
public class SubtitleExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExtractorOutput f18470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f18471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18472c;
    public long d;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i2 = this.f18472c;
        Assertions.d((i2 == 0 || i2 == 5) ? false : true);
        int i3 = this.f18472c;
        if (i3 == 1) {
            if (((DefaultExtractorInput) extractorInput).f17527c == -1) {
                throw null;
            }
            Ints.b(((DefaultExtractorInput) extractorInput).f17527c);
            throw null;
        }
        if (i3 == 2) {
            throw null;
        }
        if (i3 == 3) {
            if (((DefaultExtractorInput) extractorInput).g(((DefaultExtractorInput) extractorInput).f17527c != -1 ? Ints.b(((DefaultExtractorInput) extractorInput).f17527c) : 1024) == -1) {
                Assertions.e(this.f18471b);
                throw null;
            }
        }
        return this.f18472c == 4 ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        Assertions.d(this.f18472c == 0);
        this.f18470a = extractorOutput;
        this.f18471b = extractorOutput.track(0, 3);
        this.f18470a.endTracks();
        this.f18470a.g(new IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f18471b.c(null);
        this.f18472c = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
        if (this.f18472c != 5) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        int i2 = this.f18472c;
        Assertions.d((i2 == 0 || i2 == 5) ? false : true);
        this.d = j2;
        if (this.f18472c == 2) {
            this.f18472c = 1;
        }
        if (this.f18472c == 4) {
            this.f18472c = 3;
        }
    }
}
