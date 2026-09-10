package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2772ad extends FunctionReferenceImpl implements Function1 {
    public C2772ad(C2798bd c2798bd) {
        super(1, c2798bd, C2798bd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C2798bd c2798bd = (C2798bd) this.receiver;
        c2798bd.getClass();
        c2798bd.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), sShortValue);
        return Unit.f29295attabal;
    }
}
