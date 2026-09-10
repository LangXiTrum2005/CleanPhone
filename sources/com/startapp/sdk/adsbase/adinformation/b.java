package com.startapp.sdk.adsbase.adinformation;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40613a;

    static {
        int[] iArr = new int[AdInformationPositions.Position.values().length];
        f40613a = iArr;
        try {
            iArr[AdInformationPositions.Position.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f40613a[AdInformationPositions.Position.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f40613a[AdInformationPositions.Position.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f40613a[AdInformationPositions.Position.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
