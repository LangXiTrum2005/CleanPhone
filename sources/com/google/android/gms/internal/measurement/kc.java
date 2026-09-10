package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kc extends i1 {
    private static final kc zzj;
    private static volatile j2 zzk;
    private int zzb;
    private long zzh;
    private a2 zzi = a2.f23290b;
    private String zze = "";
    private s0 zzf = s0.f23949b;
    private String zzg = "";

    static {
        kc kcVar = new kc();
        zzj = kcVar;
        i1.p(kc.class, kcVar);
    }

    public static kc A(fs1 fs1Var, z0 z0Var) {
        i1 i1VarI = zzj.i();
        try {
            o2 o2VarA = l2.f23690c.a(i1VarI.getClass());
            androidx.datastore.preferences.protobuf.n nVar = (androidx.datastore.preferences.protobuf.n) fs1Var.f14525c;
            if (nVar == null) {
                nVar = new androidx.datastore.preferences.protobuf.n(fs1Var, (byte) 0);
            }
            o2VarA.e(i1VarI, nVar, z0Var);
            o2VarA.a(i1VarI);
            i1.s(i1VarI);
            return (kc) i1VarI;
        } catch (s2 e10) {
            throw e10.d();
        } catch (u1 e11) {
            if (e11.f24012a) {
                throw new u1(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof u1) {
                throw ((u1) e12.getCause());
            }
            throw new u1(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof u1) {
                throw ((u1) e13.getCause());
            }
            throw e13;
        }
    }

    public static kc B() {
        return zzj;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", jc.f23622a});
        }
        if (i11 == 3) {
            return new kc();
        }
        if (i11 == 4) {
            return new m8(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzk;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (kc.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final String u() {
        return this.zze;
    }

    public final s0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final Map z() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
