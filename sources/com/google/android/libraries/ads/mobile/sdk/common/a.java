package com.google.android.libraries.ads.mobile.sdk.common;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.sunback;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ sunback b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sunback sunbackVar, dern dernVar) {
        super(2, dernVar);
        this.b = sunbackVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new a(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            sunback sunbackVar = this.b;
            FullScreenContentError fullScreenContentError = new FullScreenContentError(FullScreenContentError.ErrorCode.APP_NOT_FOREGROUND, "Activity failed to start, platform generated window has no DecorView.", null);
            this.a = 1;
            if (sunbackVar.a(fullScreenContentError, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
