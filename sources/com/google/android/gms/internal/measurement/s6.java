package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f23954a;

    static {
        f23954a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
