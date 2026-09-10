package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge1 f17580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzu f17581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx0 f17582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kw0 f17583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h40 f17584g;

    public mx0(Context context, k00 k00Var, ge1 ge1Var, zzu zzuVar, kx0 kx0Var, kw0 kw0Var, h40 h40Var) {
        this.f17578a = context;
        this.f17579b = k00Var;
        this.f17580c = ge1Var;
        this.f17581d = zzuVar;
        this.f17582e = kx0Var;
        this.f17583f = kw0Var;
        this.f17584g = h40Var;
    }

    public final void a(List list, zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), zzvVar, null, null);
        }
    }

    public final void b(String str, zzv zzvVar, jw0 jw0Var, cb0 cb0Var) {
        ListenableFuture listenableFutureB;
        fw0 fw0VarF = null;
        if (kw0.a() && ((Boolean) an.f12467d.o()).booleanValue()) {
            fw0VarF = fw0.f(this.f17578a, 14);
            fw0VarF.zza();
        }
        fw0 fw0Var = fw0VarF;
        if (zzvVar != null) {
            listenableFutureB = new o8(zzvVar.zza(), this.f17581d, this.f17580c, this.f17582e, this.f17584g, 7, false).a(str);
        } else {
            listenableFutureB = ((k00) this.f17580c).b(new ze(9, this, str));
        }
        ListenableFuture listenableFuture = listenableFutureB;
        listenableFuture.addListener(new zd1(0, listenableFuture, new uw(this, fw0Var, jw0Var, cb0Var, 13, false)), this.f17579b);
    }
}
