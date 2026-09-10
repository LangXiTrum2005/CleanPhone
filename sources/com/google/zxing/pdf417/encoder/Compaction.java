package com.google.zxing.pdf417.encoder;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Compaction {
    public static final /* synthetic */ Compaction[] X = {new Compaction("AUTO", 0), new Compaction(AdPreferences.TYPE_TEXT, 1), new Compaction("BYTE", 2), new Compaction("NUMERIC", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Compaction EF5;

    public static Compaction valueOf(String str) {
        return (Compaction) Enum.valueOf(Compaction.class, str);
    }

    public static Compaction[] values() {
        return (Compaction[]) X.clone();
    }
}
