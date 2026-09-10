package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeStrategy {
    public static final EncodeStrategy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final EncodeStrategy f12352Y;
    public static final EncodeStrategy Z;
    public static final /* synthetic */ EncodeStrategy[] e0;

    static {
        EncodeStrategy encodeStrategy = new EncodeStrategy("SOURCE", 0);
        X = encodeStrategy;
        EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
        f12352Y = encodeStrategy2;
        EncodeStrategy encodeStrategy3 = new EncodeStrategy("NONE", 2);
        Z = encodeStrategy3;
        e0 = new EncodeStrategy[]{encodeStrategy, encodeStrategy2, encodeStrategy3};
    }

    public static EncodeStrategy valueOf(String str) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, str);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) e0.clone();
    }
}
