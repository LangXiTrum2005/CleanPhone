package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du0 f19668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fu0 f19669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx0 f19670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx0 f19671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jw0 f19672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m60 f19673f;

    public ru0(mx0 mx0Var, kx0 kx0Var, du0 du0Var, fu0 fu0Var, m60 m60Var, jw0 jw0Var) {
        this.f19668a = du0Var;
        this.f19669b = fu0Var;
        this.f19670c = mx0Var;
        this.f19671d = kx0Var;
        this.f19673f = m60Var;
        this.f19672e = jw0Var;
    }

    public final void a(ArrayList arrayList, cb0 cb0Var) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            du0 du0Var = this.f19668a;
            if (du0Var.f13691i0) {
                String str2 = this.f19669b.f14546b;
                kx0 kx0Var = this.f19671d;
                kx0Var.getClass();
                ((p9.b) zzt.zzk()).getClass();
                tb tbVar = new tb(str2, 2, str, System.currentTimeMillis());
                ul0 ul0Var = kx0Var.f16556a;
                ul0Var.getClass();
                ul0Var.a(new md0(23, ul0Var, tbVar));
            } else {
                jw0 jw0Var = this.f19672e;
                this.f19670c.b(str, du0Var.f13718x0, jw0Var, cb0Var);
            }
        }
    }

    public final void b(ArrayList arrayList, int i10) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ListenableFuture listenableFutureA = (((Boolean) zzba.zzc().a(am.Hb)).booleanValue() && m60.b(str)) ? this.f19673f.a(str, zzay.zzh()) : zw1.d(str);
            listenableFutureA.addListener(new zd1(0, listenableFutureA, new b2.w(i10, 7, this)), l00.f16608a);
        }
    }
}
