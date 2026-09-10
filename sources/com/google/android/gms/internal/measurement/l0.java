package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof w1) {
            List listZza = ((w1) iterable).zza();
            w1 w1Var = (w1) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = w1Var.size() - size;
                    String strM = com.applovin.impl.ca.m(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = w1Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strM);
                        }
                        w1Var.remove(size3);
                    }
                } else if (obj instanceof s0) {
                    w1Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    s0.s(bArr, 0, bArr.length);
                    w1Var.zzb();
                } else {
                    w1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof k2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof m2) {
                m2 m2Var = (m2) list;
                int i10 = m2Var.f23725c + size4;
                int length = m2Var.f23724b.length;
                if (i10 > length) {
                    if (length != 0) {
                        while (length < i10) {
                            length = com.applovin.impl.ca.v(length, 3, 2, 1, 10);
                        }
                        m2Var.f23724b = Arrays.copyOf(m2Var.f23724b, length);
                    } else {
                        m2Var.f23724b = new Object[Math.max(i10, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    g1.a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i11 = 0; i11 < size6; i11++) {
            Object obj3 = list2.get(i11);
            if (obj3 == null) {
                g1.a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final byte[] a() {
        try {
            i1 i1Var = (i1) this;
            int iN = i1Var.n();
            byte[] bArr = new byte[iN];
            boolean z10 = x0.f24137d;
            v0 v0Var = new v0(bArr, iN);
            i1Var.f(v0Var);
            if (v0Var.L() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (v0Var.L() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(q4.a.j(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public final void b(OutputStream outputStream) {
        i1 i1Var = (i1) this;
        int iN = i1Var.n();
        boolean z10 = x0.f24137d;
        if (iN > 4096) {
            iN = 4096;
        }
        w0 w0Var = new w0(outputStream, iN);
        i1Var.f(w0Var);
        if (w0Var.f24107g > 0) {
            w0Var.P();
        }
    }

    public abstract int c(o2 o2Var);
}
