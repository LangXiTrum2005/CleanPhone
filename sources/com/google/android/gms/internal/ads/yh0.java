package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci0 f22254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f22255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22256c;

    public yh0(ci0 ci0Var, k00 k00Var) {
        this.f22254a = ci0Var;
        ci0Var.getClass();
        this.f22256c = new HashMap(ci0Var.f13169a);
        this.f22255b = k00Var;
    }

    public final lj1 a() {
        lj1 lj1Var = new lj1(this);
        ((ConcurrentHashMap) lj1Var.f17036b).putAll(this.f22256c);
        return lj1Var;
    }

    public final void b() {
        if (((Boolean) zzba.zzc().a(am.f12274nd)).booleanValue()) {
            lj1 lj1VarA = a();
            lj1VarA.l("action", "pecr");
            lj1VarA.m();
        }
    }
}
