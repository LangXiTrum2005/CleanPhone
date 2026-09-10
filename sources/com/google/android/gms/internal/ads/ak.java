package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ak extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final ak zzv;
    private static volatile tt1 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private at1 zzj = wt1.f21606e;
    private String zzn = "";
    private String zzo = "";

    static {
        ak akVar = new ak();
        zzv = akVar;
        ss1.t(ak.class, akVar);
    }

    public static yj z() {
        return (yj) zzv.q();
    }

    public final void A(ArrayList arrayList) {
        at1 at1Var = this.zzj;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzj = at1Var.e(size + size);
        }
        rr1.e(arrayList, this.zzj);
    }

    public final void B(int i10) {
        this.zzi |= 1;
        this.zzk = i10;
    }

    public final void C(int i10) {
        this.zzi |= 2;
        this.zzl = i10;
    }

    public final void D(long j10) {
        this.zzi |= 4;
        this.zzm = j10;
    }

    public final void E(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void F() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void G(long j10) {
        this.zzi |= 32;
        this.zzp = j10;
    }

    public final void H(int i10) {
        this.zzi |= 64;
        this.zzu = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", xj.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (iC == 3) {
            return new ak();
        }
        if (iC == 4) {
            return new yj(zzv);
        }
        if (iC == 5) {
            return zzv;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzw;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (ak.class) {
            try {
                rs1Var = zzw;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzv);
                    zzw = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
