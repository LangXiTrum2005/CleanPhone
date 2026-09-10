package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3782v0 implements F3 {
    private final C3725rb a;
    private final Map<LevelPlay.AdFormat, C3764u> b;

    public C3782v0(C3725rb tools, Map<LevelPlay.AdFormat, C3764u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(InterfaceC3670o7.a aVar, String str, C3764u.d dVar) throws JSONException {
        Wc wcE = dVar.e();
        if (wcE != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, i3, new C3853z3(wcE.a(), wcE.b(), wcE.c())), str, i3);
        }
    }

    @Override // com.ironsource.F3
    public void a(InterfaceC3670o7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C3764u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C3764u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C3764u.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC3670o7.a aVar, String str, C3764u.d dVar) throws JSONException {
        C3 c3B = dVar.b();
        if (c3B != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, i3, new C3853z3(c3B.a(), c3B.b(), c3B.c())), str, i3);
        }
    }

    private final void a(Object obj, String str, I3 i3) throws JSONException {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(obj);
        if (thM3354exceptionOrNullimpl != null) {
            this.a.a(str, new D3().a(i3), thM3354exceptionOrNullimpl.getMessage());
        }
    }
}
