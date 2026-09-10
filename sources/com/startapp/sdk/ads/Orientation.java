package com.startapp.sdk.ads;

/* JADX INFO: loaded from: classes6.dex */
public enum Orientation {
    PORTRAIT(1),
    LANDSCAPE(2),
    AUTO(3);

    private final int index;

    Orientation(int i2) {
        this.index = i2;
    }

    public static Orientation getByName(String str) {
        if (str != null) {
            try {
                return valueOf(str);
            } catch (RuntimeException unused) {
            }
        }
        return AUTO;
    }

    public int getIndex() {
        return this.index;
    }
}
