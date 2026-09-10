package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f11 extends ss1 {
    private static final f11 zzb;
    private static volatile tt1 zzc;
    private lt1 zza = lt1.f17125b;

    static {
        f11 f11Var = new f11();
        zzb = f11Var;
        ss1.t(f11.class, f11Var);
    }

    public static f11 B(FileInputStream fileInputStream) throws et1 {
        f11 f11Var = zzb;
        es1 es1Var = new es1(fileInputStream);
        ks1 ks1Var = ks1.f16518a;
        int i10 = tr1.f20473a;
        ss1 ss1VarL = ss1.l(f11Var, es1Var, ks1.f16519b);
        ss1.y(ss1VarL);
        return (f11) ss1VarL;
    }

    public static f11 C() {
        return zzb;
    }

    public final Map A() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final lt1 D() {
        lt1 lt1Var = this.zza;
        if (!lt1Var.f17126a) {
            this.zza = lt1Var.g();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", e11.f13803a});
        }
        if (iC == 3) {
            return new f11();
        }
        if (iC == 4) {
            return new d11(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzc;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (f11.class) {
            try {
                rs1Var = zzc;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzb);
                    zzc = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final int z() {
        return this.zza.size();
    }
}
