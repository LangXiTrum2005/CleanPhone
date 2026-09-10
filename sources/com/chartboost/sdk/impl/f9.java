package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f9 implements z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8 f13878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6 f13879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uh f13880c;
    public final la d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f13881e;
    public final z2 f;
    public final ef g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mediation f13882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final id f13883i;
    public final mf j;
    public final hd k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Function2 f13884l;
    public final z6 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EndpointRepository f13885n;
    public final uf o;

    public f9(a8 fileCache, k6 downloader, uh urlResolver, la intentResolver, y adType, z2 networkService, ef requestBodyBuilder, Mediation mediation, id measurementManager, mf sdkBiddingTemplateParser, hd openMeasurementImpressionCallback, Function2 impressionFactory, z6 eventTracker, EndpointRepository endpointRepository, uf session) {
        Intrinsics.f(fileCache, "fileCache");
        Intrinsics.f(downloader, "downloader");
        Intrinsics.f(urlResolver, "urlResolver");
        Intrinsics.f(intentResolver, "intentResolver");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.f(measurementManager, "measurementManager");
        Intrinsics.f(sdkBiddingTemplateParser, "sdkBiddingTemplateParser");
        Intrinsics.f(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.f(impressionFactory, "impressionFactory");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(endpointRepository, "endpointRepository");
        Intrinsics.f(session, "session");
        this.f13878a = fileCache;
        this.f13879b = downloader;
        this.f13880c = urlResolver;
        this.d = intentResolver;
        this.f13881e = adType;
        this.f = networkService;
        this.g = requestBodyBuilder;
        this.f13882h = mediation;
        this.f13883i = measurementManager;
        this.j = sdkBiddingTemplateParser;
        this.k = openMeasurementImpressionCallback;
        this.f13884l = impressionFactory;
        this.m = eventTracker;
        this.f13885n = endpointRepository;
        this.o = session;
    }

    public final v9 a(String str, y yVar) {
        if (Intrinsics.a(yVar, y.b.g)) {
            return a(str);
        }
        if (Intrinsics.a(yVar, y.c.g)) {
            return v9.INTERSTITIAL_REWARD_VIDEO;
        }
        if (Intrinsics.a(yVar, y.a.g)) {
            return v9.BANNER;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.m.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.m.clearFromStorage(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.m.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.m.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.m.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.m.track(chVar);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.m.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.m.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.m.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.m.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.m.mo189track(event);
    }

    public final CBError.Impression a(z zVar, File file, String str) {
        Map mapD = zVar.d();
        if (mapD.isEmpty()) {
            return null;
        }
        for (p1 p1Var : mapD.values()) {
            File fileA = p1Var.a(file);
            if (fileA == null || !fileA.exists()) {
                za.b("Asset does not exist: " + p1Var.f14798b, (Throwable) null, 2, (Object) null);
                String str2 = p1Var.f14798b;
                if (str2 == null) {
                    str2 = "";
                }
                a(str, str2);
                return CBError.Impression.ASSET_MISSING;
            }
        }
        return null;
    }

    public final s9 a(l1 appRequest, n0 callback, ViewGroup viewGroup, u9 impressionIntermediateCallback, h9 impressionClickCallback, z9 viewProtocolBuilder, t9 impressionInterface, dk webViewTimeoutInterface, qc nativeBridgeCommand, mg templateLoader) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.f(impressionClickCallback, "impressionClickCallback");
        Intrinsics.f(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.f(impressionInterface, "impressionInterface");
        Intrinsics.f(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.f(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.f(templateLoader, "templateLoader");
        try {
            File fileA = this.f13878a.a().a();
            z zVarA = appRequest.a();
            String strD = appRequest.d();
            if (zVarA == null) {
                return new s9(null, CBError.Impression.PENDING_IMPRESSION_ERROR);
            }
            Intrinsics.c(fileA);
            CBError.Impression impressionA = a(zVarA, fileA, strD);
            if (impressionA != null) {
                return new s9(null, impressionA);
            }
            String strA = a(templateLoader, zVarA, fileA, strD);
            if (strA == null) {
                return new s9(null, CBError.Impression.ERROR_LOADING_WEB_VIEW);
            }
            return new s9(a(appRequest, zVarA, strD, this.f13883i.a(strA), callback, viewGroup, impressionIntermediateCallback, impressionClickCallback, viewProtocolBuilder, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand), null);
        } catch (Exception e2) {
            za.b("showReady exception:", e2);
            return new s9(null, CBError.Impression.INTERNAL);
        }
    }

    public final r2 a(l1 l1Var, z zVar, String str, String str2, n0 n0Var, ViewGroup viewGroup, u9 u9Var, h9 h9Var, z9 z9Var, t9 t9Var, dk dkVar, qc qcVar) {
        v9 v9VarA = a(zVar.p(), this.f13881e);
        d4 d4Var = new d4(this.f, this.g, this.m, this.f13885n, this.o);
        s4 s4Var = new s4(this.f, this.g, this.m, this.f13885n, this.o);
        h3 h3VarA = z9Var.a(str, zVar, this.f13881e.b(), str2, n0Var, t9Var, dkVar, qcVar);
        return (r2) this.f13884l.invoke(new o9(this.f13880c, this.d, d4Var, xg.a(this.f13881e.b(), str, this.f13882h, this.m), s4Var, v9VarA, this.k, l1Var, this.f13879b, h3VarA, new n9(0, 0, 0, 0, 15, null), zVar, this.f13881e, str, u9Var, h9Var, n0Var, this.m), viewGroup);
    }

    public final String a(mg mgVar, z zVar, File file, String str) {
        p1 p1VarF = zVar.f();
        String strA = p1VarF.a();
        if (strA != null && strA.length() != 0) {
            File fileA = p1VarF.a(file);
            HashMap map = new HashMap(zVar.s());
            if (zVar.z().length() > 0 && zVar.c().length() > 0) {
                mf mfVar = this.j;
                Intrinsics.c(fileA);
                String strA2 = mfVar.a(fileA, zVar.z(), zVar.c());
                if (strA2 != null) {
                    return strA2;
                }
            }
            if (zVar.C().length() == 0 || zVar.B().length() == 0) {
                map.put("{% native_video_player %}", "false");
            } else {
                map.put("{% native_video_player %}", com.p004ironsource.mediationsdk.metadata.a.g);
            }
            for (Map.Entry entry : zVar.d().entrySet()) {
                map.put(entry.getKey(), ((p1) entry.getValue()).f14798b);
            }
            Intrinsics.c(fileA);
            return mgVar.a(fileA, map, this.f13881e.b(), str);
        }
        za.b("AdUnit does not have a template body", (Throwable) null, 2, (Object) null);
        return null;
    }

    public final v9 a(String str) {
        if (Intrinsics.a(str, "video")) {
            return v9.INTERSTITIAL_VIDEO;
        }
        return v9.INTERSTITIAL;
    }

    public final void a(String str, String str2) {
        track((ch) new h5(fh.i.UNAVAILABLE_ASSET_ERROR, str2, this.f13881e.b(), str, this.f13882h, null, 32, null));
    }
}
