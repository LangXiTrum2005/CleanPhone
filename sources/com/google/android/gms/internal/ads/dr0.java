package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f13642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f13643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f13644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f13645e;

    public /* synthetic */ dr0(gx1 gx1Var, fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, int i10) {
        this.f13641a = i10;
        this.f13642b = gx1Var;
        this.f13643c = fx1Var;
        this.f13644d = fx1Var2;
        this.f13645e = fx1Var3;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f13641a) {
            case 0:
                jq0 jq0VarZzb = ((lq0) this.f13642b).zzb();
                xq0 xq0Var = (xq0) this.f13643c.zzb();
                List list = (List) this.f13644d.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13645e.zzb();
                if (list.contains("10")) {
                    return new vp0(xq0Var, ((Integer) zzba.zzc().a(am.Pd)).intValue(), scheduledExecutorService);
                }
                return new vp0(jq0VarZzb, ((Integer) zzba.zzc().a(am.Pd)).intValue(), scheduledExecutorService);
            case 1:
                jq0 jq0VarZzb2 = ((rq0) this.f13642b).zzb();
                xq0 xq0Var2 = (xq0) this.f13643c.zzb();
                List list2 = (List) this.f13644d.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f13645e.zzb();
                if (list2.contains("54")) {
                    return new vp0(xq0Var2, ((Integer) zzba.zzc().a(am.Zd)).intValue(), scheduledExecutorService2);
                }
                return new vp0(jq0VarZzb2, ((Integer) zzba.zzc().a(am.Zd)).intValue(), scheduledExecutorService2);
            case 2:
                hq0 hq0VarZzb = ((tq0) this.f13642b).zzb();
                xq0 xq0Var3 = (xq0) this.f13643c.zzb();
                List list3 = (List) this.f13644d.zzb();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f13645e.zzb();
                if (list3.contains("13")) {
                    return new vp0(xq0Var3, ((Integer) zzba.zzc().a(am.Yd)).intValue(), scheduledExecutorService3);
                }
                return new vp0(hq0VarZzb, ((Integer) zzba.zzc().a(am.Yd)).intValue(), scheduledExecutorService3);
            case 3:
                jq0 jq0VarZzb3 = ((ir0) this.f13642b).zzb();
                xq0 xq0Var4 = (xq0) this.f13643c.zzb();
                List list4 = (List) this.f13644d.zzb();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f13645e.zzb();
                if (list4.contains("60")) {
                    return new vp0(xq0Var4, ((Integer) zzba.zzc().a(am.f12460ze)).intValue(), scheduledExecutorService4);
                }
                return new vp0(jq0VarZzb3, ((Integer) zzba.zzc().a(am.f12460ze)).intValue(), scheduledExecutorService4);
            case 4:
                tp0 tp0VarZzb = ((yr0) this.f13642b).zzb();
                xq0 xq0Var5 = (xq0) this.f13643c.zzb();
                List list5 = (List) this.f13644d.zzb();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) this.f13645e.zzb();
                if (list5.contains("35")) {
                    return new vp0(xq0Var5, ((Integer) zzba.zzc().a(am.Md)).intValue(), scheduledExecutorService5);
                }
                return new vp0(tp0VarZzb, ((Integer) zzba.zzc().a(am.Md)).intValue(), scheduledExecutorService5);
            default:
                hq0 hq0VarZzb2 = ((fs0) this.f13642b).zzb();
                xq0 xq0Var6 = (xq0) this.f13643c.zzb();
                List list6 = (List) this.f13644d.zzb();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.f13645e.zzb();
                if (list6.contains("39")) {
                    return new vp0(xq0Var6, ((Integer) zzba.zzc().a(am.Jd)).intValue(), scheduledExecutorService6);
                }
                return new vp0(hq0VarZzb2, ((Integer) zzba.zzc().a(am.Jd)).intValue(), scheduledExecutorService6);
        }
    }
}
