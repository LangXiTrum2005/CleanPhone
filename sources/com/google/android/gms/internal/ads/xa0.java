package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xa0 implements zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21808b = new xa0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21809c = new xa0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21810d = new xa0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21811e = new xa0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21812f = new xa0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21813g = new xa0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21814h = new xa0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21815i = new xa0(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21816j = new xa0(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21817k = new xa0(9);
    public static final /* synthetic */ xa0 l = new xa0(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21818m = new xa0(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21819n = new xa0(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21820o = new xa0(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21821p = new xa0(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21822q = new xa0(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21823r = new xa0(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21824s = new xa0(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21825t = new xa0(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21826u = new xa0(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21827v = new xa0(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21828w = new xa0(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21829x = new xa0(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21830y = new xa0(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ xa0 f21831z = new xa0(25);
    public static final /* synthetic */ xa0 A = new xa0(26);
    public static final /* synthetic */ xa0 B = new xa0(27);
    public static final /* synthetic */ xa0 C = new xa0(28);
    public static final /* synthetic */ xa0 D = new xa0(29);

    public /* synthetic */ xa0(int i10) {
        this.f21832a = i10;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public final void mo160zza(Object obj) {
        int i10;
        boolean zZzab;
        int i11;
        boolean zZzab2 = false;
        switch (this.f21832a) {
            case 0:
                ((za0) obj).zzl();
                return;
            case 1:
                ((zzr) obj).zzdo();
                return;
            case 2:
                ((zzr) obj).zzdp();
                return;
            case 3:
                ((zzr) obj).zzdq();
                return;
            case 4:
                ((zzr) obj).zzdT();
                return;
            case 5:
                ((zzr) obj).zzdv();
                return;
            case 6:
                ((zzr) obj).zzdw();
                return;
            case 7:
                ((zzr) obj).zzdx();
                return;
            case 8:
                ((zzr) obj).zzdy();
                return;
            case 9:
                ((zzr) obj).zzdz();
                return;
            case 10:
                ((zzr) obj).zzh();
                return;
            case 11:
                ((fb0) obj).zzk();
                return;
            case 12:
                fp0 fp0Var = (fp0) ((gb0) obj);
                synchronized (fp0Var) {
                    zs0 zs0Var = fp0Var.f14493b;
                    Object parent = zs0Var.f22708f.getParent();
                    if (parent instanceof View) {
                        View view = (View) parent;
                        zzt.zzc();
                        zZzab2 = zzs.zzab(view, view.getContext());
                    }
                    if (zZzab2) {
                        zs0Var.c();
                        return;
                    }
                    ub0 ub0Var = zs0Var.f22712j;
                    jb0 jb0Var = zs0Var.f22710h;
                    synchronized (ub0Var) {
                        i10 = ub0Var.f20718b;
                    }
                    jb0Var.Y0(i10);
                    return;
                }
            case 13:
                fp0 fp0Var2 = (fp0) ((gb0) obj);
                synchronized (fp0Var2) {
                    try {
                        Object parent2 = fp0Var2.f14493b.f22708f.getParent();
                        if (parent2 instanceof View) {
                            View view2 = (View) parent2;
                            zzt.zzc();
                            zZzab = zzs.zzab(view2, view2.getContext());
                        } else {
                            zZzab = false;
                        }
                        if (!zZzab) {
                            zs0 zs0Var2 = fp0Var2.f14493b;
                            ub0 ub0Var2 = zs0Var2.f22712j;
                            jb0 jb0Var2 = zs0Var2.f22710h;
                            synchronized (ub0Var2) {
                                i11 = ub0Var2.f20717a;
                            }
                            jb0Var2.X0(i11);
                            return;
                        }
                        nu0 nu0Var = fp0Var2.f14497f;
                        com.google.android.gms.ads.internal.client.zzr zzrVarC = nu0Var.f17958b;
                        p70 p70Var = fp0Var2.f14500i;
                        if (p70Var != null && nu0Var.f17972q) {
                            zzrVarC = x10.c(fp0Var2.f14492a, Collections.singletonList(p70Var.f18545o));
                        }
                        synchronized (fp0Var2) {
                            nu0 nu0Var2 = fp0Var2.f14497f;
                            nu0Var2.f17958b = zzrVarC;
                            nu0Var2.f17972q = fp0Var2.f14496e.zzn;
                            nu0Var.f17971p = true;
                            try {
                                fp0Var2.x1(nu0Var.f17957a);
                            } catch (RemoteException unused) {
                                int i12 = zze.zza;
                                zzo.zzi("Failed to refresh the banner ad.");
                            }
                            fp0Var2.f14497f.f17971p = false;
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th2;
                }
            case 14:
                ((pb0) obj).zza();
                return;
            case 15:
                ((sb0) obj).C();
                return;
            case 16:
                ((sb0) obj).z();
                return;
            case 17:
                ((wb0) obj).zzo();
                return;
            case 18:
                ((yb0) obj).zza();
                return;
            case 19:
                ((gc0) obj).f("MalformedJson");
                return;
            case 20:
                ((gc0) obj).zze();
                return;
            case 21:
                ((gc0) obj).zzf();
                return;
            case 22:
                ((hc0) obj).zzg();
                return;
            case 23:
                ((hc0) obj).zzh();
                return;
            case 24:
                ((jc0) obj).zzb();
                return;
            case 25:
                ((jc0) obj).zza();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((mc0) obj).zzi();
                return;
            case 27:
                ((qc0) obj).O();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ((qc0) obj).C();
                return;
            default:
                sc0 sc0Var = (sc0) obj;
                if (sc0Var.f19931d) {
                    return;
                }
                sc0Var.f19929b.a(sc0Var.f19928a, sc0Var.f19930c);
                sc0Var.f19931d = true;
                return;
        }
    }
}
