package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class FlacReader extends StreamReader {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FlacStreamMetadata f17862n;
    public FlacOggSeeker o;

    public static final class FlacOggSeeker implements OggSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f17863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlacStreamMetadata.SeekTable f17864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17865c;
        public long d;

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public final long a(DefaultExtractorInput defaultExtractorInput) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public final SeekMap createSeekMap() {
            Assertions.d(this.f17865c != -1);
            return new FlacSeekTableSeekMap(this.f17863a, this.f17865c);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public final void startSeek(long j) {
            long[] jArr = this.f17864b.f17544a;
            this.d = jArr[Util.f(jArr, j, true)];
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f18956a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i2 = (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i2 == 6 || i2 == 7) {
            parsableByteArray.G(4);
            parsableByteArray.A();
        }
        int iB = FlacFrameReader.b(i2, parsableByteArray);
        parsableByteArray.F(0);
        return iB;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        byte[] bArr = parsableByteArray.f18956a;
        FlacStreamMetadata flacStreamMetadata = this.f17862n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f17862n = flacStreamMetadata2;
            setupData.f17886a = flacStreamMetadata2.c(Arrays.copyOfRange(bArr, 9, parsableByteArray.f18958c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & AbstractJsonLexerKt.TC_INVALID) != 3) {
            if (b2 != -1) {
                return true;
            }
            FlacOggSeeker flacOggSeeker = this.o;
            if (flacOggSeeker != null) {
                flacOggSeeker.f17865c = j;
                setupData.f17887b = flacOggSeeker;
            }
            setupData.f17886a.getClass();
            return false;
        }
        FlacStreamMetadata.SeekTable seekTableA = FlacMetadataReader.a(parsableByteArray);
        FlacStreamMetadata flacStreamMetadata3 = new FlacStreamMetadata(flacStreamMetadata.f17537a, flacStreamMetadata.f17538b, flacStreamMetadata.f17539c, flacStreamMetadata.d, flacStreamMetadata.f17540e, flacStreamMetadata.g, flacStreamMetadata.f17541h, flacStreamMetadata.j, seekTableA, flacStreamMetadata.f17543l);
        this.f17862n = flacStreamMetadata3;
        FlacOggSeeker flacOggSeeker2 = new FlacOggSeeker();
        flacOggSeeker2.f17863a = flacStreamMetadata3;
        flacOggSeeker2.f17864b = seekTableA;
        flacOggSeeker2.f17865c = -1L;
        flacOggSeeker2.d = -1L;
        this.o = flacOggSeeker2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f17862n = null;
            this.o = null;
        }
    }
}
