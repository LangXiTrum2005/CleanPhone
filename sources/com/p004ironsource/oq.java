package com.p004ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ironsource/oq;", "Lcom/ironsource/hg;", "Lcom/ironsource/hg$a;", "", "Lcom/ironsource/services/capping/PlacementName;", "placementName", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "Lcom/ironsource/n8;", "a", "Lcom/ironsource/p8;", "cappingType", "Lcom/ironsource/lf;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/p8;Lcom/ironsource/lf;)Ljava/lang/Object;", "b", "Lcom/ironsource/l8;", "Lcom/ironsource/l8;", "cappingService", "Lcom/ironsource/ra;", "Lcom/ironsource/ra;", "deliveryHandler", "<init>", "(Lcom/ironsource/l8;Lcom/ironsource/ra;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class oq implements hg, hg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l8 cappingService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ra deliveryHandler;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26412a;

        static {
            int[] iArr = new int[p8.values().length];
            try {
                iArr[p8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26412a = iArr;
        }
    }

    public oq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.p004ironsource.hg
    public synchronized n8 a(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(adFormat, "adFormat");
        String strA = new tq(placementName, adFormat).a();
        n8 n8VarA = this.deliveryHandler.a(strA);
        if (n8VarA.d()) {
            return n8VarA;
        }
        return this.cappingService.a(strA);
    }

    @Override // com.ironsource.hg.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(adFormat, "adFormat");
        String strA = new tq(placementName, adFormat).a();
        if (!this.deliveryHandler.a(strA).d()) {
            this.cappingService.b(strA);
        }
    }

    public oq(l8 cappingService, ra deliveryHandler) {
        Intrinsics.f(cappingService, "cappingService");
        Intrinsics.f(deliveryHandler, "deliveryHandler");
        this.cappingService = cappingService;
        this.deliveryHandler = deliveryHandler;
    }

    @Override // com.ironsource.hg.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, p8 cappingType, lf cappingConfig) {
        Object objA;
        try {
            Intrinsics.f(placementName, "placementName");
            Intrinsics.f(adFormat, "adFormat");
            Intrinsics.f(cappingType, "cappingType");
            Intrinsics.f(cappingConfig, "cappingConfig");
            String strA = new tq(placementName, adFormat).a();
            int i2 = a.f26412a[cappingType.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objA = this.cappingService.a(strA, cappingType, cappingConfig);
            } else {
                objA = this.deliveryHandler.a(strA, cappingType, cappingConfig);
            }
        } catch (Throwable th) {
            throw th;
        }
        return objA;
    }

    public /* synthetic */ oq(l8 l8Var, ra raVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            l8Var = new l8(null, null, null, 7, null);
        }
        this(l8Var, (i2 & 2) != 0 ? new ra() : raVar);
    }
}
