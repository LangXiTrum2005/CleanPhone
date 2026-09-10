package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cr0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f13243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f13244c;

    public cr0(fx1 fx1Var, ca0 ca0Var) {
        this.f13242a = 14;
        this.f13243b = fx1Var;
        this.f13244c = ca0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01f7  */
    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Object ja1Var;
        int i10 = this.f13242a;
        kx1 kx1Var = this.f13243b;
        kx1 kx1Var2 = this.f13244c;
        switch (i10) {
            case 0:
                return new vp0(((do0) kx1Var2).a(), ((Integer) zzba.zzc().a(am.f12122de)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 1:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new vp0(new hq0(k00Var, ((o40) ((v50) kx1Var2).f21035b).a(), 0), ((Integer) zzba.zzc().a(am.f12246le)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 2:
                return new vp0(new qp0((ct0) ((ni0) kx1Var2).f17835b.f15424a, 3), ((Integer) zzba.zzc().a(am.Wd)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 3:
                return new vp0(((x80) kx1Var2).a(), ((Integer) zzba.zzc().a(am.f12139ee)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 4:
                Context contextA = ((o40) ((er0) kx1Var2).f14059b).a();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new vp0(new hq0(contextA, k00Var2, 3), ((Integer) zzba.zzc().a(am.Vd)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 5:
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                hq0 hq0Var = new hq0(k00Var3, ((o40) ((er0) kx1Var2).f14059b).a(), 4);
                Context contextA2 = ((o40) kx1Var).a();
                if (((Boolean) zzba.zzc().a(am.Yc)).booleanValue()) {
                    zzt.zzc();
                    if (zzs.zzE(contextA2)) {
                        int i11 = ia1.f15692c;
                        ja1Var = new ja1(hq0Var);
                    } else {
                        int i12 = ia1.f15692c;
                        ja1Var = eb1.f13923j;
                    }
                } else {
                    int i13 = ia1.f15692c;
                    ja1Var = eb1.f13923j;
                }
                ic1.h(ja1Var);
                return ja1Var;
            case 6:
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new vp0(new xp0(k00Var4, ((zg0) kx1Var2).f22603b.a(), 1), ((Integer) zzba.zzc().a(am.ie)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 7:
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new vp0(new jq0(3, k00Var5, (lj0) ((er0) kx1Var2).f14059b.zzb()), ((Integer) zzba.zzc().a(am.Td)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 8:
                return new vp0(new qp0((cu0) ((er0) kx1Var2).f14059b.zzb(), 4), ((Integer) zzba.zzc().a(am.f12217je)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 9:
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                return new vp0(new yq0(((o40) ((er0) kx1Var2).f14059b).a(), k00Var6), ((Integer) zzba.zzc().a(am.Qd)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 10:
                k00 k00Var7 = l00.f16608a;
                ic1.h(k00Var7);
                return new vp0(new jq0(4, k00Var7, (ji0) ((er0) kx1Var2).f14059b.zzb()), ((Integer) zzba.zzc().a(am.Sd)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 11:
                return new vp0(((x80) kx1Var2).b(), ((Integer) zzba.zzc().a(am.Od)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 12:
                w70 w70Var = (w70) kx1Var2;
                kz kzVar = (kz) w70Var.f21437b.zzb();
                k00 k00Var8 = l00.f16608a;
                ic1.h(k00Var8);
                return new vp0(new zp0(kzVar, k00Var8, ((o40) w70Var.f21438c).a(), 3), ((Integer) zzba.zzc().a(am.Nd)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 13:
                k00 k00Var9 = l00.f16608a;
                ic1.h(k00Var9);
                return new vp0(new hq0(k00Var9, ((o40) ((er0) kx1Var2).f14059b).a(), 5), ((Integer) zzba.zzc().a(am.Ld)).intValue(), (ScheduledExecutorService) kx1Var.zzb());
            case 14:
                k00 k00Var10 = l00.f16608a;
                ic1.h(k00Var10);
                return new yv0(k00Var10, (ScheduledExecutorService) kx1Var.zzb(), new xv0(((ca0) kx1Var2).f13121b.zzb()));
            default:
                return new o61((u61) ((fx1) kx1Var2).zzb(), ((lx1) kx1Var).zzb());
        }
    }

    public /* synthetic */ cr0(kx1 kx1Var, kx1 kx1Var2, int i10) {
        this.f13242a = i10;
        this.f13244c = kx1Var;
        this.f13243b = kx1Var2;
    }
}
