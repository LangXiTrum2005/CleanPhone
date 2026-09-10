package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class C0288cf implements M8, M8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28383c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, Integer> f28384a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0283ca f28385b = new C0283ca();

    /* JADX INFO: renamed from: com.ironsource.cf$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28386a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f28386a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28386a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28386a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28386a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0288cf() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(IronSource.a aVar, int i10) {
        this.f28384a.put(aVar, Integer.valueOf(i10));
        int i11 = a.f28386a[aVar.ordinal()];
        if (i11 == 1) {
            this.f28385b.d(i10);
            return;
        }
        if (i11 == 2) {
            this.f28385b.b(i10);
        } else if (i11 == 3) {
            this.f28385b.a(i10);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f28385b.c(i10);
        }
    }

    @Override // com.ironsource.M8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f28384a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.M8
    public synchronized int a(IronSource.a aVar) {
        int iIntValue = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.f28384a.get(aVar);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.M8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
