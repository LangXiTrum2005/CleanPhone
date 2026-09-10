package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* JADX INFO: renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0394id implements K7, K7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E3 f28907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N4 f28908b;

    /* JADX INFO: renamed from: com.ironsource.id$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28909a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28909a = iArr;
        }
    }

    public C0394id() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.K7
    public synchronized G3 a(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        String strA = new C0501od(placementName, adFormat).a();
        G3 g3A = this.f28908b.a(strA);
        if (g3A.d()) {
            return g3A;
        }
        return this.f28907a.a(strA);
    }

    @Override // com.ironsource.K7.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        String strA = new C0501od(placementName, adFormat).a();
        if (!this.f28908b.a(strA).d()) {
            this.f28907a.b(strA);
        }
    }

    public C0394id(E3 cappingService, N4 deliveryHandler) {
        kotlin.jvm.internal.n.f(cappingService, "cappingService");
        kotlin.jvm.internal.n.f(deliveryHandler, "deliveryHandler");
        this.f28907a = cappingService;
        this.f28908b = deliveryHandler;
    }

    public /* synthetic */ C0394id(E3 e10, N4 n9, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new E3(null, null, null, 7, null) : e10, (i10 & 2) != 0 ? new N4() : n9);
    }

    @Override // com.ironsource.K7.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, I3 cappingType, InterfaceC0495o7 cappingConfig) {
        Object objA;
        try {
            kotlin.jvm.internal.n.f(placementName, "placementName");
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            kotlin.jvm.internal.n.f(cappingType, "cappingType");
            kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
            String strA = new C0501od(placementName, adFormat).a();
            int i10 = a.f28909a[cappingType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new aa.b((byte) 0, 20);
                }
                objA = this.f28907a.a(strA, cappingType, cappingConfig);
            } else {
                objA = this.f28908b.a(strA, cappingType, cappingConfig);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objA;
    }
}
