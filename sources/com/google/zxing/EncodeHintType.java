package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EncodeHintType {
    public static final EncodeHintType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final EncodeHintType f21332Y;
    public static final EncodeHintType Z;
    public static final EncodeHintType e0;
    public static final EncodeHintType f0;
    public static final EncodeHintType g0;
    public static final /* synthetic */ EncodeHintType[] h0;

    static {
        EncodeHintType encodeHintType = new EncodeHintType("ERROR_CORRECTION", 0);
        X = encodeHintType;
        EncodeHintType encodeHintType2 = new EncodeHintType("CHARACTER_SET", 1);
        f21332Y = encodeHintType2;
        EncodeHintType encodeHintType3 = new EncodeHintType("DATA_MATRIX_SHAPE", 2);
        EncodeHintType encodeHintType4 = new EncodeHintType("MIN_SIZE", 3);
        EncodeHintType encodeHintType5 = new EncodeHintType("MAX_SIZE", 4);
        EncodeHintType encodeHintType6 = new EncodeHintType("MARGIN", 5);
        Z = encodeHintType6;
        EncodeHintType encodeHintType7 = new EncodeHintType("PDF417_COMPACT", 6);
        EncodeHintType encodeHintType8 = new EncodeHintType("PDF417_COMPACTION", 7);
        EncodeHintType encodeHintType9 = new EncodeHintType("PDF417_DIMENSIONS", 8);
        EncodeHintType encodeHintType10 = new EncodeHintType("AZTEC_LAYERS", 9);
        e0 = encodeHintType10;
        EncodeHintType encodeHintType11 = new EncodeHintType("QR_VERSION", 10);
        f0 = encodeHintType11;
        EncodeHintType encodeHintType12 = new EncodeHintType("GS1_FORMAT", 11);
        g0 = encodeHintType12;
        h0 = new EncodeHintType[]{encodeHintType, encodeHintType2, encodeHintType3, encodeHintType4, encodeHintType5, encodeHintType6, encodeHintType7, encodeHintType8, encodeHintType9, encodeHintType10, encodeHintType11, encodeHintType12};
    }

    public static EncodeHintType valueOf(String str) {
        return (EncodeHintType) Enum.valueOf(EncodeHintType.class, str);
    }

    public static EncodeHintType[] values() {
        return (EncodeHintType[]) h0.clone();
    }
}
