package com.google.android.gms.internal.ads;

import com.ironsource.InterfaceC0435l1;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15315b;

    public /* synthetic */ hj1(f81 f81Var) {
        this.f15314a = new HashMap((HashMap) f81Var.f14317b);
        this.f15315b = new HashMap((HashMap) f81Var.f14318c);
    }

    public final Object a(jc1 jc1Var, Class cls) throws GeneralSecurityException {
        gj1 gj1Var = new gj1(jc1Var.getClass(), cls);
        HashMap map = this.f15314a;
        if (map.containsKey(gj1Var)) {
            return ((ej1) map.get(gj1Var)).f13998c.c(jc1Var);
        }
        String string = gj1Var.toString();
        throw new GeneralSecurityException(q4.a.j(new StringBuilder(string.length() + InterfaceC0435l1.d.b.f29106c), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
