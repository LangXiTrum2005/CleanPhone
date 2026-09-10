package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qi1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qi1 f19092b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19093a = new HashMap();

    static {
        pf1 pf1Var = pf1.f18634k;
        qi1 qi1Var = new qi1();
        try {
            qi1Var.a(pf1Var, oi1.class);
            f19092b = qi1Var;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final synchronized void a(di1 di1Var, Class cls) {
        try {
            HashMap map = this.f19093a;
            di1 di1Var2 = (di1) map.get(cls);
            if (di1Var2 != null && !di1Var2.equals(di1Var)) {
                String string = cls.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(string);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            map.put(cls, di1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final jc1 b(ff1 ff1Var, Integer num) {
        jc1 jc1VarA;
        synchronized (this) {
            di1 di1Var = (di1) this.f19093a.get(ff1Var.getClass());
            if (di1Var == null) {
                String string = ff1Var.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 86);
                sb2.append("Cannot create a new key for parameters ");
                sb2.append(string);
                sb2.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb2.toString());
            }
            jc1VarA = di1Var.a(ff1Var, num);
        }
        return jc1VarA;
    }
}
