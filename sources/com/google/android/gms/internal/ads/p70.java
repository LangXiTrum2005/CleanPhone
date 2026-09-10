package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p70 extends m80 {
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f18543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b30 f18544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final eu0 f18545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j80 f18546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ne0 f18547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rc0 f18548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dx1 f18549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Executor f18550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzr f18551u;

    public p70(k80 k80Var, Context context, eu0 eu0Var, View view, b30 b30Var, j80 j80Var, ne0 ne0Var, rc0 rc0Var, dx1 dx1Var, Executor executor) {
        super(k80Var);
        this.l = context;
        this.f18543m = view;
        this.f18544n = b30Var;
        this.f18545o = eu0Var;
        this.f18546p = j80Var;
        this.f18547q = ne0Var;
        this.f18548r = rc0Var;
        this.f18549s = dx1Var;
        this.f18550t = executor;
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a() {
        this.f18550t.execute(new x60(this, 1));
        super.a();
    }

    public final eu0 c() {
        zzr zzrVar = this.f18551u;
        if (zzrVar != null) {
            return zzrVar.zzi ? new eu0(-3, 0, true) : new eu0(zzrVar.zze, zzrVar.zzb, false);
        }
        du0 du0Var = this.f17335b;
        if (du0Var.f13680c0) {
            for (String str : du0Var.f13675a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f18543m;
            return new eu0(view.getWidth(), view.getHeight(), false);
        }
        return (eu0) du0Var.f13707r.get(0);
    }

    public final int d() {
        if (((Boolean) zzba.zzc().a(am.f12151f9)).booleanValue() && this.f17335b.g0) {
            if (!((Boolean) zzba.zzc().a(am.f12167g9)).booleanValue()) {
                return 0;
            }
        }
        return ((fu0) this.f17334a.f16196b.f20920d).f14547c;
    }
}
