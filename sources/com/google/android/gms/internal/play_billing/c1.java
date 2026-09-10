package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    protected int zza;

    public final byte[] a() {
        try {
            t1 t1Var = (t1) this;
            int iE = t1Var.e();
            byte[] bArr = new byte[iE];
            j1 j1Var = new j1(bArr, iE);
            s2 s2VarA = p2.f24443c.a(t1Var.getClass());
            h2 h2Var = j1Var.f24306a;
            if (h2Var == null) {
                h2Var = new h2(j1Var);
            }
            s2VarA.f(t1Var, h2Var);
            if (iE - j1Var.f24309d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(defpackage.e.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public abstract int b(s2 s2Var);
}
