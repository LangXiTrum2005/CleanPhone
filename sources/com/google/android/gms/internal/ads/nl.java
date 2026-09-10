package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nl extends ss1 {
    private static final nl zzF;
    private static volatile tt1 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private uj zzA;
    private sj zzB;
    private ak zzC;
    private bl zzD;
    private tk zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private hk zzw;
    private jl zzy;
    private kl zzz;
    private String zzp = "";
    private int zzv = 1000;
    private zs1 zzx = jt1.f16181e;

    static {
        nl nlVar = new nl();
        zzF = nlVar;
        ss1.t(nl.class, nlVar);
    }

    public static ml K() {
        return (ml) zzF.q();
    }

    public final void A(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final sj B() {
        sj sjVar = this.zzB;
        return sjVar == null ? sj.z() : sjVar;
    }

    public final void C(tk tkVar) {
        this.zzE = tkVar;
        this.zzn |= com.ironsource.mediationsdk.metadata.a.f29616n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(List list) {
        zs1 zs1Var = this.zzx;
        if (!((sr1) zs1Var).f20043a) {
            this.zzx = ss1.k(zs1Var);
        }
        rr1.e(list, this.zzx);
    }

    public final void E() {
        this.zzx = jt1.f16181e;
    }

    public final void F(jl jlVar) {
        this.zzy = jlVar;
        this.zzn |= 32;
    }

    public final void G(sj sjVar) {
        this.zzB = sjVar;
        this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void H(ak akVar) {
        this.zzC = akVar;
        this.zzn |= 512;
    }

    public final void I(bl blVar) {
        this.zzD = blVar;
        this.zzn |= 1024;
    }

    public final String J() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", nd.f17775x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (iC == 3) {
            return new nl();
        }
        if (iC == 4) {
            return new ml(zzF);
        }
        if (iC == 5) {
            return zzF;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzG;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (nl.class) {
            try {
                rs1Var = zzG;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzF);
                    zzG = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final jl z() {
        jl jlVar = this.zzy;
        return jlVar == null ? jl.z() : jlVar;
    }
}
