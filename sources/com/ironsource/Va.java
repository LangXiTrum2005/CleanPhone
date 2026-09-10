package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Va extends C0484ne {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27401a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27401a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Va(C0484ne sdkConfig) {
        super(sdkConfig);
        kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> mapA;
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(adUnitId)) ? false : true;
    }

    public final InterfaceC0637w6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        return new InterfaceC0637w6.a(a(adFormat, adUnitId));
    }

    public final C0358gd c(LevelPlay.AdFormat adFormat, String str) {
        C0358gd c0358gdA;
        I9 i9A;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        int i10 = a.f27401a[adFormat.ordinal()];
        if (i10 == 1) {
            C0323ee c0323eeF = d().c().f();
            if (c0323eeF == null || (c0358gdA = c0323eeF.a(str)) == null) {
                return null;
            }
            return new C0358gd(c0358gdA.b(), c0358gdA.c(), c0358gdA.d(), c0358gdA.f(), c0358gdA.e(), c0358gdA.a());
        }
        if (i10 == 2) {
            E9 e9D = d().c().d();
            if (e9D == null || (i9A = e9D.a(str)) == null) {
                return null;
            }
            return new C0358gd(i9A);
        }
        if (i10 == 3) {
            U2 u2C = d().c().c();
            if (u2C == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            C0312e3 c0312e3A = u2C.a(str);
            if (c0312e3A == null) {
                c0312e3A = u2C.i();
                kotlin.jvm.internal.n.e(c0312e3A, "config.defaultBannerPlacement");
            }
            return new C0358gd(c0312e3A);
        }
        if (i10 != 4) {
            throw new aa.b((byte) 0, 20);
        }
        Qb qbE = d().c().e();
        if (qbE != null && str != null) {
            C0267bc c0267bcA = qbE.a(str);
            if (c0267bcA == null) {
                c0267bcA = qbE.e();
            }
            if (c0267bcA != null) {
                return new C0358gd(c0267bcA);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final List<C0679yc> d(LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> mapA;
        Set<String> setKeySet;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        Fd.a aVar = h().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null) {
            return xj.v.f53866a;
        }
        ArrayList arrayList = new ArrayList(xj.p.W(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(d(adFormat, (String) it.next()));
        }
        return xj.n.j0(xj.p.X(arrayList));
    }

    public final String j() {
        return h().a().b().c().a();
    }

    public final List<LevelPlayAdSize> k() {
        List<String> listA = h().a().c().b().a();
        ArrayList arrayList = new ArrayList(xj.p.W(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float l() {
        return h().a().c().b().b();
    }

    public final boolean m() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        return aVarA != null && aVarA.b();
    }

    public final boolean n() {
        return h().a().b().e();
    }

    public final C0411jd b(C0624vb tools) {
        kotlin.jvm.internal.n.f(tools, "tools");
        return new C0411jd(tools, h().a().a());
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C0594u.d dVarB;
        Long lD;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        C0594u c0594u = h().a().a().get(adFormat);
        long jLongValue = (c0594u == null || (dVarB = c0594u.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    public final Ua.a a(String adUnitId) {
        long jD;
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        T2 t2C = h().a().c();
        T2.b bVar = t2C.a().get(adUnitId);
        int iC = bVar != null ? bVar.c() : t2C.b().c();
        boolean zE = bVar != null ? bVar.e() : t2C.b().e();
        if (bVar != null) {
            jD = bVar.d();
        } else {
            jD = t2C.b().d();
        }
        return new Ua.a(zE, iC, jD);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> mapA;
        Set<String> setKeySet;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null) ? xj.v.f53866a : xj.n.N0(setKeySet);
    }

    public final List<C0679yc> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, Fd.b> mapA;
        Fd.b bVar;
        List<String> listA;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (bVar = mapA.get(adUnitId)) != null && (listA = bVar.a()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                C0679yc c0679yc = h().e().a().get((String) it.next());
                if (c0679yc != null) {
                    arrayList.add(c0679yc);
                }
            }
            return arrayList;
        }
        return xj.v.f53866a;
    }

    public final C0613v0 a(C0624vb tools) {
        kotlin.jvm.internal.n.f(tools, "tools");
        return new C0613v0(tools, h().a().a());
    }

    private final InterfaceC0637w6.c a(LevelPlay.AdFormat adFormat, String str) {
        C0594u.d dVarB;
        Ad adG;
        Map<String, C0594u.d> mapA;
        C0594u.d dVar;
        Ad adG2;
        boolean z10 = adFormat == LevelPlay.AdFormat.REWARDED;
        C0594u c0594u = h().a().a().get(adFormat);
        InterfaceC0637w6.c cVarA = null;
        InterfaceC0637w6.c cVarA2 = (c0594u == null || (mapA = c0594u.a()) == null || (dVar = mapA.get(str)) == null || (adG2 = dVar.g()) == null) ? null : adG2.a();
        if (c0594u != null && (dVarB = c0594u.b()) != null && (adG = dVarB.g()) != null) {
            cVarA = adG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        if (cVarA2 != null) {
            return cVarA2;
        }
        if (z10) {
            return InterfaceC0637w6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC0637w6.c.SINGLE;
    }

    public final Sd c(C0624vb tools) {
        kotlin.jvm.internal.n.f(tools, "tools");
        C0594u c0594u = h().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Sd(tools, c0594u != null ? c0594u.a() : null, c0594u != null ? c0594u.c() : null);
    }

    public final List<Fd.c> c(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        return h().d().a(adFormat);
    }
}
