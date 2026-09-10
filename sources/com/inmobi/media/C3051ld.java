package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3051ld extends FunctionReferenceImpl implements Function2 {
    public C3051ld(C3101nd c3101nd) {
        super(2, c3101nd, C3101nd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3336x p0 = (C3336x) obj;
        InMobiJsonResponse p1 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        C3101nd c3101nd = (C3101nd) this.receiver;
        C3097n9 c3097n9 = c3101nd.e;
        if (c3097n9 != null) {
            c3097n9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c3101nd.r.a(new Yc(p0, p1, c3101nd.p, c3101nd.q, c3101nd.r), c3101nd);
        return Unit.f29295attabal;
    }
}
