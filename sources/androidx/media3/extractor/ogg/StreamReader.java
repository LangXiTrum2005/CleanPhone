package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
abstract class StreamReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f7189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExtractorOutput f7190c;
    public OggSeeker d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7191e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7193i;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7194l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OggPacket f7188a = new OggPacket();
    public SetupData j = new SetupData();

    public static class SetupData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Format f7195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlacReader.FlacOggSeeker f7196b;
    }

    public static final class UnseekableOggSeeker implements OggSeeker {
        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final long a(DefaultExtractorInput defaultExtractorInput) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final SeekMap createSeekMap() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
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
            this.f7192h = 0;
        } else {
            this.f7192h = 1;
        }
        this.f7191e = -1L;
        this.g = 0L;
    }
}
