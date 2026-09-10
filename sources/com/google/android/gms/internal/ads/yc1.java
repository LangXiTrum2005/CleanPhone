package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yc1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, uc1 uc1Var, long j10, rc1 rc1Var, rc1 rc1Var2) {
        while (!unsafe.compareAndSwapObject(uc1Var, j10, rc1Var, rc1Var2)) {
            if (unsafe.getObject(uc1Var, j10) != rc1Var) {
                return false;
            }
        }
        return true;
    }
}
