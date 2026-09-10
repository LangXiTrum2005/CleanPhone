package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr1 {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof ht1) {
            List listZza = ((ht1) iterable).zza();
            ht1 ht1Var = (ht1) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = ht1Var.size() - size;
                    String strM = com.applovin.impl.ca.m(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = ht1Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strM);
                        }
                        ht1Var.remove(size3);
                    }
                } else if (obj instanceof cs1) {
                    ht1Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    cs1.D(bArr, 0, bArr.length);
                    ht1Var.zzb();
                } else {
                    ht1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof ut1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof wt1) {
                wt1 wt1Var = (wt1) list;
                int i10 = wt1Var.f21608c + size4;
                int length = wt1Var.f21607b.length;
                if (i10 > length) {
                    if (length != 0) {
                        while (length < i10) {
                            length = com.applovin.impl.ca.v(length, 3, 2, 1, 10);
                        }
                        wt1Var.f21607b = Arrays.copyOf(wt1Var.f21607b, length);
                    } else {
                        wt1Var.f21607b = new Object[Math.max(i10, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    qs1.g(size5, list);
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
                qs1.g(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final as1 a() {
        try {
            int iD = ((ss1) this).d(null);
            as1 as1Var = cs1.f13248b;
            byte[] bArr = new byte[iD];
            boolean z10 = is1.f15840b;
            gs1 gs1Var = new gs1(bArr, iD);
            ((ss1) this).u(gs1Var);
            gs1Var.r();
            return new as1(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(f("ByteString"), e10);
        }
    }

    public final byte[] b() {
        try {
            int iD = ((ss1) this).d(null);
            byte[] bArr = new byte[iD];
            boolean z10 = is1.f15840b;
            gs1 gs1Var = new gs1(bArr, iD);
            ((ss1) this).u(gs1Var);
            gs1Var.r();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(f("byte array"), e10);
        }
    }

    public final void c(OutputStream outputStream) {
        ss1 ss1Var = (ss1) this;
        int iD = ss1Var.d(null);
        boolean z10 = is1.f15840b;
        if (iD > 4096) {
            iD = 4096;
        }
        hs1 hs1Var = new hs1(outputStream, iD);
        ss1Var.u(hs1Var);
        if (hs1Var.f15382e > 0) {
            hs1Var.R();
        }
    }

    public abstract int d(bu1 bu1Var);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + str.length() + 44);
        d5.u.r(sb2, "Serializing ", name, " to a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }
}
