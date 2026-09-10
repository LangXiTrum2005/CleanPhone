package com.google.zxing.datamatrix.decoder;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21356a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21356a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21356a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21356a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21356a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21356a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        public static final /* synthetic */ Mode[] X = {new Mode("PAD_ENCODE", 0), new Mode("ASCII_ENCODE", 1), new Mode("C40_ENCODE", 2), new Mode("TEXT_ENCODE", 3), new Mode("ANSIX12_ENCODE", 4), new Mode("EDIFACT_ENCODE", 5), new Mode("BASE256_ENCODE", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        Mode EF5;

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) X.clone();
        }
    }
}
