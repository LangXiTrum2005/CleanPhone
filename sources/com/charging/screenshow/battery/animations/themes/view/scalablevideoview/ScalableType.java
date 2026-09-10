package com.charging.screenshow.battery.animations.themes.view.scalablevideoview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ScalableType {
    public static final ScalableType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ScalableType f13335Y;
    public static final /* synthetic */ ScalableType[] Z;

    static {
        ScalableType scalableType = new ScalableType("NONE", 0);
        X = scalableType;
        ScalableType scalableType2 = new ScalableType("FIT_XY", 1);
        ScalableType scalableType3 = new ScalableType("FIT_START", 2);
        ScalableType scalableType4 = new ScalableType("FIT_CENTER", 3);
        ScalableType scalableType5 = new ScalableType("FIT_END", 4);
        ScalableType scalableType6 = new ScalableType("LEFT_TOP", 5);
        ScalableType scalableType7 = new ScalableType("LEFT_CENTER", 6);
        ScalableType scalableType8 = new ScalableType("LEFT_BOTTOM", 7);
        ScalableType scalableType9 = new ScalableType("CENTER_TOP", 8);
        ScalableType scalableType10 = new ScalableType("CENTER", 9);
        ScalableType scalableType11 = new ScalableType("CENTER_BOTTOM", 10);
        ScalableType scalableType12 = new ScalableType("RIGHT_TOP", 11);
        ScalableType scalableType13 = new ScalableType("RIGHT_CENTER", 12);
        ScalableType scalableType14 = new ScalableType("RIGHT_BOTTOM", 13);
        ScalableType scalableType15 = new ScalableType("LEFT_TOP_CROP", 14);
        ScalableType scalableType16 = new ScalableType("LEFT_CENTER_CROP", 15);
        ScalableType scalableType17 = new ScalableType("LEFT_BOTTOM_CROP", 16);
        ScalableType scalableType18 = new ScalableType("CENTER_TOP_CROP", 17);
        ScalableType scalableType19 = new ScalableType("CENTER_CROP", 18);
        f13335Y = scalableType19;
        Z = new ScalableType[]{scalableType, scalableType2, scalableType3, scalableType4, scalableType5, scalableType6, scalableType7, scalableType8, scalableType9, scalableType10, scalableType11, scalableType12, scalableType13, scalableType14, scalableType15, scalableType16, scalableType17, scalableType18, scalableType19, new ScalableType("CENTER_BOTTOM_CROP", 19), new ScalableType("RIGHT_TOP_CROP", 20), new ScalableType("RIGHT_CENTER_CROP", 21), new ScalableType("RIGHT_BOTTOM_CROP", 22), new ScalableType("START_INSIDE", 23), new ScalableType("CENTER_INSIDE", 24), new ScalableType("END_INSIDE", 25)};
    }

    public static ScalableType valueOf(String str) {
        return (ScalableType) Enum.valueOf(ScalableType.class, str);
    }

    public static ScalableType[] values() {
        return (ScalableType[]) Z.clone();
    }
}
