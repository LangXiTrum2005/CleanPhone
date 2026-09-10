package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3497ed implements I7, I7.a {
    private final E3 a;
    private final M4 b;

    /* JADX INFO: renamed from: com.ironsource.ed$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

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
            a = iArr;
        }
    }

    public C3497ed() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.I7
    public synchronized G3 a(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C3604kd(placementName, adFormat).a();
        G3 g3A = this.b.a(strA);
        if (g3A.d()) {
            return g3A;
        }
        return this.a.a(strA);
    }

    @Override // com.ironsource.I7.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C3604kd(placementName, adFormat).a();
        if (!this.b.a(strA).d()) {
            this.a.b(strA);
        }
    }

    public C3497ed(E3 cappingService, M4 deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.a = cappingService;
        this.b = deliveryHandler;
    }

    public /* synthetic */ C3497ed(E3 e3, M4 m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new E3(null, null, null, 7, null) : e3, (i & 2) != 0 ? new M4() : m4);
    }

    @Override // com.ironsource.I7.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, I3 cappingType, InterfaceC3634m7 cappingConfig) {
        Object objA;
        try {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            String strA = new C3604kd(placementName, adFormat).a();
            int i = a.a[cappingType.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objA = this.a.a(strA, cappingType, cappingConfig);
            } else {
                objA = this.b.a(strA, cappingType, cappingConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
        return objA;
    }
}
