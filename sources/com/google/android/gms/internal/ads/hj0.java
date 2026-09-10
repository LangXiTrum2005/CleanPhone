package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi0 f15309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh0 f15310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15311c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15312d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15313e;

    public hj0(yi0 yi0Var, mh0 mh0Var) {
        this.f15309a = yi0Var;
        this.f15310b = mh0Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f15311c) {
            try {
                if (!this.f15313e) {
                    yi0 yi0Var = this.f15309a;
                    if (!yi0Var.f22262b) {
                        fj0 fj0Var = new fj0(this);
                        yi0 yi0Var2 = this.f15309a;
                        yi0Var2.getClass();
                        yi0Var2.f22265e.addListener(new zd1(28, yi0Var2, fj0Var), yi0Var2.f22270j);
                        return jSONArray;
                    }
                    b(yi0Var.b());
                }
                Iterator it = this.f15312d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((gj0) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(List list) {
        fv fvVar;
        lh0 lh0VarB;
        lh0 lh0VarB2;
        fv fvVar2;
        synchronized (this.f15311c) {
            try {
                if (this.f15313e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    tr trVar = (tr) it.next();
                    String string = (!((Boolean) zzba.zzc().a(am.Ra)).booleanValue() || (lh0VarB2 = this.f15310b.b(trVar.f20463a)) == null || (fvVar2 = lh0VarB2.f16990c) == null) ? "" : fvVar2.toString();
                    String str = string;
                    boolean z10 = ((Boolean) zzba.zzc().a(am.Sa)).booleanValue() && (lh0VarB = this.f15310b.b(trVar.f20463a)) != null && lh0VarB.f16991d;
                    ArrayList arrayList = this.f15312d;
                    String str2 = trVar.f20463a;
                    lh0 lh0VarB3 = this.f15310b.b(str2);
                    arrayList.add(new gj0(str2, str, (lh0VarB3 == null || (fvVar = lh0VarB3.f16989b) == null) ? "" : fvVar.toString(), trVar.f20464b ? 1 : 0, trVar.f20466d, trVar.f20465c, z10));
                }
                this.f15313e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
