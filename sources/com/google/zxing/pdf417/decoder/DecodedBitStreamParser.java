package com.google.zxing.pdf417.decoder;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger[] f21387a;

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21388a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21388a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21388a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21388a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21388a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21388a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21388a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final /* synthetic */ Mode[] X = {new Mode("ALPHA", 0), new Mode("LOWER", 1), new Mode("MIXED", 2), new Mode("PUNCT", 3), new Mode("ALPHA_SHIFT", 4), new Mode("PUNCT_SHIFT", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Mode EF5;

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) X.clone();
        }
    }

    static {
        ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
        "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f21387a = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i2 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f21387a;
            if (i2 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i2] = bigIntegerArr2[i2 - 1].multiply(bigIntegerValueOf);
            i2++;
        }
    }
}
