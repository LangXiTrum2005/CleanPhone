package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41140a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f41140a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41140a[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41140a[AdPreferences.Placement.INAPP_NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
