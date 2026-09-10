package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ad1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, dd1 dd1Var, long j10, cd1 cd1Var, cd1 cd1Var2) {
        while (!unsafe.compareAndSwapObject(dd1Var, j10, cd1Var, cd1Var2)) {
            if (unsafe.getObject(dd1Var, j10) != cd1Var) {
                return false;
            }
        }
        return true;
    }
}
