package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f17431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f17432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yh0 f17433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ul0 f17434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qf f17436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f17437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mx0 f17438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zl0 f17439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pu0 f17440j;

    public mg0(Context context, Executor executor, qf qfVar, VersionInfoParcel versionInfoParcel, zza zzaVar, ul0 ul0Var, mx0 mx0Var, yh0 yh0Var, zl0 zl0Var, pu0 pu0Var) {
        this.f17432b = context;
        this.f17435e = executor;
        this.f17436f = qfVar;
        this.f17437g = versionInfoParcel;
        this.f17431a = zzaVar;
        this.f17434d = ul0Var;
        this.f17438h = mx0Var;
        this.f17433c = yh0Var;
        this.f17439i = zl0Var;
        this.f17440j = pu0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ng0 ng0Var = new ng0(this);
        synchronized (ng0Var) {
            String str = (String) zzba.zzc().a(am.N4);
            qf qfVar = ng0Var.f17816f;
            zza zzaVar = ng0Var.f17812b;
            zl0 zl0Var = ng0Var.f17821k;
            gd1 gd1VarZ = zw1.z(zw1.r(new j30(ng0Var.f17813c, qfVar, ng0Var.f17817g, zzaVar, zl0Var, ng0Var.l, ng0Var.f17814d, str), l00.f16613f), new lx(ng0Var, 1), ng0Var.f17815e);
            ng0Var.f17822m = gd1VarZ;
            v71.j(gd1VarZ, "NativeJavascriptExecutor.initializeEngine", l00.f16615h);
        }
        return ng0Var;
    }
}
