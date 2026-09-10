package androidx.media3.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Sniffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7138a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        int[] iArr = f7138a;
        for (int i3 = 0; i3 < 29; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147 A[RETURN] */
    public static SniffFailure b(ExtractorInput extractorInput, boolean z2, boolean z3) {
        SniffFailure sniffFailure;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long length = extractorInput.getLength();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i5 = (int) j2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (true) {
            if (i7 < i5) {
                parsableByteArray.D(8);
                boolean z5 = true;
                if (extractorInput.peekFully(parsableByteArray.f5667a, i6, 8, true)) {
                    long jW = parsableByteArray.w();
                    int iG = parsableByteArray.g();
                    if (jW == 1) {
                        j = j;
                        extractorInput.peekFully(parsableByteArray.f5667a, 8, 8);
                        i3 = 16;
                        parsableByteArray.F(16);
                        jW = parsableByteArray.o();
                        i7 = i7;
                    } else {
                        j = j;
                        if (jW == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j) {
                                jW = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i3 = 8;
                    }
                    long j3 = jW;
                    long j4 = i3;
                    if (j3 < j4) {
                        return new AtomSizeTooSmallSniffFailure();
                    }
                    int i8 = i7 + i3;
                    sniffFailure = null;
                    if (iG == 1836019574) {
                        i5 += (int) j3;
                        if (length != -1 && i5 > length) {
                            i5 = (int) length;
                        }
                        i7 = i8;
                        i6 = 0;
                    } else if (iG == 1836019558 || iG == 1836475768) {
                        i2 = 1;
                    } else {
                        if (iG == 1835295092) {
                            z4 = true;
                        }
                        long j5 = length;
                        if ((((long) i8) + j3) - j4 >= i5) {
                            i2 = 0;
                        } else {
                            int i9 = (int) (j3 - j4);
                            i7 = i8 + i9;
                            if (iG != 1718909296) {
                                i4 = 0;
                                if (i9 != 0) {
                                    extractorInput.advancePeekPosition(i9);
                                }
                            } else {
                                if (i9 < 8) {
                                    return new AtomSizeTooSmallSniffFailure();
                                }
                                parsableByteArray.D(i9);
                                i4 = 0;
                                extractorInput.peekFully(parsableByteArray.f5667a, 0, i9);
                                if (a(parsableByteArray.g(), z3)) {
                                    z4 = true;
                                }
                                parsableByteArray.H(4);
                                int iA = parsableByteArray.a() / 4;
                                if (!z4 && iA > 0) {
                                    iArr = new int[iA];
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= iA) {
                                            z5 = z4;
                                            break;
                                        }
                                        int iG2 = parsableByteArray.g();
                                        iArr[i10] = iG2;
                                        if (a(iG2, z3)) {
                                            break;
                                        }
                                        i10++;
                                    }
                                } else {
                                    z5 = z4;
                                    iArr = null;
                                }
                                if (!z5) {
                                    UnsupportedBrandsSniffFailure unsupportedBrandsSniffFailure = new UnsupportedBrandsSniffFailure();
                                    if (iArr != null && iArr.length != 0) {
                                        new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
                                    }
                                    return unsupportedBrandsSniffFailure;
                                }
                                z4 = z5;
                            }
                            i6 = i4;
                            length = j5;
                        }
                    }
                }
                if (!z4) {
                    return NoDeclaredBrandSniffFailure.f7128a;
                }
                if (z2 != i2) {
                    return i2 != 0 ? IncorrectFragmentationSniffFailure.f7108a : IncorrectFragmentationSniffFailure.f7109b;
                }
                return sniffFailure;
            }
            sniffFailure = null;
            i2 = i6;
            if (!z4) {
                return NoDeclaredBrandSniffFailure.f7128a;
            }
            if (z2 != i2) {
                if (i2 != 0) {
                }
            }
            return sniffFailure;
        }
    }
}
