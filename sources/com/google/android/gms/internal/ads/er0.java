package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class er0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kx1 f14059b;

    public /* synthetic */ er0() {
        this.f14058a = 25;
    }

    public static void a(er0 er0Var, kx1 kx1Var) {
        if (er0Var.f14059b != null) {
            throw new IllegalStateException();
        }
        er0Var.f14059b = kx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Object ja1Var;
        switch (this.f14058a) {
            case 0:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                yq0 yq0Var = new yq0(k00Var, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14059b.zzb();
                if (((Boolean) zzba.zzc().a(am.f12163g5)).booleanValue()) {
                    vp0 vp0Var = new vp0(yq0Var, ((Integer) zzba.zzc().a(am.f12178h5)).intValue(), scheduledExecutorService);
                    int i10 = ia1.f15692c;
                    ja1Var = new ja1(vp0Var);
                } else {
                    int i11 = ia1.f15692c;
                    ja1Var = eb1.f13923j;
                }
                ic1.h(ja1Var);
                return ja1Var;
            case 1:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new vp0(new yq0(k00Var2, 1), ((Integer) zzba.zzc().a(am.Ud)).intValue(), (ScheduledExecutorService) this.f14059b.zzb());
            case 2:
                Context contextA = ((o40) this.f14059b).a();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new hq0(contextA, k00Var3, 3);
            case 3:
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new hq0(k00Var4, ((o40) this.f14059b).a(), 4);
            case 4:
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new jq0(3, k00Var5, (lj0) this.f14059b.zzb());
            case 5:
                return new qp0((cu0) this.f14059b.zzb(), 4);
            case 6:
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                return new yq0(((o40) this.f14059b).a(), k00Var6);
            case 7:
                k00 k00Var7 = l00.f16608a;
                ic1.h(k00Var7);
                return new jq0(4, k00Var7, (ji0) this.f14059b.zzb());
            case 8:
                k00 k00Var8 = l00.f16608a;
                ic1.h(k00Var8);
                return new hq0(k00Var8, ((o40) this.f14059b).a(), 5);
            case 9:
                k00 k00Var9 = l00.f16608a;
                ic1.h(k00Var9);
                ((o40) this.f14059b).a();
                return new yq0(k00Var9, 4);
            case 10:
                return new ts0((zu0) this.f14059b.zzb());
            case 11:
                return new ut0((zu0) this.f14059b.zzb());
            case 12:
                return new jw0((kw0) this.f14059b.zzb());
            case 13:
                return new jw0((kw0) this.f14059b.zzb());
            case 14:
                return new File(new File((File) this.f14059b.zzb(), "drgd"), "pmtd.d");
            case 15:
                return new File(new File((File) this.f14059b.zzb(), "drgd"), "pcbc.d");
            case 16:
                return new File(new File((File) this.f14059b.zzb(), "drgd"), "pcam.jar.d");
            case 17:
                return new File(new File((File) this.f14059b.zzb(), "drgd"), "pmtd");
            case 18:
                return new File(new File(new File((File) this.f14059b.zzb(), "drgd"), "v"), "pcopt");
            case 19:
                return new File(new File((File) this.f14059b.zzb(), "drgd"), "pcbc");
            case 20:
                return new File(new File((File) this.f14059b.zzb(), "drgd"), "pcam.jar.tmp");
            case 21:
                return new File(new File(new File((File) this.f14059b.zzb(), "drgd"), "v"), "pcam.jar");
            case 22:
                return new File(new File((File) this.f14059b.zzb(), "ocs"), "pmtd");
            case 23:
                return new File(new File((File) this.f14059b.zzb(), "ocs"), "pcbc");
            case 24:
                return new File(new File((File) this.f14059b.zzb(), "ocs"), "pcam.jar");
            default:
                kx1 kx1Var = this.f14059b;
                if (kx1Var != null) {
                    return kx1Var.zzb();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ er0(kx1 kx1Var, int i10) {
        this.f14058a = i10;
        this.f14059b = kx1Var;
    }
}
