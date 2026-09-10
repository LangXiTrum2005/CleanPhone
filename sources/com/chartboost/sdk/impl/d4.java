package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.p004ironsource.qt;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements b3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f13673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef f13674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y6 f13675c;
    public final EndpointRepository d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uf f13676e;
    public e4 f;

    public d4(z2 networkService, ef requestBodyBuilder, y6 eventTracker, EndpointRepository endpointRepository, uf session) {
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        Intrinsics.f(session, "session");
        this.f13673a = networkService;
        this.f13674b = requestBodyBuilder;
        this.f13675c = eventTracker;
        this.d = endpointRepository;
        this.f13676e = session;
    }

    public final void a(b3 b3Var, b4 b4Var) {
        b3Var.a("ad_id", b4Var.a());
        b3Var.a("to", b4Var.g());
        b3Var.a("cgn", b4Var.b());
        b3Var.a(com.smartdigimkt.x.t.o1, b4Var.c());
        b3Var.a("location", b4Var.e());
        if (b4Var.d() == v9.BANNER) {
            b3Var.a(com.smartdigimkt.x.t.o1, "");
        } else if (b4Var.i() != null && b4Var.h() != null) {
            float f = 1000;
            b3Var.a("total_time", Float.valueOf(b4Var.h().floatValue() / f));
            b3Var.a("playback_time", Float.valueOf(b4Var.i().floatValue() / f));
            za.a("TotalDuration: " + b4Var.h() + " PlaybackTime: " + b4Var.i(), (Throwable) null, 2, (Object) null);
        }
        Boolean boolF = b4Var.f();
        if (boolF != null) {
            b3Var.a("retarget_reinstall", boolF);
        }
    }

    public final void a(e4 e4Var, b4 params) {
        Intrinsics.f(params, "params");
        this.f = e4Var;
        URL endPointUrl = this.d.getEndPointUrl(EndpointRepository.EndPoint.CLICK);
        String strA = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.e(path, "getPath(...)");
        b3 b3Var = new b3(strA, path, this.f13674b.a(), ae.NORMAL, this, this.f13675c, this.f13676e);
        b3Var.s = true;
        a(b3Var, params);
        this.f13673a.a(b3Var);
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, CBError cBError) {
        String message;
        if (cBError == null || (message = cBError.getMessage()) == null) {
            message = "Click failure";
        }
        e4 e4Var = this.f;
        if (e4Var != null) {
            e4Var.a(message);
        }
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, JSONObject jSONObject) {
        JSONObject jSONObjectA = s2.a(jSONObject, qt.f26623n);
        e4 e4Var = this.f;
        if (e4Var != null) {
            e4Var.a(jSONObjectA);
        }
    }
}
