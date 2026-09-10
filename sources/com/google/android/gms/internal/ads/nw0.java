package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 extends ss1 {
    private static final nw0 zzaJ;
    private static volatile tt1 zzaK;
    private int zzC;
    private int zzE;
    private int zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzX;
    private int zzY;
    private int zza;
    private gx0 zzaA;
    private ax0 zzaB;
    private uw0 zzaC;
    private bw0 zzaD;
    private ew0 zzaE;
    private int zzaF;
    private int zzaG;
    private boolean zzaH;
    private int zzaa;
    private long zzak;
    private int zzam;
    private int zzan;
    private int zzao;
    private fx0 zzap;
    private int zzaq;
    private dx0 zzar;
    private sw0 zzas;
    private ww0 zzat;
    private vw0 zzau;
    private ex0 zzav;
    private bx0 zzaw;
    private yw0 zzax;
    private vu1 zzay;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzd = "";
    private ws1 zzh = ts1.f20489e;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzA = "";
    private String zzB = "";
    private String zzD = "";
    private String zzG = "";
    private zs1 zzH = jt1.f16181e;
    private String zzR = "";
    private String zzS = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzZ = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzae = "";
    private String zzaf = "";
    private String zzag = "";
    private String zzah = "";
    private String zzai = "";
    private String zzaj = "";
    private String zzal = "";
    private String zzaz = "";
    private String zzaI = "";

    static {
        nw0 nw0Var = new nw0();
        zzaJ = nw0Var;
        ss1.t(nw0.class, nw0Var);
    }

    public static lw0 B() {
        return (lw0) zzaJ.q();
    }

    public final /* synthetic */ void A(int i10) {
        if (i10 != 1) {
            this.zzQ = i10 - 2;
        } else {
            bt1.a();
            throw null;
        }
    }

    public final /* synthetic */ void C(boolean z10) {
        this.zzi = z10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zzj = j10;
    }

    public final /* synthetic */ void E(long j10) {
        this.zzk = j10;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzu = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzz = str;
    }

    public final /* synthetic */ void H(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzB = str2;
    }

    public final /* synthetic */ void I(int i10) {
        this.zzC = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(Iterable iterable) {
        zs1 zs1Var = this.zzH;
        if (!((sr1) zs1Var).f20043a) {
            this.zzH = ss1.k(zs1Var);
        }
        rr1.e(iterable, this.zzH);
    }

    public final /* synthetic */ void K(int i10) {
        this.zzK = i10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zzM = j10;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzR = str;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzS = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzae = str;
    }

    public final /* synthetic */ void P(String str) {
        this.zzaf = str;
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzag = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzah = str;
    }

    public final /* synthetic */ void S(String str) {
        this.zzai = str;
    }

    public final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzaj = str;
    }

    public final /* synthetic */ void U(mw0 mw0Var) {
        this.zzaq = mw0Var.zza();
    }

    public final /* synthetic */ void V(vu1 vu1Var) {
        this.zzay = vu1Var;
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final /* synthetic */ void W(String str) {
        this.zzaz = str;
    }

    public final /* synthetic */ void X(int i10) {
        this.zzb = i10 - 2;
    }

    public final /* synthetic */ void Y() {
        this.zzp = 1;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzaJ, "\u0004R\u0000\u0001\u0001RR\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000bH\u0004I\u0004J\u0004K\u0002L\u0002M\fN\fOဉ\fPဉ\rQ\u0007RȈ", new Object[]{"zza", "zzb", "zzi", "zzj", "zzp", "zzu", "zzz", "zzB", "zzC", "zzI", "zzK", "zzM", "zzQ", "zzR", "zzS", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzv", "zzx", "zzD", "zzG", "zzH", "zzT", "zzU", "zzac", "zzak", "zzd", "zze", "zzf", "zzg", "zzk", "zzn", "zzo", "zzh", "zzan", "zzao", "zzc", "zzar", "zzas", "zzX", "zzZ", "zzW", "zzV", "zzaq", "zzY", "zzaa", "zzab", "zzA", "zzat", "zzJ", "zzau", "zzal", "zzam", "zzap", "zzav", "zzaw", "zzad", "zzax", "zzay", "zzaz", "zzy", "zzaA", "zzN", "zzO", "zzP", "zzaB", "zzw", "zzaC", "zzL", "zzaF", "zzaG", "zzl", "zzm", "zzE", "zzF", "zzaD", "zzaE", "zzaH", "zzaI"});
        }
        if (iC == 3) {
            return new nw0();
        }
        if (iC == 4) {
            return new lw0(zzaJ);
        }
        if (iC == 5) {
            return zzaJ;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzaK;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (nw0.class) {
            try {
                rs1Var = zzaK;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzaJ);
                    zzaK = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final /* synthetic */ void z(int i10) {
        if (i10 != 1) {
            this.zzI = i10 - 2;
        } else {
            bt1.a();
            throw null;
        }
    }
}
