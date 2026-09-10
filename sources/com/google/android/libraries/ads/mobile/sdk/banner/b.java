package com.google.android.libraries.ads.mobile.sdk.banner;

import complexometry.marial;
import liquory.saneness;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdView a;
    public final /* synthetic */ marial b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdView adView, marial marialVar, dern dernVar) {
        super(2, dernVar);
        this.a = adView;
        this.b = marialVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new b(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        AdView.a(this.a, (saneness) ((marial.saneness) this.b).attabal());
        return Unit.f29295attabal;
    }
}
