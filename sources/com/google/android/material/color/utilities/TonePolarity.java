package com.google.android.material.color.utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class TonePolarity {
    public static final /* synthetic */ TonePolarity[] X = {new TonePolarity("DARKER", 0), new TonePolarity("LIGHTER", 1), new TonePolarity("NEARER", 2), new TonePolarity("FARTHER", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    TonePolarity EF5;

    public static TonePolarity valueOf(String str) {
        return (TonePolarity) Enum.valueOf(TonePolarity.class, str);
    }

    public static TonePolarity[] values() {
        return (TonePolarity[]) X.clone();
    }
}
