package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.Mediation;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ff implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f13898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f13899c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedPreferences f13900e;
    public final ng f;
    public final q3 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uf f13901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final be f13902i;
    public final Mediation j;
    public final y5 k;

    public ff(Context context, p2 identity, a3 reachability, AtomicReference sdkConfig, SharedPreferences sharedPreferences, ng timeSource, q3 carrierBuilder, uf session, be privacyApi, Mediation mediation, y5 deviceBodyFieldsFactory) {
        Intrinsics.f(context, "context");
        Intrinsics.f(identity, "identity");
        Intrinsics.f(reachability, "reachability");
        Intrinsics.f(sdkConfig, "sdkConfig");
        Intrinsics.f(sharedPreferences, "sharedPreferences");
        Intrinsics.f(timeSource, "timeSource");
        Intrinsics.f(carrierBuilder, "carrierBuilder");
        Intrinsics.f(session, "session");
        Intrinsics.f(privacyApi, "privacyApi");
        Intrinsics.f(deviceBodyFieldsFactory, "deviceBodyFieldsFactory");
        this.f13897a = context;
        this.f13898b = identity;
        this.f13899c = reachability;
        this.d = sdkConfig;
        this.f13900e = sharedPreferences;
        this.f = timeSource;
        this.g = carrierBuilder;
        this.f13901h = session;
        this.f13902i = privacyApi;
        this.j = mediation;
        this.k = deviceBodyFieldsFactory;
    }

    @Override // com.chartboost.sdk.impl.ef
    public gf a() {
        w3 w3Var = w3.f15454b;
        String strE = w3Var.e();
        String strF = w3Var.f();
        y8 y8VarH = this.f13898b.h();
        oe reachabilityBodyFields = w7.toReachabilityBodyFields(this.f13899c);
        p3 p3VarA = this.g.a(this.f13897a);
        vf vfVarG = this.f13901h.g();
        og bodyFields = w7.toBodyFields(this.f);
        ce ceVarG = this.f13902i.g();
        x4 x4VarK = ((qf) this.d.get()).k();
        x5 x5VarB = this.k.b();
        Mediation mediation = this.j;
        return new gf(strE, strF, y8VarH, reachabilityBodyFields, p3VarA, vfVarG, bodyFields, ceVarG, x4VarK, x5VarB, mediation != null ? mediation.toMediationBodyFields() : null);
    }
}
