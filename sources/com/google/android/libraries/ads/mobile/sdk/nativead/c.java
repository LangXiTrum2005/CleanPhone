package com.google.android.libraries.ads.mobile.sdk.nativead;

import acidy.impromptu;
import ads_mobile_sdk.k92;
import ads_mobile_sdk.l61;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends SuspendLambda implements Function1 {
    public final /* synthetic */ k92 a;
    public final /* synthetic */ impromptu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k92 k92Var, impromptu impromptuVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = k92Var;
        this.b = impromptuVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new c(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new c(this.a, this.b, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.a((orthocephalic) new l61(this.b), false);
        return Unit.f29295attabal;
    }
}
