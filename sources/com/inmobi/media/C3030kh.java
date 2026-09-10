package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3030kh extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3055lh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3030kh(C3055lh c3055lh, dern dernVar) {
        super(2, dernVar);
        this.b = c3055lh;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3030kh(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3030kh(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            H0 h0 = (H0) E0.a.getValue();
            AdQualityResult adQualityResult = this.b.a;
            this.a = 1;
            if (h0.a(adQualityResult, this) == objBeachfront) {
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
