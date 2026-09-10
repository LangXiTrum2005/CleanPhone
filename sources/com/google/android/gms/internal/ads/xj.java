package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xj extends ss1 {
    private static final xj zzG;
    private static volatile tt1 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final xs1 zzx = new s6(26);
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private ws1 zzw = ts1.f20489e;
    private uj zzy;
    private int zzz;

    static {
        xj xjVar = new xj();
        zzG = xjVar;
        ss1.t(xj.class, xjVar);
    }

    public static xj O(byte[] bArr) throws et1 {
        xj xjVar = zzG;
        int length = bArr.length;
        ks1 ks1Var = ks1.f16518a;
        int i10 = tr1.f20473a;
        ss1 ss1VarX = ss1.x(xjVar, bArr, length, ks1.f16519b);
        ss1.y(ss1VarX);
        return (xj) ss1VarX;
    }

    public static wj P() {
        return (wj) zzG.q();
    }

    public final void A(ll llVar) {
        this.zzp = llVar.f17050a;
        this.zzn |= 2;
    }

    public final void B(long j10) {
        this.zzn |= 4;
        this.zzu = j10;
    }

    public final void C(long j10) {
        this.zzn |= 8;
        this.zzv = j10;
    }

    public final void D(ArrayList arrayList) {
        List list = this.zzw;
        if (!((sr1) list).f20043a) {
            int size = list.size();
            this.zzw = ((ts1) list).e(size + size);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cl clVar = (cl) it.next();
            ((ts1) this.zzw).n(clVar.f13209a);
        }
    }

    public final void E(uj ujVar) {
        this.zzy = ujVar;
        this.zzn |= 16;
    }

    public final void F(ll llVar) {
        this.zzz = llVar.f17050a;
        this.zzn |= 32;
    }

    public final void G(ll llVar) {
        this.zzA = llVar.f17050a;
        this.zzn |= 64;
    }

    public final void H(ll llVar) {
        this.zzB = llVar.f17050a;
        this.zzn |= 128;
    }

    public final void I(int i10) {
        this.zzn |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzC = i10;
    }

    public final void J(ll llVar) {
        this.zzD = llVar.f17050a;
        this.zzn |= 512;
    }

    public final void K(zj zjVar) {
        this.zzE = zjVar.f22638a;
        this.zzn |= 1024;
    }

    public final void L(long j10) {
        this.zzn |= com.ironsource.mediationsdk.metadata.a.f29616n;
        this.zzF = j10;
    }

    public final long M() {
        return this.zzo;
    }

    public final ll N() {
        ll llVar;
        int i10 = this.zzp;
        ll llVar2 = ll.ENUM_FALSE;
        if (i10 == 0) {
            llVar = llVar2;
        } else if (i10 != 1) {
            llVar = i10 != 1000 ? null : ll.ENUM_UNKNOWN;
        } else {
            llVar = ll.ENUM_TRUE;
        }
        return llVar == null ? llVar2 : llVar;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            nd ndVar = nd.f17775x;
            return new xt1(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", ndVar, "zzu", "zzv", "zzw", nd.f17773v, "zzy", "zzz", ndVar, "zzA", ndVar, "zzB", ndVar, "zzC", "zzD", ndVar, "zzE", nd.f17770s, "zzF"});
        }
        if (iC == 3) {
            return new xj();
        }
        if (iC == 4) {
            return new wj(zzG);
        }
        if (iC == 5) {
            return zzG;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzH;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (xj.class) {
            try {
                rs1Var = zzH;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzG);
                    zzH = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final void z(long j10) {
        this.zzn |= 1;
        this.zzo = j10;
    }
}
