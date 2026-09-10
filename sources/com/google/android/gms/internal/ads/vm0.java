package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vm0 implements nm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k70 f21203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh0 f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou0 f21205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f21206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VersionInfoParcel f21207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rq f21208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21209g = ((Boolean) zzba.zzc().a(am.f12378ua)).booleanValue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zl0 f21210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wh0 f21211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yh0 f21212j;

    public vm0(k70 k70Var, Executor executor, eh0 eh0Var, ou0 ou0Var, VersionInfoParcel versionInfoParcel, rq rqVar, zl0 zl0Var, wh0 wh0Var, yh0 yh0Var) {
        this.f21203a = k70Var;
        this.f21206d = executor;
        this.f21204b = eh0Var;
        this.f21205c = ou0Var;
        this.f21207e = versionInfoParcel;
        this.f21208f = rqVar;
        this.f21210h = zl0Var;
        this.f21211i = wh0Var;
        this.f21212j = yh0Var;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        tc0 tc0Var = new tc0(8);
        be1 be1Var = be1.f12743b;
        q80 q80Var = new q80(this, du0Var, ju0Var, tc0Var, 3);
        Executor executor = this.f21206d;
        fd1 fd1VarX = zw1.x(be1Var, q80Var, executor);
        fd1VarX.addListener(new bf(4), executor);
        return fd1VarX;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        hu0 hu0Var = du0Var.f13708s;
        return (hu0Var == null || hu0Var.f15394a == null) ? false : true;
    }
}
