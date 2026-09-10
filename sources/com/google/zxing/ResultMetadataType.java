package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ResultMetadataType {
    public static final /* synthetic */ ResultMetadataType[] X = {new ResultMetadataType("OTHER", 0), new ResultMetadataType("ORIENTATION", 1), new ResultMetadataType("BYTE_SEGMENTS", 2), new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3), new ResultMetadataType("ISSUE_NUMBER", 4), new ResultMetadataType("SUGGESTED_PRICE", 5), new ResultMetadataType("POSSIBLE_COUNTRY", 6), new ResultMetadataType("UPC_EAN_EXTENSION", 7), new ResultMetadataType("PDF417_EXTRA_METADATA", 8), new ResultMetadataType("STRUCTURED_APPEND_SEQUENCE", 9), new ResultMetadataType("STRUCTURED_APPEND_PARITY", 10)};

    /* JADX INFO: Fake field, exist only in values array */
    ResultMetadataType EF5;

    public static ResultMetadataType valueOf(String str) {
        return (ResultMetadataType) Enum.valueOf(ResultMetadataType.class, str);
    }

    public static ResultMetadataType[] values() {
        return (ResultMetadataType[]) X.clone();
    }
}
