package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONException;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3515fd {
    private final C3725rb a;
    private final Map<LevelPlay.AdFormat, C3764u> b;

    public C3515fd(C3725rb tools, Map<LevelPlay.AdFormat, C3764u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(I7.a aVar, String str, LevelPlay.AdFormat adFormat, C3764u.d dVar) throws JSONException {
        I3 i3 = I3.Delivery;
        L4 l4C = dVar.c();
        a(aVar.a(str, adFormat, i3, new C3853z3(l4C != null ? Boolean.valueOf(l4C.a()) : null, null, null, 6, null)), str, adFormat, i3);
    }

    private final void c(I7.a aVar, String str, LevelPlay.AdFormat adFormat, C3764u.d dVar) throws JSONException {
        Wc wcE = dVar.e();
        if (wcE != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, adFormat, i3, new C3853z3(wcE.a(), wcE.b(), H3.Second)), str, adFormat, i3);
        }
    }

    public final void a(I7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C3764u> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C3764u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C3764u.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(I7.a aVar, String str, LevelPlay.AdFormat adFormat, C3764u.d dVar) throws JSONException {
        C3 c3B = dVar.b();
        if (c3B != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, adFormat, i3, new C3853z3(c3B.a(), c3B.b(), c3B.c())), str, adFormat, i3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, I3 i3) throws JSONException {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(obj);
        if (thM3354exceptionOrNullimpl != null) {
            this.a.a(str, adFormat, new D3().a(i3), thM3354exceptionOrNullimpl.getMessage());
        }
    }
}
