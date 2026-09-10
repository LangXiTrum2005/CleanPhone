package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes3.dex */
final class PsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimestampAdjuster f18046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsableByteArray f18047b = new ParsableByteArray();

        public PsScrSeeker(TimestampAdjuster timestampAdjuster) {
            this.f18046a = timestampAdjuster;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public final void a() {
            byte[] bArr = Util.f;
            ParsableByteArray parsableByteArray = this.f18047b;
            parsableByteArray.getClass();
            parsableByteArray.D(bArr, bArr.length);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public final BinarySearchSeeker.TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j) {
            int iD;
            long j2 = defaultExtractorInput.d;
            int iMin = (int) Math.min(20000L, defaultExtractorInput.f17527c - j2);
            ParsableByteArray parsableByteArray = this.f18047b;
            parsableByteArray.C(iMin);
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, iMin, false);
            int i2 = -1;
            int i3 = -1;
            long j3 = -9223372036854775807L;
            while (parsableByteArray.a() >= 4) {
                if (PsBinarySearchSeeker.d(parsableByteArray.f18957b, parsableByteArray.f18956a) != 442) {
                    parsableByteArray.G(1);
                } else {
                    parsableByteArray.G(4);
                    long jC = PsDurationReader.c(parsableByteArray);
                    if (jC != -9223372036854775807L) {
                        long jB = this.f18046a.b(jC);
                        if (jB > j) {
                            return j3 == -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-1, jB, j2) : new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + ((long) i3));
                        }
                        if (jB + 100000 > j) {
                            return new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + ((long) parsableByteArray.f18957b));
                        }
                        j3 = jB;
                        i3 = parsableByteArray.f18957b;
                    }
                    int i4 = parsableByteArray.f18958c;
                    if (parsableByteArray.a() >= 10) {
                        parsableByteArray.G(9);
                        int iU = parsableByteArray.u() & 7;
                        if (parsableByteArray.a() >= iU) {
                            parsableByteArray.G(iU);
                            if (parsableByteArray.a() >= 4) {
                                if (PsBinarySearchSeeker.d(parsableByteArray.f18957b, parsableByteArray.f18956a) != 443) {
                                    while (parsableByteArray.a() >= 4) {
                                        iD = PsBinarySearchSeeker.d(parsableByteArray.f18957b, parsableByteArray.f18956a);
                                        if (iD == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                parsableByteArray.G(4);
                                int iZ = parsableByteArray.z();
                                if (parsableByteArray.a() < iZ) {
                                    parsableByteArray.F(i4);
                                } else {
                                    parsableByteArray.G(iZ);
                                    while (parsableByteArray.a() >= 4) {
                                        iD = PsBinarySearchSeeker.d(parsableByteArray.f18957b, parsableByteArray.f18956a);
                                        if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                            break;
                                        }
                                        parsableByteArray.G(4);
                                        if (parsableByteArray.a() < 2) {
                                            parsableByteArray.F(i4);
                                            break;
                                        }
                                        parsableByteArray.F(Math.min(parsableByteArray.f18958c, parsableByteArray.f18957b + parsableByteArray.z()));
                                    }
                                }
                            } else {
                                parsableByteArray.F(i4);
                            }
                        } else {
                            parsableByteArray.F(i4);
                        }
                    } else {
                        parsableByteArray.F(i4);
                    }
                    i2 = parsableByteArray.f18957b;
                }
            }
            return j3 != -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-2, j3, j2 + ((long) i2)) : BinarySearchSeeker.TimestampSearchResult.d;
        }
    }

    public static int d(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
