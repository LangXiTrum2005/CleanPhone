package com.inmobi.sdk;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24170a;

    static {
        int[] iArr = new int[InMobiSdk.LogLevel.values().length];
        try {
            iArr[InMobiSdk.LogLevel.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiSdk.LogLevel.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiSdk.LogLevel.DEBUG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f24170a = iArr;
    }
}
