package com.ironsource;

import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3665o2 implements InterfaceC3683p2 {
    private final String a;
    private final InterfaceC3727rd b;

    public C3665o2(String encryptedAuctionResponse, InterfaceC3727rd providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = encryptedAuctionResponse;
        this.b = providerName;
    }

    @Override // com.ironsource.InterfaceC3683p2
    public Object a() {
        Object objM3351constructorimpl;
        String strC = C3578j5.b().c();
        Intrinsics.checkNotNullExpressionValue(strC, "getInstance().mediationKey");
        C3655na c3655na = new C3655na(new E4(this.a, strC));
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(c3655na.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl == null) {
            return C3629m2.h.a((JSONObject) objM3351constructorimpl, this.b.value());
        }
        C3631m4.d().a(thM3354exceptionOrNullimpl);
        return thM3354exceptionOrNullimpl instanceof IllegalArgumentException ? Result.m3351constructorimpl(p002kotlin.dern.attabal(new Z7(C3753t5.a.d()))) : Result.m3351constructorimpl(p002kotlin.dern.attabal(new Z7(C3753t5.a.h())));
    }
}
