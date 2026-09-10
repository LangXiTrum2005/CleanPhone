package com.startapp.sdk.adsbase.mraid.bridge;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public enum MraidState {
    LOADING,
    DEFAULT,
    EXPANDED,
    RESIZED,
    HIDDEN;

    @Override // java.lang.Enum
    public final String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
