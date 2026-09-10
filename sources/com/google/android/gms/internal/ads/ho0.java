package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 implements tm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xg0 f15341d;

    public /* synthetic */ ho0(Context context, Executor executor, xg0 xg0Var, int i10) {
        this.f15338a = i10;
        this.f15339b = context;
        this.f15340c = executor;
        this.f15341d = xg0Var;
    }

    public static final void c(ju0 ju0Var, du0 du0Var, qm0 qm0Var) {
        try {
            wu0 wu0Var = (wu0) qm0Var.f19127b;
            try {
                wu0Var.f21609a.z0(((ou0) ju0Var.f16195a.f20839b).f18363d, du0Var.f13713v.toString());
            } catch (Throwable th2) {
                throw new qu0(th2);
            }
        } catch (Exception e10) {
            String str = qm0Var.f19126a;
            int i10 = zze.zza;
            zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final Object a(ju0 ju0Var, du0 du0Var, qm0 qm0Var) {
        switch (this.f15338a) {
            case 0:
                vu0 vu0Var = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                wg0 wg0Var = new wg0(new ym0(this, qm0Var, du0Var, 1), null, 0);
                m50 m50Var = (m50) this.f15341d;
                l50 l50Var = new l50(m50Var.f17253c, m50Var.f17255d, vu0Var, wg0Var);
                l50Var.V().P0(new k60((wu0) qm0Var.f19127b, 0), this.f15340c);
                ((jn0) qm0Var.f19128c).y1((jo0) l50Var.r0.zzb());
                return l50Var.X();
            default:
                vu0 vu0Var2 = new vu0(ju0Var, du0Var, qm0Var.f19126a);
                wg0 wg0Var2 = new wg0(new lj1(this, qm0Var, du0Var, 26), null, 0);
                m50 m50Var2 = (m50) this.f15341d;
                l50 l50Var2 = new l50(m50Var2.f17253c, m50Var2.f17255d, vu0Var2, wg0Var2);
                l50Var2.V().P0(new k60((wu0) qm0Var.f19127b, 0), this.f15340c);
                qa0 qa0Var = (qa0) l50Var2.f16726d0.zzb();
                ba0 ba0Var = (ba0) l50Var2.f16727e0.zzb();
                bb0 bb0Var = (bb0) l50Var2.f16731j0.zzb();
                uc0 uc0Var = (uc0) l50Var2.f16737p0.zzb();
                kn0 kn0Var = (kn0) qm0Var.f19128c;
                mo0 mo0Var = new mo0(this, bb0Var, ba0Var, qa0Var, uc0Var);
                synchronized (kn0Var) {
                    kn0Var.f16483a = mo0Var;
                }
                return l50Var2.X();
        }
    }

    @Override // com.google.android.gms.internal.ads.tm0
    public final void b(ju0 ju0Var, du0 du0Var, qm0 qm0Var) throws qu0 {
        switch (this.f15338a) {
            case 0:
                JSONObject jSONObject = du0Var.f13713v;
                IInterface iInterface = qm0Var.f19128c;
                Object obj = qm0Var.f19127b;
                Context context = this.f15339b;
                try {
                    ou0 ou0Var = (ou0) ju0Var.f16195a.f20839b;
                    d5.o oVar = ou0Var.f18374p;
                    zzm zzmVar = ou0Var.f18363d;
                    if (oVar.f38703b == 3) {
                        wu0 wu0Var = (wu0) obj;
                        try {
                            wu0Var.f21609a.c1(new s9.b(context), zzmVar, jSONObject.toString(), (xt) iInterface);
                            return;
                        } catch (Throwable th2) {
                            throw new qu0(th2);
                        }
                    }
                    wu0 wu0Var2 = (wu0) obj;
                    try {
                        wu0Var2.f21609a.I0(new s9.b(context), zzmVar, jSONObject.toString(), (xt) iInterface);
                        return;
                    } catch (Throwable th3) {
                        throw new qu0(th3);
                    }
                } catch (Exception e10) {
                    String str = qm0Var.f19126a;
                    int i10 = zze.zza;
                    zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
                    return;
                }
                String str2 = qm0Var.f19126a;
                int i11 = zze.zza;
                zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str2)), e10);
                return;
            default:
                wu0 wu0Var3 = (wu0) qm0Var.f19127b;
                if (wu0Var3.a()) {
                    c(ju0Var, du0Var, qm0Var);
                    return;
                }
                uw uwVar = new uw(this, ju0Var, du0Var, qm0Var, 9, false);
                IInterface iInterface2 = qm0Var.f19128c;
                kn0 kn0Var = (kn0) iInterface2;
                synchronized (kn0Var) {
                    kn0Var.f16485c = uwVar;
                }
                Context context2 = this.f15339b;
                ou0 ou0Var2 = (ou0) ju0Var.f16195a.f20839b;
                cy cyVar = (cy) iInterface2;
                String string = du0Var.f13713v.toString();
                try {
                    wu0Var3.f21609a.M0(new s9.b(context2), ou0Var2.f18363d, cyVar, string);
                    return;
                } catch (Throwable th4) {
                    throw new qu0(th4);
                }
        }
    }
}
