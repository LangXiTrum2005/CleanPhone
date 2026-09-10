package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class md extends ss1 {
    private static final md zzu;
    private static volatile tt1 zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private at1 zzb = wt1.f21606e;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private ws1 zzn = ts1.f20489e;

    static {
        md mdVar = new md();
        zzu = mdVar;
        ss1.t(md.class, mdVar);
    }

    public static ld z() {
        return (ld) zzu.q();
    }

    public final void A(vd vdVar) {
        at1 at1Var = this.zzb;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzb = at1Var.e(size + size);
        }
        this.zzb.add(vdVar);
    }

    public final void B() {
        this.zzb = wt1.f21606e;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void D(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void H(long j10) {
        this.zza |= 64;
        this.zzi = j10;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzk = str;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 512;
        this.zzl = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 1024;
        this.zzm = j10;
    }

    public final void M(ws1 ws1Var) {
        List list = this.zzn;
        if (!((sr1) list).f20043a) {
            int size = list.size();
            this.zzn = ((ts1) list).e(size + size);
        }
        rr1.e(ws1Var, this.zzn);
    }

    public final /* synthetic */ void N(int i10) {
        this.zzg = i10 - 1;
        this.zza |= 16;
    }

    public final void O(int i10) {
        this.zzo = i10 - 2;
        this.zza |= com.ironsource.mediationsdk.metadata.a.f29616n;
    }

    public final /* synthetic */ void P(int i10) {
        this.zzp = 1;
        this.zza |= 4096;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", vd.class, "zzc", "zzd", "zze", "zzf", "zzg", nd.f17756d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (iC == 3) {
            return new md();
        }
        if (iC == 4) {
            return new ld(zzu);
        }
        if (iC == 5) {
            return zzu;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzv;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (md.class) {
            try {
                rs1Var = zzv;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzu);
                    zzv = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
