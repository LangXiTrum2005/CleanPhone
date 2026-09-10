package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;

/* JADX INFO: loaded from: classes.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimestampAdjuster f7622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsableByteArray f7623b = new ParsableByteArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7624c;

        public TsPcrSeeker(int i2, TimestampAdjuster timestampAdjuster) {
            this.f7624c = i2;
            this.f7622a = timestampAdjuster;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public final void a() {
            byte[] bArr = Util.f;
            ParsableByteArray parsableByteArray = this.f7623b;
            parsableByteArray.getClass();
            parsableByteArray.E(bArr, bArr.length);
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public final BinarySearchSeeker.TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j) {
            long j2 = defaultExtractorInput.d;
            int iMin = (int) Math.min(112800, defaultExtractorInput.f6741c - j2);
            ParsableByteArray parsableByteArray = this.f7623b;
            parsableByteArray.D(iMin);
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, iMin, false);
            int i2 = parsableByteArray.f5669c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (parsableByteArray.a() >= 188) {
                byte[] bArr = parsableByteArray.f5667a;
                int i3 = parsableByteArray.f5668b;
                while (i3 < i2 && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i2) {
                    break;
                }
                long jA = TsUtil.a(parsableByteArray, i3, this.f7624c);
                if (jA != -9223372036854775807L) {
                    long jB = this.f7622a.b(jA);
                    if (jB > j) {
                        return j5 == -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-1, jB, j2) : new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + j4);
                    }
                    j5 = jB;
                    if (100000 + j5 > j) {
                        return new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + ((long) i3));
                    }
                    j4 = i3;
                }
                parsableByteArray.G(i4);
                j3 = i4;
            }
            return j5 != -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-2, j5, j2 + j3) : BinarySearchSeeker.TimestampSearchResult.d;
        }
    }
}
