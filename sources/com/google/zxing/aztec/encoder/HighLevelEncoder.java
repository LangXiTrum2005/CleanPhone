package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class HighLevelEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f21336a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f21337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f21338c;

    /* JADX INFO: renamed from: com.google.zxing.aztec.encoder.HighLevelEncoder$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<State> {
        @Override // java.util.Comparator
        public final int compare(State state, State state2) {
            return state.f21343c - state2.f21343c;
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f21337b = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            f21337b[0][i2] = i2 - 63;
        }
        f21337b[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            f21337b[1][i3] = i3 - 95;
        }
        f21337b[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            f21337b[2][i4] = i4 - 46;
        }
        int[] iArr2 = f21337b[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            f21337b[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            int i7 = iArr4[i6];
            if (i7 > 0) {
                f21337b[4][i7] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f21338c = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f21338c;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }
}
