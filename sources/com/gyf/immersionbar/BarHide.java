package com.gyf.immersionbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BarHide {
    public static final /* synthetic */ BarHide[] X = {new BarHide("FLAG_HIDE_STATUS_BAR", 0), new BarHide("FLAG_HIDE_NAVIGATION_BAR", 1), new BarHide("FLAG_HIDE_BAR", 2), new BarHide("FLAG_SHOW_BAR", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    BarHide EF5;

    public static BarHide valueOf(String str) {
        return (BarHide) Enum.valueOf(BarHide.class, str);
    }

    public static BarHide[] values() {
        return (BarHide[]) X.clone();
    }
}
