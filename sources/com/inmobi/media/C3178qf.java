package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3178qf extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3227sf a;
    public final /* synthetic */ AdConfig.OmidConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3178qf(C3227sf c3227sf, AdConfig.OmidConfig omidConfig, dern dernVar) {
        super(2, dernVar);
        this.a = c3227sf;
        this.b = omidConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3178qf(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3178qf(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Ea ea = this.a.a.a;
        ea.getClass();
        Intrinsics.checkNotNullParameter("last_ts", com.ironsource.X3.i.W);
        return igo.attabal.attabal((System.currentTimeMillis() / ((long) 1000)) - ea.a.getLong("last_ts", 0L) > this.b.getExpiry());
    }
}
