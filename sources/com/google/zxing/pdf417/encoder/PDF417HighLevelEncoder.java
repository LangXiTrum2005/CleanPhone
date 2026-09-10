package com.google.zxing.pdf417.encoder;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class PDF417HighLevelEncoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f21396c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f21394a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f21395b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] d = new byte[128];

    /* JADX INFO: renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21397a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f21397a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21397a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21397a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i2 = 0;
        byte[] bArr = new byte[128];
        f21396c = bArr;
        Charset charset = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f21394a;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                f21396c[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr3 = f21395b;
            if (i2 >= bArr3.length) {
                return;
            }
            byte b3 = bArr3[i2];
            if (b3 > 0) {
                d[b3] = (byte) i2;
            }
            i2++;
        }
    }
}
