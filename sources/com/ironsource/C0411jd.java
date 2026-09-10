package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0411jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0624vb f28999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C0594u> f29000b;

    public C0411jd(C0624vb tools, Map<LevelPlay.AdFormat, C0594u> adFormatsConfigurations) {
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adFormatsConfigurations, "adFormatsConfigurations");
        this.f28999a = tools;
        this.f29000b = adFormatsConfigurations;
    }

    private final void b(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C0594u.d dVar) throws JSONException {
        I3 i10 = I3.Delivery;
        M4 m4C = dVar.c();
        a(aVar.a(str, adFormat, i10, new C0688z3(m4C != null ? Boolean.valueOf(m4C.a()) : null, null, null, 6, null)), str, adFormat, i10);
    }

    private final void c(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C0594u.d dVar) throws JSONException {
        C0268bd c0268bdE = dVar.e();
        if (c0268bdE != null) {
            I3 i10 = I3.Pacing;
            a(aVar.a(str, adFormat, i10, new C0688z3(c0268bdE.a(), c0268bdE.b(), H3.Second)), str, adFormat, i10);
        }
    }

    public final void a(K7.a cappingService) {
        kotlin.jvm.internal.n.f(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C0594u> entry : this.f29000b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C0594u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C0594u.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C0594u.d dVar) throws JSONException {
        C3 c3B = dVar.b();
        if (c3B != null) {
            I3 i10 = I3.ShowCount;
            a(aVar.a(str, adFormat, i10, new C0688z3(c3B.a(), c3B.b(), c3B.c())), str, adFormat, i10);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, I3 i10) throws JSONException {
        Throwable thA = wj.h.a(obj);
        if (thA != null) {
            this.f28999a.a(str, adFormat, new D3().a(i10), thA.getMessage());
        }
    }
}
