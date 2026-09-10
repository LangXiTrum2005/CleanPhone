package com.inmobi.media;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3112o extends SuspendLambda implements Function1 {
    public C3112o(dern dernVar) {
        super(1, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3112o(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3112o((dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        if (C3162q.d.get() && C3162q.b()) {
            C3162q.a(igo.attabal.dern(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        return Unit.f29295attabal;
    }
}
