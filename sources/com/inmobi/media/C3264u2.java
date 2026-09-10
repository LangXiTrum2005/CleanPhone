package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3264u2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3339x2 a;
    public final /* synthetic */ VastProperties b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3264u2(AbstractC3339x2 abstractC3339x2, VastProperties vastProperties, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC3339x2;
        this.b = vastProperties;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3264u2(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3264u2(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AdEvents adEvents = this.a.e;
        if (adEvents != null) {
            adEvents.loaded(this.b);
        }
        return Unit.f29295attabal;
    }
}
