package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimestampAdjuster f18069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsableByteArray f18070b = new ParsableByteArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18071c;

        public TsPcrSeeker(int i2, TimestampAdjuster timestampAdjuster) {
            this.f18071c = i2;
            this.f18069a = timestampAdjuster;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public final void a() {
            byte[] bArr = Util.f;
            ParsableByteArray parsableByteArray = this.f18070b;
            parsableByteArray.getClass();
            parsableByteArray.D(bArr, bArr.length);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public final BinarySearchSeeker.TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j) {
            long j2 = defaultExtractorInput.d;
            int iMin = (int) Math.min(112800, defaultExtractorInput.f17527c - j2);
            ParsableByteArray parsableByteArray = this.f18070b;
            parsableByteArray.C(iMin);
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, iMin, false);
            int i2 = parsableByteArray.f18958c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (parsableByteArray.a() >= 188) {
                byte[] bArr = parsableByteArray.f18956a;
                int i3 = parsableByteArray.f18957b;
                while (i3 < i2 && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i2) {
                    break;
                }
                long jA = TsUtil.a(parsableByteArray, i3, this.f18071c);
                if (jA != -9223372036854775807L) {
                    long jB = this.f18069a.b(jA);
                    if (jB > j) {
                        return j5 == -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-1, jB, j2) : new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + j4);
                    }
                    j5 = jB;
                    if (100000 + j5 > j) {
                        return new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + ((long) i3));
                    }
                    j4 = i3;
                }
                parsableByteArray.F(i4);
                j3 = i4;
            }
            return j5 != -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-2, j5, j2 + j3) : BinarySearchSeeker.TimestampSearchResult.d;
        }
    }
}
