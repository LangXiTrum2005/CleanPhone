package com.charging.screenshow.battery.animations.themes.view.scalablevideoview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PivotPoint {
    public static final PivotPoint X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final PivotPoint f13334Y;
    public static final PivotPoint Z;
    public static final PivotPoint e0;
    public static final PivotPoint f0;
    public static final PivotPoint g0;
    public static final PivotPoint h0;
    public static final PivotPoint i0;
    public static final PivotPoint j0;
    public static final /* synthetic */ PivotPoint[] k0;

    static {
        PivotPoint pivotPoint = new PivotPoint("LEFT_TOP", 0);
        X = pivotPoint;
        PivotPoint pivotPoint2 = new PivotPoint("LEFT_CENTER", 1);
        f13334Y = pivotPoint2;
        PivotPoint pivotPoint3 = new PivotPoint("LEFT_BOTTOM", 2);
        Z = pivotPoint3;
        PivotPoint pivotPoint4 = new PivotPoint("CENTER_TOP", 3);
        e0 = pivotPoint4;
        PivotPoint pivotPoint5 = new PivotPoint("CENTER", 4);
        f0 = pivotPoint5;
        PivotPoint pivotPoint6 = new PivotPoint("CENTER_BOTTOM", 5);
        g0 = pivotPoint6;
        PivotPoint pivotPoint7 = new PivotPoint("RIGHT_TOP", 6);
        h0 = pivotPoint7;
        PivotPoint pivotPoint8 = new PivotPoint("RIGHT_CENTER", 7);
        i0 = pivotPoint8;
        PivotPoint pivotPoint9 = new PivotPoint("RIGHT_BOTTOM", 8);
        j0 = pivotPoint9;
        k0 = new PivotPoint[]{pivotPoint, pivotPoint2, pivotPoint3, pivotPoint4, pivotPoint5, pivotPoint6, pivotPoint7, pivotPoint8, pivotPoint9};
    }

    public static PivotPoint valueOf(String str) {
        return (PivotPoint) Enum.valueOf(PivotPoint.class, str);
    }

    public static PivotPoint[] values() {
        return (PivotPoint[]) k0.clone();
    }
}
