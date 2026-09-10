package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19932a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19936e;

    public /* synthetic */ sd0(qc0 qc0Var, m60 m60Var, mx0 mx0Var, ul0 ul0Var) {
        this.f19933b = qc0Var;
        this.f19935d = m60Var;
        this.f19934c = mx0Var;
        this.f19936e = ul0Var;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        int i10 = this.f19932a;
        Object obj2 = this.f19935d;
        Object obj3 = this.f19934c;
        Object obj4 = this.f19936e;
        Object obj5 = this.f19933b;
        switch (i10) {
            case 0:
                td0 td0Var = (td0) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (td0Var != null && !TextUtils.isEmpty(str)) {
                    ((mx0) obj3).b(str, (zzv) obj2, (jw0) obj4, td0Var.D);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((oq) obj2).b(obj6, map);
                } else {
                    ((ng0) obj4).c((String) obj3, this);
                }
                break;
            default:
                b30 b30Var = (b30) obj;
                nq.b(map, (qc0) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    m60 m60Var = (m60) obj2;
                    ListenableFuture listenableFutureA = nq.a(b30Var, str2);
                    hz hzVar = new hz(b30Var, m60Var, (mx0) obj3, (ul0) obj4, 12);
                    listenableFutureA.addListener(new zd1(0, listenableFutureA, hzVar), l00.f16608a);
                } else {
                    int i11 = zze.zza;
                    zzo.zzi("URL missing from click GMSG.");
                }
                break;
        }
    }

    public /* synthetic */ sd0(td0 td0Var, mx0 mx0Var, zzv zzvVar, jw0 jw0Var) {
        this.f19933b = new WeakReference(td0Var);
        this.f19934c = mx0Var;
        this.f19935d = zzvVar;
        this.f19936e = jw0Var;
    }

    public /* synthetic */ sd0(ng0 ng0Var, WeakReference weakReference, String str, oq oqVar) {
        this.f19936e = ng0Var;
        this.f19933b = weakReference;
        this.f19934c = str;
        this.f19935d = oqVar;
    }
}
