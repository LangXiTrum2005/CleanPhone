package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2822cb extends SuspendLambda implements Function2 {
    public final /* synthetic */ C2848db a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2822cb(C2848db c2848db, dern dernVar) {
        super(2, dernVar);
        this.a = c2848db;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2822cb(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2822cb(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C2848db c2848db = this.a;
        Hc hc = c2848db.f;
        InMobiAdRequestStatus status = c2848db.e;
        hc.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        hc.onAdLoadFailed(status);
        return Unit.f29295attabal;
    }
}
