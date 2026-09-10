package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac4Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17275a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, com.p004ironsource.mediationsdk.metadata.a.f25965n};

    public static final class SyncFrameInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17278c;

        public SyncFrameInfo(int i2, int i3, int i4) {
            this.f17276a = i2;
            this.f17277b = i3;
            this.f17278c = i4;
        }
    }

    public static void a(int i2, ParsableByteArray parsableByteArray) {
        parsableByteArray.C(7);
        byte[] bArr = parsableByteArray.f18956a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static SyncFrameInfo b(ParsableBitArray parsableBitArray) {
        int i2;
        int i3;
        int iG = parsableBitArray.g(16);
        int iG2 = parsableBitArray.g(16);
        if (iG2 == 65535) {
            iG2 = parsableBitArray.g(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i4 = iG2 + i2;
        if (iG == 44097) {
            i4 += 2;
        }
        if (parsableBitArray.g(2) == 3) {
            do {
                parsableBitArray.g(2);
            } while (parsableBitArray.f());
        }
        int iG3 = parsableBitArray.g(10);
        if (parsableBitArray.f() && parsableBitArray.g(3) > 0) {
            parsableBitArray.n(2);
        }
        int i5 = parsableBitArray.f() ? 48000 : 44100;
        int iG4 = parsableBitArray.g(4);
        int[] iArr = f17275a;
        if (i5 == 44100 && iG4 == 13) {
            i3 = iArr[iG4];
        } else if (i5 != 48000 || iG4 >= 14) {
            i3 = 0;
        } else {
            int i6 = iArr[iG4];
            int i7 = iG3 % 5;
            if (i7 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    if (iG4 != 3) {
                    }
                    i3 = i6 + 1;
                } else if (i7 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i3 = i6 + 1;
                } else {
                    i3 = i6;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i3 = i6 + 1;
            } else {
                i3 = i6;
            }
        }
        return new SyncFrameInfo(i5, i4, i3);
    }
}
