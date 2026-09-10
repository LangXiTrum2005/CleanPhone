package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0613v0 implements F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0624vb f30832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C0594u> f30833b;

    public C0613v0(C0624vb tools, Map<LevelPlay.AdFormat, C0594u> adFormatsConfigurations) {
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adFormatsConfigurations, "adFormatsConfigurations");
        this.f30832a = tools;
        this.f30833b = adFormatsConfigurations;
    }

    private final void b(InterfaceC0531q7.a aVar, String str, C0594u.d dVar) throws JSONException {
        C0268bd c0268bdE = dVar.e();
        if (c0268bdE != null) {
            I3 i10 = I3.Pacing;
            a(aVar.a(str, i10, new C0688z3(c0268bdE.a(), c0268bdE.b(), c0268bdE.c())), str, i10);
        }
    }

    @Override // com.ironsource.F3
    public void a(InterfaceC0531q7.a cappingService) {
        kotlin.jvm.internal.n.f(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C0594u>> it = this.f30833b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C0594u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C0594u.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC0531q7.a aVar, String str, C0594u.d dVar) throws JSONException {
        C3 c3B = dVar.b();
        if (c3B != null) {
            I3 i10 = I3.ShowCount;
            a(aVar.a(str, i10, new C0688z3(c3B.a(), c3B.b(), c3B.c())), str, i10);
        }
    }

    private final void a(Object obj, String str, I3 i10) throws JSONException {
        Throwable thA = wj.h.a(obj);
        if (thA != null) {
            this.f30832a.a(str, new D3().a(i10), thA.getMessage());
        }
    }
}
