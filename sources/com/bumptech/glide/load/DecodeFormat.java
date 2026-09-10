package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DecodeFormat {
    public static final DecodeFormat X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final DecodeFormat f12351Y;
    public static final DecodeFormat Z;
    public static final /* synthetic */ DecodeFormat[] e0;

    static {
        DecodeFormat decodeFormat = new DecodeFormat("PREFER_ARGB_8888", 0);
        X = decodeFormat;
        DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
        f12351Y = decodeFormat2;
        e0 = new DecodeFormat[]{decodeFormat, decodeFormat2};
        Z = decodeFormat;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) e0.clone();
    }
}
