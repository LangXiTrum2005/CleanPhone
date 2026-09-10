package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0590td implements InterfaceC0608ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f30729a;

    /* JADX INFO: renamed from: com.ironsource.td$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30730a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30730a = iArr;
        }
    }

    public C0590td(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f30729a = adFormat;
    }

    private final C0554rd a(Fd.c cVar, int i10, Va va2) {
        String strC = cVar.c();
        if (strC == null) {
            IronLog.INTERNAL.warning("invalid adUnitId");
            return null;
        }
        List<String> listD = cVar.d();
        if (listD == null) {
            IronLog.INTERNAL.warning("invalid instances");
            return null;
        }
        C0363h0 c0363h0 = new C0363h0(com.unity3d.mediation.a.a(this.f30729a), C0638w7.f30930a.a(), strC, null, null, null, 56, null);
        AbstractC0649x0 abstractC0649x0A = a(c0363h0, va2);
        if (abstractC0649x0A == null) {
            IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        IronSource.a aVarA = com.unity3d.mediation.a.a(this.f30729a);
        F0.b bVar = F0.b.MEDIATION;
        V0 v4 = new V0(new C0506p0(aVarA, bVar), abstractC0649x0A, bVar);
        v4.d().a(new D0(v4, c0363h0, null, 4, null));
        return new C0554rd(strC, listD, i10, new C0662xd(v4, abstractC0649x0A, null, 4, null), v4);
    }

    private final AbstractC0649x0 a(C0363h0 c0363h0, Va va2) {
        try {
            int i10 = a.f30730a[this.f30729a.ordinal()];
            if (i10 == 1) {
                return C9.f25859z.a(c0363h0, va2, false);
            }
            if (i10 == 2) {
                return C0287ce.f28376z.a(c0363h0, va2, false);
            }
            throw new IllegalArgumentException("Unsupported ad format for preload: " + this.f30729a);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.f30729a + ": " + e10.getMessage() + "\n" + qk.i0.m0(e10));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC0608ud
    public List<InterfaceC0572sd> a(List<Fd.c> config, int i10, Va levelPlayConfig) {
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(levelPlayConfig, "levelPlayConfig");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = config.iterator();
        while (it.hasNext()) {
            C0554rd c0554rdA = a((Fd.c) it.next(), i10, levelPlayConfig);
            if (c0554rdA != null) {
                arrayList.add(c0554rdA);
            }
        }
        return arrayList;
    }
}
