package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.p004ironsource.qt;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 implements b3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f15091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef f15092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y6 f15093c;
    public final EndpointRepository d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uf f15094e;
    public t4 f;

    public s4(z2 networkService, ef requestBodyBuilder, y6 eventTracker, EndpointRepository endpointRepository, uf session) {
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        Intrinsics.f(session, "session");
        this.f15091a = networkService;
        this.f15092b = requestBodyBuilder;
        this.f15093c = eventTracker;
        this.d = endpointRepository;
        this.f15094e = session;
    }

    public final void a(b3 b3Var, r4 r4Var) {
        b3Var.a("location", r4Var.c());
        b3Var.a("reward", Integer.valueOf(r4Var.d()));
        b3Var.a("currency-name", r4Var.e());
        b3Var.a("ad_id", r4Var.a());
        b3Var.a("force_close", Boolean.FALSE);
        b3Var.a("cgn", r4Var.b());
        if (r4Var.g() == null || r4Var.f() == null) {
            return;
        }
        float f = 1000;
        b3Var.a("total_time", Float.valueOf(r4Var.f().floatValue() / f));
        b3Var.a("playback_time", Float.valueOf(r4Var.g().floatValue() / f));
        za.a("TotalDuration: " + r4Var.f() + " PlaybackTime: " + r4Var.g(), (Throwable) null, 2, (Object) null);
    }

    public final void a(t4 t4Var, r4 params) {
        Intrinsics.f(params, "params");
        this.f = t4Var;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.VIDEO_COMPLETE);
        String strA = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.e(path, "getPath(...)");
        b3 b3Var = new b3(strA, path, this.f15092b.a(), ae.NORMAL, this, this.f15093c, this.f15094e);
        a(b3Var, params);
        this.f15091a.a(b3Var);
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, CBError cBError) {
        String message;
        if (cBError == null || (message = cBError.getMessage()) == null) {
            message = "Click failure";
        }
        t4 t4Var = this.f;
        if (t4Var != null) {
            t4Var.a(message);
        }
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, JSONObject jSONObject) {
        JSONObject jSONObjectA = s2.a(jSONObject, qt.f26623n);
        t4 t4Var = this.f;
        if (t4Var != null) {
            t4Var.a(jSONObjectA);
        }
    }
}
