package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.DefaultExtractorInput;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes.dex */
final class PsBinarySearchSeeker extends BinarySearchSeeker {

    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimestampAdjuster f7599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsableByteArray f7600b = new ParsableByteArray();

        public PsScrSeeker(TimestampAdjuster timestampAdjuster) {
            this.f7599a = timestampAdjuster;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public final void a() {
            byte[] bArr = Util.f;
            ParsableByteArray parsableByteArray = this.f7600b;
            parsableByteArray.getClass();
            parsableByteArray.E(bArr, bArr.length);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public final BinarySearchSeeker.TimestampSearchResult b(DefaultExtractorInput defaultExtractorInput, long j) {
            int iD;
            long j2 = defaultExtractorInput.d;
            int iMin = (int) Math.min(20000L, defaultExtractorInput.f6741c - j2);
            ParsableByteArray parsableByteArray = this.f7600b;
            parsableByteArray.D(iMin);
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, iMin, false);
            int i2 = -1;
            int i3 = -1;
            long j3 = -9223372036854775807L;
            while (parsableByteArray.a() >= 4) {
                if (PsBinarySearchSeeker.d(parsableByteArray.f5668b, parsableByteArray.f5667a) != 442) {
                    parsableByteArray.H(1);
                } else {
                    parsableByteArray.H(4);
                    long jC = PsDurationReader.c(parsableByteArray);
                    if (jC != -9223372036854775807L) {
                        long jB = this.f7599a.b(jC);
                        if (jB > j) {
                            return j3 == -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-1, jB, j2) : new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + ((long) i3));
                        }
                        if (jB + 100000 > j) {
                            return new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2 + ((long) parsableByteArray.f5668b));
                        }
                        j3 = jB;
                        i3 = parsableByteArray.f5668b;
                    }
                    int i4 = parsableByteArray.f5669c;
                    if (parsableByteArray.a() >= 10) {
                        parsableByteArray.H(9);
                        int iU = parsableByteArray.u() & 7;
                        if (parsableByteArray.a() >= iU) {
                            parsableByteArray.H(iU);
                            if (parsableByteArray.a() >= 4) {
                                if (PsBinarySearchSeeker.d(parsableByteArray.f5668b, parsableByteArray.f5667a) != 443) {
                                    while (parsableByteArray.a() >= 4) {
                                        iD = PsBinarySearchSeeker.d(parsableByteArray.f5668b, parsableByteArray.f5667a);
                                        if (iD == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                parsableByteArray.H(4);
                                int iA = parsableByteArray.A();
                                if (parsableByteArray.a() < iA) {
                                    parsableByteArray.G(i4);
                                } else {
                                    parsableByteArray.H(iA);
                                    while (parsableByteArray.a() >= 4) {
                                        iD = PsBinarySearchSeeker.d(parsableByteArray.f5668b, parsableByteArray.f5667a);
                                        if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                            break;
                                        }
                                        parsableByteArray.H(4);
                                        if (parsableByteArray.a() < 2) {
                                            parsableByteArray.G(i4);
                                            break;
                                        }
                                        parsableByteArray.G(Math.min(parsableByteArray.f5669c, parsableByteArray.f5668b + parsableByteArray.A()));
                                    }
                                }
                            } else {
                                parsableByteArray.G(i4);
                            }
                        } else {
                            parsableByteArray.G(i4);
                        }
                    } else {
                        parsableByteArray.G(i4);
                    }
                    i2 = parsableByteArray.f5668b;
                }
            }
            return j3 != -9223372036854775807L ? new BinarySearchSeeker.TimestampSearchResult(-2, j3, j2 + ((long) i2)) : BinarySearchSeeker.TimestampSearchResult.d;
        }
    }

    public static int d(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
