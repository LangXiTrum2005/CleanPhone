package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DecodeHintType {
    public static final /* synthetic */ DecodeHintType[] X = {new DecodeHintType("OTHER", 0), new DecodeHintType("PURE_BARCODE", 1), new DecodeHintType("POSSIBLE_FORMATS", 2), new DecodeHintType("TRY_HARDER", 3), new DecodeHintType("CHARACTER_SET", 4), new DecodeHintType("ALLOWED_LENGTHS", 5), new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6), new DecodeHintType("ASSUME_GS1", 7), new DecodeHintType("RETURN_CODABAR_START_END", 8), new DecodeHintType("NEED_RESULT_POINT_CALLBACK", 9), new DecodeHintType("ALLOWED_EAN_EXTENSIONS", 10)};

    /* JADX INFO: Fake field, exist only in values array */
    DecodeHintType EF5;

    public static DecodeHintType valueOf(String str) {
        return (DecodeHintType) Enum.valueOf(DecodeHintType.class, str);
    }

    public static DecodeHintType[] values() {
        return (DecodeHintType[]) X.clone();
    }
}
