package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ng0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zza f17812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f17813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yh0 f17814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qf f17816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f17817g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ul0 f17819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mx0 f17820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zl0 f17821k;
    public final pu0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gd1 f17822m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg0 f17811a = new jg0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lq f17818h = new lq();

    public ng0(mg0 mg0Var) {
        this.f17813c = mg0Var.f17432b;
        this.f17815e = mg0Var.f17435e;
        this.f17816f = mg0Var.f17436f;
        this.f17817g = mg0Var.f17437g;
        this.f17812b = mg0Var.f17431a;
        this.f17819i = mg0Var.f17434d;
        this.f17820j = mg0Var.f17438h;
        this.f17814d = mg0Var.f17433c;
        this.f17821k = mg0Var.f17439i;
        this.l = mg0Var.f17440j;
    }

    public final synchronized ListenableFuture a(String str, JSONObject jSONObject) {
        gd1 gd1Var = this.f17822m;
        if (gd1Var == null) {
            return be1.f12743b;
        }
        return zw1.x(gd1Var, new q80(this, str, jSONObject, 2), this.f17815e);
    }

    public final synchronized void b(String str, oq oqVar) {
        gd1 gd1Var = this.f17822m;
        if (gd1Var == null) {
            return;
        }
        md0 md0Var = new md0(this, str, oqVar, 19);
        gd1Var.addListener(new zd1(0, gd1Var, md0Var), this.f17815e);
    }

    public final synchronized void c(String str, oq oqVar) {
        gd1 gd1Var = this.f17822m;
        if (gd1Var == null) {
            return;
        }
        lj1 lj1Var = new lj1(this, str, oqVar);
        gd1Var.addListener(new zd1(0, gd1Var, lj1Var), this.f17815e);
    }

    public final synchronized void d(Map map) {
        gd1 gd1Var = this.f17822m;
        if (gd1Var == null) {
            return;
        }
        so0 so0Var = new so0(this, map);
        gd1Var.addListener(new zd1(0, gd1Var, so0Var), this.f17815e);
    }
}
