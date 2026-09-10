package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class GradientType {
    public static final GradientType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final GradientType f9769Y;
    public static final /* synthetic */ GradientType[] Z;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        X = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        f9769Y = gradientType2;
        Z = new GradientType[]{gradientType, gradientType2};
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) Z.clone();
    }
}
