package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i9 extends i1 {
    private static final i9 zzp;
    private static volatile j2 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private a2 zzm;
    private a2 zzn;
    private String zzo;

    static {
        i9 i9Var = new i9();
        zzp = i9Var;
        i1.p(i9.class, i9Var);
    }

    public i9() {
        a2 a2Var = a2.f23290b;
        this.zzm = a2Var;
        this.zzn = a2Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static f9 Z() {
        return (f9) zzp.k();
    }

    public static i9 a0() {
        return zzp;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void B() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void C(long j10) {
        this.zzb |= 128;
        this.zzl = j10;
    }

    public final a2 D() {
        a2 a2Var = this.zzm;
        if (!a2Var.f23291a) {
            this.zzm = a2Var.g();
        }
        return this.zzm;
    }

    public final a2 E() {
        a2 a2Var = this.zzn;
        if (!a2Var.f23291a) {
            this.zzn = a2Var.g();
        }
        return this.zzn;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzo = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean H() {
        return (this.zzb & 1) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final String K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 4) != 0;
    }

    public final String M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final long O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zzb & 16) != 0;
    }

    public final String Q() {
        return this.zzi;
    }

    public final boolean R() {
        return (this.zzb & 32) != 0;
    }

    public final String S() {
        return this.zzj;
    }

    public final boolean T() {
        return (this.zzb & 64) != 0;
    }

    public final String U() {
        return this.zzk;
    }

    public final boolean V() {
        return (this.zzb & 128) != 0;
    }

    public final long W() {
        return this.zzl;
    }

    public final boolean X() {
        return (this.zzb & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final String Y() {
        return this.zzo;
    }

    public final /* synthetic */ void b0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void c0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void d0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void e0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void f0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", g9.f23506a, "zzn", h9.f23542a, "zzo"});
        }
        if (i11 == 3) {
            return new i9();
        }
        if (i11 == 4) {
            return new f9(zzp);
        }
        if (i11 == 5) {
            return zzp;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzq;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (i9.class) {
            try {
                h1Var = zzq;
                if (h1Var == null) {
                    h1Var = new h1(zzp);
                    zzq = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void v(long j10) {
        this.zzb |= 8;
        this.zzh = j10;
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void x() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void z() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }
}
