package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rf0 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f19571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du0 f19572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fu0 f19573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzb f19574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bz f19575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f19576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f19577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19578i;

    public /* synthetic */ rf0(Object obj, zzr zzrVar, du0 du0Var, fu0 fu0Var, zzb zzbVar, bz bzVar, String str, String str2, int i10) {
        this.f19570a = i10;
        this.f19578i = obj;
        this.f19571b = zzrVar;
        this.f19572c = du0Var;
        this.f19573d = fu0Var;
        this.f19574e = zzbVar;
        this.f19575f = bzVar;
        this.f19576g = str;
        this.f19577h = str2;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        ji0 ji0Var;
        switch (this.f19570a) {
            case 0:
                tf0 tf0Var = (tf0) this.f19578i;
                zzr zzrVar = this.f19571b;
                du0 du0Var = this.f19572c;
                fu0 fu0Var = this.f19573d;
                zzb zzbVar = this.f19574e;
                bz bzVar = this.f19575f;
                String str = this.f19576g;
                String str2 = this.f19577h;
                b30 b30VarA = tf0Var.f20353j.a(zzrVar, du0Var, fu0Var);
                kj kjVar = new kj(b30VarA);
                pg0 pg0Var = tf0Var.l.f19585a;
                g30 g30VarZzP = b30VarA.zzP();
                ul ulVar = am.f12352sf;
                g30VarZzP.J(pg0Var, pg0Var, pg0Var, pg0Var, pg0Var, false, null, !((Boolean) zzba.zzc().a(ulVar)).booleanValue() ? new zzb(tf0Var.f20344a, null, null) : zzbVar, null, true != ((Boolean) zzba.zzc().a(ulVar)).booleanValue() ? null : bzVar, tf0Var.f20357o, tf0Var.f20356n, tf0Var.f20355m, null, pg0Var, null, null, null, null, null, null, null);
                b30VarA.D("/getNativeAdViewSignals", nq.f17902n);
                b30VarA.D("/getNativeClickMeta", nq.f17903o);
                if (((Boolean) zzba.zzc().a(am.Q8)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.S8)).booleanValue() && (ji0Var = tf0Var.f20361s) != null) {
                        b30VarA.D("/onDeviceStorageEvent", new eq(ji0Var, 3));
                    }
                }
                g30 g30VarZzP2 = b30VarA.zzP();
                synchronized (g30VarZzP2.f14697d) {
                    g30VarZzP2.f14711s = true;
                    break;
                }
                b30VarA.zzP().f14700g = new i30(kjVar, 1);
                b30VarA.t(str, str2);
                return kjVar;
            default:
                bg0 bg0Var = (bg0) this.f19578i;
                zzr zzrVar2 = this.f19571b;
                du0 du0Var2 = this.f19572c;
                fu0 fu0Var2 = this.f19573d;
                zzb zzbVar2 = this.f19574e;
                bz bzVar2 = this.f19575f;
                String str3 = this.f19576g;
                String str4 = this.f19577h;
                b30 b30VarA2 = bg0Var.f12767c.a(zzrVar2, du0Var2, fu0Var2);
                kj kjVar2 = new kj(b30VarA2);
                if (bg0Var.f12765a.f18361b != null) {
                    bg0Var.a(b30VarA2, zzbVar2, bzVar2);
                    b30VarA2.F(new t0(5, 0, 0));
                } else {
                    pg0 pg0Var2 = bg0Var.f12768d.f19585a;
                    g30 g30VarZzP3 = b30VarA2.zzP();
                    ul ulVar2 = am.f12352sf;
                    g30VarZzP3.J(pg0Var2, pg0Var2, pg0Var2, pg0Var2, pg0Var2, false, null, !((Boolean) zzba.zzc().a(ulVar2)).booleanValue() ? new zzb(bg0Var.f12769e, null, null) : zzbVar2, null, true != ((Boolean) zzba.zzc().a(ulVar2)).booleanValue() ? null : bzVar2, bg0Var.f12772h, bg0Var.f12771g, bg0Var.f12770f, null, pg0Var2, null, null, null, null, bg0Var.f12774j, null, null);
                    bg0.b(b30VarA2);
                }
                b30VarA2.zzP().f14700g = new zf0(bg0Var, b30VarA2, kjVar2, 0);
                b30VarA2.t(str3, str4);
                return kjVar2;
        }
    }
}
