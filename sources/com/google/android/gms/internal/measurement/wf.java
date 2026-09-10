package com.google.android.gms.internal.measurement;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wf extends ta.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.x f24124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24125i;

    public wf(com.google.android.gms.internal.consent_sdk.x xVar, int i10) {
        this.f24124h = xVar;
        this.f24125i = i10;
    }

    @Override // ta.r
    public final void c() {
        AtomicLong atomicLong;
        long j10;
        int i10;
        int i11;
        boolean z10;
        com.google.android.gms.internal.consent_sdk.x xVar = this.f24124h;
        this.f24124h = null;
        if (xVar == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) xVar.f23262c;
        do {
            atomicLong = (AtomicLong) xVar.f23261b;
            j10 = atomicLong.get();
            i10 = (int) j10;
            long j11 = j10 >>> 32;
            if (i10 == Integer.MIN_VALUE) {
                throw new AssertionError(defpackage.e.s(new StringBuilder(String.valueOf(j10).length() + 13), "Refcount is: ", j10));
            }
            i11 = (int) j11;
            z10 = i10 == -2147483647;
            if (z10) {
                i11++;
            }
        } while (!atomicLong.compareAndSet(j10, (((long) i11) << 32) | (4294967295L & ((long) (i10 - 1)))));
        if (z10) {
            while (true) {
                xf xfVar = (xf) atomicReference.get();
                if (xfVar != null) {
                    if (xfVar.f24153h <= this.f24125i) {
                        xfVar.cancel(true);
                        while (!atomicReference.compareAndSet(xfVar, null)) {
                            if (atomicReference.get() != xfVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // ta.r
    public final String j() {
        ta.y yVar;
        com.google.android.gms.internal.consent_sdk.x xVar = this.f24124h;
        if (xVar == null || (yVar = (ta.y) ((wd) xVar.f23260a).f24119b) == null) {
            return null;
        }
        String string = yVar.toString();
        String strJ = q4.a.j(new StringBuilder(string.length() + 11), "callable=[", string, X3.j.f27836e);
        xf xfVar = (xf) ((AtomicReference) this.f24124h.f23262c).get();
        if (xfVar == null) {
            return strJ;
        }
        int length = strJ.length();
        String string2 = xfVar.toString();
        return d5.u.h(new StringBuilder(string2.length() + length + 9 + 1), strJ, ", trial=[", string2, X3.j.f27836e);
    }
}
