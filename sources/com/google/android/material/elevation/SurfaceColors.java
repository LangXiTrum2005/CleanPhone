package com.google.android.material.elevation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceColors {
    public static final /* synthetic */ SurfaceColors[] X = {new SurfaceColors("SURFACE_0", 0), new SurfaceColors("SURFACE_1", 1), new SurfaceColors("SURFACE_2", 2), new SurfaceColors("SURFACE_3", 3), new SurfaceColors("SURFACE_4", 4), new SurfaceColors("SURFACE_5", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    SurfaceColors EF5;

    public static SurfaceColors valueOf(String str) {
        return (SurfaceColors) Enum.valueOf(SurfaceColors.class, str);
    }

    public static SurfaceColors[] values() {
        return (SurfaceColors[]) X.clone();
    }
}
