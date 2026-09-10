package com.google.zxing.datamatrix.encoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SymbolShapeHint {
    public static final /* synthetic */ SymbolShapeHint[] X = {new SymbolShapeHint("FORCE_NONE", 0), new SymbolShapeHint("FORCE_SQUARE", 1), new SymbolShapeHint("FORCE_RECTANGLE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    SymbolShapeHint EF5;

    public static SymbolShapeHint valueOf(String str) {
        return (SymbolShapeHint) Enum.valueOf(SymbolShapeHint.class, str);
    }

    public static SymbolShapeHint[] values() {
        return (SymbolShapeHint[]) X.clone();
    }
}
