package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements s, b3.a, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8 f15158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef f15159c;
    public final z2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f15160e;
    public final md f;
    public final id g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z6 f15161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EndpointRepository f15162i;
    public final m1 j;
    public gf k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public wa f15163l;
    public Function1 m;

    public t(y adTraits, a8 fileCache, ef requestBodyBuilder, z2 networkService, i0 adUnitParser, md openRTBAdUnitParser, id openMeasurementManager, z6 eventTracker, EndpointRepository endpointRepository, m1 applicationComponent) {
        Intrinsics.f(adTraits, "adTraits");
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(adUnitParser, "adUnitParser");
        Intrinsics.f(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        Intrinsics.f(applicationComponent, "applicationComponent");
        this.f15157a = adTraits;
        this.f15158b = fileCache;
        this.f15159c = requestBodyBuilder;
        this.d = networkService;
        this.f15160e = adUnitParser;
        this.f = openRTBAdUnitParser;
        this.g = openMeasurementManager;
        this.f15161h = eventTracker;
        this.f15162i = endpointRepository;
        this.j = applicationComponent;
    }

    public final nd a(b3.a aVar, int i2, int i3, String str, int i4, gf gfVar, id idVar, uf ufVar) {
        URL endPointUrl = this.f15162i.getEndPointUrl(this.f15157a.a());
        return new nd(new wc(com.chartboost.sdk.internal.Networking.b.a(endPointUrl), endPointUrl.getPath(), gfVar, ae.NORMAL, aVar), new x(this.f15157a, Integer.valueOf(i2), Integer.valueOf(i3), str, i4), idVar, this.f15161h, ufVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f15161h.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15161h.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15161h.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f15161h.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f15161h.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15161h.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f15161h.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f15161h.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f15161h.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f15161h.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f15161h.mo189track(event);
    }

    public /* synthetic */ t(y yVar, a8 a8Var, ef efVar, z2 z2Var, i0 i0Var, md mdVar, id idVar, z6 z6Var, EndpointRepository endpointRepository, m1 m1Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, a8Var, efVar, z2Var, i0Var, mdVar, idVar, z6Var, endpointRepository, (i2 & 512) != 0 ? w3.f15454b.a() : m1Var);
    }

    public final b3 a(String str, int i2, int i3, boolean z2, gf gfVar, b3.a aVar, id idVar, uf ufVar) {
        int iD;
        y yVar = this.f15157a;
        if (Intrinsics.a(yVar, y.c.g)) {
            iD = gfVar.h().e();
        } else {
            iD = Intrinsics.a(yVar, y.b.g) ? gfVar.h().d() : gfVar.h().a();
        }
        int i4 = iD;
        if (Intrinsics.a(this.f15157a, y.a.g)) {
            return a(aVar, i2, i3, str, i4, gfVar, idVar, ufVar);
        }
        return a(aVar, str, i4, z2, gfVar, idVar, ufVar);
    }

    public final j3 a(b3.a aVar, String str, int i2, boolean z2, gf gfVar, id idVar, uf ufVar) {
        Partner partnerC;
        URL endPointUrl = this.f15162i.getEndPointUrl(this.f15157a.a());
        v2.c cVar = v2.c.POST;
        String strA = com.chartboost.sdk.internal.Networking.b.a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.e(path, "getPath(...)");
        j3 j3Var = new j3(cVar, strA, path, gfVar, ae.NORMAL, null, aVar, this.f15161h, ufVar);
        JSONObject jSONObjectE = this.f15158b.e();
        Intrinsics.e(jSONObjectE, "getWebViewCacheAssets(...)");
        j3Var.b("cache_assets", jSONObjectE);
        j3Var.b("location", str);
        j3Var.b("imp_depth", Integer.valueOf(i2));
        if (idVar.g() && (partnerC = idVar.c()) != null) {
            j3Var.c("omidpn", partnerC.getName());
            j3Var.c("omidpv", partnerC.getVersion());
        }
        j3Var.b(com.smartdigimkt.q0.b.O, Boolean.valueOf(z2));
        j3Var.s = true;
        return j3Var;
    }

    public final void a(z zVar, b3 b3Var) {
        Function1 function1 = this.m;
        if (function1 != null) {
            wa waVar = this.f15163l;
            if (waVar != null) {
                function1.invoke(new xa(waVar.a(), zVar, null, b3Var.f15348h, b3Var.g));
                return;
            } else {
                Intrinsics.m("params");
                throw null;
            }
        }
        Intrinsics.m("callback");
        throw null;
    }

    public final void a(String str) {
        Function1 function1 = this.m;
        if (function1 != null) {
            wa waVar = this.f15163l;
            if (waVar != null) {
                function1.invoke(new xa(waVar.a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, str), 0L, 0L, 26, null));
                return;
            } else {
                Intrinsics.m("params");
                throw null;
            }
        }
        Intrinsics.m("callback");
        throw null;
    }

    public String a(JSONObject jSONObject, String str, String str2) {
        return s.a.a(this, jSONObject, str, str2);
    }

    @Override // com.chartboost.sdk.impl.s
    public void a(wa params, Function1 callback) {
        Intrinsics.f(params, "params");
        Intrinsics.f(callback, "callback");
        this.f15163l = params;
        this.m = callback;
        this.k = this.f15159c.a();
        String strD = params.a().d();
        Integer numB = params.b();
        int iIntValue = numB != null ? numB.intValue() : 0;
        Integer numC = params.c();
        int iIntValue2 = numC != null ? numC.intValue() : 0;
        boolean zE = params.e();
        gf gfVar = this.k;
        if (gfVar != null) {
            b3 b3VarA = a(strD, iIntValue, iIntValue2, zE, gfVar, this, this.g, this.j.k());
            b3VarA.f15349i = v2.b.ASYNC;
            this.d.a(b3VarA);
            return;
        }
        Intrinsics.m("requestBodyFields");
        throw null;
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, CBError cBError) {
        Function1 function1 = this.m;
        if (function1 != null) {
            wa waVar = this.f15163l;
            if (waVar != null) {
                l1 l1VarA = waVar.a();
                if (cBError == null) {
                    cBError = new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response");
                }
                function1.invoke(new xa(l1VarA, null, cBError, 0L, 0L, 26, null));
                return;
            }
            Intrinsics.m("params");
            throw null;
        }
        Intrinsics.m("callback");
        throw null;
    }

    @Override // com.chartboost.sdk.impl.b3.a
    public void a(b3 b3Var, JSONObject jSONObject) {
        if (b3Var != null && jSONObject != null) {
            gf gfVar = this.k;
            Unit unit = null;
            if (gfVar != null) {
                wa waVar = this.f15163l;
                if (waVar != null) {
                    JSONObject jSONObjectA = waVar.d().a(jSONObject);
                    wa waVar2 = this.f15163l;
                    if (waVar2 != null) {
                        z zVarA = a(gfVar, jSONObjectA, waVar2.a().d());
                        if (zVarA != null) {
                            a(zVarA, b3Var);
                            unit = Unit.f43263a;
                        }
                        if (unit == null) {
                            a("Error parsing response");
                            return;
                        }
                        return;
                    }
                    Intrinsics.m("params");
                    throw null;
                }
                Intrinsics.m("params");
                throw null;
            }
            Intrinsics.m("requestBodyFields");
            throw null;
        }
        a("Unexpected response");
    }

    public final z a(gf gfVar, JSONObject jSONObject, String str) {
        try {
            y yVar = this.f15157a;
            y.a aVar = y.a.g;
            if (Intrinsics.a(yVar, aVar)) {
                return this.f.a(aVar, jSONObject);
            }
            if (gfVar.a().b()) {
                return this.f15160e.a(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            fh.a aVar2 = fh.a.GET_RESPONSE_PARSING_ERROR;
            JSONObject jSONObject2 = new JSONObject();
            String message = e2.getMessage();
            if (message == null) {
                message = "no message";
            }
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            track((ch) new h5(aVar2, a(jSONObject2, message, string), this.f15157a.b(), str, null, null, 48, null));
            return null;
        }
    }
}
