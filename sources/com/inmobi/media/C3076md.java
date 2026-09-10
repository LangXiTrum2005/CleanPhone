package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3076md extends FunctionReferenceImpl implements Function1 {
    public C3076md(C3101nd c3101nd) {
        super(1, c3101nd, C3101nd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3101nd c3101nd = (C3101nd) this.receiver;
        c3101nd.getClass();
        c3101nd.a(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return Unit.f29295attabal;
    }
}
