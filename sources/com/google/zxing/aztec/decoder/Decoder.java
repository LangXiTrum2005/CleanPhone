package com.google.zxing.aztec.decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class Decoder {

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21335a;

        static {
            int[] iArr = new int[Table.values().length];
            f21335a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21335a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21335a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21335a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21335a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Table {
        public static final /* synthetic */ Table[] X = {new Table("UPPER", 0), new Table("LOWER", 1), new Table("MIXED", 2), new Table("DIGIT", 3), new Table("PUNCT", 4), new Table("BINARY", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Table EF5;

        public static Table valueOf(String str) {
            return (Table) Enum.valueOf(Table.class, str);
        }

        public static Table[] values() {
            return (Table[]) X.clone();
        }
    }
}
