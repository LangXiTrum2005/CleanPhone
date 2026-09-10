package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yd extends i1 {
    private static final yd zzl;
    private static volatile j2 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private s1 zzg = m2.f23723e;

    static {
        yd ydVar = new yd();
        zzl = ydVar;
        i1.p(yd.class, ydVar);
    }

    public static yd w(InputStream inputStream, z0 z0Var) throws u1 {
        yd ydVar = zzl;
        fs1 fs1VarV = fs1.v(inputStream, 4096);
        i1 i1VarI = ydVar.i();
        try {
            o2 o2VarA = l2.f23690c.a(i1VarI.getClass());
            androidx.datastore.preferences.protobuf.n nVar = (androidx.datastore.preferences.protobuf.n) fs1VarV.f14525c;
            if (nVar == null) {
                nVar = new androidx.datastore.preferences.protobuf.n(fs1VarV, (byte) 0);
            }
            o2VarA.e(i1VarI, nVar, z0Var);
            o2VarA.a(i1VarI);
            i1.s(i1VarI);
            return (yd) i1VarI;
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

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", i0.f23555b, "zzi", "zzk", "zzj"});
        }
        if (i11 == 3) {
            return new yd();
        }
        if (i11 == 4) {
            return new m8(zzl);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzm;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (yd.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
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

    public final boolean v() {
        return this.zzf;
    }
}
