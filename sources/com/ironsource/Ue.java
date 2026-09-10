package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ue {
    public final Bg a(Se response) {
        kotlin.jvm.internal.n.f(response, "response");
        Ag agA = a(response.d(), response.e());
        return agA == null ? Bg.b.f25755a : new Bg.a(agA);
    }

    private final Ag a(P3 p10, Gd gd2) {
        P3.a aVarE = p10.e();
        if (aVarE == null) {
            return null;
        }
        Ag agA = a(LevelPlay.AdFormat.REWARDED, gd2.h(), aVarE.h());
        if (agA != null) {
            return agA;
        }
        Ag agA2 = a(LevelPlay.AdFormat.INTERSTITIAL, gd2.f(), aVarE.f());
        if (agA2 != null) {
            return agA2;
        }
        Ag agA3 = a(LevelPlay.AdFormat.BANNER, gd2.e(), aVarE.e());
        if (agA3 != null) {
            return agA3;
        }
        Ag agA4 = a(LevelPlay.AdFormat.NATIVE_AD, gd2.g(), aVarE.g());
        if (agA4 != null) {
            return agA4;
        }
        return null;
    }

    private final Ag a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, P3.a.InterfaceC0043a interfaceC0043a) {
        if (map == null) {
            return null;
        }
        Collection<? extends List<String>> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return null;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!((List) it.next()).isEmpty()) {
                if (interfaceC0043a == null) {
                    return null;
                }
                List<P3.a.e> listA = interfaceC0043a.a();
                if (listA == null) {
                    return new Ag.b(adFormat);
                }
                if (listA.isEmpty()) {
                    return new Ag.a(adFormat);
                }
                return null;
            }
        }
        return null;
    }
}
