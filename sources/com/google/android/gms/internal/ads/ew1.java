package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ew1 extends ss1 {
    private static final ew1 zzQ;
    private static volatile tt1 zzR;
    private cw1 zzA;
    private at1 zzB;
    private hv1 zzC;
    private String zzD;
    private cv1 zzE;
    private at1 zzF;
    private int zzG;
    private at1 zzH;
    private at1 zzI;
    private long zzJ;
    private dw1 zzK;
    private rv1 zzL;
    private String zzM;
    private bw1 zzN;
    private at1 zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private fv1 zzg;
    private at1 zzh;
    private at1 zzi;
    private String zzj;
    private uv1 zzk;
    private boolean zzl;
    private at1 zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private cs1 zzu;
    private zv1 zzv;
    private boolean zzw;
    private String zzx;
    private at1 zzy;
    private at1 zzz;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        ew1 ew1Var = new ew1();
        zzQ = ew1Var;
        ss1.t(ew1.class, ew1Var);
    }

    public ew1() {
        wt1 wt1Var = wt1.f21606e;
        this.zzh = wt1Var;
        this.zzi = wt1Var;
        this.zzj = "";
        this.zzm = wt1Var;
        this.zzn = "";
        this.zzu = cs1.f13248b;
        this.zzx = "";
        this.zzy = wt1Var;
        this.zzz = wt1Var;
        this.zzB = wt1Var;
        this.zzD = "";
        this.zzF = wt1Var;
        this.zzH = wt1Var;
        this.zzI = wt1Var;
        this.zzM = "";
        this.zzO = wt1Var;
    }

    public static dv1 C() {
        return (dv1) zzQ.q();
    }

    public final List A() {
        return this.zzh;
    }

    public final String B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(fv1 fv1Var) {
        this.zzg = fv1Var;
        this.zza |= 32;
    }

    public final void G(xv1 xv1Var) {
        at1 at1Var = this.zzh;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzh = at1Var.e(size + size);
        }
        this.zzh.add(xv1Var);
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void I() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void J(uv1 uv1Var) {
        this.zzk = uv1Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void K(zv1 zv1Var) {
        this.zzv = zv1Var;
        this.zza |= Segment.SIZE;
    }

    public final void L(ArrayList arrayList) {
        at1 at1Var = this.zzy;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzy = at1Var.e(size + size);
        }
        rr1.e(arrayList, this.zzy);
    }

    public final void M(ArrayList arrayList) {
        at1 at1Var = this.zzz;
        if (!((sr1) at1Var).f20043a) {
            int size = at1Var.size();
            this.zzz = at1Var.e(size + size);
        }
        rr1.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void N(int i10) {
        this.zzb = i10 - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        switch (v0.i.c(i10)) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = ss1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new xt1(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", xv1.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", bv1.f12906k, "zzc", bv1.f12900e, "zzg", "zzj", "zzk", "zzu", "zzi", gw1.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", jw1.class, "zzC", "zzD", "zzE", "zzF", iv1.class, "zzG", bv1.f12909o, "zzH", qv1.class, "zzI", sv1.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", aw1.class});
            case 3:
                return new ew1();
            case 4:
                return new dv1(zzQ);
            case 5:
                return zzQ;
            case 6:
                tt1 tt1Var = zzR;
                if (tt1Var != null) {
                    return tt1Var;
                }
                synchronized (ew1.class) {
                    try {
                        rs1Var = zzR;
                        if (rs1Var == null) {
                            rs1Var = new rs1(zzQ);
                            zzR = rs1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rs1Var;
            default:
                throw null;
        }
    }

    public final String z() {
        return this.zzd;
    }
}
