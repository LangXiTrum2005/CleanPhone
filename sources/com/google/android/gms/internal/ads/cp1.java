package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 implements jj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cp1 f13226a = new cp1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ej1 f13227b = new ej1(ni1.class, hf1.class, tj1.f20424s);

    @Override // com.google.android.gms.internal.ads.jj1
    public final Object a(iw0 iw0Var, iw0 iw0Var2) throws GeneralSecurityException {
        zq1 zq1VarJ;
        List arrayList;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < ((List) iw0Var.f15864b).size(); i10++) {
            cf1 cf1VarU = iw0Var.u(i10);
            if (cf1VarU.f13154b.equals(af1.f12010c)) {
                hf1 hf1Var = (hf1) iw0Var2.f(cf1VarU);
                jc1 jc1Var = cf1VarU.f13153a;
                if (jc1Var instanceof tp1) {
                    zq1VarJ = ((tp1) jc1Var).j();
                } else {
                    if (!(jc1Var instanceof ni1)) {
                        String name = jc1Var.getClass().getName();
                        String strValueOf = String.valueOf(jc1Var.b());
                        throw new GeneralSecurityException(d5.u.h(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zq1VarJ = ((ni1) jc1Var).j();
                }
                hq1 hq1Var = new hq1(hf1Var, cf1VarU.f13155c);
                byte[] bArr = zq1VarJ.f22697a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (map.containsKey(zq1VarJ)) {
                    arrayList = (List) map.get(zq1VarJ);
                } else {
                    arrayList = new ArrayList();
                    map.put(zq1VarJ, arrayList);
                }
                arrayList.add(hq1Var);
            }
        }
        if (((Map) iw0Var.f15865c).get(pi1.class) == null) {
            return new gq1(new dj1(map));
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.jj1
    public final Class zza() {
        return hf1.class;
    }

    @Override // com.google.android.gms.internal.ads.jj1
    public final Class zzb() {
        return hf1.class;
    }
}
