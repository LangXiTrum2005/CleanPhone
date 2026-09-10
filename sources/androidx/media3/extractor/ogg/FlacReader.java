package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacMetadataReader;
import androidx.media3.extractor.FlacSeekTableSeekMap;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.SeekMap;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
final class FlacReader extends StreamReader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FlacStreamMetadata f7171n;
    public FlacOggSeeker o;

    public static final class FlacOggSeeker implements OggSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f7172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlacStreamMetadata.SeekTable f7173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7174c;
        public long d;

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final long a(DefaultExtractorInput defaultExtractorInput) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final SeekMap createSeekMap() {
            Assertions.e(this.f7174c != -1);
            return new FlacSeekTableSeekMap(this.f7172a, this.f7174c);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final void startSeek(long j) {
            long[] jArr = this.f7173b.f6768a;
            this.d = jArr[Util.e(jArr, j, true)];
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f5667a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i2 = (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i2 == 6 || i2 == 7) {
            parsableByteArray.H(4);
            parsableByteArray.B();
        }
        int iB = FlacFrameReader.b(i2, parsableByteArray);
        parsableByteArray.G(0);
        return iB;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        byte[] bArr = parsableByteArray.f5667a;
        FlacStreamMetadata flacStreamMetadata = this.f7171n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f7171n = flacStreamMetadata2;
            setupData.f7195a = flacStreamMetadata2.c(Arrays.copyOfRange(bArr, 9, parsableByteArray.f5669c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & AbstractJsonLexerKt.TC_INVALID) != 3) {
            if (b2 != -1) {
                return true;
            }
            FlacOggSeeker flacOggSeeker = this.o;
            if (flacOggSeeker != null) {
                flacOggSeeker.f7174c = j;
                setupData.f7196b = flacOggSeeker;
            }
            setupData.f7195a.getClass();
            return false;
        }
        FlacStreamMetadata.SeekTable seekTableA = FlacMetadataReader.a(parsableByteArray);
        FlacStreamMetadata flacStreamMetadata3 = new FlacStreamMetadata(flacStreamMetadata.f6761a, flacStreamMetadata.f6762b, flacStreamMetadata.f6763c, flacStreamMetadata.d, flacStreamMetadata.f6764e, flacStreamMetadata.g, flacStreamMetadata.f6765h, flacStreamMetadata.j, seekTableA, flacStreamMetadata.f6767l);
        this.f7171n = flacStreamMetadata3;
        FlacOggSeeker flacOggSeeker2 = new FlacOggSeeker();
        flacOggSeeker2.f7172a = flacStreamMetadata3;
        flacOggSeeker2.f7173b = seekTableA;
        flacOggSeeker2.f7174c = -1L;
        flacOggSeeker2.d = -1L;
        this.o = flacOggSeeker2;
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f7171n = null;
            this.o = null;
        }
    }
}
