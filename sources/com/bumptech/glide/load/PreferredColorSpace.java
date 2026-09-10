package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PreferredColorSpace {
    public static final PreferredColorSpace X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ PreferredColorSpace[] f12370Y;

    /* JADX INFO: Fake field, exist only in values array */
    PreferredColorSpace EF0;

    static {
        PreferredColorSpace preferredColorSpace = new PreferredColorSpace("SRGB", 0);
        PreferredColorSpace preferredColorSpace2 = new PreferredColorSpace("DISPLAY_P3", 1);
        X = preferredColorSpace2;
        f12370Y = new PreferredColorSpace[]{preferredColorSpace, preferredColorSpace2};
    }

    public static PreferredColorSpace valueOf(String str) {
        return (PreferredColorSpace) Enum.valueOf(PreferredColorSpace.class, str);
    }

    public static PreferredColorSpace[] values() {
        return (PreferredColorSpace[]) f12370Y.clone();
    }
}
