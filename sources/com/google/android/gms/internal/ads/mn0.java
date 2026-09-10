package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mn0 implements nm0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f17494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh0 f17495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ou0 f17496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f17498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rq f17499g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zl0 f17501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wh0 f17502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yh0 f17503k;
    public final Object l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17493a = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17500h = ((Boolean) zzba.zzc().a(am.f12378ua)).booleanValue();

    public mn0(Context context, VersionInfoParcel versionInfoParcel, ou0 ou0Var, Executor executor, ed0 ed0Var, eh0 eh0Var, rq rqVar, zl0 zl0Var, wh0 wh0Var, yh0 yh0Var) {
        this.f17494b = context;
        this.f17496d = ou0Var;
        this.l = ed0Var;
        this.f17497e = executor;
        this.f17498f = versionInfoParcel;
        this.f17495c = eh0Var;
        this.f17499g = rqVar;
        this.f17501i = zl0Var;
        this.f17502j = wh0Var;
        this.f17503k = yh0Var;
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        switch (this.f17493a) {
            case 0:
                tc0 tc0Var = new tc0(8);
                be1 be1Var = be1.f12743b;
                q80 q80Var = new q80(this, du0Var, ju0Var, tc0Var, 7);
                Executor executor = this.f17497e;
                fd1 fd1VarX = zw1.x(be1Var, q80Var, executor);
                fd1VarX.addListener(new bf(5), executor);
                return fd1VarX;
            default:
                tc0 tc0Var2 = new tc0(8);
                be1 be1Var2 = be1.f12743b;
                q80 q80Var2 = new q80(this, du0Var, ju0Var, tc0Var2, 9);
                Executor executor2 = this.f17497e;
                fd1 fd1VarX2 = zw1.x(be1Var2, q80Var2, executor2);
                fd1VarX2.addListener(new bf(6), executor2);
                return fd1VarX2;
        }
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        switch (this.f17493a) {
            case 0:
                hu0 hu0Var = du0Var.f13708s;
                return (hu0Var == null || hu0Var.f15394a == null) ? false : true;
            default:
                hu0 hu0Var2 = du0Var.f13708s;
                return (hu0Var2 == null || hu0Var2.f15394a == null) ? false : true;
        }
    }

    public mn0(Context context, VersionInfoParcel versionInfoParcel, ou0 ou0Var, Executor executor, xg0 xg0Var, eh0 eh0Var, rq rqVar, zl0 zl0Var, wh0 wh0Var, yh0 yh0Var) {
        this.f17494b = context;
        this.f17496d = ou0Var;
        this.l = xg0Var;
        this.f17497e = executor;
        this.f17498f = versionInfoParcel;
        this.f17495c = eh0Var;
        this.f17499g = rqVar;
        this.f17501i = zl0Var;
        this.f17502j = wh0Var;
        this.f17503k = yh0Var;
    }
}
