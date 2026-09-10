package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    public static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlacStreamMetadata f17618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FlacFrameReader.SampleNumberHolder f17620c = new FlacFrameReader.SampleNumberHolder();

        public FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i2) {
            this.f17618a = flacStreamMetadata;
            this.f17619b = i2;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public final BinarySearchSeeker.TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j) throws EOFException, InterruptedIOException {
            long j2 = defaultExtractorInput.d;
            long jC = c(defaultExtractorInput);
            long peekPosition = defaultExtractorInput.getPeekPosition();
            defaultExtractorInput.c(Math.max(6, this.f17618a.f17539c), false);
            long jC2 = c(defaultExtractorInput);
            long peekPosition2 = defaultExtractorInput.getPeekPosition();
            if (jC > j || jC2 <= j) {
                return jC2 <= j ? new BinarySearchSeeker.TimestampSearchResult(-2, jC2, peekPosition2) : new BinarySearchSeeker.TimestampSearchResult(-1, jC, j2);
            }
            return new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, peekPosition);
        }

        public final long c(DefaultExtractorInput defaultExtractorInput) throws EOFException, InterruptedIOException {
            long j;
            long j2;
            FlacFrameReader.SampleNumberHolder sampleNumberHolder;
            FlacStreamMetadata flacStreamMetadata;
            boolean zA;
            int iE;
            while (true) {
                long peekPosition = defaultExtractorInput.getPeekPosition();
                j = defaultExtractorInput.f17527c;
                j2 = 6;
                long j3 = j - 6;
                sampleNumberHolder = this.f17620c;
                flacStreamMetadata = this.f17618a;
                if (peekPosition >= j3) {
                    j2 = 6;
                    break;
                }
                long peekPosition2 = defaultExtractorInput.getPeekPosition();
                byte[] bArr = new byte[2];
                defaultExtractorInput.peekFully(bArr, 0, 2, false);
                int i2 = ((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                int i3 = this.f17619b;
                if (i2 != i3) {
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.c((int) (peekPosition2 - defaultExtractorInput.d), false);
                    zA = false;
                } else {
                    ParsableByteArray parsableByteArray = new ParsableByteArray(16);
                    System.arraycopy(bArr, 0, parsableByteArray.f18956a, 0, 2);
                    byte[] bArr2 = parsableByteArray.f18956a;
                    int i4 = 0;
                    for (int i5 = 2; i4 < 14 && (iE = defaultExtractorInput.e(i5 + i4, 14 - i4, bArr2)) != -1; i5 = 2) {
                        i4 += iE;
                    }
                    parsableByteArray.E(i4);
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.c((int) (peekPosition2 - defaultExtractorInput.d), false);
                    zA = FlacFrameReader.a(parsableByteArray, flacStreamMetadata, i3, sampleNumberHolder);
                }
                if (zA) {
                    break;
                }
                defaultExtractorInput.c(1, false);
            }
            if (defaultExtractorInput.getPeekPosition() < j - j2) {
                return sampleNumberHolder.f17533a;
            }
            defaultExtractorInput.c((int) (j - defaultExtractorInput.getPeekPosition()), false);
            return flacStreamMetadata.j;
        }
    }
}
