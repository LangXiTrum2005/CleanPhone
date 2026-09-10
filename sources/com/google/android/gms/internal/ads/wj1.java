package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wj1 implements jj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wj1 f21527a = new wj1();

    @Override // com.google.android.gms.internal.ads.jj1
    public final Object a(iw0 iw0Var, iw0 iw0Var2) throws GeneralSecurityException {
        zq1 zq1VarJ;
        List list;
        cf1 cf1VarR = iw0Var.r();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < ((List) iw0Var.f15864b).size(); i10++) {
            cf1 cf1VarU = iw0Var.u(i10);
            if (cf1VarU.f13154b.equals(af1.f12010c)) {
                ik1 ik1Var = (ik1) iw0Var2.f(cf1VarU);
                jc1 jc1Var = cf1VarU.f13153a;
                if (jc1Var instanceof dk1) {
                    zq1VarJ = ((dk1) jc1Var).j();
                } else {
                    if (!(jc1Var instanceof ni1)) {
                        String name = jc1Var.getClass().getName();
                        String strValueOf = String.valueOf(jc1Var.b());
                        throw new GeneralSecurityException(d5.u.h(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zq1VarJ = ((ni1) jc1Var).j();
                }
                byte[] bArr = zq1VarJ.f22697a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(zq1VarJ)) {
                    list = (List) map.get(zq1VarJ);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(zq1VarJ, arrayList);
                    list = arrayList;
                }
                list.add(ik1Var);
            }
        }
        return new ik1();
    }

    @Override // com.google.android.gms.internal.ads.jj1
    public final Class zza() {
        return ik1.class;
    }

    @Override // com.google.android.gms.internal.ads.jj1
    public final Class zzb() {
        return ik1.class;
    }
}
