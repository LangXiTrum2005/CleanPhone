package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
abstract class StreamReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f17880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExtractorOutput f17881c;
    public OggSeeker d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17882e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17884i;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17885l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OggPacket f17879a = new OggPacket();
    public SetupData j = new SetupData();

    public static class SetupData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Format f17886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlacReader.FlacOggSeeker f17887b;
    }

    public static final class UnseekableOggSeeker implements OggSeeker {
        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public final long a(DefaultExtractorInput defaultExtractorInput) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public final SeekMap createSeekMap() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public final void startSeek(long j) {
        }
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(ParsableByteArray parsableByteArray);

    public abstract boolean c(ParsableByteArray parsableByteArray, long j, SetupData setupData);

    public void d(boolean z2) {
        if (z2) {
            this.j = new SetupData();
            this.f = 0L;
            this.f17883h = 0;
        } else {
            this.f17883h = 1;
        }
        this.f17882e = -1L;
        this.g = 0L;
    }
}
