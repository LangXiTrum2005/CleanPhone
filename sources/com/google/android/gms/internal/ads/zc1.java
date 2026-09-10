package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zc1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, dd1 dd1Var, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(dd1Var, j10, obj, obj2)) {
            if (unsafe.getObject(dd1Var, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
