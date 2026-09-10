package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
final class Sniffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17829a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(ExtractorInput extractorInput, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        long length = extractorInput.getLength();
        long j = -1;
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i3 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i4 = (int) j2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        while (true) {
            if (i6 < i4) {
                parsableByteArray.C(8);
                if (extractorInput.peekFully(parsableByteArray.f18956a, i5, 8, true)) {
                    long jV = parsableByteArray.v();
                    int iG = parsableByteArray.g();
                    if (jV == 1) {
                        extractorInput.peekFully(parsableByteArray.f18956a, 8, 8);
                        parsableByteArray.E(16);
                        i2 = 16;
                        jV = parsableByteArray.o();
                    } else {
                        if (jV == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j) {
                                jV = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i2 = 8;
                    }
                    long j3 = i2;
                    if (jV < j3) {
                        return false;
                    }
                    int i7 = i6 + i2;
                    if (iG == 1836019574) {
                        i4 += (int) jV;
                        if (i3 != 0 && i4 > length) {
                            i4 = (int) length;
                        }
                        i6 = i7;
                    } else {
                        if (iG == 1836019558 || iG == 1836475768) {
                            z4 = true;
                            return z5 && z2 == z4;
                        }
                        int i8 = i3;
                        if ((((long) i7) + jV) - j3 < i4) {
                            int i9 = (int) (jV - j3);
                            i6 = i7 + i9;
                            if (iG == 1718909296) {
                                if (i9 < 8) {
                                    return false;
                                }
                                parsableByteArray.C(i9);
                                extractorInput.peekFully(parsableByteArray.f18956a, 0, i9);
                                int i10 = i9 / 4;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if (i11 != 1) {
                                        int iG2 = parsableByteArray.g();
                                        if ((iG2 >>> 8) != 3368816 && (iG2 != 1751476579 || !z3)) {
                                            int[] iArr = f17829a;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= 29) {
                                                    continue;
                                                } else if (iArr[i12] != iG2) {
                                                    i12++;
                                                }
                                            }
                                        }
                                        z5 = true;
                                        break;
                                    }
                                    parsableByteArray.G(4);
                                }
                                if (!z5) {
                                    return false;
                                }
                            } else if (i9 != 0) {
                                extractorInput.advancePeekPosition(i9);
                            }
                            i3 = i8;
                        }
                    }
                    j = -1;
                    i5 = 0;
                }
            }
            z4 = false;
            if (z5) {
                return false;
            }
        }
    }
}
