package com.unity3d.scar.adapter.common.scarads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class UnityAdFormat {
    public static final UnityAdFormat X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final UnityAdFormat f42794Y;
    public static final UnityAdFormat Z;
    public static final UnityAdFormat e0;
    public static final /* synthetic */ UnityAdFormat[] f0;

    static {
        UnityAdFormat unityAdFormat = new UnityAdFormat("UNSPECIFIED", 0);
        X = unityAdFormat;
        UnityAdFormat unityAdFormat2 = new UnityAdFormat("INTERSTITIAL", 1);
        f42794Y = unityAdFormat2;
        UnityAdFormat unityAdFormat3 = new UnityAdFormat("REWARDED", 2);
        Z = unityAdFormat3;
        UnityAdFormat unityAdFormat4 = new UnityAdFormat("BANNER", 3);
        e0 = unityAdFormat4;
        f0 = new UnityAdFormat[]{unityAdFormat, unityAdFormat2, unityAdFormat3, unityAdFormat4};
    }

    public static UnityAdFormat valueOf(String str) {
        return (UnityAdFormat) Enum.valueOf(UnityAdFormat.class, str);
    }

    public static UnityAdFormat[] values() {
        return (UnityAdFormat[]) f0.clone();
    }
}
