package com.gyf.immersionbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class NavigationBarType {
    public static final NavigationBarType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final NavigationBarType f21439Y;
    public static final NavigationBarType Z;
    public static final NavigationBarType e0;
    public static final NavigationBarType f0;
    public static final /* synthetic */ NavigationBarType[] g0;

    static {
        NavigationBarType navigationBarType = new NavigationBarType("CLASSIC", 0);
        X = navigationBarType;
        NavigationBarType navigationBarType2 = new NavigationBarType("GESTURES", 1);
        f21439Y = navigationBarType2;
        NavigationBarType navigationBarType3 = new NavigationBarType("GESTURES_THREE_STAGE", 2);
        Z = navigationBarType3;
        NavigationBarType navigationBarType4 = new NavigationBarType("DOUBLE", 3);
        e0 = navigationBarType4;
        NavigationBarType navigationBarType5 = new NavigationBarType("UNKNOWN", 4);
        f0 = navigationBarType5;
        g0 = new NavigationBarType[]{navigationBarType, navigationBarType2, navigationBarType3, navigationBarType4, navigationBarType5};
    }

    public static NavigationBarType valueOf(String str) {
        return (NavigationBarType) Enum.valueOf(NavigationBarType.class, str);
    }

    public static NavigationBarType[] values() {
        return (NavigationBarType[]) g0.clone();
    }
}
